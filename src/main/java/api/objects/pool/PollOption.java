package api.objects.pool;

import api.objects.BotApiObject;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PollOption implements BotApiObject {
    @JsonProperty("text")
    private String text;

    @JsonProperty("voter_count")
    private Integer voterCount;

    PollOption(String text, Integer voterCount) {
        this.text = text;
        this.voterCount = voterCount;
    }

    public static PollOptionBuilder builder() {
        return new PollOptionBuilder();
    }

    public String getText() {
        return this.text;
    }

    public Integer getVoterCount() {
        return this.voterCount;
    }

    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    @JsonProperty("voter_count")
    public void setVoterCount(Integer voterCount) {
        this.voterCount = voterCount;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof PollOption)) return false;
        final PollOption other = (PollOption) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$text = this.getText();
        final Object other$text = other.getText();
        if (this$text == null ? other$text != null : !this$text.equals(other$text)) return false;
        final Object this$voterCount = this.getVoterCount();
        final Object other$voterCount = other.getVoterCount();
        if (this$voterCount == null ? other$voterCount != null : !this$voterCount.equals(other$voterCount))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof PollOption;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $text = this.getText();
        result = result * PRIME + ($text == null ? 43 : $text.hashCode());
        final Object $voterCount = this.getVoterCount();
        result = result * PRIME + ($voterCount == null ? 43 : $voterCount.hashCode());
        return result;
    }

    public String toString() {
        return "PollOption(text=" + this.getText() + ", voterCount=" + this.getVoterCount() + ")";
    }

    public static class PollOptionBuilder {
        private String text;
        private Integer voterCount;

        PollOptionBuilder() {
        }

        @JsonProperty("text")
        public PollOptionBuilder text(String text) {
            this.text = text;
            return this;
        }

        @JsonProperty("voter_count")
        public PollOptionBuilder voterCount(Integer voterCount) {
            this.voterCount = voterCount;
            return this;
        }

        public PollOption build() {
            return new PollOption(this.text, this.voterCount);
        }

        public String toString() {
            return "PollOption.PollOptionBuilder(text=" + this.text + ", voterCount=" + this.voterCount + ")";
        }
    }
}
