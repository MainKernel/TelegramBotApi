package api.objects.chat;

import api.objects.BotApiObject;
import api.objects.user.User;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ChatJoinRequest implements BotApiObject {
    @JsonProperty("chat")
    private Chat chat;
    @JsonProperty("from")
    private User from;
    @JsonProperty("user_chat_id;")
    private long userChatId;
    @JsonProperty("date")
    private long date;
    @JsonProperty("bio")
    private String bio;
    @JsonProperty("invite_link")
    private ChatInviteLink inviteLink;
}
