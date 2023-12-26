package api.objects.command;

import api.objects.BotApiObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BotCommand implements BotApiObject {
    @JsonProperty("command")
    private String command;
    @JsonProperty("description")
    private String description;
}
