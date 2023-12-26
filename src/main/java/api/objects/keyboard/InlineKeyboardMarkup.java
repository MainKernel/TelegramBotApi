package api.objects.keyboard;

import api.objects.BotApiObject;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class InlineKeyboardMarkup implements BotApiObject {
    @JsonProperty("inline_keyboard")
    private List<List<InlineKeyboardButton>> inlineKeyboard;

    InlineKeyboardMarkup(List<List<InlineKeyboardButton>> inlineKeyboard) {
        this.inlineKeyboard = inlineKeyboard;
    }

    public static InlineKeyboardMarkupBuilder builder() {
        return new InlineKeyboardMarkupBuilder();
    }

    public List<List<InlineKeyboardButton>> getInlineKeyboard() {
        return this.inlineKeyboard;
    }

    @JsonProperty("inline_keyboard")
    public void setInlineKeyboard(List<List<InlineKeyboardButton>> inlineKeyboard) {
        this.inlineKeyboard = inlineKeyboard;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof InlineKeyboardMarkup)) return false;
        final InlineKeyboardMarkup other = (InlineKeyboardMarkup) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$inlineKeyboard = this.getInlineKeyboard();
        final Object other$inlineKeyboard = other.getInlineKeyboard();
        if (this$inlineKeyboard == null ? other$inlineKeyboard != null : !this$inlineKeyboard.equals(other$inlineKeyboard))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof InlineKeyboardMarkup;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $inlineKeyboard = this.getInlineKeyboard();
        result = result * PRIME + ($inlineKeyboard == null ? 43 : $inlineKeyboard.hashCode());
        return result;
    }

    public String toString() {
        return "InlineKeyboardMarkup(inlineKeyboard=" + this.getInlineKeyboard() + ")";
    }

    public static class InlineKeyboardMarkupBuilder {
        private List<List<InlineKeyboardButton>> inlineKeyboard;

        InlineKeyboardMarkupBuilder() {
        }

        @JsonProperty("inline_keyboard")
        public InlineKeyboardMarkupBuilder inlineKeyboard(List<List<InlineKeyboardButton>> inlineKeyboard) {
            this.inlineKeyboard = inlineKeyboard;
            return this;
        }

        public InlineKeyboardMarkup build() {
            return new InlineKeyboardMarkup(this.inlineKeyboard);
        }

        public String toString() {
            return "InlineKeyboardMarkup.InlineKeyboardMarkupBuilder(inlineKeyboard=" + this.inlineKeyboard + ")";
        }
    }
}
