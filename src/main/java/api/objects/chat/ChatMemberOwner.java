package api.objects.chat;

import api.objects.BotApiObject;
import api.objects.user.User;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ChatMemberOwner implements BotApiObject {
    @JsonProperty("status")
    private String status;
    @JsonProperty("user")
    private User user;
    @JsonProperty("is_anonymous")
    private Boolean isAnonymous;
    @JsonProperty("custom_title")
    private String customTitle;

}
