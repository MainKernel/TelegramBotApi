package api.objects.chat;

import api.objects.BotApiObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ChatShared implements BotApiObject {
    @JsonProperty("request_id")
    private Integer requestId;

    @JsonProperty("chat_id")
    private Long chatId;
}
