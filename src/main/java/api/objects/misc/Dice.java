package api.objects.misc;

import api.objects.BotApiObject;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Dice implements BotApiObject {
    @JsonProperty("emoji")
    private String emoji;

    @JsonProperty("value")
    private Integer value;

    Dice(String emoji, Integer value) {
        this.emoji = emoji;
        this.value = value;
    }

    public static DiceBuilder builder() {
        return new DiceBuilder();
    }

    public String getEmoji() {
        return this.emoji;
    }

    public Integer getValue() {
        return this.value;
    }

    @JsonProperty("emoji")
    public void setEmoji(String emoji) {
        this.emoji = emoji;
    }

    @JsonProperty("value")
    public void setValue(Integer value) {
        this.value = value;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Dice)) return false;
        final Dice other = (Dice) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$emoji = this.getEmoji();
        final Object other$emoji = other.getEmoji();
        if (this$emoji == null ? other$emoji != null : !this$emoji.equals(other$emoji)) return false;
        final Object this$value = this.getValue();
        final Object other$value = other.getValue();
        if (this$value == null ? other$value != null : !this$value.equals(other$value)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Dice;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $emoji = this.getEmoji();
        result = result * PRIME + ($emoji == null ? 43 : $emoji.hashCode());
        final Object $value = this.getValue();
        result = result * PRIME + ($value == null ? 43 : $value.hashCode());
        return result;
    }

    public String toString() {
        return "Dice(emoji=" + this.getEmoji() + ", value=" + this.getValue() + ")";
    }

    public static class DiceBuilder {
        private String emoji;
        private Integer value;

        DiceBuilder() {
        }

        @JsonProperty("emoji")
        public DiceBuilder emoji(String emoji) {
            this.emoji = emoji;
            return this;
        }

        @JsonProperty("value")
        public DiceBuilder value(Integer value) {
            this.value = value;
            return this;
        }

        public Dice build() {
            return new Dice(this.emoji, this.value);
        }

        public String toString() {
            return "Dice.DiceBuilder(emoji=" + this.emoji + ", value=" + this.value + ")";
        }
    }
}
