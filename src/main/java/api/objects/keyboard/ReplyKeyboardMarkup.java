package api.objects.keyboard;

import api.objects.BotApiObject;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ReplyKeyboardMarkup implements BotApiObject {
    @JsonProperty("keyboard")
    private List<List<KeyboardButton>> keyboard;

    @JsonProperty("is_persistent")
    private Boolean isPersistent;

    @JsonProperty("resize_keyboard")
    private Boolean resizeKeyboard;

    @JsonProperty("one_time_keyboard")
    private Boolean oneTimeKeyboard;

    @JsonProperty("input_field_placeholder")
    private String inputFieldPlaceholder;

    @JsonProperty("selective")
    private Boolean selective;

    ReplyKeyboardMarkup(List<List<KeyboardButton>> keyboard, Boolean isPersistent, Boolean resizeKeyboard, Boolean oneTimeKeyboard, String inputFieldPlaceholder, Boolean selective) {
        this.keyboard = keyboard;
        this.isPersistent = isPersistent;
        this.resizeKeyboard = resizeKeyboard;
        this.oneTimeKeyboard = oneTimeKeyboard;
        this.inputFieldPlaceholder = inputFieldPlaceholder;
        this.selective = selective;
    }

    public static ReplyKeyboardMarkupBuilder builder() {
        return new ReplyKeyboardMarkupBuilder();
    }

    public List<List<KeyboardButton>> getKeyboard() {
        return this.keyboard;
    }

    public Boolean getIsPersistent() {
        return this.isPersistent;
    }

    public Boolean getResizeKeyboard() {
        return this.resizeKeyboard;
    }

    public Boolean getOneTimeKeyboard() {
        return this.oneTimeKeyboard;
    }

    public String getInputFieldPlaceholder() {
        return this.inputFieldPlaceholder;
    }

    public Boolean getSelective() {
        return this.selective;
    }

    @JsonProperty("keyboard")
    public void setKeyboard(List<List<KeyboardButton>> keyboard) {
        this.keyboard = keyboard;
    }

    @JsonProperty("is_persistent")
    public void setIsPersistent(Boolean isPersistent) {
        this.isPersistent = isPersistent;
    }

    @JsonProperty("resize_keyboard")
    public void setResizeKeyboard(Boolean resizeKeyboard) {
        this.resizeKeyboard = resizeKeyboard;
    }

    @JsonProperty("one_time_keyboard")
    public void setOneTimeKeyboard(Boolean oneTimeKeyboard) {
        this.oneTimeKeyboard = oneTimeKeyboard;
    }

    @JsonProperty("input_field_placeholder")
    public void setInputFieldPlaceholder(String inputFieldPlaceholder) {
        this.inputFieldPlaceholder = inputFieldPlaceholder;
    }

    @JsonProperty("selective")
    public void setSelective(Boolean selective) {
        this.selective = selective;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ReplyKeyboardMarkup)) return false;
        final ReplyKeyboardMarkup other = (ReplyKeyboardMarkup) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$keyboard = this.getKeyboard();
        final Object other$keyboard = other.getKeyboard();
        if (this$keyboard == null ? other$keyboard != null : !this$keyboard.equals(other$keyboard)) return false;
        final Object this$isPersistent = this.getIsPersistent();
        final Object other$isPersistent = other.getIsPersistent();
        if (this$isPersistent == null ? other$isPersistent != null : !this$isPersistent.equals(other$isPersistent))
            return false;
        final Object this$resizeKeyboard = this.getResizeKeyboard();
        final Object other$resizeKeyboard = other.getResizeKeyboard();
        if (this$resizeKeyboard == null ? other$resizeKeyboard != null : !this$resizeKeyboard.equals(other$resizeKeyboard))
            return false;
        final Object this$oneTimeKeyboard = this.getOneTimeKeyboard();
        final Object other$oneTimeKeyboard = other.getOneTimeKeyboard();
        if (this$oneTimeKeyboard == null ? other$oneTimeKeyboard != null : !this$oneTimeKeyboard.equals(other$oneTimeKeyboard))
            return false;
        final Object this$inputFieldPlaceholder = this.getInputFieldPlaceholder();
        final Object other$inputFieldPlaceholder = other.getInputFieldPlaceholder();
        if (this$inputFieldPlaceholder == null ? other$inputFieldPlaceholder != null : !this$inputFieldPlaceholder.equals(other$inputFieldPlaceholder))
            return false;
        final Object this$selective = this.getSelective();
        final Object other$selective = other.getSelective();
        if (this$selective == null ? other$selective != null : !this$selective.equals(other$selective)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ReplyKeyboardMarkup;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $keyboard = this.getKeyboard();
        result = result * PRIME + ($keyboard == null ? 43 : $keyboard.hashCode());
        final Object $isPersistent = this.getIsPersistent();
        result = result * PRIME + ($isPersistent == null ? 43 : $isPersistent.hashCode());
        final Object $resizeKeyboard = this.getResizeKeyboard();
        result = result * PRIME + ($resizeKeyboard == null ? 43 : $resizeKeyboard.hashCode());
        final Object $oneTimeKeyboard = this.getOneTimeKeyboard();
        result = result * PRIME + ($oneTimeKeyboard == null ? 43 : $oneTimeKeyboard.hashCode());
        final Object $inputFieldPlaceholder = this.getInputFieldPlaceholder();
        result = result * PRIME + ($inputFieldPlaceholder == null ? 43 : $inputFieldPlaceholder.hashCode());
        final Object $selective = this.getSelective();
        result = result * PRIME + ($selective == null ? 43 : $selective.hashCode());
        return result;
    }

    public String toString() {
        return "ReplyKeyboardMarkup(keyboard=" + this.getKeyboard() + ", isPersistent=" + this.getIsPersistent() + ", resizeKeyboard=" + this.getResizeKeyboard() + ", oneTimeKeyboard=" + this.getOneTimeKeyboard() + ", inputFieldPlaceholder=" + this.getInputFieldPlaceholder() + ", selective=" + this.getSelective() + ")";
    }

    public static class ReplyKeyboardMarkupBuilder {
        private List<List<KeyboardButton>> keyboard;
        private Boolean isPersistent;
        private Boolean resizeKeyboard;
        private Boolean oneTimeKeyboard;
        private String inputFieldPlaceholder;
        private Boolean selective;

        ReplyKeyboardMarkupBuilder() {
        }

        @JsonProperty("keyboard")
        public ReplyKeyboardMarkupBuilder keyboard(List<List<KeyboardButton>> keyboard) {
            this.keyboard = keyboard;
            return this;
        }

        @JsonProperty("is_persistent")
        public ReplyKeyboardMarkupBuilder isPersistent(Boolean isPersistent) {
            this.isPersistent = isPersistent;
            return this;
        }

        @JsonProperty("resize_keyboard")
        public ReplyKeyboardMarkupBuilder resizeKeyboard(Boolean resizeKeyboard) {
            this.resizeKeyboard = resizeKeyboard;
            return this;
        }

        @JsonProperty("one_time_keyboard")
        public ReplyKeyboardMarkupBuilder oneTimeKeyboard(Boolean oneTimeKeyboard) {
            this.oneTimeKeyboard = oneTimeKeyboard;
            return this;
        }

        @JsonProperty("input_field_placeholder")
        public ReplyKeyboardMarkupBuilder inputFieldPlaceholder(String inputFieldPlaceholder) {
            this.inputFieldPlaceholder = inputFieldPlaceholder;
            return this;
        }

        @JsonProperty("selective")
        public ReplyKeyboardMarkupBuilder selective(Boolean selective) {
            this.selective = selective;
            return this;
        }

        public ReplyKeyboardMarkup build() {
            return new ReplyKeyboardMarkup(this.keyboard, this.isPersistent, this.resizeKeyboard, this.oneTimeKeyboard, this.inputFieldPlaceholder, this.selective);
        }

        public String toString() {
            return "ReplyKeyboardMarkup.ReplyKeyboardMarkupBuilder(keyboard=" + this.keyboard + ", isPersistent=" + this.isPersistent + ", resizeKeyboard=" + this.resizeKeyboard + ", oneTimeKeyboard=" + this.oneTimeKeyboard + ", inputFieldPlaceholder=" + this.inputFieldPlaceholder + ", selective=" + this.selective + ")";
        }
    }
}
