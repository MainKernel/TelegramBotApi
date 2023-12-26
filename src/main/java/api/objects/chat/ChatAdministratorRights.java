package api.objects.chat;

import api.objects.BotApiObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ChatAdministratorRights implements BotApiObject {
    @JsonProperty("is_anonymous")
    private boolean isAnonymous;
    @JsonProperty("can_manage_chat")
    private boolean canManageChat;
    @JsonProperty("can_delete_messages")
    private boolean canDeleteMessages;
    @JsonProperty("can_manage_video_chats")
    private boolean canManageVideoChats;
    @JsonProperty("can_restrict_members")
    private boolean canRestrictMembers;
    @JsonProperty("can_promote_members")
    private boolean canPromoteMembers;
    @JsonProperty("can_change_info")
    private boolean canChangeInfo;
    @JsonProperty("can_invite_users")
    private boolean canInviteUsers;
    @JsonProperty("can_post_messages")
    private boolean canPostMessages;
    @JsonProperty("can_edit_messages")
    private boolean canEditMessages;
    @JsonProperty("can_pin_messages")
    private boolean canPinMessages;
    @JsonProperty("can_post_stories")
    private boolean canPostStories;
    @JsonProperty("can_edit_stories")
    private boolean canEditStories;
    @JsonProperty("can_delete_stories")
    private boolean canDeleteStories;
    @JsonProperty("can_manage_topics")
    private boolean canManageTopics;
}
