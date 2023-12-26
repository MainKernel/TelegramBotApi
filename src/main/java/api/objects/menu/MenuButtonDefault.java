package api.objects.menu;

import api.objects.BotApiObject;
import com.fasterxml.jackson.annotation.JsonProperty;

public class MenuButtonDefault implements BotApiObject {
    @JsonProperty("type")
    private String type;

    MenuButtonDefault(String type) {
        this.type = type;
    }

    public static MenuButtonDefaultBuilder builder() {
        return new MenuButtonDefaultBuilder();
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
        if (!(o instanceof MenuButtonDefault)) return false;
        final MenuButtonDefault other = (MenuButtonDefault) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof MenuButtonDefault;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        return result;
    }

    public String toString() {
        return "MenuButtonDefault(type=" + this.getType() + ")";
    }

    public static class MenuButtonDefaultBuilder {
        private String type;

        MenuButtonDefaultBuilder() {
        }

        @JsonProperty("type")
        public MenuButtonDefaultBuilder type(String type) {
            this.type = type;
            return this;
        }

        public MenuButtonDefault build() {
            return new MenuButtonDefault(this.type);
        }

        public String toString() {
            return "MenuButtonDefault.MenuButtonDefaultBuilder(type=" + this.type + ")";
        }
    }
}
