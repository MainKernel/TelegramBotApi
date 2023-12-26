package api.objects.chat;

import api.objects.BotApiObject;
import api.objects.user.User;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ChatMemberLeft implements BotApiObject {
    @JsonProperty("status")
    private String status;
    @JsonProperty("user")
    private User user;
}
