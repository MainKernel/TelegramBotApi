package api.objects.media;

import api.objects.BotApiObject;

public class InputMedia implements BotApiObject {
    InputMedia() {
    }

    public static InputMediaBuilder builder() {
        return new InputMediaBuilder();
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof InputMedia)) return false;
        final InputMedia other = (InputMedia) o;
        if (!other.canEqual((Object) this)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof InputMedia;
    }

    public int hashCode() {
        int result = 1;
        return result;
    }

    public String toString() {
        return "InputMedia()";
    }

    public static class InputMediaBuilder {
        InputMediaBuilder() {
        }

        public InputMedia build() {
            return new InputMedia();
        }

        public String toString() {
            return "InputMedia.InputMediaBuilder()";
        }
    }
}
