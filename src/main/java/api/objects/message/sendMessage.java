package api.objects.message;

import api.objects.BotApiObject;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class sendMessage implements BotApiObject {
    @JsonProperty("chat_id")
    private Integer chatId; // Unique identifier for the target chat or username of the target channel

    @JsonProperty("message_thread_id")
    private Integer messageThreadId; // Unique identifier for the target message thread of the forum (for supergroups)

    @JsonProperty("text")
    private String text; // Text of the message to be sent

    @JsonProperty("parse_mode")
    private String parseMode; // Mode for parsing entities in the message text

    @JsonProperty("entities")
    private List<MessageEntity> entities; // List of special entities that appear in the message text

    @JsonProperty("disable_web_page_preview")
    private Boolean disableWebPagePreview; // Disables link previews for links in this message

    @JsonProperty("disable_notification")
    private Boolean disableNotification; // Sends the message silently

    @JsonProperty("protect_content")
    private Boolean protectContent; // Protects the contents of the send message from forwarding and saving

    @JsonProperty("reply_to_message_id")
    private Integer replyToMessageId; // ID of the original message if the message is a reply

    @JsonProperty("allow_sending_without_reply")
    private Boolean allowSendingWithoutReply; // Pass True if the message should be sent even if the specified replied-to message is not found

    @JsonProperty("reply_markup")
    private Object replyMarkup;

    public sendMessage() {

    }

    public sendMessage(Integer chatId, Integer messageThreadId, String text, String parseMode, List<MessageEntity> entities, Boolean disableWebPagePreview, Boolean disableNotification, Boolean protectContent, Integer replyToMessageId, Boolean allowSendingWithoutReply, Object replyMarkup) {
        this.chatId = chatId;
        this.messageThreadId = messageThreadId;
        this.text = text;
        this.parseMode = parseMode;
        this.entities = entities;
        this.disableWebPagePreview = disableWebPagePreview;
        this.disableNotification = disableNotification;
        this.protectContent = protectContent;
        this.replyToMessageId = replyToMessageId;
        this.allowSendingWithoutReply = allowSendingWithoutReply;
        this.replyMarkup = replyMarkup;
    }

    public static SendMessageBuilder builder() {
        return new SendMessageBuilder();
    }

    public Integer getChatId() {
        return this.chatId;
    }

    public Integer getMessageThreadId() {
        return this.messageThreadId;
    }

    public String getText() {
        return this.text;
    }

    public String getParseMode() {
        return this.parseMode;
    }

    public List<MessageEntity> getEntities() {
        return this.entities;
    }

    public Boolean getDisableWebPagePreview() {
        return this.disableWebPagePreview;
    }

    public Boolean getDisableNotification() {
        return this.disableNotification;
    }

    public Boolean getProtectContent() {
        return this.protectContent;
    }

    public Integer getReplyToMessageId() {
        return this.replyToMessageId;
    }

    public Boolean getAllowSendingWithoutReply() {
        return this.allowSendingWithoutReply;
    }

    public Object getReplyMarkup() {
        return this.replyMarkup;
    }

    @JsonProperty("chat_id")
    public void setChatId(Integer chatId) {
        this.chatId = chatId;
    }

    @JsonProperty("message_thread_id")
    public void setMessageThreadId(Integer messageThreadId) {
        this.messageThreadId = messageThreadId;
    }

    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    @JsonProperty("parse_mode")
    public void setParseMode(String parseMode) {
        this.parseMode = parseMode;
    }

    @JsonProperty("entities")
    public void setEntities(List<MessageEntity> entities) {
        this.entities = entities;
    }

    @JsonProperty("disable_web_page_preview")
    public void setDisableWebPagePreview(Boolean disableWebPagePreview) {
        this.disableWebPagePreview = disableWebPagePreview;
    }

    @JsonProperty("disable_notification")
    public void setDisableNotification(Boolean disableNotification) {
        this.disableNotification = disableNotification;
    }

    @JsonProperty("protect_content")
    public void setProtectContent(Boolean protectContent) {
        this.protectContent = protectContent;
    }

    @JsonProperty("reply_to_message_id")
    public void setReplyToMessageId(Integer replyToMessageId) {
        this.replyToMessageId = replyToMessageId;
    }

    @JsonProperty("allow_sending_without_reply")
    public void setAllowSendingWithoutReply(Boolean allowSendingWithoutReply) {
        this.allowSendingWithoutReply = allowSendingWithoutReply;
    }

    @JsonProperty("reply_markup")
    public void setReplyMarkup(Object replyMarkup) {
        this.replyMarkup = replyMarkup;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof sendMessage)) return false;
        final sendMessage other = (sendMessage) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$chatId = this.getChatId();
        final Object other$chatId = other.getChatId();
        if (this$chatId == null ? other$chatId != null : !this$chatId.equals(other$chatId)) return false;
        final Object this$messageThreadId = this.getMessageThreadId();
        final Object other$messageThreadId = other.getMessageThreadId();
        if (this$messageThreadId == null ? other$messageThreadId != null : !this$messageThreadId.equals(other$messageThreadId))
            return false;
        final Object this$text = this.getText();
        final Object other$text = other.getText();
        if (this$text == null ? other$text != null : !this$text.equals(other$text)) return false;
        final Object this$parseMode = this.getParseMode();
        final Object other$parseMode = other.getParseMode();
        if (this$parseMode == null ? other$parseMode != null : !this$parseMode.equals(other$parseMode)) return false;
        final Object this$entities = this.getEntities();
        final Object other$entities = other.getEntities();
        if (this$entities == null ? other$entities != null : !this$entities.equals(other$entities)) return false;
        final Object this$disableWebPagePreview = this.getDisableWebPagePreview();
        final Object other$disableWebPagePreview = other.getDisableWebPagePreview();
        if (this$disableWebPagePreview == null ? other$disableWebPagePreview != null : !this$disableWebPagePreview.equals(other$disableWebPagePreview))
            return false;
        final Object this$disableNotification = this.getDisableNotification();
        final Object other$disableNotification = other.getDisableNotification();
        if (this$disableNotification == null ? other$disableNotification != null : !this$disableNotification.equals(other$disableNotification))
            return false;
        final Object this$protectContent = this.getProtectContent();
        final Object other$protectContent = other.getProtectContent();
        if (this$protectContent == null ? other$protectContent != null : !this$protectContent.equals(other$protectContent))
            return false;
        final Object this$replyToMessageId = this.getReplyToMessageId();
        final Object other$replyToMessageId = other.getReplyToMessageId();
        if (this$replyToMessageId == null ? other$replyToMessageId != null : !this$replyToMessageId.equals(other$replyToMessageId))
            return false;
        final Object this$allowSendingWithoutReply = this.getAllowSendingWithoutReply();
        final Object other$allowSendingWithoutReply = other.getAllowSendingWithoutReply();
        if (this$allowSendingWithoutReply == null ? other$allowSendingWithoutReply != null : !this$allowSendingWithoutReply.equals(other$allowSendingWithoutReply))
            return false;
        final Object this$replyMarkup = this.getReplyMarkup();
        final Object other$replyMarkup = other.getReplyMarkup();
        if (this$replyMarkup == null ? other$replyMarkup != null : !this$replyMarkup.equals(other$replyMarkup))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof sendMessage;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $chatId = this.getChatId();
        result = result * PRIME + ($chatId == null ? 43 : $chatId.hashCode());
        final Object $messageThreadId = this.getMessageThreadId();
        result = result * PRIME + ($messageThreadId == null ? 43 : $messageThreadId.hashCode());
        final Object $text = this.getText();
        result = result * PRIME + ($text == null ? 43 : $text.hashCode());
        final Object $parseMode = this.getParseMode();
        result = result * PRIME + ($parseMode == null ? 43 : $parseMode.hashCode());
        final Object $entities = this.getEntities();
        result = result * PRIME + ($entities == null ? 43 : $entities.hashCode());
        final Object $disableWebPagePreview = this.getDisableWebPagePreview();
        result = result * PRIME + ($disableWebPagePreview == null ? 43 : $disableWebPagePreview.hashCode());
        final Object $disableNotification = this.getDisableNotification();
        result = result * PRIME + ($disableNotification == null ? 43 : $disableNotification.hashCode());
        final Object $protectContent = this.getProtectContent();
        result = result * PRIME + ($protectContent == null ? 43 : $protectContent.hashCode());
        final Object $replyToMessageId = this.getReplyToMessageId();
        result = result * PRIME + ($replyToMessageId == null ? 43 : $replyToMessageId.hashCode());
        final Object $allowSendingWithoutReply = this.getAllowSendingWithoutReply();
        result = result * PRIME + ($allowSendingWithoutReply == null ? 43 : $allowSendingWithoutReply.hashCode());
        final Object $replyMarkup = this.getReplyMarkup();
        result = result * PRIME + ($replyMarkup == null ? 43 : $replyMarkup.hashCode());
        return result;
    }

    public String toString() {
        return "sendMessage(chatId=" + this.getChatId() + ", messageThreadId=" + this.getMessageThreadId() + ", text=" + this.getText() + ", parseMode=" + this.getParseMode() + ", entities=" + this.getEntities() + ", disableWebPagePreview=" + this.getDisableWebPagePreview() + ", disableNotification=" + this.getDisableNotification() + ", protectContent=" + this.getProtectContent() + ", replyToMessageId=" + this.getReplyToMessageId() + ", allowSendingWithoutReply=" + this.getAllowSendingWithoutReply() + ", replyMarkup=" + this.getReplyMarkup() + ")";
    }

    public static class SendMessageBuilder {
        private Integer chatId;
        private Integer messageThreadId;
        private String text;
        private String parseMode;
        private List<MessageEntity> entities;
        private Boolean disableWebPagePreview;
        private Boolean disableNotification;
        private Boolean protectContent;
        private Integer replyToMessageId;
        private Boolean allowSendingWithoutReply;
        private Object replyMarkup;

        SendMessageBuilder() {
        }

        @JsonProperty("chat_id")
        public SendMessageBuilder chatId(Integer chatId) {
            this.chatId = chatId;
            return this;
        }

        @JsonProperty("message_thread_id")
        public SendMessageBuilder messageThreadId(Integer messageThreadId) {
            this.messageThreadId = messageThreadId;
            return this;
        }

        @JsonProperty("text")
        public SendMessageBuilder text(String text) {
            this.text = text;
            return this;
        }

        @JsonProperty("parse_mode")
        public SendMessageBuilder parseMode(String parseMode) {
            this.parseMode = parseMode;
            return this;
        }

        @JsonProperty("entities")
        public SendMessageBuilder entities(List<MessageEntity> entities) {
            this.entities = entities;
            return this;
        }

        @JsonProperty("disable_web_page_preview")
        public SendMessageBuilder disableWebPagePreview(Boolean disableWebPagePreview) {
            this.disableWebPagePreview = disableWebPagePreview;
            return this;
        }

        @JsonProperty("disable_notification")
        public SendMessageBuilder disableNotification(Boolean disableNotification) {
            this.disableNotification = disableNotification;
            return this;
        }

        @JsonProperty("protect_content")
        public SendMessageBuilder protectContent(Boolean protectContent) {
            this.protectContent = protectContent;
            return this;
        }

        @JsonProperty("reply_to_message_id")
        public SendMessageBuilder replyToMessageId(Integer replyToMessageId) {
            this.replyToMessageId = replyToMessageId;
            return this;
        }

        @JsonProperty("allow_sending_without_reply")
        public SendMessageBuilder allowSendingWithoutReply(Boolean allowSendingWithoutReply) {
            this.allowSendingWithoutReply = allowSendingWithoutReply;
            return this;
        }

        @JsonProperty("reply_markup")
        public SendMessageBuilder replyMarkup(Object replyMarkup) {
            this.replyMarkup = replyMarkup;
            return this;
        }

        public sendMessage build() {
            return new sendMessage(this.chatId, this.messageThreadId, this.text, this.parseMode, this.entities, this.disableWebPagePreview, this.disableNotification, this.protectContent, this.replyToMessageId, this.allowSendingWithoutReply, this.replyMarkup);
        }

        public String toString() {
            return "sendMessage.SendMessageBuilder(chatId=" + this.chatId + ", messageThreadId=" + this.messageThreadId + ", text=" + this.text + ", parseMode=" + this.parseMode + ", entities=" + this.entities + ", disableWebPagePreview=" + this.disableWebPagePreview + ", disableNotification=" + this.disableNotification + ", protectContent=" + this.protectContent + ", replyToMessageId=" + this.replyToMessageId + ", allowSendingWithoutReply=" + this.allowSendingWithoutReply + ", replyMarkup=" + this.replyMarkup + ")";
        }
    }
}
