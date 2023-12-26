package sender;

import api.objects.data.ResponseData;
import api.objects.data.ResultItem;

import api.objects.message.Message;
import api.objects.message.sendMessage;
import bot.Bot;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import java.io.IOException;

import java.net.URI;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

public class Sender extends Thread {
    private static final String BASE_URL = "https://api.telegram.org/bot";
    private static final Gson gson = new Gson();
    private static final HttpClient client = HttpClient.newHttpClient();
    private static String updates;
    private static String send;
    private static Long offset;
    private static Boolean running = true;
    private final Bot bot;

    public Sender(Bot bot) {
        this.bot = bot;
        String finalUrl = BASE_URL + bot.getBotToken() + "/";
        updates = finalUrl + "getUpdates?offset=";
        send = finalUrl + "sendMessage";
    }


    /*
     * Send messages to chat using chat_id from Message object
     * @param message - Message object
     * */
    public static void sendUpdate(Message message) throws IOException, InterruptedException {

        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(converter(message));
        HttpRequest request = HttpRequest.newBuilder(URI.create(send))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(json))
                .build();
        client.send(request, HttpResponse.BodyHandlers.ofString());
    }

    private static sendMessage converter(Message message) {
        return api.objects.message.sendMessage.builder()
                .chatId(message.getFrom().getId())
                .text(message.getText()).build();
    }

    public static void stopSender() {
        running = false;
    }

    /* Get updates and redirecting it to Bot() onUpdateReceived() method
     * */
    private void getUpdates() throws IOException, InterruptedException {
        /*Handling update, and increase offset
         * */
        HttpRequest request = HttpRequest.newBuilder(URI.create(updates + offset)).build();
        HttpResponse<String> send = client.send(request, HttpResponse.BodyHandlers.ofString());

        ResponseData responseData = gson.fromJson(send.body(), ResponseData.class);
        getMessage(responseData.getResult());

    }

    private void setNewOffset(long resultItems) {
        offset = resultItems;
    }

    private void getMessage(List<ResultItem> resultItems) {
        if(!resultItems.isEmpty()){
            for (ResultItem resultItem : resultItems) {
                setNewOffset(resultItem.getUpdate_id() + 1);
                bot.onUpdateReceive(resultItem.getMessage());
            }
        }
    }

    @Override
    public void run() {
        while (running) {
            try {
                getUpdates();
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
