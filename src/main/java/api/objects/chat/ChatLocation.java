package api.objects.chat;

import api.objects.BotApiObject;
import api.objects.misc.Location;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ChatLocation implements BotApiObject {
    @JsonProperty("location")
    private Location location;
    @JsonProperty("address")
    private String address;
}
