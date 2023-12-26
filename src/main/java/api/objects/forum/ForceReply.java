package api.objects.forum;

import api.objects.BotApiObject;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ForceReply implements BotApiObject {
    @JsonProperty("force_reply")
    private boolean forceReply;
    @JsonProperty("input_field_placeholder")
    private String inputFieldPlaceholder;
    @JsonProperty("selective")
    private boolean selective;

    ForceReply(boolean forceReply, String inputFieldPlaceholder, boolean selective) {
        this.forceReply = forceReply;
        this.inputFieldPlaceholder = inputFieldPlaceholder;
        this.selective = selective;
    }

    public static ForceReplyBuilder builder() {
        return new ForceReplyBuilder();
    }

    public boolean isForceReply() {
        return this.forceReply;
    }

    public String getInputFieldPlaceholder() {
        return this.inputFieldPlaceholder;
    }

    public boolean isSelective() {
        return this.selective;
    }

    @JsonProperty("force_reply")
    public void setForceReply(boolean forceReply) {
        this.forceReply = forceReply;
    }

    @JsonProperty("input_field_placeholder")
    public void setInputFieldPlaceholder(String inputFieldPlaceholder) {
        this.inputFieldPlaceholder = inputFieldPlaceholder;
    }

    @JsonProperty("selective")
    public void setSelective(boolean selective) {
        this.selective = selective;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ForceReply)) return false;
        final ForceReply other = (ForceReply) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.isForceReply() != other.isForceReply()) return false;
        final Object this$inputFieldPlaceholder = this.getInputFieldPlaceholder();
        final Object other$inputFieldPlaceholder = other.getInputFieldPlaceholder();
        if (this$inputFieldPlaceholder == null ? other$inputFieldPlaceholder != null : !this$inputFieldPlaceholder.equals(other$inputFieldPlaceholder))
            return false;
        if (this.isSelective() != other.isSelective()) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ForceReply;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + (this.isForceReply() ? 79 : 97);
        final Object $inputFieldPlaceholder = this.getInputFieldPlaceholder();
        result = result * PRIME + ($inputFieldPlaceholder == null ? 43 : $inputFieldPlaceholder.hashCode());
        result = result * PRIME + (this.isSelective() ? 79 : 97);
        return result;
    }

    public String toString() {
        return "ForceReply(forceReply=" + this.isForceReply() + ", inputFieldPlaceholder=" + this.getInputFieldPlaceholder() + ", selective=" + this.isSelective() + ")";
    }

    public static class ForceReplyBuilder {
        private boolean forceReply;
        private String inputFieldPlaceholder;
        private boolean selective;

        ForceReplyBuilder() {
        }

        @JsonProperty("force_reply")
        public ForceReplyBuilder forceReply(boolean forceReply) {
            this.forceReply = forceReply;
            return this;
        }

        @JsonProperty("input_field_placeholder")
        public ForceReplyBuilder inputFieldPlaceholder(String inputFieldPlaceholder) {
            this.inputFieldPlaceholder = inputFieldPlaceholder;
            return this;
        }

        @JsonProperty("selective")
        public ForceReplyBuilder selective(boolean selective) {
            this.selective = selective;
            return this;
        }

        public ForceReply build() {
            return new ForceReply(this.forceReply, this.inputFieldPlaceholder, this.selective);
        }

        public String toString() {
            return "ForceReply.ForceReplyBuilder(forceReply=" + this.forceReply + ", inputFieldPlaceholder=" + this.inputFieldPlaceholder + ", selective=" + this.selective + ")";
        }
    }
}
