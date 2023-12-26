package api.objects.message;

import api.objects.BotApiObject;
import api.objects.chat.Chat;
import api.objects.chat.ChatShared;
import api.objects.forum.*;
import api.objects.keyboard.InlineKeyboardMarkup;
import api.objects.media.*;
import api.objects.misc.*;
import api.objects.pool.Poll;
import api.objects.user.User;
import api.objects.user.UserShared;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Message implements BotApiObject {
    @JsonProperty("message_id")
    private Integer messageId;
    @JsonProperty("message_thread_id")
    private Integer messageThreadId;
    @JsonProperty("form")
    private User from;
    @JsonProperty("sender_chat")
    private Chat senderChat;
    @JsonProperty("date")
    private Integer date;
    @JsonProperty("chat")
    private Chat chat;
    @JsonProperty("forward_from")
    private User forwardFrom;
    @JsonProperty("forward_from_chat")
    private Chat forwardFromChat;
    @JsonProperty("forward_from_message_id")
    private Integer forwardFromMessageId;
    @JsonProperty("forward_signature")
    private String forwardSignature;
    @JsonProperty("forward_sender_name")
    private String forwardSenderName;
    @JsonProperty("forward_date")
    private Integer forwardDate;
    @JsonProperty("is_topic_message")
    private Boolean isTopicMessage;
    @JsonProperty("is_automatic_forward")
    private Boolean isAutomaticForward;
    @JsonProperty("reply_to_message")
    private Message replyToMessage;
    @JsonProperty("via_bot")
    private User viaBot;
    @JsonProperty("edit_date")
    private Integer editDate;
    @JsonProperty("has_protected_content")
    private Boolean hasProtectedContent;
    @JsonProperty("media_group_id")
    private String mediaGroupId;
    @JsonProperty("author_signature")
    private String authorSignature;
    @JsonProperty("text")
    private String text;
    @JsonProperty("entities")
    private List<MessageEntity> entities;
    @JsonProperty("animation")
    private Animation animation;
    @JsonProperty("audio")
    private Audio audio;
    @JsonProperty("document")
    private Document document;
    @JsonProperty("photo")
    private List<PhotoSize> photo;
    @JsonProperty("sticker")
    private Sticker sticker;
    @JsonProperty("story")
    private Story story;
    @JsonProperty("video")
    private Video video;
    @JsonProperty("video_note")
    private VideoNote videoNote;
    @JsonProperty("voice")
    private Voice voice;
    @JsonProperty("caption")
    private String caption;
    @JsonProperty("caption_entities")
    private List<MessageEntity> captionEntities;
    @JsonProperty("has_media_spoiler")
    private Boolean hasMediaSpoiler;
    @JsonProperty("contact")
    private Contact contact;
    @JsonProperty("dice")
    private Dice dice;
    //    @JsonProperty("game")
//    private Game game;
    @JsonProperty("poll")
    private Poll poll;
    @JsonProperty("venue")
    private Venue venue;
    @JsonProperty("location")
    private Location location;
    @JsonProperty("new_chat_members")
    private List<User> newChatMembers;
    @JsonProperty("left_chat_members")
    private User leftChatMember;
    @JsonProperty("new_chat_title")
    private String newChatTitle;
    @JsonProperty("new_chat_photo")
    private List<PhotoSize> newChatPhoto;
    @JsonProperty("delete_chat_photo")
    private Boolean deleteChatPhoto;
    @JsonProperty("group_chat_created")
    private Boolean groupChatCreated;
    @JsonProperty("supergroup_chat_created")
    private Boolean supergroupChatCreated;
    @JsonProperty("channel_chat_created")
    private Boolean channelChatCreated;
    @JsonProperty("message_auto_delete_timer")
    private MessageAutoDeleteTimerChanged messageAutoDeleteTimerChanged;
    @JsonProperty("migrate_to_chat_id")
    private Long migrateToChatId;
    @JsonProperty("migrate_from_chat_id")
    private Long migrateFromChatId;
    @JsonProperty("pinned_message")
    private Message pinnedMessage;
    //    @JsonProperty("invoice")
//    private Invoice invoice;
//    @JsonProperty("successful_payment")
//    private SuccessfulPayment successfulPayment;
    @JsonProperty("user_shared")
    private UserShared userShared;
    @JsonProperty("chat_shared")
    private ChatShared chatShared;
    @JsonProperty("connected_website")
    private String connectedWebsite;
    @JsonProperty("write_access_allowed")
    private WriteAccessAllowed writeAccessAllowed;
    //    @JsonProperty("passport_data")
//    private PassportData passportData;
    @JsonProperty("proximity_alert_triggered")
    private ProximityAlertTriggered proximityAlertTriggered;
    @JsonProperty("forum_topic_created")
    private ForumTopicCreated forumTopicCreated;
    @JsonProperty("forum_topic_edited")
    private ForumTopicEdited forumTopicEdited;
    @JsonProperty("forum_topic_closed")
    private ForumTopicClosed forumTopicClosed;
    @JsonProperty("forum_topic_reopened")
    private ForumTopicReopened forumTopicReopened;
    @JsonProperty("general_forum_topic_hidden")
    private GeneralForumTopicHidden generalForumTopicHidden;
    @JsonProperty("general_forum_topic_unhidden")
    private GeneralForumTopicUnhidden generalForumTopicUnhidden;
    @JsonProperty("video_chat_scheduled")
    private VideoChatScheduled videoChatScheduled;
    @JsonProperty("video_chat_started")
    private VideoChatStarted videoChatStarted;
    @JsonProperty("video_chat_ended")
    private VideoChatEnded videoChatEnded;
    @JsonProperty("video_chat_participants_invited")
    private VideoChatParticipantsInvited videoChatParticipantsInvited;
    @JsonProperty("web_app_data")
    private WebAppData webAppData;
    @JsonProperty("reply_markup")
    private InlineKeyboardMarkup replyMarkup;

    Message(Integer messageId, Integer messageThreadId, User from, Chat senderChat, Integer date, Chat chat, User forwardFrom, Chat forwardFromChat, Integer forwardFromMessageId, String forwardSignature, String forwardSenderName, Integer forwardDate, Boolean isTopicMessage, Boolean isAutomaticForward, Message replyToMessage, User viaBot, Integer editDate, Boolean hasProtectedContent, String mediaGroupId, String authorSignature, String text, List<MessageEntity> entities, Animation animation, Audio audio, Document document, List<PhotoSize> photo, Story story, Video video, VideoNote videoNote, Voice voice, String caption, List<MessageEntity> captionEntities, Boolean hasMediaSpoiler, Contact contact, Dice dice, Poll poll, Venue venue, Location location, List<User> newChatMembers, User leftChatMember, String newChatTitle, List<PhotoSize> newChatPhoto, Boolean deleteChatPhoto, Boolean groupChatCreated, Boolean supergroupChatCreated, Boolean channelChatCreated, MessageAutoDeleteTimerChanged messageAutoDeleteTimerChanged, Long migrateToChatId, Long migrateFromChatId, Message pinnedMessage, UserShared userShared, ChatShared chatShared, String connectedWebsite, WriteAccessAllowed writeAccessAllowed, ProximityAlertTriggered proximityAlertTriggered, ForumTopicCreated forumTopicCreated, ForumTopicEdited forumTopicEdited, ForumTopicClosed forumTopicClosed, ForumTopicReopened forumTopicReopened, GeneralForumTopicHidden generalForumTopicHidden, GeneralForumTopicUnhidden generalForumTopicUnhidden, VideoChatScheduled videoChatScheduled, VideoChatStarted videoChatStarted, VideoChatEnded videoChatEnded, VideoChatParticipantsInvited videoChatParticipantsInvited, WebAppData webAppData, InlineKeyboardMarkup replyMarkup) {
        this.messageId = messageId;
        this.messageThreadId = messageThreadId;
        this.from = from;
        this.senderChat = senderChat;
        this.date = date;
        this.chat = chat;
        this.forwardFrom = forwardFrom;
        this.forwardFromChat = forwardFromChat;
        this.forwardFromMessageId = forwardFromMessageId;
        this.forwardSignature = forwardSignature;
        this.forwardSenderName = forwardSenderName;
        this.forwardDate = forwardDate;
        this.isTopicMessage = isTopicMessage;
        this.isAutomaticForward = isAutomaticForward;
        this.replyToMessage = replyToMessage;
        this.viaBot = viaBot;
        this.editDate = editDate;
        this.hasProtectedContent = hasProtectedContent;
        this.mediaGroupId = mediaGroupId;
        this.authorSignature = authorSignature;
        this.text = text;
        this.entities = entities;
        this.animation = animation;
        this.audio = audio;
        this.document = document;
        this.photo = photo;
        this.story = story;
        this.video = video;
        this.videoNote = videoNote;
        this.voice = voice;
        this.caption = caption;
        this.captionEntities = captionEntities;
        this.hasMediaSpoiler = hasMediaSpoiler;
        this.contact = contact;
        this.dice = dice;
        this.poll = poll;
        this.venue = venue;
        this.location = location;
        this.newChatMembers = newChatMembers;
        this.leftChatMember = leftChatMember;
        this.newChatTitle = newChatTitle;
        this.newChatPhoto = newChatPhoto;
        this.deleteChatPhoto = deleteChatPhoto;
        this.groupChatCreated = groupChatCreated;
        this.supergroupChatCreated = supergroupChatCreated;
        this.channelChatCreated = channelChatCreated;
        this.messageAutoDeleteTimerChanged = messageAutoDeleteTimerChanged;
        this.migrateToChatId = migrateToChatId;
        this.migrateFromChatId = migrateFromChatId;
        this.pinnedMessage = pinnedMessage;
        this.userShared = userShared;
        this.chatShared = chatShared;
        this.connectedWebsite = connectedWebsite;
        this.writeAccessAllowed = writeAccessAllowed;
        this.proximityAlertTriggered = proximityAlertTriggered;
        this.forumTopicCreated = forumTopicCreated;
        this.forumTopicEdited = forumTopicEdited;
        this.forumTopicClosed = forumTopicClosed;
        this.forumTopicReopened = forumTopicReopened;
        this.generalForumTopicHidden = generalForumTopicHidden;
        this.generalForumTopicUnhidden = generalForumTopicUnhidden;
        this.videoChatScheduled = videoChatScheduled;
        this.videoChatStarted = videoChatStarted;
        this.videoChatEnded = videoChatEnded;
        this.videoChatParticipantsInvited = videoChatParticipantsInvited;
        this.webAppData = webAppData;
        this.replyMarkup = replyMarkup;
    }

    public static MessageBuilder builder() {
        return new MessageBuilder();
    }

    public Integer getMessageId() {
        return this.messageId;
    }

    public Integer getMessageThreadId() {
        return this.messageThreadId;
    }

    public User getFrom() {
        return this.from;
    }

    public Chat getSenderChat() {
        return this.senderChat;
    }

    public Integer getDate() {
        return this.date;
    }

    public Chat getChat() {
        return this.chat;
    }

    public User getForwardFrom() {
        return this.forwardFrom;
    }

    public Chat getForwardFromChat() {
        return this.forwardFromChat;
    }

    public Integer getForwardFromMessageId() {
        return this.forwardFromMessageId;
    }

    public String getForwardSignature() {
        return this.forwardSignature;
    }

    public String getForwardSenderName() {
        return this.forwardSenderName;
    }

    public Integer getForwardDate() {
        return this.forwardDate;
    }

    public Boolean getIsTopicMessage() {
        return this.isTopicMessage;
    }

    public Boolean getIsAutomaticForward() {
        return this.isAutomaticForward;
    }

    public Message getReplyToMessage() {
        return this.replyToMessage;
    }

    public User getViaBot() {
        return this.viaBot;
    }

    public Integer getEditDate() {
        return this.editDate;
    }

    public Boolean getHasProtectedContent() {
        return this.hasProtectedContent;
    }

    public String getMediaGroupId() {
        return this.mediaGroupId;
    }

    public String getAuthorSignature() {
        return this.authorSignature;
    }

    public String getText() {
        return this.text;
    }

    public List<MessageEntity> getEntities() {
        return this.entities;
    }

    public Animation getAnimation() {
        return this.animation;
    }

    public Audio getAudio() {
        return this.audio;
    }

    public Document getDocument() {
        return this.document;
    }

    public List<PhotoSize> getPhoto() {
        return this.photo;
    }

    public Story getStory() {
        return this.story;
    }

    public Video getVideo() {
        return this.video;
    }

    public VideoNote getVideoNote() {
        return this.videoNote;
    }

    public Voice getVoice() {
        return this.voice;
    }

    public String getCaption() {
        return this.caption;
    }

    public List<MessageEntity> getCaptionEntities() {
        return this.captionEntities;
    }

    public Boolean getHasMediaSpoiler() {
        return this.hasMediaSpoiler;
    }

    public Contact getContact() {
        return this.contact;
    }

    public Dice getDice() {
        return this.dice;
    }

    public Poll getPoll() {
        return this.poll;
    }

    public Venue getVenue() {
        return this.venue;
    }

    public Location getLocation() {
        return this.location;
    }

    public List<User> getNewChatMembers() {
        return this.newChatMembers;
    }

    public User getLeftChatMember() {
        return this.leftChatMember;
    }

    public String getNewChatTitle() {
        return this.newChatTitle;
    }

    public List<PhotoSize> getNewChatPhoto() {
        return this.newChatPhoto;
    }

    public Boolean getDeleteChatPhoto() {
        return this.deleteChatPhoto;
    }

    public Boolean getGroupChatCreated() {
        return this.groupChatCreated;
    }

    public Boolean getSupergroupChatCreated() {
        return this.supergroupChatCreated;
    }

    public Boolean getChannelChatCreated() {
        return this.channelChatCreated;
    }

    public MessageAutoDeleteTimerChanged getMessageAutoDeleteTimerChanged() {
        return this.messageAutoDeleteTimerChanged;
    }

    public Long getMigrateToChatId() {
        return this.migrateToChatId;
    }

    public Long getMigrateFromChatId() {
        return this.migrateFromChatId;
    }

    public Message getPinnedMessage() {
        return this.pinnedMessage;
    }

    public UserShared getUserShared() {
        return this.userShared;
    }

    public ChatShared getChatShared() {
        return this.chatShared;
    }

    public String getConnectedWebsite() {
        return this.connectedWebsite;
    }

    public WriteAccessAllowed getWriteAccessAllowed() {
        return this.writeAccessAllowed;
    }

    public ProximityAlertTriggered getProximityAlertTriggered() {
        return this.proximityAlertTriggered;
    }

    public ForumTopicCreated getForumTopicCreated() {
        return this.forumTopicCreated;
    }

    public ForumTopicEdited getForumTopicEdited() {
        return this.forumTopicEdited;
    }

    public ForumTopicClosed getForumTopicClosed() {
        return this.forumTopicClosed;
    }

    public ForumTopicReopened getForumTopicReopened() {
        return this.forumTopicReopened;
    }

    public GeneralForumTopicHidden getGeneralForumTopicHidden() {
        return this.generalForumTopicHidden;
    }

    public GeneralForumTopicUnhidden getGeneralForumTopicUnhidden() {
        return this.generalForumTopicUnhidden;
    }

    public VideoChatScheduled getVideoChatScheduled() {
        return this.videoChatScheduled;
    }

    public VideoChatStarted getVideoChatStarted() {
        return this.videoChatStarted;
    }

    public VideoChatEnded getVideoChatEnded() {
        return this.videoChatEnded;
    }

    public VideoChatParticipantsInvited getVideoChatParticipantsInvited() {
        return this.videoChatParticipantsInvited;
    }

    public WebAppData getWebAppData() {
        return this.webAppData;
    }

    public InlineKeyboardMarkup getReplyMarkup() {
        return this.replyMarkup;
    }

    @JsonProperty("message_id")
    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    @JsonProperty("message_thread_id")
    public void setMessageThreadId(Integer messageThreadId) {
        this.messageThreadId = messageThreadId;
    }

    @JsonProperty("form")
    public void setFrom(User from) {
        this.from = from;
    }

    @JsonProperty("sender_chat")
    public void setSenderChat(Chat senderChat) {
        this.senderChat = senderChat;
    }

    @JsonProperty("date")
    public void setDate(Integer date) {
        this.date = date;
    }

    @JsonProperty("chat")
    public void setChat(Chat chat) {
        this.chat = chat;
    }

    @JsonProperty("forward_from")
    public void setForwardFrom(User forwardFrom) {
        this.forwardFrom = forwardFrom;
    }

    @JsonProperty("forward_from_chat")
    public void setForwardFromChat(Chat forwardFromChat) {
        this.forwardFromChat = forwardFromChat;
    }

    @JsonProperty("forward_from_message_id")
    public void setForwardFromMessageId(Integer forwardFromMessageId) {
        this.forwardFromMessageId = forwardFromMessageId;
    }

    @JsonProperty("forward_signature")
    public void setForwardSignature(String forwardSignature) {
        this.forwardSignature = forwardSignature;
    }

    @JsonProperty("forward_sender_name")
    public void setForwardSenderName(String forwardSenderName) {
        this.forwardSenderName = forwardSenderName;
    }

    @JsonProperty("forward_date")
    public void setForwardDate(Integer forwardDate) {
        this.forwardDate = forwardDate;
    }

    @JsonProperty("is_topic_message")
    public void setIsTopicMessage(Boolean isTopicMessage) {
        this.isTopicMessage = isTopicMessage;
    }

    @JsonProperty("is_automatic_forward")
    public void setIsAutomaticForward(Boolean isAutomaticForward) {
        this.isAutomaticForward = isAutomaticForward;
    }

    @JsonProperty("reply_to_message")
    public void setReplyToMessage(Message replyToMessage) {
        this.replyToMessage = replyToMessage;
    }

    @JsonProperty("via_bot")
    public void setViaBot(User viaBot) {
        this.viaBot = viaBot;
    }

    @JsonProperty("edit_date")
    public void setEditDate(Integer editDate) {
        this.editDate = editDate;
    }

    @JsonProperty("has_protected_content")
    public void setHasProtectedContent(Boolean hasProtectedContent) {
        this.hasProtectedContent = hasProtectedContent;
    }

    @JsonProperty("media_group_id")
    public void setMediaGroupId(String mediaGroupId) {
        this.mediaGroupId = mediaGroupId;
    }

    @JsonProperty("author_signature")
    public void setAuthorSignature(String authorSignature) {
        this.authorSignature = authorSignature;
    }

    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    @JsonProperty("entities")
    public void setEntities(List<MessageEntity> entities) {
        this.entities = entities;
    }

    @JsonProperty("animation")
    public void setAnimation(Animation animation) {
        this.animation = animation;
    }

    @JsonProperty("audio")
    public void setAudio(Audio audio) {
        this.audio = audio;
    }

    @JsonProperty("document")
    public void setDocument(Document document) {
        this.document = document;
    }

    @JsonProperty("photo")
    public void setPhoto(List<PhotoSize> photo) {
        this.photo = photo;
    }

    @JsonProperty("story")
    public void setStory(Story story) {
        this.story = story;
    }

    @JsonProperty("video")
    public void setVideo(Video video) {
        this.video = video;
    }

    @JsonProperty("video_note")
    public void setVideoNote(VideoNote videoNote) {
        this.videoNote = videoNote;
    }

    @JsonProperty("voice")
    public void setVoice(Voice voice) {
        this.voice = voice;
    }

    @JsonProperty("caption")
    public void setCaption(String caption) {
        this.caption = caption;
    }

    @JsonProperty("caption_entities")
    public void setCaptionEntities(List<MessageEntity> captionEntities) {
        this.captionEntities = captionEntities;
    }

    @JsonProperty("has_media_spoiler")
    public void setHasMediaSpoiler(Boolean hasMediaSpoiler) {
        this.hasMediaSpoiler = hasMediaSpoiler;
    }

    @JsonProperty("contact")
    public void setContact(Contact contact) {
        this.contact = contact;
    }

    @JsonProperty("dice")
    public void setDice(Dice dice) {
        this.dice = dice;
    }

    @JsonProperty("poll")
    public void setPoll(Poll poll) {
        this.poll = poll;
    }

    @JsonProperty("venue")
    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    @JsonProperty("location")
    public void setLocation(Location location) {
        this.location = location;
    }

    @JsonProperty("new_chat_members")
    public void setNewChatMembers(List<User> newChatMembers) {
        this.newChatMembers = newChatMembers;
    }

    @JsonProperty("left_chat_members")
    public void setLeftChatMember(User leftChatMember) {
        this.leftChatMember = leftChatMember;
    }

    @JsonProperty("new_chat_title")
    public void setNewChatTitle(String newChatTitle) {
        this.newChatTitle = newChatTitle;
    }

    @JsonProperty("new_chat_photo")
    public void setNewChatPhoto(List<PhotoSize> newChatPhoto) {
        this.newChatPhoto = newChatPhoto;
    }

    @JsonProperty("delete_chat_photo")
    public void setDeleteChatPhoto(Boolean deleteChatPhoto) {
        this.deleteChatPhoto = deleteChatPhoto;
    }

    @JsonProperty("group_chat_created")
    public void setGroupChatCreated(Boolean groupChatCreated) {
        this.groupChatCreated = groupChatCreated;
    }

    @JsonProperty("supergroup_chat_created")
    public void setSupergroupChatCreated(Boolean supergroupChatCreated) {
        this.supergroupChatCreated = supergroupChatCreated;
    }

    @JsonProperty("channel_chat_created")
    public void setChannelChatCreated(Boolean channelChatCreated) {
        this.channelChatCreated = channelChatCreated;
    }

    @JsonProperty("message_auto_delete_timer")
    public void setMessageAutoDeleteTimerChanged(MessageAutoDeleteTimerChanged messageAutoDeleteTimerChanged) {
        this.messageAutoDeleteTimerChanged = messageAutoDeleteTimerChanged;
    }

    @JsonProperty("migrate_to_chat_id")
    public void setMigrateToChatId(Long migrateToChatId) {
        this.migrateToChatId = migrateToChatId;
    }

    @JsonProperty("migrate_from_chat_id")
    public void setMigrateFromChatId(Long migrateFromChatId) {
        this.migrateFromChatId = migrateFromChatId;
    }

    @JsonProperty("pinned_message")
    public void setPinnedMessage(Message pinnedMessage) {
        this.pinnedMessage = pinnedMessage;
    }

    @JsonProperty("user_shared")
    public void setUserShared(UserShared userShared) {
        this.userShared = userShared;
    }

    @JsonProperty("chat_shared")
    public void setChatShared(ChatShared chatShared) {
        this.chatShared = chatShared;
    }

    @JsonProperty("connected_website")
    public void setConnectedWebsite(String connectedWebsite) {
        this.connectedWebsite = connectedWebsite;
    }

    @JsonProperty("write_access_allowed")
    public void setWriteAccessAllowed(WriteAccessAllowed writeAccessAllowed) {
        this.writeAccessAllowed = writeAccessAllowed;
    }

    @JsonProperty("proximity_alert_triggered")
    public void setProximityAlertTriggered(ProximityAlertTriggered proximityAlertTriggered) {
        this.proximityAlertTriggered = proximityAlertTriggered;
    }

    @JsonProperty("forum_topic_created")
    public void setForumTopicCreated(ForumTopicCreated forumTopicCreated) {
        this.forumTopicCreated = forumTopicCreated;
    }

    @JsonProperty("forum_topic_edited")
    public void setForumTopicEdited(ForumTopicEdited forumTopicEdited) {
        this.forumTopicEdited = forumTopicEdited;
    }

    @JsonProperty("forum_topic_closed")
    public void setForumTopicClosed(ForumTopicClosed forumTopicClosed) {
        this.forumTopicClosed = forumTopicClosed;
    }

    @JsonProperty("forum_topic_reopened")
    public void setForumTopicReopened(ForumTopicReopened forumTopicReopened) {
        this.forumTopicReopened = forumTopicReopened;
    }

    @JsonProperty("general_forum_topic_hidden")
    public void setGeneralForumTopicHidden(GeneralForumTopicHidden generalForumTopicHidden) {
        this.generalForumTopicHidden = generalForumTopicHidden;
    }

    @JsonProperty("general_forum_topic_unhidden")
    public void setGeneralForumTopicUnhidden(GeneralForumTopicUnhidden generalForumTopicUnhidden) {
        this.generalForumTopicUnhidden = generalForumTopicUnhidden;
    }

    @JsonProperty("video_chat_scheduled")
    public void setVideoChatScheduled(VideoChatScheduled videoChatScheduled) {
        this.videoChatScheduled = videoChatScheduled;
    }

    @JsonProperty("video_chat_started")
    public void setVideoChatStarted(VideoChatStarted videoChatStarted) {
        this.videoChatStarted = videoChatStarted;
    }

    @JsonProperty("video_chat_ended")
    public void setVideoChatEnded(VideoChatEnded videoChatEnded) {
        this.videoChatEnded = videoChatEnded;
    }

    @JsonProperty("video_chat_participants_invited")
    public void setVideoChatParticipantsInvited(VideoChatParticipantsInvited videoChatParticipantsInvited) {
        this.videoChatParticipantsInvited = videoChatParticipantsInvited;
    }

    @JsonProperty("web_app_data")
    public void setWebAppData(WebAppData webAppData) {
        this.webAppData = webAppData;
    }

    @JsonProperty("reply_markup")
    public void setReplyMarkup(InlineKeyboardMarkup replyMarkup) {
        this.replyMarkup = replyMarkup;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Message)) return false;
        final Message other = (Message) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$messageId = this.getMessageId();
        final Object other$messageId = other.getMessageId();
        if (this$messageId == null ? other$messageId != null : !this$messageId.equals(other$messageId)) return false;
        final Object this$messageThreadId = this.getMessageThreadId();
        final Object other$messageThreadId = other.getMessageThreadId();
        if (this$messageThreadId == null ? other$messageThreadId != null : !this$messageThreadId.equals(other$messageThreadId))
            return false;
        final Object this$from = this.getFrom();
        final Object other$from = other.getFrom();
        if (this$from == null ? other$from != null : !this$from.equals(other$from)) return false;
        final Object this$senderChat = this.getSenderChat();
        final Object other$senderChat = other.getSenderChat();
        if (this$senderChat == null ? other$senderChat != null : !this$senderChat.equals(other$senderChat))
            return false;
        final Object this$date = this.getDate();
        final Object other$date = other.getDate();
        if (this$date == null ? other$date != null : !this$date.equals(other$date)) return false;
        final Object this$chat = this.getChat();
        final Object other$chat = other.getChat();
        if (this$chat == null ? other$chat != null : !this$chat.equals(other$chat)) return false;
        final Object this$forwardFrom = this.getForwardFrom();
        final Object other$forwardFrom = other.getForwardFrom();
        if (this$forwardFrom == null ? other$forwardFrom != null : !this$forwardFrom.equals(other$forwardFrom))
            return false;
        final Object this$forwardFromChat = this.getForwardFromChat();
        final Object other$forwardFromChat = other.getForwardFromChat();
        if (this$forwardFromChat == null ? other$forwardFromChat != null : !this$forwardFromChat.equals(other$forwardFromChat))
            return false;
        final Object this$forwardFromMessageId = this.getForwardFromMessageId();
        final Object other$forwardFromMessageId = other.getForwardFromMessageId();
        if (this$forwardFromMessageId == null ? other$forwardFromMessageId != null : !this$forwardFromMessageId.equals(other$forwardFromMessageId))
            return false;
        final Object this$forwardSignature = this.getForwardSignature();
        final Object other$forwardSignature = other.getForwardSignature();
        if (this$forwardSignature == null ? other$forwardSignature != null : !this$forwardSignature.equals(other$forwardSignature))
            return false;
        final Object this$forwardSenderName = this.getForwardSenderName();
        final Object other$forwardSenderName = other.getForwardSenderName();
        if (this$forwardSenderName == null ? other$forwardSenderName != null : !this$forwardSenderName.equals(other$forwardSenderName))
            return false;
        final Object this$forwardDate = this.getForwardDate();
        final Object other$forwardDate = other.getForwardDate();
        if (this$forwardDate == null ? other$forwardDate != null : !this$forwardDate.equals(other$forwardDate))
            return false;
        final Object this$isTopicMessage = this.getIsTopicMessage();
        final Object other$isTopicMessage = other.getIsTopicMessage();
        if (this$isTopicMessage == null ? other$isTopicMessage != null : !this$isTopicMessage.equals(other$isTopicMessage))
            return false;
        final Object this$isAutomaticForward = this.getIsAutomaticForward();
        final Object other$isAutomaticForward = other.getIsAutomaticForward();
        if (this$isAutomaticForward == null ? other$isAutomaticForward != null : !this$isAutomaticForward.equals(other$isAutomaticForward))
            return false;
        final Object this$replyToMessage = this.getReplyToMessage();
        final Object other$replyToMessage = other.getReplyToMessage();
        if (this$replyToMessage == null ? other$replyToMessage != null : !this$replyToMessage.equals(other$replyToMessage))
            return false;
        final Object this$viaBot = this.getViaBot();
        final Object other$viaBot = other.getViaBot();
        if (this$viaBot == null ? other$viaBot != null : !this$viaBot.equals(other$viaBot)) return false;
        final Object this$editDate = this.getEditDate();
        final Object other$editDate = other.getEditDate();
        if (this$editDate == null ? other$editDate != null : !this$editDate.equals(other$editDate)) return false;
        final Object this$hasProtectedContent = this.getHasProtectedContent();
        final Object other$hasProtectedContent = other.getHasProtectedContent();
        if (this$hasProtectedContent == null ? other$hasProtectedContent != null : !this$hasProtectedContent.equals(other$hasProtectedContent))
            return false;
        final Object this$mediaGroupId = this.getMediaGroupId();
        final Object other$mediaGroupId = other.getMediaGroupId();
        if (this$mediaGroupId == null ? other$mediaGroupId != null : !this$mediaGroupId.equals(other$mediaGroupId))
            return false;
        final Object this$authorSignature = this.getAuthorSignature();
        final Object other$authorSignature = other.getAuthorSignature();
        if (this$authorSignature == null ? other$authorSignature != null : !this$authorSignature.equals(other$authorSignature))
            return false;
        final Object this$text = this.getText();
        final Object other$text = other.getText();
        if (this$text == null ? other$text != null : !this$text.equals(other$text)) return false;
        final Object this$entities = this.getEntities();
        final Object other$entities = other.getEntities();
        if (this$entities == null ? other$entities != null : !this$entities.equals(other$entities)) return false;
        final Object this$animation = this.getAnimation();
        final Object other$animation = other.getAnimation();
        if (this$animation == null ? other$animation != null : !this$animation.equals(other$animation)) return false;
        final Object this$audio = this.getAudio();
        final Object other$audio = other.getAudio();
        if (this$audio == null ? other$audio != null : !this$audio.equals(other$audio)) return false;
        final Object this$document = this.getDocument();
        final Object other$document = other.getDocument();
        if (this$document == null ? other$document != null : !this$document.equals(other$document)) return false;
        final Object this$photo = this.getPhoto();
        final Object other$photo = other.getPhoto();
        if (this$photo == null ? other$photo != null : !this$photo.equals(other$photo)) return false;
        final Object this$story = this.getStory();
        final Object other$story = other.getStory();
        if (this$story == null ? other$story != null : !this$story.equals(other$story)) return false;
        final Object this$video = this.getVideo();
        final Object other$video = other.getVideo();
        if (this$video == null ? other$video != null : !this$video.equals(other$video)) return false;
        final Object this$videoNote = this.getVideoNote();
        final Object other$videoNote = other.getVideoNote();
        if (this$videoNote == null ? other$videoNote != null : !this$videoNote.equals(other$videoNote)) return false;
        final Object this$voice = this.getVoice();
        final Object other$voice = other.getVoice();
        if (this$voice == null ? other$voice != null : !this$voice.equals(other$voice)) return false;
        final Object this$caption = this.getCaption();
        final Object other$caption = other.getCaption();
        if (this$caption == null ? other$caption != null : !this$caption.equals(other$caption)) return false;
        final Object this$captionEntities = this.getCaptionEntities();
        final Object other$captionEntities = other.getCaptionEntities();
        if (this$captionEntities == null ? other$captionEntities != null : !this$captionEntities.equals(other$captionEntities))
            return false;
        final Object this$hasMediaSpoiler = this.getHasMediaSpoiler();
        final Object other$hasMediaSpoiler = other.getHasMediaSpoiler();
        if (this$hasMediaSpoiler == null ? other$hasMediaSpoiler != null : !this$hasMediaSpoiler.equals(other$hasMediaSpoiler))
            return false;
        final Object this$contact = this.getContact();
        final Object other$contact = other.getContact();
        if (this$contact == null ? other$contact != null : !this$contact.equals(other$contact)) return false;
        final Object this$dice = this.getDice();
        final Object other$dice = other.getDice();
        if (this$dice == null ? other$dice != null : !this$dice.equals(other$dice)) return false;
        final Object this$poll = this.getPoll();
        final Object other$poll = other.getPoll();
        if (this$poll == null ? other$poll != null : !this$poll.equals(other$poll)) return false;
        final Object this$venue = this.getVenue();
        final Object other$venue = other.getVenue();
        if (this$venue == null ? other$venue != null : !this$venue.equals(other$venue)) return false;
        final Object this$location = this.getLocation();
        final Object other$location = other.getLocation();
        if (this$location == null ? other$location != null : !this$location.equals(other$location)) return false;
        final Object this$newChatMembers = this.getNewChatMembers();
        final Object other$newChatMembers = other.getNewChatMembers();
        if (this$newChatMembers == null ? other$newChatMembers != null : !this$newChatMembers.equals(other$newChatMembers))
            return false;
        final Object this$leftChatMember = this.getLeftChatMember();
        final Object other$leftChatMember = other.getLeftChatMember();
        if (this$leftChatMember == null ? other$leftChatMember != null : !this$leftChatMember.equals(other$leftChatMember))
            return false;
        final Object this$newChatTitle = this.getNewChatTitle();
        final Object other$newChatTitle = other.getNewChatTitle();
        if (this$newChatTitle == null ? other$newChatTitle != null : !this$newChatTitle.equals(other$newChatTitle))
            return false;
        final Object this$newChatPhoto = this.getNewChatPhoto();
        final Object other$newChatPhoto = other.getNewChatPhoto();
        if (this$newChatPhoto == null ? other$newChatPhoto != null : !this$newChatPhoto.equals(other$newChatPhoto))
            return false;
        final Object this$deleteChatPhoto = this.getDeleteChatPhoto();
        final Object other$deleteChatPhoto = other.getDeleteChatPhoto();
        if (this$deleteChatPhoto == null ? other$deleteChatPhoto != null : !this$deleteChatPhoto.equals(other$deleteChatPhoto))
            return false;
        final Object this$groupChatCreated = this.getGroupChatCreated();
        final Object other$groupChatCreated = other.getGroupChatCreated();
        if (this$groupChatCreated == null ? other$groupChatCreated != null : !this$groupChatCreated.equals(other$groupChatCreated))
            return false;
        final Object this$supergroupChatCreated = this.getSupergroupChatCreated();
        final Object other$supergroupChatCreated = other.getSupergroupChatCreated();
        if (this$supergroupChatCreated == null ? other$supergroupChatCreated != null : !this$supergroupChatCreated.equals(other$supergroupChatCreated))
            return false;
        final Object this$channelChatCreated = this.getChannelChatCreated();
        final Object other$channelChatCreated = other.getChannelChatCreated();
        if (this$channelChatCreated == null ? other$channelChatCreated != null : !this$channelChatCreated.equals(other$channelChatCreated))
            return false;
        final Object this$messageAutoDeleteTimerChanged = this.getMessageAutoDeleteTimerChanged();
        final Object other$messageAutoDeleteTimerChanged = other.getMessageAutoDeleteTimerChanged();
        if (this$messageAutoDeleteTimerChanged == null ? other$messageAutoDeleteTimerChanged != null : !this$messageAutoDeleteTimerChanged.equals(other$messageAutoDeleteTimerChanged))
            return false;
        final Object this$migrateToChatId = this.getMigrateToChatId();
        final Object other$migrateToChatId = other.getMigrateToChatId();
        if (this$migrateToChatId == null ? other$migrateToChatId != null : !this$migrateToChatId.equals(other$migrateToChatId))
            return false;
        final Object this$migrateFromChatId = this.getMigrateFromChatId();
        final Object other$migrateFromChatId = other.getMigrateFromChatId();
        if (this$migrateFromChatId == null ? other$migrateFromChatId != null : !this$migrateFromChatId.equals(other$migrateFromChatId))
            return false;
        final Object this$pinnedMessage = this.getPinnedMessage();
        final Object other$pinnedMessage = other.getPinnedMessage();
        if (this$pinnedMessage == null ? other$pinnedMessage != null : !this$pinnedMessage.equals(other$pinnedMessage))
            return false;
        final Object this$userShared = this.getUserShared();
        final Object other$userShared = other.getUserShared();
        if (this$userShared == null ? other$userShared != null : !this$userShared.equals(other$userShared))
            return false;
        final Object this$chatShared = this.getChatShared();
        final Object other$chatShared = other.getChatShared();
        if (this$chatShared == null ? other$chatShared != null : !this$chatShared.equals(other$chatShared))
            return false;
        final Object this$connectedWebsite = this.getConnectedWebsite();
        final Object other$connectedWebsite = other.getConnectedWebsite();
        if (this$connectedWebsite == null ? other$connectedWebsite != null : !this$connectedWebsite.equals(other$connectedWebsite))
            return false;
        final Object this$writeAccessAllowed = this.getWriteAccessAllowed();
        final Object other$writeAccessAllowed = other.getWriteAccessAllowed();
        if (this$writeAccessAllowed == null ? other$writeAccessAllowed != null : !this$writeAccessAllowed.equals(other$writeAccessAllowed))
            return false;
        final Object this$proximityAlertTriggered = this.getProximityAlertTriggered();
        final Object other$proximityAlertTriggered = other.getProximityAlertTriggered();
        if (this$proximityAlertTriggered == null ? other$proximityAlertTriggered != null : !this$proximityAlertTriggered.equals(other$proximityAlertTriggered))
            return false;
        final Object this$forumTopicCreated = this.getForumTopicCreated();
        final Object other$forumTopicCreated = other.getForumTopicCreated();
        if (this$forumTopicCreated == null ? other$forumTopicCreated != null : !this$forumTopicCreated.equals(other$forumTopicCreated))
            return false;
        final Object this$forumTopicEdited = this.getForumTopicEdited();
        final Object other$forumTopicEdited = other.getForumTopicEdited();
        if (this$forumTopicEdited == null ? other$forumTopicEdited != null : !this$forumTopicEdited.equals(other$forumTopicEdited))
            return false;
        final Object this$forumTopicClosed = this.getForumTopicClosed();
        final Object other$forumTopicClosed = other.getForumTopicClosed();
        if (this$forumTopicClosed == null ? other$forumTopicClosed != null : !this$forumTopicClosed.equals(other$forumTopicClosed))
            return false;
        final Object this$forumTopicReopened = this.getForumTopicReopened();
        final Object other$forumTopicReopened = other.getForumTopicReopened();
        if (this$forumTopicReopened == null ? other$forumTopicReopened != null : !this$forumTopicReopened.equals(other$forumTopicReopened))
            return false;
        final Object this$generalForumTopicHidden = this.getGeneralForumTopicHidden();
        final Object other$generalForumTopicHidden = other.getGeneralForumTopicHidden();
        if (this$generalForumTopicHidden == null ? other$generalForumTopicHidden != null : !this$generalForumTopicHidden.equals(other$generalForumTopicHidden))
            return false;
        final Object this$generalForumTopicUnhidden = this.getGeneralForumTopicUnhidden();
        final Object other$generalForumTopicUnhidden = other.getGeneralForumTopicUnhidden();
        if (this$generalForumTopicUnhidden == null ? other$generalForumTopicUnhidden != null : !this$generalForumTopicUnhidden.equals(other$generalForumTopicUnhidden))
            return false;
        final Object this$videoChatScheduled = this.getVideoChatScheduled();
        final Object other$videoChatScheduled = other.getVideoChatScheduled();
        if (this$videoChatScheduled == null ? other$videoChatScheduled != null : !this$videoChatScheduled.equals(other$videoChatScheduled))
            return false;
        final Object this$videoChatStarted = this.getVideoChatStarted();
        final Object other$videoChatStarted = other.getVideoChatStarted();
        if (this$videoChatStarted == null ? other$videoChatStarted != null : !this$videoChatStarted.equals(other$videoChatStarted))
            return false;
        final Object this$videoChatEnded = this.getVideoChatEnded();
        final Object other$videoChatEnded = other.getVideoChatEnded();
        if (this$videoChatEnded == null ? other$videoChatEnded != null : !this$videoChatEnded.equals(other$videoChatEnded))
            return false;
        final Object this$videoChatParticipantsInvited = this.getVideoChatParticipantsInvited();
        final Object other$videoChatParticipantsInvited = other.getVideoChatParticipantsInvited();
        if (this$videoChatParticipantsInvited == null ? other$videoChatParticipantsInvited != null : !this$videoChatParticipantsInvited.equals(other$videoChatParticipantsInvited))
            return false;
        final Object this$webAppData = this.getWebAppData();
        final Object other$webAppData = other.getWebAppData();
        if (this$webAppData == null ? other$webAppData != null : !this$webAppData.equals(other$webAppData))
            return false;
        final Object this$replyMarkup = this.getReplyMarkup();
        final Object other$replyMarkup = other.getReplyMarkup();
        if (this$replyMarkup == null ? other$replyMarkup != null : !this$replyMarkup.equals(other$replyMarkup))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Message;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $messageId = this.getMessageId();
        result = result * PRIME + ($messageId == null ? 43 : $messageId.hashCode());
        final Object $messageThreadId = this.getMessageThreadId();
        result = result * PRIME + ($messageThreadId == null ? 43 : $messageThreadId.hashCode());
        final Object $from = this.getFrom();
        result = result * PRIME + ($from == null ? 43 : $from.hashCode());
        final Object $senderChat = this.getSenderChat();
        result = result * PRIME + ($senderChat == null ? 43 : $senderChat.hashCode());
        final Object $date = this.getDate();
        result = result * PRIME + ($date == null ? 43 : $date.hashCode());
        final Object $chat = this.getChat();
        result = result * PRIME + ($chat == null ? 43 : $chat.hashCode());
        final Object $forwardFrom = this.getForwardFrom();
        result = result * PRIME + ($forwardFrom == null ? 43 : $forwardFrom.hashCode());
        final Object $forwardFromChat = this.getForwardFromChat();
        result = result * PRIME + ($forwardFromChat == null ? 43 : $forwardFromChat.hashCode());
        final Object $forwardFromMessageId = this.getForwardFromMessageId();
        result = result * PRIME + ($forwardFromMessageId == null ? 43 : $forwardFromMessageId.hashCode());
        final Object $forwardSignature = this.getForwardSignature();
        result = result * PRIME + ($forwardSignature == null ? 43 : $forwardSignature.hashCode());
        final Object $forwardSenderName = this.getForwardSenderName();
        result = result * PRIME + ($forwardSenderName == null ? 43 : $forwardSenderName.hashCode());
        final Object $forwardDate = this.getForwardDate();
        result = result * PRIME + ($forwardDate == null ? 43 : $forwardDate.hashCode());
        final Object $isTopicMessage = this.getIsTopicMessage();
        result = result * PRIME + ($isTopicMessage == null ? 43 : $isTopicMessage.hashCode());
        final Object $isAutomaticForward = this.getIsAutomaticForward();
        result = result * PRIME + ($isAutomaticForward == null ? 43 : $isAutomaticForward.hashCode());
        final Object $replyToMessage = this.getReplyToMessage();
        result = result * PRIME + ($replyToMessage == null ? 43 : $replyToMessage.hashCode());
        final Object $viaBot = this.getViaBot();
        result = result * PRIME + ($viaBot == null ? 43 : $viaBot.hashCode());
        final Object $editDate = this.getEditDate();
        result = result * PRIME + ($editDate == null ? 43 : $editDate.hashCode());
        final Object $hasProtectedContent = this.getHasProtectedContent();
        result = result * PRIME + ($hasProtectedContent == null ? 43 : $hasProtectedContent.hashCode());
        final Object $mediaGroupId = this.getMediaGroupId();
        result = result * PRIME + ($mediaGroupId == null ? 43 : $mediaGroupId.hashCode());
        final Object $authorSignature = this.getAuthorSignature();
        result = result * PRIME + ($authorSignature == null ? 43 : $authorSignature.hashCode());
        final Object $text = this.getText();
        result = result * PRIME + ($text == null ? 43 : $text.hashCode());
        final Object $entities = this.getEntities();
        result = result * PRIME + ($entities == null ? 43 : $entities.hashCode());
        final Object $animation = this.getAnimation();
        result = result * PRIME + ($animation == null ? 43 : $animation.hashCode());
        final Object $audio = this.getAudio();
        result = result * PRIME + ($audio == null ? 43 : $audio.hashCode());
        final Object $document = this.getDocument();
        result = result * PRIME + ($document == null ? 43 : $document.hashCode());
        final Object $photo = this.getPhoto();
        result = result * PRIME + ($photo == null ? 43 : $photo.hashCode());
        final Object $story = this.getStory();
        result = result * PRIME + ($story == null ? 43 : $story.hashCode());
        final Object $video = this.getVideo();
        result = result * PRIME + ($video == null ? 43 : $video.hashCode());
        final Object $videoNote = this.getVideoNote();
        result = result * PRIME + ($videoNote == null ? 43 : $videoNote.hashCode());
        final Object $voice = this.getVoice();
        result = result * PRIME + ($voice == null ? 43 : $voice.hashCode());
        final Object $caption = this.getCaption();
        result = result * PRIME + ($caption == null ? 43 : $caption.hashCode());
        final Object $captionEntities = this.getCaptionEntities();
        result = result * PRIME + ($captionEntities == null ? 43 : $captionEntities.hashCode());
        final Object $hasMediaSpoiler = this.getHasMediaSpoiler();
        result = result * PRIME + ($hasMediaSpoiler == null ? 43 : $hasMediaSpoiler.hashCode());
        final Object $contact = this.getContact();
        result = result * PRIME + ($contact == null ? 43 : $contact.hashCode());
        final Object $dice = this.getDice();
        result = result * PRIME + ($dice == null ? 43 : $dice.hashCode());
        final Object $poll = this.getPoll();
        result = result * PRIME + ($poll == null ? 43 : $poll.hashCode());
        final Object $venue = this.getVenue();
        result = result * PRIME + ($venue == null ? 43 : $venue.hashCode());
        final Object $location = this.getLocation();
        result = result * PRIME + ($location == null ? 43 : $location.hashCode());
        final Object $newChatMembers = this.getNewChatMembers();
        result = result * PRIME + ($newChatMembers == null ? 43 : $newChatMembers.hashCode());
        final Object $leftChatMember = this.getLeftChatMember();
        result = result * PRIME + ($leftChatMember == null ? 43 : $leftChatMember.hashCode());
        final Object $newChatTitle = this.getNewChatTitle();
        result = result * PRIME + ($newChatTitle == null ? 43 : $newChatTitle.hashCode());
        final Object $newChatPhoto = this.getNewChatPhoto();
        result = result * PRIME + ($newChatPhoto == null ? 43 : $newChatPhoto.hashCode());
        final Object $deleteChatPhoto = this.getDeleteChatPhoto();
        result = result * PRIME + ($deleteChatPhoto == null ? 43 : $deleteChatPhoto.hashCode());
        final Object $groupChatCreated = this.getGroupChatCreated();
        result = result * PRIME + ($groupChatCreated == null ? 43 : $groupChatCreated.hashCode());
        final Object $supergroupChatCreated = this.getSupergroupChatCreated();
        result = result * PRIME + ($supergroupChatCreated == null ? 43 : $supergroupChatCreated.hashCode());
        final Object $channelChatCreated = this.getChannelChatCreated();
        result = result * PRIME + ($channelChatCreated == null ? 43 : $channelChatCreated.hashCode());
        final Object $messageAutoDeleteTimerChanged = this.getMessageAutoDeleteTimerChanged();
        result = result * PRIME + ($messageAutoDeleteTimerChanged == null ? 43 : $messageAutoDeleteTimerChanged.hashCode());
        final Object $migrateToChatId = this.getMigrateToChatId();
        result = result * PRIME + ($migrateToChatId == null ? 43 : $migrateToChatId.hashCode());
        final Object $migrateFromChatId = this.getMigrateFromChatId();
        result = result * PRIME + ($migrateFromChatId == null ? 43 : $migrateFromChatId.hashCode());
        final Object $pinnedMessage = this.getPinnedMessage();
        result = result * PRIME + ($pinnedMessage == null ? 43 : $pinnedMessage.hashCode());
        final Object $userShared = this.getUserShared();
        result = result * PRIME + ($userShared == null ? 43 : $userShared.hashCode());
        final Object $chatShared = this.getChatShared();
        result = result * PRIME + ($chatShared == null ? 43 : $chatShared.hashCode());
        final Object $connectedWebsite = this.getConnectedWebsite();
        result = result * PRIME + ($connectedWebsite == null ? 43 : $connectedWebsite.hashCode());
        final Object $writeAccessAllowed = this.getWriteAccessAllowed();
        result = result * PRIME + ($writeAccessAllowed == null ? 43 : $writeAccessAllowed.hashCode());
        final Object $proximityAlertTriggered = this.getProximityAlertTriggered();
        result = result * PRIME + ($proximityAlertTriggered == null ? 43 : $proximityAlertTriggered.hashCode());
        final Object $forumTopicCreated = this.getForumTopicCreated();
        result = result * PRIME + ($forumTopicCreated == null ? 43 : $forumTopicCreated.hashCode());
        final Object $forumTopicEdited = this.getForumTopicEdited();
        result = result * PRIME + ($forumTopicEdited == null ? 43 : $forumTopicEdited.hashCode());
        final Object $forumTopicClosed = this.getForumTopicClosed();
        result = result * PRIME + ($forumTopicClosed == null ? 43 : $forumTopicClosed.hashCode());
        final Object $forumTopicReopened = this.getForumTopicReopened();
        result = result * PRIME + ($forumTopicReopened == null ? 43 : $forumTopicReopened.hashCode());
        final Object $generalForumTopicHidden = this.getGeneralForumTopicHidden();
        result = result * PRIME + ($generalForumTopicHidden == null ? 43 : $generalForumTopicHidden.hashCode());
        final Object $generalForumTopicUnhidden = this.getGeneralForumTopicUnhidden();
        result = result * PRIME + ($generalForumTopicUnhidden == null ? 43 : $generalForumTopicUnhidden.hashCode());
        final Object $videoChatScheduled = this.getVideoChatScheduled();
        result = result * PRIME + ($videoChatScheduled == null ? 43 : $videoChatScheduled.hashCode());
        final Object $videoChatStarted = this.getVideoChatStarted();
        result = result * PRIME + ($videoChatStarted == null ? 43 : $videoChatStarted.hashCode());
        final Object $videoChatEnded = this.getVideoChatEnded();
        result = result * PRIME + ($videoChatEnded == null ? 43 : $videoChatEnded.hashCode());
        final Object $videoChatParticipantsInvited = this.getVideoChatParticipantsInvited();
        result = result * PRIME + ($videoChatParticipantsInvited == null ? 43 : $videoChatParticipantsInvited.hashCode());
        final Object $webAppData = this.getWebAppData();
        result = result * PRIME + ($webAppData == null ? 43 : $webAppData.hashCode());
        final Object $replyMarkup = this.getReplyMarkup();
        result = result * PRIME + ($replyMarkup == null ? 43 : $replyMarkup.hashCode());
        return result;
    }

    public String toString() {
        return "Message(messageId=" + this.getMessageId() + ", messageThreadId=" + this.getMessageThreadId() + ", from=" + this.getFrom() + ", senderChat=" + this.getSenderChat() + ", date=" + this.getDate() + ", chat=" + this.getChat() + ", forwardFrom=" + this.getForwardFrom() + ", forwardFromChat=" + this.getForwardFromChat() + ", forwardFromMessageId=" + this.getForwardFromMessageId() + ", forwardSignature=" + this.getForwardSignature() + ", forwardSenderName=" + this.getForwardSenderName() + ", forwardDate=" + this.getForwardDate() + ", isTopicMessage=" + this.getIsTopicMessage() + ", isAutomaticForward=" + this.getIsAutomaticForward() + ", replyToMessage=" + this.getReplyToMessage() + ", viaBot=" + this.getViaBot() + ", editDate=" + this.getEditDate() + ", hasProtectedContent=" + this.getHasProtectedContent() + ", mediaGroupId=" + this.getMediaGroupId() + ", authorSignature=" + this.getAuthorSignature() + ", text=" + this.getText() + ", entities=" + this.getEntities() + ", animation=" + this.getAnimation() + ", audio=" + this.getAudio() + ", document=" + this.getDocument() + ", photo=" + this.getPhoto() + ", story=" + this.getStory() + ", video=" + this.getVideo() + ", videoNote=" + this.getVideoNote() + ", voice=" + this.getVoice() + ", caption=" + this.getCaption() + ", captionEntities=" + this.getCaptionEntities() + ", hasMediaSpoiler=" + this.getHasMediaSpoiler() + ", contact=" + this.getContact() + ", dice=" + this.getDice() + ", poll=" + this.getPoll() + ", venue=" + this.getVenue() + ", location=" + this.getLocation() + ", newChatMembers=" + this.getNewChatMembers() + ", leftChatMember=" + this.getLeftChatMember() + ", newChatTitle=" + this.getNewChatTitle() + ", newChatPhoto=" + this.getNewChatPhoto() + ", deleteChatPhoto=" + this.getDeleteChatPhoto() + ", groupChatCreated=" + this.getGroupChatCreated() + ", supergroupChatCreated=" + this.getSupergroupChatCreated() + ", channelChatCreated=" + this.getChannelChatCreated() + ", messageAutoDeleteTimerChanged=" + this.getMessageAutoDeleteTimerChanged() + ", migrateToChatId=" + this.getMigrateToChatId() + ", migrateFromChatId=" + this.getMigrateFromChatId() + ", pinnedMessage=" + this.getPinnedMessage() + ", userShared=" + this.getUserShared() + ", chatShared=" + this.getChatShared() + ", connectedWebsite=" + this.getConnectedWebsite() + ", writeAccessAllowed=" + this.getWriteAccessAllowed() + ", proximityAlertTriggered=" + this.getProximityAlertTriggered() + ", forumTopicCreated=" + this.getForumTopicCreated() + ", forumTopicEdited=" + this.getForumTopicEdited() + ", forumTopicClosed=" + this.getForumTopicClosed() + ", forumTopicReopened=" + this.getForumTopicReopened() + ", generalForumTopicHidden=" + this.getGeneralForumTopicHidden() + ", generalForumTopicUnhidden=" + this.getGeneralForumTopicUnhidden() + ", videoChatScheduled=" + this.getVideoChatScheduled() + ", videoChatStarted=" + this.getVideoChatStarted() + ", videoChatEnded=" + this.getVideoChatEnded() + ", videoChatParticipantsInvited=" + this.getVideoChatParticipantsInvited() + ", webAppData=" + this.getWebAppData() + ", replyMarkup=" + this.getReplyMarkup() + ")";
    }

    public static class MessageBuilder {
        private Integer messageId;
        private Integer messageThreadId;
        private User from;
        private Chat senderChat;
        private Integer date;
        private Chat chat;
        private User forwardFrom;
        private Chat forwardFromChat;
        private Integer forwardFromMessageId;
        private String forwardSignature;
        private String forwardSenderName;
        private Integer forwardDate;
        private Boolean isTopicMessage;
        private Boolean isAutomaticForward;
        private Message replyToMessage;
        private User viaBot;
        private Integer editDate;
        private Boolean hasProtectedContent;
        private String mediaGroupId;
        private String authorSignature;
        private String text;
        private List<MessageEntity> entities;
        private Animation animation;
        private Audio audio;
        private Document document;
        private List<PhotoSize> photo;
        private Story story;
        private Video video;
        private VideoNote videoNote;
        private Voice voice;
        private String caption;
        private List<MessageEntity> captionEntities;
        private Boolean hasMediaSpoiler;
        private Contact contact;
        private Dice dice;
        private Poll poll;
        private Venue venue;
        private Location location;
        private List<User> newChatMembers;
        private User leftChatMember;
        private String newChatTitle;
        private List<PhotoSize> newChatPhoto;
        private Boolean deleteChatPhoto;
        private Boolean groupChatCreated;
        private Boolean supergroupChatCreated;
        private Boolean channelChatCreated;
        private MessageAutoDeleteTimerChanged messageAutoDeleteTimerChanged;
        private Long migrateToChatId;
        private Long migrateFromChatId;
        private Message pinnedMessage;
        private UserShared userShared;
        private ChatShared chatShared;
        private String connectedWebsite;
        private WriteAccessAllowed writeAccessAllowed;
        private ProximityAlertTriggered proximityAlertTriggered;
        private ForumTopicCreated forumTopicCreated;
        private ForumTopicEdited forumTopicEdited;
        private ForumTopicClosed forumTopicClosed;
        private ForumTopicReopened forumTopicReopened;
        private GeneralForumTopicHidden generalForumTopicHidden;
        private GeneralForumTopicUnhidden generalForumTopicUnhidden;
        private VideoChatScheduled videoChatScheduled;
        private VideoChatStarted videoChatStarted;
        private VideoChatEnded videoChatEnded;
        private VideoChatParticipantsInvited videoChatParticipantsInvited;
        private WebAppData webAppData;
        private InlineKeyboardMarkup replyMarkup;

        MessageBuilder() {
        }

        @JsonProperty("message_id")
        public MessageBuilder messageId(Integer messageId) {
            this.messageId = messageId;
            return this;
        }

        @JsonProperty("message_thread_id")
        public MessageBuilder messageThreadId(Integer messageThreadId) {
            this.messageThreadId = messageThreadId;
            return this;
        }

        @JsonProperty("form")
        public MessageBuilder from(User from) {
            this.from = from;
            return this;
        }

        @JsonProperty("sender_chat")
        public MessageBuilder senderChat(Chat senderChat) {
            this.senderChat = senderChat;
            return this;
        }

        @JsonProperty("date")
        public MessageBuilder date(Integer date) {
            this.date = date;
            return this;
        }

        @JsonProperty("chat")
        public MessageBuilder chat(Chat chat) {
            this.chat = chat;
            return this;
        }

        @JsonProperty("forward_from")
        public MessageBuilder forwardFrom(User forwardFrom) {
            this.forwardFrom = forwardFrom;
            return this;
        }

        @JsonProperty("forward_from_chat")
        public MessageBuilder forwardFromChat(Chat forwardFromChat) {
            this.forwardFromChat = forwardFromChat;
            return this;
        }

        @JsonProperty("forward_from_message_id")
        public MessageBuilder forwardFromMessageId(Integer forwardFromMessageId) {
            this.forwardFromMessageId = forwardFromMessageId;
            return this;
        }

        @JsonProperty("forward_signature")
        public MessageBuilder forwardSignature(String forwardSignature) {
            this.forwardSignature = forwardSignature;
            return this;
        }

        @JsonProperty("forward_sender_name")
        public MessageBuilder forwardSenderName(String forwardSenderName) {
            this.forwardSenderName = forwardSenderName;
            return this;
        }

        @JsonProperty("forward_date")
        public MessageBuilder forwardDate(Integer forwardDate) {
            this.forwardDate = forwardDate;
            return this;
        }

        @JsonProperty("is_topic_message")
        public MessageBuilder isTopicMessage(Boolean isTopicMessage) {
            this.isTopicMessage = isTopicMessage;
            return this;
        }

        @JsonProperty("is_automatic_forward")
        public MessageBuilder isAutomaticForward(Boolean isAutomaticForward) {
            this.isAutomaticForward = isAutomaticForward;
            return this;
        }

        @JsonProperty("reply_to_message")
        public MessageBuilder replyToMessage(Message replyToMessage) {
            this.replyToMessage = replyToMessage;
            return this;
        }

        @JsonProperty("via_bot")
        public MessageBuilder viaBot(User viaBot) {
            this.viaBot = viaBot;
            return this;
        }

        @JsonProperty("edit_date")
        public MessageBuilder editDate(Integer editDate) {
            this.editDate = editDate;
            return this;
        }

        @JsonProperty("has_protected_content")
        public MessageBuilder hasProtectedContent(Boolean hasProtectedContent) {
            this.hasProtectedContent = hasProtectedContent;
            return this;
        }

        @JsonProperty("media_group_id")
        public MessageBuilder mediaGroupId(String mediaGroupId) {
            this.mediaGroupId = mediaGroupId;
            return this;
        }

        @JsonProperty("author_signature")
        public MessageBuilder authorSignature(String authorSignature) {
            this.authorSignature = authorSignature;
            return this;
        }

        @JsonProperty("text")
        public MessageBuilder text(String text) {
            this.text = text;
            return this;
        }

        @JsonProperty("entities")
        public MessageBuilder entities(List<MessageEntity> entities) {
            this.entities = entities;
            return this;
        }

        @JsonProperty("animation")
        public MessageBuilder animation(Animation animation) {
            this.animation = animation;
            return this;
        }

        @JsonProperty("audio")
        public MessageBuilder audio(Audio audio) {
            this.audio = audio;
            return this;
        }

        @JsonProperty("document")
        public MessageBuilder document(Document document) {
            this.document = document;
            return this;
        }

        @JsonProperty("photo")
        public MessageBuilder photo(List<PhotoSize> photo) {
            this.photo = photo;
            return this;
        }

        @JsonProperty("story")
        public MessageBuilder story(Story story) {
            this.story = story;
            return this;
        }

        @JsonProperty("video")
        public MessageBuilder video(Video video) {
            this.video = video;
            return this;
        }

        @JsonProperty("video_note")
        public MessageBuilder videoNote(VideoNote videoNote) {
            this.videoNote = videoNote;
            return this;
        }

        @JsonProperty("voice")
        public MessageBuilder voice(Voice voice) {
            this.voice = voice;
            return this;
        }

        @JsonProperty("caption")
        public MessageBuilder caption(String caption) {
            this.caption = caption;
            return this;
        }

        @JsonProperty("caption_entities")
        public MessageBuilder captionEntities(List<MessageEntity> captionEntities) {
            this.captionEntities = captionEntities;
            return this;
        }

        @JsonProperty("has_media_spoiler")
        public MessageBuilder hasMediaSpoiler(Boolean hasMediaSpoiler) {
            this.hasMediaSpoiler = hasMediaSpoiler;
            return this;
        }

        @JsonProperty("contact")
        public MessageBuilder contact(Contact contact) {
            this.contact = contact;
            return this;
        }

        @JsonProperty("dice")
        public MessageBuilder dice(Dice dice) {
            this.dice = dice;
            return this;
        }

        @JsonProperty("poll")
        public MessageBuilder poll(Poll poll) {
            this.poll = poll;
            return this;
        }

        @JsonProperty("venue")
        public MessageBuilder venue(Venue venue) {
            this.venue = venue;
            return this;
        }

        @JsonProperty("location")
        public MessageBuilder location(Location location) {
            this.location = location;
            return this;
        }

        @JsonProperty("new_chat_members")
        public MessageBuilder newChatMembers(List<User> newChatMembers) {
            this.newChatMembers = newChatMembers;
            return this;
        }

        @JsonProperty("left_chat_members")
        public MessageBuilder leftChatMember(User leftChatMember) {
            this.leftChatMember = leftChatMember;
            return this;
        }

        @JsonProperty("new_chat_title")
        public MessageBuilder newChatTitle(String newChatTitle) {
            this.newChatTitle = newChatTitle;
            return this;
        }

        @JsonProperty("new_chat_photo")
        public MessageBuilder newChatPhoto(List<PhotoSize> newChatPhoto) {
            this.newChatPhoto = newChatPhoto;
            return this;
        }

        @JsonProperty("delete_chat_photo")
        public MessageBuilder deleteChatPhoto(Boolean deleteChatPhoto) {
            this.deleteChatPhoto = deleteChatPhoto;
            return this;
        }

        @JsonProperty("group_chat_created")
        public MessageBuilder groupChatCreated(Boolean groupChatCreated) {
            this.groupChatCreated = groupChatCreated;
            return this;
        }

        @JsonProperty("supergroup_chat_created")
        public MessageBuilder supergroupChatCreated(Boolean supergroupChatCreated) {
            this.supergroupChatCreated = supergroupChatCreated;
            return this;
        }

        @JsonProperty("channel_chat_created")
        public MessageBuilder channelChatCreated(Boolean channelChatCreated) {
            this.channelChatCreated = channelChatCreated;
            return this;
        }

        @JsonProperty("message_auto_delete_timer")
        public MessageBuilder messageAutoDeleteTimerChanged(MessageAutoDeleteTimerChanged messageAutoDeleteTimerChanged) {
            this.messageAutoDeleteTimerChanged = messageAutoDeleteTimerChanged;
            return this;
        }

        @JsonProperty("migrate_to_chat_id")
        public MessageBuilder migrateToChatId(Long migrateToChatId) {
            this.migrateToChatId = migrateToChatId;
            return this;
        }

        @JsonProperty("migrate_from_chat_id")
        public MessageBuilder migrateFromChatId(Long migrateFromChatId) {
            this.migrateFromChatId = migrateFromChatId;
            return this;
        }

        @JsonProperty("pinned_message")
        public MessageBuilder pinnedMessage(Message pinnedMessage) {
            this.pinnedMessage = pinnedMessage;
            return this;
        }

        @JsonProperty("user_shared")
        public MessageBuilder userShared(UserShared userShared) {
            this.userShared = userShared;
            return this;
        }

        @JsonProperty("chat_shared")
        public MessageBuilder chatShared(ChatShared chatShared) {
            this.chatShared = chatShared;
            return this;
        }

        @JsonProperty("connected_website")
        public MessageBuilder connectedWebsite(String connectedWebsite) {
            this.connectedWebsite = connectedWebsite;
            return this;
        }

        @JsonProperty("write_access_allowed")
        public MessageBuilder writeAccessAllowed(WriteAccessAllowed writeAccessAllowed) {
            this.writeAccessAllowed = writeAccessAllowed;
            return this;
        }

        @JsonProperty("proximity_alert_triggered")
        public MessageBuilder proximityAlertTriggered(ProximityAlertTriggered proximityAlertTriggered) {
            this.proximityAlertTriggered = proximityAlertTriggered;
            return this;
        }

        @JsonProperty("forum_topic_created")
        public MessageBuilder forumTopicCreated(ForumTopicCreated forumTopicCreated) {
            this.forumTopicCreated = forumTopicCreated;
            return this;
        }

        @JsonProperty("forum_topic_edited")
        public MessageBuilder forumTopicEdited(ForumTopicEdited forumTopicEdited) {
            this.forumTopicEdited = forumTopicEdited;
            return this;
        }

        @JsonProperty("forum_topic_closed")
        public MessageBuilder forumTopicClosed(ForumTopicClosed forumTopicClosed) {
            this.forumTopicClosed = forumTopicClosed;
            return this;
        }

        @JsonProperty("forum_topic_reopened")
        public MessageBuilder forumTopicReopened(ForumTopicReopened forumTopicReopened) {
            this.forumTopicReopened = forumTopicReopened;
            return this;
        }

        @JsonProperty("general_forum_topic_hidden")
        public MessageBuilder generalForumTopicHidden(GeneralForumTopicHidden generalForumTopicHidden) {
            this.generalForumTopicHidden = generalForumTopicHidden;
            return this;
        }

        @JsonProperty("general_forum_topic_unhidden")
        public MessageBuilder generalForumTopicUnhidden(GeneralForumTopicUnhidden generalForumTopicUnhidden) {
            this.generalForumTopicUnhidden = generalForumTopicUnhidden;
            return this;
        }

        @JsonProperty("video_chat_scheduled")
        public MessageBuilder videoChatScheduled(VideoChatScheduled videoChatScheduled) {
            this.videoChatScheduled = videoChatScheduled;
            return this;
        }

        @JsonProperty("video_chat_started")
        public MessageBuilder videoChatStarted(VideoChatStarted videoChatStarted) {
            this.videoChatStarted = videoChatStarted;
            return this;
        }

        @JsonProperty("video_chat_ended")
        public MessageBuilder videoChatEnded(VideoChatEnded videoChatEnded) {
            this.videoChatEnded = videoChatEnded;
            return this;
        }

        @JsonProperty("video_chat_participants_invited")
        public MessageBuilder videoChatParticipantsInvited(VideoChatParticipantsInvited videoChatParticipantsInvited) {
            this.videoChatParticipantsInvited = videoChatParticipantsInvited;
            return this;
        }

        @JsonProperty("web_app_data")
        public MessageBuilder webAppData(WebAppData webAppData) {
            this.webAppData = webAppData;
            return this;
        }

        @JsonProperty("reply_markup")
        public MessageBuilder replyMarkup(InlineKeyboardMarkup replyMarkup) {
            this.replyMarkup = replyMarkup;
            return this;
        }

        public Message build() {
            return new Message(this.messageId, this.messageThreadId, this.from, this.senderChat, this.date, this.chat, this.forwardFrom, this.forwardFromChat, this.forwardFromMessageId, this.forwardSignature, this.forwardSenderName, this.forwardDate, this.isTopicMessage, this.isAutomaticForward, this.replyToMessage, this.viaBot, this.editDate, this.hasProtectedContent, this.mediaGroupId, this.authorSignature, this.text, this.entities, this.animation, this.audio, this.document, this.photo, this.story, this.video, this.videoNote, this.voice, this.caption, this.captionEntities, this.hasMediaSpoiler, this.contact, this.dice, this.poll, this.venue, this.location, this.newChatMembers, this.leftChatMember, this.newChatTitle, this.newChatPhoto, this.deleteChatPhoto, this.groupChatCreated, this.supergroupChatCreated, this.channelChatCreated, this.messageAutoDeleteTimerChanged, this.migrateToChatId, this.migrateFromChatId, this.pinnedMessage, this.userShared, this.chatShared, this.connectedWebsite, this.writeAccessAllowed, this.proximityAlertTriggered, this.forumTopicCreated, this.forumTopicEdited, this.forumTopicClosed, this.forumTopicReopened, this.generalForumTopicHidden, this.generalForumTopicUnhidden, this.videoChatScheduled, this.videoChatStarted, this.videoChatEnded, this.videoChatParticipantsInvited, this.webAppData, this.replyMarkup);
        }

        public String toString() {
            return "Message.MessageBuilder(messageId=" + this.messageId + ", messageThreadId=" + this.messageThreadId + ", from=" + this.from + ", senderChat=" + this.senderChat + ", date=" + this.date + ", chat=" + this.chat + ", forwardFrom=" + this.forwardFrom + ", forwardFromChat=" + this.forwardFromChat + ", forwardFromMessageId=" + this.forwardFromMessageId + ", forwardSignature=" + this.forwardSignature + ", forwardSenderName=" + this.forwardSenderName + ", forwardDate=" + this.forwardDate + ", isTopicMessage=" + this.isTopicMessage + ", isAutomaticForward=" + this.isAutomaticForward + ", replyToMessage=" + this.replyToMessage + ", viaBot=" + this.viaBot + ", editDate=" + this.editDate + ", hasProtectedContent=" + this.hasProtectedContent + ", mediaGroupId=" + this.mediaGroupId + ", authorSignature=" + this.authorSignature + ", text=" + this.text + ", entities=" + this.entities + ", animation=" + this.animation + ", audio=" + this.audio + ", document=" + this.document + ", photo=" + this.photo + ", story=" + this.story + ", video=" + this.video + ", videoNote=" + this.videoNote + ", voice=" + this.voice + ", caption=" + this.caption + ", captionEntities=" + this.captionEntities + ", hasMediaSpoiler=" + this.hasMediaSpoiler + ", contact=" + this.contact + ", dice=" + this.dice + ", poll=" + this.poll + ", venue=" + this.venue + ", location=" + this.location + ", newChatMembers=" + this.newChatMembers + ", leftChatMember=" + this.leftChatMember + ", newChatTitle=" + this.newChatTitle + ", newChatPhoto=" + this.newChatPhoto + ", deleteChatPhoto=" + this.deleteChatPhoto + ", groupChatCreated=" + this.groupChatCreated + ", supergroupChatCreated=" + this.supergroupChatCreated + ", channelChatCreated=" + this.channelChatCreated + ", messageAutoDeleteTimerChanged=" + this.messageAutoDeleteTimerChanged + ", migrateToChatId=" + this.migrateToChatId + ", migrateFromChatId=" + this.migrateFromChatId + ", pinnedMessage=" + this.pinnedMessage + ", userShared=" + this.userShared + ", chatShared=" + this.chatShared + ", connectedWebsite=" + this.connectedWebsite + ", writeAccessAllowed=" + this.writeAccessAllowed + ", proximityAlertTriggered=" + this.proximityAlertTriggered + ", forumTopicCreated=" + this.forumTopicCreated + ", forumTopicEdited=" + this.forumTopicEdited + ", forumTopicClosed=" + this.forumTopicClosed + ", forumTopicReopened=" + this.forumTopicReopened + ", generalForumTopicHidden=" + this.generalForumTopicHidden + ", generalForumTopicUnhidden=" + this.generalForumTopicUnhidden + ", videoChatScheduled=" + this.videoChatScheduled + ", videoChatStarted=" + this.videoChatStarted + ", videoChatEnded=" + this.videoChatEnded + ", videoChatParticipantsInvited=" + this.videoChatParticipantsInvited + ", webAppData=" + this.webAppData + ", replyMarkup=" + this.replyMarkup + ")";
        }
    }
}
