package api.objects.command;

import api.objects.BotApiObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BotCommandScopeAllGroupChats implements BotApiObject {
    @JsonProperty("type")
    private String type = "type";

}
