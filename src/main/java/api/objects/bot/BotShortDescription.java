package api.objects.bot;

import api.objects.BotApiObject;
import com.fasterxml.jackson.annotation.JsonProperty;

public class BotShortDescription implements BotApiObject {
    @JsonProperty("short_description")
    private String shortDescription;

    BotShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public static BotShortDescriptionBuilder builder() {
        return new BotShortDescriptionBuilder();
    }

    public String getShortDescription() {
        return this.shortDescription;
    }

    @JsonProperty("short_description")
    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof BotShortDescription)) return false;
        final BotShortDescription other = (BotShortDescription) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$shortDescription = this.getShortDescription();
        final Object other$shortDescription = other.getShortDescription();
        if (this$shortDescription == null ? other$shortDescription != null : !this$shortDescription.equals(other$shortDescription))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof BotShortDescription;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $shortDescription = this.getShortDescription();
        result = result * PRIME + ($shortDescription == null ? 43 : $shortDescription.hashCode());
        return result;
    }

    public String toString() {
        return "BotShortDescription(shortDescription=" + this.getShortDescription() + ")";
    }

    public static class BotShortDescriptionBuilder {
        private String shortDescription;

        BotShortDescriptionBuilder() {
        }

        @JsonProperty("short_description")
        public BotShortDescriptionBuilder shortDescription(String shortDescription) {
            this.shortDescription = shortDescription;
            return this;
        }

        public BotShortDescription build() {
            return new BotShortDescription(this.shortDescription);
        }

        public String toString() {
            return "BotShortDescription.BotShortDescriptionBuilder(shortDescription=" + this.shortDescription + ")";
        }
    }
}
