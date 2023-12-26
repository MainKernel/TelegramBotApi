package api.objects.bot;

import api.objects.BotApiObject;
import com.fasterxml.jackson.annotation.JsonProperty;

public class BotDescription implements BotApiObject {
    @JsonProperty("description")
    private String description;

    BotDescription(String description) {
        this.description = description;
    }

    public static BotDescriptionBuilder builder() {
        return new BotDescriptionBuilder();
    }

    public String getDescription() {
        return this.description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof BotDescription)) return false;
        final BotDescription other = (BotDescription) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$description = this.getDescription();
        final Object other$description = other.getDescription();
        if (this$description == null ? other$description != null : !this$description.equals(other$description))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof BotDescription;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $description = this.getDescription();
        result = result * PRIME + ($description == null ? 43 : $description.hashCode());
        return result;
    }

    public String toString() {
        return "BotDescription(description=" + this.getDescription() + ")";
    }

    public static class BotDescriptionBuilder {
        private String description;

        BotDescriptionBuilder() {
        }

        @JsonProperty("description")
        public BotDescriptionBuilder description(String description) {
            this.description = description;
            return this;
        }

        public BotDescription build() {
            return new BotDescription(this.description);
        }

        public String toString() {
            return "BotDescription.BotDescriptionBuilder(description=" + this.description + ")";
        }
    }
}
