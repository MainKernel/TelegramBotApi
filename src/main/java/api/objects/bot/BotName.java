package api.objects.bot;

import api.objects.BotApiObject;
import com.fasterxml.jackson.annotation.JsonProperty;

public class BotName implements BotApiObject {
    @JsonProperty("name")
    private String name;

    BotName(String name) {
        this.name = name;
    }

    public static BotNameBuilder builder() {
        return new BotNameBuilder();
    }

    public String getName() {
        return this.name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof BotName)) return false;
        final BotName other = (BotName) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof BotName;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        return result;
    }

    public String toString() {
        return "BotName(name=" + this.getName() + ")";
    }

    public static class BotNameBuilder {
        private String name;

        BotNameBuilder() {
        }

        @JsonProperty("name")
        public BotNameBuilder name(String name) {
            this.name = name;
            return this;
        }

        public BotName build() {
            return new BotName(this.name);
        }

        public String toString() {
            return "BotName.BotNameBuilder(name=" + this.name + ")";
        }
    }
}
