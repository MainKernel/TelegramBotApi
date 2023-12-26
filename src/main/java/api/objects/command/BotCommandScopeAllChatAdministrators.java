package api.objects.command;

import api.objects.BotApiObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BotCommandScopeAllChatAdministrators implements BotApiObject {
    @JsonProperty("type")
    private String type = "all_chat_administrators";

}
