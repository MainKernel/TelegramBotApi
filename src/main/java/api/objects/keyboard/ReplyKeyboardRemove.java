package api.objects.keyboard;

import api.objects.BotApiObject;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ReplyKeyboardRemove implements BotApiObject {
    @JsonProperty("remove_keyboard")
    private boolean removeKeyboard;

    @JsonProperty("selective")
    private boolean selective;

    ReplyKeyboardRemove(boolean removeKeyboard, boolean selective) {
        this.removeKeyboard = removeKeyboard;
        this.selective = selective;
    }

    public static ReplyKeyboardRemoveBuilder builder() {
        return new ReplyKeyboardRemoveBuilder();
    }

    public boolean isRemoveKeyboard() {
        return this.removeKeyboard;
    }

    public boolean isSelective() {
        return this.selective;
    }

    @JsonProperty("remove_keyboard")
    public void setRemoveKeyboard(boolean removeKeyboard) {
        this.removeKeyboard = removeKeyboard;
    }

    @JsonProperty("selective")
    public void setSelective(boolean selective) {
        this.selective = selective;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ReplyKeyboardRemove)) return false;
        final ReplyKeyboardRemove other = (ReplyKeyboardRemove) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.isRemoveKeyboard() != other.isRemoveKeyboard()) return false;
        if (this.isSelective() != other.isSelective()) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ReplyKeyboardRemove;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + (this.isRemoveKeyboard() ? 79 : 97);
        result = result * PRIME + (this.isSelective() ? 79 : 97);
        return result;
    }

    public String toString() {
        return "ReplyKeyboardRemove(removeKeyboard=" + this.isRemoveKeyboard() + ", selective=" + this.isSelective() + ")";
    }

    public static class ReplyKeyboardRemoveBuilder {
        private boolean removeKeyboard;
        private boolean selective;

        ReplyKeyboardRemoveBuilder() {
        }

        @JsonProperty("remove_keyboard")
        public ReplyKeyboardRemoveBuilder removeKeyboard(boolean removeKeyboard) {
            this.removeKeyboard = removeKeyboard;
            return this;
        }

        @JsonProperty("selective")
        public ReplyKeyboardRemoveBuilder selective(boolean selective) {
            this.selective = selective;
            return this;
        }

        public ReplyKeyboardRemove build() {
            return new ReplyKeyboardRemove(this.removeKeyboard, this.selective);
        }

        public String toString() {
            return "ReplyKeyboardRemove.ReplyKeyboardRemoveBuilder(removeKeyboard=" + this.removeKeyboard + ", selective=" + this.selective + ")";
        }
    }
}
