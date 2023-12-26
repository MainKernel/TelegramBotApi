package api.objects.message;

import api.objects.BotApiObject;
import com.fasterxml.jackson.annotation.JsonProperty;

public class MessageId implements BotApiObject {
    @JsonProperty("message_id")
    private Integer messageId;

    MessageId(Integer messageId) {
        this.messageId = messageId;
    }

    public static MessageIdBuilder builder() {
        return new MessageIdBuilder();
    }

    public Integer getMessageId() {
        return this.messageId;
    }

    @JsonProperty("message_id")
    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof MessageId)) return false;
        final MessageId other = (MessageId) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$messageId = this.getMessageId();
        final Object other$messageId = other.getMessageId();
        if (this$messageId == null ? other$messageId != null : !this$messageId.equals(other$messageId)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof MessageId;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $messageId = this.getMessageId();
        result = result * PRIME + ($messageId == null ? 43 : $messageId.hashCode());
        return result;
    }

    public String toString() {
        return "MessageId(messageId=" + this.getMessageId() + ")";
    }

    public static class MessageIdBuilder {
        private Integer messageId;

        MessageIdBuilder() {
        }

        @JsonProperty("message_id")
        public MessageIdBuilder messageId(Integer messageId) {
            this.messageId = messageId;
            return this;
        }

        public MessageId build() {
            return new MessageId(this.messageId);
        }

        public String toString() {
            return "MessageId.MessageIdBuilder(messageId=" + this.messageId + ")";
        }
    }
}
