package api.objects.keyboard;

import api.objects.BotApiObject;
import com.fasterxml.jackson.annotation.JsonProperty;

public class KeyboardButtonPollType implements BotApiObject {
    @JsonProperty("type")
    private String type;

    KeyboardButtonPollType(String type) {
        this.type = type;
    }

    public static KeyboardButtonPollTypeBuilder builder() {
        return new KeyboardButtonPollTypeBuilder();
    }

    public String getType() {
        return this.type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof KeyboardButtonPollType)) return false;
        final KeyboardButtonPollType other = (KeyboardButtonPollType) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof KeyboardButtonPollType;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        return result;
    }

    public String toString() {
        return "KeyboardButtonPollType(type=" + this.getType() + ")";
    }

    public static class KeyboardButtonPollTypeBuilder {
        private String type;

        KeyboardButtonPollTypeBuilder() {
        }

        @JsonProperty("type")
        public KeyboardButtonPollTypeBuilder type(String type) {
            this.type = type;
            return this;
        }

        public KeyboardButtonPollType build() {
            return new KeyboardButtonPollType(this.type);
        }

        public String toString() {
            return "KeyboardButtonPollType.KeyboardButtonPollTypeBuilder(type=" + this.type + ")";
        }
    }
}
