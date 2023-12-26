package api.objects.data;

import api.objects.message.Message;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ResultItem {
    @JsonProperty("update_id")
    private long update_id;
    private Message message;

    ResultItem(long update_id, Message message) {
        this.update_id = update_id;
        this.message = message;
    }

    public static ResultItemBuilder builder() {
        return new ResultItemBuilder();
    }

    public long getUpdate_id() {
        return this.update_id;
    }

    public Message getMessage() {
        return this.message;
    }

    @JsonProperty("update_id")
    public void setUpdate_id(long update_id) {
        this.update_id = update_id;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ResultItem)) return false;
        final ResultItem other = (ResultItem) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getUpdate_id() != other.getUpdate_id()) return false;
        final Object this$message = this.getMessage();
        final Object other$message = other.getMessage();
        if (this$message == null ? other$message != null : !this$message.equals(other$message)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ResultItem;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final long $update_id = this.getUpdate_id();
        result = result * PRIME + (int) ($update_id >>> 32 ^ $update_id);
        final Object $message = this.getMessage();
        result = result * PRIME + ($message == null ? 43 : $message.hashCode());
        return result;
    }

    public String toString() {
        return "ResultItem(update_id=" + this.getUpdate_id() + ", message=" + this.getMessage() + ")";
    }

    public static class ResultItemBuilder {
        private long update_id;
        private Message message;

        ResultItemBuilder() {
        }

        @JsonProperty("update_id")
        public ResultItemBuilder update_id(long update_id) {
            this.update_id = update_id;
            return this;
        }

        public ResultItemBuilder message(Message message) {
            this.message = message;
            return this;
        }

        public ResultItem build() {
            return new ResultItem(this.update_id, this.message);
        }

        public String toString() {
            return "ResultItem.ResultItemBuilder(update_id=" + this.update_id + ", message=" + this.message + ")";
        }
    }
}
