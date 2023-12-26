package api.objects.forum;

import api.objects.BotApiObject;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ForumTopicEdited implements BotApiObject {
    @JsonProperty("name")
    private String name;

    @JsonProperty("icon_custom_emoji_id")
    private String iconCustomEmojiId;

    ForumTopicEdited(String name, String iconCustomEmojiId) {
        this.name = name;
        this.iconCustomEmojiId = iconCustomEmojiId;
    }

    public static ForumTopicEditedBuilder builder() {
        return new ForumTopicEditedBuilder();
    }

    public String getName() {
        return this.name;
    }

    public String getIconCustomEmojiId() {
        return this.iconCustomEmojiId;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("icon_custom_emoji_id")
    public void setIconCustomEmojiId(String iconCustomEmojiId) {
        this.iconCustomEmojiId = iconCustomEmojiId;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ForumTopicEdited)) return false;
        final ForumTopicEdited other = (ForumTopicEdited) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$iconCustomEmojiId = this.getIconCustomEmojiId();
        final Object other$iconCustomEmojiId = other.getIconCustomEmojiId();
        if (this$iconCustomEmojiId == null ? other$iconCustomEmojiId != null : !this$iconCustomEmojiId.equals(other$iconCustomEmojiId))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ForumTopicEdited;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $iconCustomEmojiId = this.getIconCustomEmojiId();
        result = result * PRIME + ($iconCustomEmojiId == null ? 43 : $iconCustomEmojiId.hashCode());
        return result;
    }

    public String toString() {
        return "ForumTopicEdited(name=" + this.getName() + ", iconCustomEmojiId=" + this.getIconCustomEmojiId() + ")";
    }

    public static class ForumTopicEditedBuilder {
        private String name;
        private String iconCustomEmojiId;

        ForumTopicEditedBuilder() {
        }

        @JsonProperty("name")
        public ForumTopicEditedBuilder name(String name) {
            this.name = name;
            return this;
        }

        @JsonProperty("icon_custom_emoji_id")
        public ForumTopicEditedBuilder iconCustomEmojiId(String iconCustomEmojiId) {
            this.iconCustomEmojiId = iconCustomEmojiId;
            return this;
        }

        public ForumTopicEdited build() {
            return new ForumTopicEdited(this.name, this.iconCustomEmojiId);
        }

        public String toString() {
            return "ForumTopicEdited.ForumTopicEditedBuilder(name=" + this.name + ", iconCustomEmojiId=" + this.iconCustomEmojiId + ")";
        }
    }
}
