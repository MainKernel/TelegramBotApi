package api.objects.chat;

import api.objects.BotApiObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ChatMemberAdministrator implements BotApiObject {
    @JsonProperty("status")
    private String status;
    @JsonProperty("can_be_edited")
    private boolean canBeEdited;
    @JsonProperty("is_anonymous")
    private Boolean isAnonymous;
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
    private Boolean canPostMessages;
    @JsonProperty("can_edit_messages")
    private Boolean canEditMessages;
    @JsonProperty("can_pin_messages")
    private Boolean canPinMessages;
    @JsonProperty("can_post_stories")
    private Boolean canPostStories;
    @JsonProperty("can_edit_stories")
    private Boolean canEditStories;
    @JsonProperty("can_delete_stories")
    private Boolean canDeleteStories;
    @JsonProperty("can_manage_topics")
    private Boolean canManageTopics;
    @JsonProperty("custom_title")
    private String customTitle;
}
