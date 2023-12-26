package api.objects.chat;

import api.objects.BotApiObject;
import api.objects.user.User;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ChatMemberUpdated implements BotApiObject {
    @JsonProperty("chat")
    private Chat chat;
    @JsonProperty("from")
    private User from;
    @JsonProperty("date")
    private Integer date;
    @JsonProperty("old_chat_member")
    private ChatMember oldChatMember;
    @JsonProperty("new_chat_member")
    private ChatMember newChatMember;
    @JsonProperty("invite_link")
    private ChatInviteLink inviteLink;
    @JsonProperty("via_chat_folder_invite_link")
    private Boolean viaChatFolderInviteLink;
}
