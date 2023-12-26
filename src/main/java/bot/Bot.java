package bot;

import api.objects.message.Message;
import lombok.SneakyThrows;
import sender.Sender;

import java.io.IOException;

public abstract class Bot implements TelegramBot {
    protected final Sender sender = new Sender(this);

    {
        sender.start();
    }

    public Bot() {
    }

    public abstract void onUpdateReceive(Message message);


}

