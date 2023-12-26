package api.objects.message;

import api.objects.BotApiObject;
import com.fasterxml.jackson.annotation.JsonProperty;

public class MessageAutoDeleteTimerChanged implements BotApiObject {
    @JsonProperty("message_auto_delete_time")
    private Integer messageAutoDeleteTime;

    MessageAutoDeleteTimerChanged(Integer messageAutoDeleteTime) {
        this.messageAutoDeleteTime = messageAutoDeleteTime;
    }

    public static MessageAutoDeleteTimerChangedBuilder builder() {
        return new MessageAutoDeleteTimerChangedBuilder();
    }

    public Integer getMessageAutoDeleteTime() {
        return this.messageAutoDeleteTime;
    }

    @JsonProperty("message_auto_delete_time")
    public void setMessageAutoDeleteTime(Integer messageAutoDeleteTime) {
        this.messageAutoDeleteTime = messageAutoDeleteTime;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof MessageAutoDeleteTimerChanged)) return false;
        final MessageAutoDeleteTimerChanged other = (MessageAutoDeleteTimerChanged) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$messageAutoDeleteTime = this.getMessageAutoDeleteTime();
        final Object other$messageAutoDeleteTime = other.getMessageAutoDeleteTime();
        if (this$messageAutoDeleteTime == null ? other$messageAutoDeleteTime != null : !this$messageAutoDeleteTime.equals(other$messageAutoDeleteTime))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof MessageAutoDeleteTimerChanged;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $messageAutoDeleteTime = this.getMessageAutoDeleteTime();
        result = result * PRIME + ($messageAutoDeleteTime == null ? 43 : $messageAutoDeleteTime.hashCode());
        return result;
    }

    public String toString() {
        return "MessageAutoDeleteTimerChanged(messageAutoDeleteTime=" + this.getMessageAutoDeleteTime() + ")";
    }

    public static class MessageAutoDeleteTimerChangedBuilder {
        private Integer messageAutoDeleteTime;

        MessageAutoDeleteTimerChangedBuilder() {
        }

        @JsonProperty("message_auto_delete_time")
        public MessageAutoDeleteTimerChangedBuilder messageAutoDeleteTime(Integer messageAutoDeleteTime) {
            this.messageAutoDeleteTime = messageAutoDeleteTime;
            return this;
        }

        public MessageAutoDeleteTimerChanged build() {
            return new MessageAutoDeleteTimerChanged(this.messageAutoDeleteTime);
        }

        public String toString() {
            return "MessageAutoDeleteTimerChanged.MessageAutoDeleteTimerChangedBuilder(messageAutoDeleteTime=" + this.messageAutoDeleteTime + ")";
        }
    }
}
