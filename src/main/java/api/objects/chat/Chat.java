package api.objects.chat;

import api.objects.BotApiObject;
import api.objects.message.Message;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Chat implements BotApiObject {

    @JsonProperty("id")
    private Long id;
    @JsonProperty("type")
    private String type;
    @JsonProperty("title")
    private String title;
    @JsonProperty("username")
    private String username;
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("last_name")
    private String lastName;
    @JsonProperty("is_forum")
    private Boolean isForum;
    @JsonProperty("photo")
    private ChatPhoto photo;
    @JsonProperty("active_usernames")
    private List<String> activeUsernames;
    @JsonProperty("emoji_status_custom_emoji_id")
    private String emojiStatusCustomEmojiId;
    @JsonProperty("emoji_status_expiration_date")
    private Integer emojiStatusExpirationDate;
    @JsonProperty("bio")
    private String bio;
    @JsonProperty("has_private_forwards")
    private Boolean hasPrivateForwards;
    @JsonProperty("has_restricted_voice_and_video_messages")
    private Boolean hasRestrictedVoiceAndVideoMessages;
    @JsonProperty("join_to_send_messages")
    private Boolean joinToSendMessages;
    @JsonProperty("join_by_request")
    private Boolean joinByRequest;
    @JsonProperty("description")
    private String description;
    @JsonProperty("invite_link")
    private String inviteLink;
    @JsonProperty("pinned_message")
    private Message pinnedMessage;
    @JsonProperty("permission")
    private ChatPermissions permissions;
    @JsonProperty("slow_mode_delay")
    private Integer slowModeDelay;
    @JsonProperty("message_auto_delete_time")
    private Integer messageAutoDeleteTime;
    @JsonProperty("has_aggressive_anti_spam_enabled")
    private Boolean hasAggressiveAntiSpamEnabled;
    @JsonProperty("has_hidden_members")
    private Boolean hasHiddenMembers;
    @JsonProperty("has_protected_content")
    private Boolean hasProtectedContent;
    @JsonProperty("sticker_set_name")
    private String stickerSetName;
    @JsonProperty("can_set_sticker_set")
    private Boolean canSetStickerSet;
    @JsonProperty("linked_chat_id")
    private Long linkedChatId;
    @JsonProperty("location")
    private ChatLocation location;

    Chat(Long id, String type, String title, String username, String firstName, String lastName, Boolean isForum, ChatPhoto photo, List<String> activeUsernames, String emojiStatusCustomEmojiId, Integer emojiStatusExpirationDate, String bio, Boolean hasPrivateForwards, Boolean hasRestrictedVoiceAndVideoMessages, Boolean joinToSendMessages, Boolean joinByRequest, String description, String inviteLink, Message pinnedMessage, ChatPermissions permissions, Integer slowModeDelay, Integer messageAutoDeleteTime, Boolean hasAggressiveAntiSpamEnabled, Boolean hasHiddenMembers, Boolean hasProtectedContent, String stickerSetName, Boolean canSetStickerSet, Long linkedChatId, ChatLocation location) {
        this.id = id;
        this.type = type;
        this.title = title;
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.isForum = isForum;
        this.photo = photo;
        this.activeUsernames = activeUsernames;
        this.emojiStatusCustomEmojiId = emojiStatusCustomEmojiId;
        this.emojiStatusExpirationDate = emojiStatusExpirationDate;
        this.bio = bio;
        this.hasPrivateForwards = hasPrivateForwards;
        this.hasRestrictedVoiceAndVideoMessages = hasRestrictedVoiceAndVideoMessages;
        this.joinToSendMessages = joinToSendMessages;
        this.joinByRequest = joinByRequest;
        this.description = description;
        this.inviteLink = inviteLink;
        this.pinnedMessage = pinnedMessage;
        this.permissions = permissions;
        this.slowModeDelay = slowModeDelay;
        this.messageAutoDeleteTime = messageAutoDeleteTime;
        this.hasAggressiveAntiSpamEnabled = hasAggressiveAntiSpamEnabled;
        this.hasHiddenMembers = hasHiddenMembers;
        this.hasProtectedContent = hasProtectedContent;
        this.stickerSetName = stickerSetName;
        this.canSetStickerSet = canSetStickerSet;
        this.linkedChatId = linkedChatId;
        this.location = location;
    }

    public static ChatBuilder builder() {
        return new ChatBuilder();
    }

    public Long getId() {
        return this.id;
    }

    public String getType() {
        return this.type;
    }

    public String getTitle() {
        return this.title;
    }

    public String getUsername() {
        return this.username;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public Boolean getIsForum() {
        return this.isForum;
    }

    public ChatPhoto getPhoto() {
        return this.photo;
    }

    public List<String> getActiveUsernames() {
        return this.activeUsernames;
    }

    public String getEmojiStatusCustomEmojiId() {
        return this.emojiStatusCustomEmojiId;
    }

    public Integer getEmojiStatusExpirationDate() {
        return this.emojiStatusExpirationDate;
    }

    public String getBio() {
        return this.bio;
    }

    public Boolean getHasPrivateForwards() {
        return this.hasPrivateForwards;
    }

    public Boolean getHasRestrictedVoiceAndVideoMessages() {
        return this.hasRestrictedVoiceAndVideoMessages;
    }

    public Boolean getJoinToSendMessages() {
        return this.joinToSendMessages;
    }

    public Boolean getJoinByRequest() {
        return this.joinByRequest;
    }

    public String getDescription() {
        return this.description;
    }

    public String getInviteLink() {
        return this.inviteLink;
    }

    public Message getPinnedMessage() {
        return this.pinnedMessage;
    }

    public ChatPermissions getPermissions() {
        return this.permissions;
    }

    public Integer getSlowModeDelay() {
        return this.slowModeDelay;
    }

    public Integer getMessageAutoDeleteTime() {
        return this.messageAutoDeleteTime;
    }

    public Boolean getHasAggressiveAntiSpamEnabled() {
        return this.hasAggressiveAntiSpamEnabled;
    }

    public Boolean getHasHiddenMembers() {
        return this.hasHiddenMembers;
    }

    public Boolean getHasProtectedContent() {
        return this.hasProtectedContent;
    }

    public String getStickerSetName() {
        return this.stickerSetName;
    }

    public Boolean getCanSetStickerSet() {
        return this.canSetStickerSet;
    }

    public Long getLinkedChatId() {
        return this.linkedChatId;
    }

    public ChatLocation getLocation() {
        return this.location;
    }

    @JsonProperty("id")
    public void setId(Long id) {
        this.id = id;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("username")
    public void setUsername(String username) {
        this.username = username;
    }

    @JsonProperty("first_name")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @JsonProperty("last_name")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @JsonProperty("is_forum")
    public void setIsForum(Boolean isForum) {
        this.isForum = isForum;
    }

    @JsonProperty("photo")
    public void setPhoto(ChatPhoto photo) {
        this.photo = photo;
    }

    @JsonProperty("active_usernames")
    public void setActiveUsernames(List<String> activeUsernames) {
        this.activeUsernames = activeUsernames;
    }

    @JsonProperty("emoji_status_custom_emoji_id")
    public void setEmojiStatusCustomEmojiId(String emojiStatusCustomEmojiId) {
        this.emojiStatusCustomEmojiId = emojiStatusCustomEmojiId;
    }

    @JsonProperty("emoji_status_expiration_date")
    public void setEmojiStatusExpirationDate(Integer emojiStatusExpirationDate) {
        this.emojiStatusExpirationDate = emojiStatusExpirationDate;
    }

    @JsonProperty("bio")
    public void setBio(String bio) {
        this.bio = bio;
    }

    @JsonProperty("has_private_forwards")
    public void setHasPrivateForwards(Boolean hasPrivateForwards) {
        this.hasPrivateForwards = hasPrivateForwards;
    }

    @JsonProperty("has_restricted_voice_and_video_messages")
    public void setHasRestrictedVoiceAndVideoMessages(Boolean hasRestrictedVoiceAndVideoMessages) {
        this.hasRestrictedVoiceAndVideoMessages = hasRestrictedVoiceAndVideoMessages;
    }

    @JsonProperty("join_to_send_messages")
    public void setJoinToSendMessages(Boolean joinToSendMessages) {
        this.joinToSendMessages = joinToSendMessages;
    }

    @JsonProperty("join_by_request")
    public void setJoinByRequest(Boolean joinByRequest) {
        this.joinByRequest = joinByRequest;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("invite_link")
    public void setInviteLink(String inviteLink) {
        this.inviteLink = inviteLink;
    }

    @JsonProperty("pinned_message")
    public void setPinnedMessage(Message pinnedMessage) {
        this.pinnedMessage = pinnedMessage;
    }

    @JsonProperty("permission")
    public void setPermissions(ChatPermissions permissions) {
        this.permissions = permissions;
    }

    @JsonProperty("slow_mode_delay")
    public void setSlowModeDelay(Integer slowModeDelay) {
        this.slowModeDelay = slowModeDelay;
    }

    @JsonProperty("message_auto_delete_time")
    public void setMessageAutoDeleteTime(Integer messageAutoDeleteTime) {
        this.messageAutoDeleteTime = messageAutoDeleteTime;
    }

    @JsonProperty("has_aggressive_anti_spam_enabled")
    public void setHasAggressiveAntiSpamEnabled(Boolean hasAggressiveAntiSpamEnabled) {
        this.hasAggressiveAntiSpamEnabled = hasAggressiveAntiSpamEnabled;
    }

    @JsonProperty("has_hidden_members")
    public void setHasHiddenMembers(Boolean hasHiddenMembers) {
        this.hasHiddenMembers = hasHiddenMembers;
    }

    @JsonProperty("has_protected_content")
    public void setHasProtectedContent(Boolean hasProtectedContent) {
        this.hasProtectedContent = hasProtectedContent;
    }

    @JsonProperty("sticker_set_name")
    public void setStickerSetName(String stickerSetName) {
        this.stickerSetName = stickerSetName;
    }

    @JsonProperty("can_set_sticker_set")
    public void setCanSetStickerSet(Boolean canSetStickerSet) {
        this.canSetStickerSet = canSetStickerSet;
    }

    @JsonProperty("linked_chat_id")
    public void setLinkedChatId(Long linkedChatId) {
        this.linkedChatId = linkedChatId;
    }

    @JsonProperty("location")
    public void setLocation(ChatLocation location) {
        this.location = location;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Chat)) return false;
        final Chat other = (Chat) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        final Object this$title = this.getTitle();
        final Object other$title = other.getTitle();
        if (this$title == null ? other$title != null : !this$title.equals(other$title)) return false;
        final Object this$username = this.getUsername();
        final Object other$username = other.getUsername();
        if (this$username == null ? other$username != null : !this$username.equals(other$username)) return false;
        final Object this$firstName = this.getFirstName();
        final Object other$firstName = other.getFirstName();
        if (this$firstName == null ? other$firstName != null : !this$firstName.equals(other$firstName)) return false;
        final Object this$lastName = this.getLastName();
        final Object other$lastName = other.getLastName();
        if (this$lastName == null ? other$lastName != null : !this$lastName.equals(other$lastName)) return false;
        final Object this$isForum = this.getIsForum();
        final Object other$isForum = other.getIsForum();
        if (this$isForum == null ? other$isForum != null : !this$isForum.equals(other$isForum)) return false;
        final Object this$photo = this.getPhoto();
        final Object other$photo = other.getPhoto();
        if (this$photo == null ? other$photo != null : !this$photo.equals(other$photo)) return false;
        final Object this$activeUsernames = this.getActiveUsernames();
        final Object other$activeUsernames = other.getActiveUsernames();
        if (this$activeUsernames == null ? other$activeUsernames != null : !this$activeUsernames.equals(other$activeUsernames))
            return false;
        final Object this$emojiStatusCustomEmojiId = this.getEmojiStatusCustomEmojiId();
        final Object other$emojiStatusCustomEmojiId = other.getEmojiStatusCustomEmojiId();
        if (this$emojiStatusCustomEmojiId == null ? other$emojiStatusCustomEmojiId != null : !this$emojiStatusCustomEmojiId.equals(other$emojiStatusCustomEmojiId))
            return false;
        final Object this$emojiStatusExpirationDate = this.getEmojiStatusExpirationDate();
        final Object other$emojiStatusExpirationDate = other.getEmojiStatusExpirationDate();
        if (this$emojiStatusExpirationDate == null ? other$emojiStatusExpirationDate != null : !this$emojiStatusExpirationDate.equals(other$emojiStatusExpirationDate))
            return false;
        final Object this$bio = this.getBio();
        final Object other$bio = other.getBio();
        if (this$bio == null ? other$bio != null : !this$bio.equals(other$bio)) return false;
        final Object this$hasPrivateForwards = this.getHasPrivateForwards();
        final Object other$hasPrivateForwards = other.getHasPrivateForwards();
        if (this$hasPrivateForwards == null ? other$hasPrivateForwards != null : !this$hasPrivateForwards.equals(other$hasPrivateForwards))
            return false;
        final Object this$hasRestrictedVoiceAndVideoMessages = this.getHasRestrictedVoiceAndVideoMessages();
        final Object other$hasRestrictedVoiceAndVideoMessages = other.getHasRestrictedVoiceAndVideoMessages();
        if (this$hasRestrictedVoiceAndVideoMessages == null ? other$hasRestrictedVoiceAndVideoMessages != null : !this$hasRestrictedVoiceAndVideoMessages.equals(other$hasRestrictedVoiceAndVideoMessages))
            return false;
        final Object this$joinToSendMessages = this.getJoinToSendMessages();
        final Object other$joinToSendMessages = other.getJoinToSendMessages();
        if (this$joinToSendMessages == null ? other$joinToSendMessages != null : !this$joinToSendMessages.equals(other$joinToSendMessages))
            return false;
        final Object this$joinByRequest = this.getJoinByRequest();
        final Object other$joinByRequest = other.getJoinByRequest();
        if (this$joinByRequest == null ? other$joinByRequest != null : !this$joinByRequest.equals(other$joinByRequest))
            return false;
        final Object this$description = this.getDescription();
        final Object other$description = other.getDescription();
        if (this$description == null ? other$description != null : !this$description.equals(other$description))
            return false;
        final Object this$inviteLink = this.getInviteLink();
        final Object other$inviteLink = other.getInviteLink();
        if (this$inviteLink == null ? other$inviteLink != null : !this$inviteLink.equals(other$inviteLink))
            return false;
        final Object this$pinnedMessage = this.getPinnedMessage();
        final Object other$pinnedMessage = other.getPinnedMessage();
        if (this$pinnedMessage == null ? other$pinnedMessage != null : !this$pinnedMessage.equals(other$pinnedMessage))
            return false;
        final Object this$permissions = this.getPermissions();
        final Object other$permissions = other.getPermissions();
        if (this$permissions == null ? other$permissions != null : !this$permissions.equals(other$permissions))
            return false;
        final Object this$slowModeDelay = this.getSlowModeDelay();
        final Object other$slowModeDelay = other.getSlowModeDelay();
        if (this$slowModeDelay == null ? other$slowModeDelay != null : !this$slowModeDelay.equals(other$slowModeDelay))
            return false;
        final Object this$messageAutoDeleteTime = this.getMessageAutoDeleteTime();
        final Object other$messageAutoDeleteTime = other.getMessageAutoDeleteTime();
        if (this$messageAutoDeleteTime == null ? other$messageAutoDeleteTime != null : !this$messageAutoDeleteTime.equals(other$messageAutoDeleteTime))
            return false;
        final Object this$hasAggressiveAntiSpamEnabled = this.getHasAggressiveAntiSpamEnabled();
        final Object other$hasAggressiveAntiSpamEnabled = other.getHasAggressiveAntiSpamEnabled();
        if (this$hasAggressiveAntiSpamEnabled == null ? other$hasAggressiveAntiSpamEnabled != null : !this$hasAggressiveAntiSpamEnabled.equals(other$hasAggressiveAntiSpamEnabled))
            return false;
        final Object this$hasHiddenMembers = this.getHasHiddenMembers();
        final Object other$hasHiddenMembers = other.getHasHiddenMembers();
        if (this$hasHiddenMembers == null ? other$hasHiddenMembers != null : !this$hasHiddenMembers.equals(other$hasHiddenMembers))
            return false;
        final Object this$hasProtectedContent = this.getHasProtectedContent();
        final Object other$hasProtectedContent = other.getHasProtectedContent();
        if (this$hasProtectedContent == null ? other$hasProtectedContent != null : !this$hasProtectedContent.equals(other$hasProtectedContent))
            return false;
        final Object this$stickerSetName = this.getStickerSetName();
        final Object other$stickerSetName = other.getStickerSetName();
        if (this$stickerSetName == null ? other$stickerSetName != null : !this$stickerSetName.equals(other$stickerSetName))
            return false;
        final Object this$canSetStickerSet = this.getCanSetStickerSet();
        final Object other$canSetStickerSet = other.getCanSetStickerSet();
        if (this$canSetStickerSet == null ? other$canSetStickerSet != null : !this$canSetStickerSet.equals(other$canSetStickerSet))
            return false;
        final Object this$linkedChatId = this.getLinkedChatId();
        final Object other$linkedChatId = other.getLinkedChatId();
        if (this$linkedChatId == null ? other$linkedChatId != null : !this$linkedChatId.equals(other$linkedChatId))
            return false;
        final Object this$location = this.getLocation();
        final Object other$location = other.getLocation();
        if (this$location == null ? other$location != null : !this$location.equals(other$location)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Chat;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        final Object $title = this.getTitle();
        result = result * PRIME + ($title == null ? 43 : $title.hashCode());
        final Object $username = this.getUsername();
        result = result * PRIME + ($username == null ? 43 : $username.hashCode());
        final Object $firstName = this.getFirstName();
        result = result * PRIME + ($firstName == null ? 43 : $firstName.hashCode());
        final Object $lastName = this.getLastName();
        result = result * PRIME + ($lastName == null ? 43 : $lastName.hashCode());
        final Object $isForum = this.getIsForum();
        result = result * PRIME + ($isForum == null ? 43 : $isForum.hashCode());
        final Object $photo = this.getPhoto();
        result = result * PRIME + ($photo == null ? 43 : $photo.hashCode());
        final Object $activeUsernames = this.getActiveUsernames();
        result = result * PRIME + ($activeUsernames == null ? 43 : $activeUsernames.hashCode());
        final Object $emojiStatusCustomEmojiId = this.getEmojiStatusCustomEmojiId();
        result = result * PRIME + ($emojiStatusCustomEmojiId == null ? 43 : $emojiStatusCustomEmojiId.hashCode());
        final Object $emojiStatusExpirationDate = this.getEmojiStatusExpirationDate();
        result = result * PRIME + ($emojiStatusExpirationDate == null ? 43 : $emojiStatusExpirationDate.hashCode());
        final Object $bio = this.getBio();
        result = result * PRIME + ($bio == null ? 43 : $bio.hashCode());
        final Object $hasPrivateForwards = this.getHasPrivateForwards();
        result = result * PRIME + ($hasPrivateForwards == null ? 43 : $hasPrivateForwards.hashCode());
        final Object $hasRestrictedVoiceAndVideoMessages = this.getHasRestrictedVoiceAndVideoMessages();
        result = result * PRIME + ($hasRestrictedVoiceAndVideoMessages == null ? 43 : $hasRestrictedVoiceAndVideoMessages.hashCode());
        final Object $joinToSendMessages = this.getJoinToSendMessages();
        result = result * PRIME + ($joinToSendMessages == null ? 43 : $joinToSendMessages.hashCode());
        final Object $joinByRequest = this.getJoinByRequest();
        result = result * PRIME + ($joinByRequest == null ? 43 : $joinByRequest.hashCode());
        final Object $description = this.getDescription();
        result = result * PRIME + ($description == null ? 43 : $description.hashCode());
        final Object $inviteLink = this.getInviteLink();
        result = result * PRIME + ($inviteLink == null ? 43 : $inviteLink.hashCode());
        final Object $pinnedMessage = this.getPinnedMessage();
        result = result * PRIME + ($pinnedMessage == null ? 43 : $pinnedMessage.hashCode());
        final Object $permissions = this.getPermissions();
        result = result * PRIME + ($permissions == null ? 43 : $permissions.hashCode());
        final Object $slowModeDelay = this.getSlowModeDelay();
        result = result * PRIME + ($slowModeDelay == null ? 43 : $slowModeDelay.hashCode());
        final Object $messageAutoDeleteTime = this.getMessageAutoDeleteTime();
        result = result * PRIME + ($messageAutoDeleteTime == null ? 43 : $messageAutoDeleteTime.hashCode());
        final Object $hasAggressiveAntiSpamEnabled = this.getHasAggressiveAntiSpamEnabled();
        result = result * PRIME + ($hasAggressiveAntiSpamEnabled == null ? 43 : $hasAggressiveAntiSpamEnabled.hashCode());
        final Object $hasHiddenMembers = this.getHasHiddenMembers();
        result = result * PRIME + ($hasHiddenMembers == null ? 43 : $hasHiddenMembers.hashCode());
        final Object $hasProtectedContent = this.getHasProtectedContent();
        result = result * PRIME + ($hasProtectedContent == null ? 43 : $hasProtectedContent.hashCode());
        final Object $stickerSetName = this.getStickerSetName();
        result = result * PRIME + ($stickerSetName == null ? 43 : $stickerSetName.hashCode());
        final Object $canSetStickerSet = this.getCanSetStickerSet();
        result = result * PRIME + ($canSetStickerSet == null ? 43 : $canSetStickerSet.hashCode());
        final Object $linkedChatId = this.getLinkedChatId();
        result = result * PRIME + ($linkedChatId == null ? 43 : $linkedChatId.hashCode());
        final Object $location = this.getLocation();
        result = result * PRIME + ($location == null ? 43 : $location.hashCode());
        return result;
    }

    public String toString() {
        return "Chat(id=" + this.getId() + ", type=" + this.getType() + ", title=" + this.getTitle() + ", username=" + this.getUsername() + ", firstName=" + this.getFirstName() + ", lastName=" + this.getLastName() + ", isForum=" + this.getIsForum() + ", photo=" + this.getPhoto() + ", activeUsernames=" + this.getActiveUsernames() + ", emojiStatusCustomEmojiId=" + this.getEmojiStatusCustomEmojiId() + ", emojiStatusExpirationDate=" + this.getEmojiStatusExpirationDate() + ", bio=" + this.getBio() + ", hasPrivateForwards=" + this.getHasPrivateForwards() + ", hasRestrictedVoiceAndVideoMessages=" + this.getHasRestrictedVoiceAndVideoMessages() + ", joinToSendMessages=" + this.getJoinToSendMessages() + ", joinByRequest=" + this.getJoinByRequest() + ", description=" + this.getDescription() + ", inviteLink=" + this.getInviteLink() + ", pinnedMessage=" + this.getPinnedMessage() + ", permissions=" + this.getPermissions() + ", slowModeDelay=" + this.getSlowModeDelay() + ", messageAutoDeleteTime=" + this.getMessageAutoDeleteTime() + ", hasAggressiveAntiSpamEnabled=" + this.getHasAggressiveAntiSpamEnabled() + ", hasHiddenMembers=" + this.getHasHiddenMembers() + ", hasProtectedContent=" + this.getHasProtectedContent() + ", stickerSetName=" + this.getStickerSetName() + ", canSetStickerSet=" + this.getCanSetStickerSet() + ", linkedChatId=" + this.getLinkedChatId() + ", location=" + this.getLocation() + ")";
    }

    public static class ChatBuilder {
        private Long id;
        private String type;
        private String title;
        private String username;
        private String firstName;
        private String lastName;
        private Boolean isForum;
        private ChatPhoto photo;
        private List<String> activeUsernames;
        private String emojiStatusCustomEmojiId;
        private Integer emojiStatusExpirationDate;
        private String bio;
        private Boolean hasPrivateForwards;
        private Boolean hasRestrictedVoiceAndVideoMessages;
        private Boolean joinToSendMessages;
        private Boolean joinByRequest;
        private String description;
        private String inviteLink;
        private Message pinnedMessage;
        private ChatPermissions permissions;
        private Integer slowModeDelay;
        private Integer messageAutoDeleteTime;
        private Boolean hasAggressiveAntiSpamEnabled;
        private Boolean hasHiddenMembers;
        private Boolean hasProtectedContent;
        private String stickerSetName;
        private Boolean canSetStickerSet;
        private Long linkedChatId;
        private ChatLocation location;

        ChatBuilder() {
        }

        @JsonProperty("id")
        public ChatBuilder id(Long id) {
            this.id = id;
            return this;
        }

        @JsonProperty("type")
        public ChatBuilder type(String type) {
            this.type = type;
            return this;
        }

        @JsonProperty("title")
        public ChatBuilder title(String title) {
            this.title = title;
            return this;
        }

        @JsonProperty("username")
        public ChatBuilder username(String username) {
            this.username = username;
            return this;
        }

        @JsonProperty("first_name")
        public ChatBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        @JsonProperty("last_name")
        public ChatBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        @JsonProperty("is_forum")
        public ChatBuilder isForum(Boolean isForum) {
            this.isForum = isForum;
            return this;
        }

        @JsonProperty("photo")
        public ChatBuilder photo(ChatPhoto photo) {
            this.photo = photo;
            return this;
        }

        @JsonProperty("active_usernames")
        public ChatBuilder activeUsernames(List<String> activeUsernames) {
            this.activeUsernames = activeUsernames;
            return this;
        }

        @JsonProperty("emoji_status_custom_emoji_id")
        public ChatBuilder emojiStatusCustomEmojiId(String emojiStatusCustomEmojiId) {
            this.emojiStatusCustomEmojiId = emojiStatusCustomEmojiId;
            return this;
        }

        @JsonProperty("emoji_status_expiration_date")
        public ChatBuilder emojiStatusExpirationDate(Integer emojiStatusExpirationDate) {
            this.emojiStatusExpirationDate = emojiStatusExpirationDate;
            return this;
        }

        @JsonProperty("bio")
        public ChatBuilder bio(String bio) {
            this.bio = bio;
            return this;
        }

        @JsonProperty("has_private_forwards")
        public ChatBuilder hasPrivateForwards(Boolean hasPrivateForwards) {
            this.hasPrivateForwards = hasPrivateForwards;
            return this;
        }

        @JsonProperty("has_restricted_voice_and_video_messages")
        public ChatBuilder hasRestrictedVoiceAndVideoMessages(Boolean hasRestrictedVoiceAndVideoMessages) {
            this.hasRestrictedVoiceAndVideoMessages = hasRestrictedVoiceAndVideoMessages;
            return this;
        }

        @JsonProperty("join_to_send_messages")
        public ChatBuilder joinToSendMessages(Boolean joinToSendMessages) {
            this.joinToSendMessages = joinToSendMessages;
            return this;
        }

        @JsonProperty("join_by_request")
        public ChatBuilder joinByRequest(Boolean joinByRequest) {
            this.joinByRequest = joinByRequest;
            return this;
        }

        @JsonProperty("description")
        public ChatBuilder description(String description) {
            this.description = description;
            return this;
        }

        @JsonProperty("invite_link")
        public ChatBuilder inviteLink(String inviteLink) {
            this.inviteLink = inviteLink;
            return this;
        }

        @JsonProperty("pinned_message")
        public ChatBuilder pinnedMessage(Message pinnedMessage) {
            this.pinnedMessage = pinnedMessage;
            return this;
        }

        @JsonProperty("permission")
        public ChatBuilder permissions(ChatPermissions permissions) {
            this.permissions = permissions;
            return this;
        }

        @JsonProperty("slow_mode_delay")
        public ChatBuilder slowModeDelay(Integer slowModeDelay) {
            this.slowModeDelay = slowModeDelay;
            return this;
        }

        @JsonProperty("message_auto_delete_time")
        public ChatBuilder messageAutoDeleteTime(Integer messageAutoDeleteTime) {
            this.messageAutoDeleteTime = messageAutoDeleteTime;
            return this;
        }

        @JsonProperty("has_aggressive_anti_spam_enabled")
        public ChatBuilder hasAggressiveAntiSpamEnabled(Boolean hasAggressiveAntiSpamEnabled) {
            this.hasAggressiveAntiSpamEnabled = hasAggressiveAntiSpamEnabled;
            return this;
        }

        @JsonProperty("has_hidden_members")
        public ChatBuilder hasHiddenMembers(Boolean hasHiddenMembers) {
            this.hasHiddenMembers = hasHiddenMembers;
            return this;
        }

        @JsonProperty("has_protected_content")
        public ChatBuilder hasProtectedContent(Boolean hasProtectedContent) {
            this.hasProtectedContent = hasProtectedContent;
            return this;
        }

        @JsonProperty("sticker_set_name")
        public ChatBuilder stickerSetName(String stickerSetName) {
            this.stickerSetName = stickerSetName;
            return this;
        }

        @JsonProperty("can_set_sticker_set")
        public ChatBuilder canSetStickerSet(Boolean canSetStickerSet) {
            this.canSetStickerSet = canSetStickerSet;
            return this;
        }

        @JsonProperty("linked_chat_id")
        public ChatBuilder linkedChatId(Long linkedChatId) {
            this.linkedChatId = linkedChatId;
            return this;
        }

        @JsonProperty("location")
        public ChatBuilder location(ChatLocation location) {
            this.location = location;
            return this;
        }

        public Chat build() {
            return new Chat(this.id, this.type, this.title, this.username, this.firstName, this.lastName, this.isForum, this.photo, this.activeUsernames, this.emojiStatusCustomEmojiId, this.emojiStatusExpirationDate, this.bio, this.hasPrivateForwards, this.hasRestrictedVoiceAndVideoMessages, this.joinToSendMessages, this.joinByRequest, this.description, this.inviteLink, this.pinnedMessage, this.permissions, this.slowModeDelay, this.messageAutoDeleteTime, this.hasAggressiveAntiSpamEnabled, this.hasHiddenMembers, this.hasProtectedContent, this.stickerSetName, this.canSetStickerSet, this.linkedChatId, this.location);
        }

        public String toString() {
            return "Chat.ChatBuilder(id=" + this.id + ", type=" + this.type + ", title=" + this.title + ", username=" + this.username + ", firstName=" + this.firstName + ", lastName=" + this.lastName + ", isForum=" + this.isForum + ", photo=" + this.photo + ", activeUsernames=" + this.activeUsernames + ", emojiStatusCustomEmojiId=" + this.emojiStatusCustomEmojiId + ", emojiStatusExpirationDate=" + this.emojiStatusExpirationDate + ", bio=" + this.bio + ", hasPrivateForwards=" + this.hasPrivateForwards + ", hasRestrictedVoiceAndVideoMessages=" + this.hasRestrictedVoiceAndVideoMessages + ", joinToSendMessages=" + this.joinToSendMessages + ", joinByRequest=" + this.joinByRequest + ", description=" + this.description + ", inviteLink=" + this.inviteLink + ", pinnedMessage=" + this.pinnedMessage + ", permissions=" + this.permissions + ", slowModeDelay=" + this.slowModeDelay + ", messageAutoDeleteTime=" + this.messageAutoDeleteTime + ", hasAggressiveAntiSpamEnabled=" + this.hasAggressiveAntiSpamEnabled + ", hasHiddenMembers=" + this.hasHiddenMembers + ", hasProtectedContent=" + this.hasProtectedContent + ", stickerSetName=" + this.stickerSetName + ", canSetStickerSet=" + this.canSetStickerSet + ", linkedChatId=" + this.linkedChatId + ", location=" + this.location + ")";
        }
    }
}
