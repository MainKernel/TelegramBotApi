package api.objects.forum;

import api.objects.BotApiObject;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ForumTopic implements BotApiObject {
    @JsonProperty("message_thread_id")
    private Integer messageThreadId;
    @JsonProperty("name")
    private String name;
    @JsonProperty("icon_color")
    private Integer iconColor;
    @JsonProperty("icon_custom_emoji_id")
    private String iconCustomEmojiId;

    ForumTopic(Integer messageThreadId, String name, Integer iconColor, String iconCustomEmojiId) {
        this.messageThreadId = messageThreadId;
        this.name = name;
        this.iconColor = iconColor;
        this.iconCustomEmojiId = iconCustomEmojiId;
    }

    public static ForumTopicBuilder builder() {
        return new ForumTopicBuilder();
    }

    public Integer getMessageThreadId() {
        return this.messageThreadId;
    }

    public String getName() {
        return this.name;
    }

    public Integer getIconColor() {
        return this.iconColor;
    }

    public String getIconCustomEmojiId() {
        return this.iconCustomEmojiId;
    }

    @JsonProperty("message_thread_id")
    public void setMessageThreadId(Integer messageThreadId) {
        this.messageThreadId = messageThreadId;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("icon_color")
    public void setIconColor(Integer iconColor) {
        this.iconColor = iconColor;
    }

    @JsonProperty("icon_custom_emoji_id")
    public void setIconCustomEmojiId(String iconCustomEmojiId) {
        this.iconCustomEmojiId = iconCustomEmojiId;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ForumTopic)) return false;
        final ForumTopic other = (ForumTopic) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$messageThreadId = this.getMessageThreadId();
        final Object other$messageThreadId = other.getMessageThreadId();
        if (this$messageThreadId == null ? other$messageThreadId != null : !this$messageThreadId.equals(other$messageThreadId))
            return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$iconColor = this.getIconColor();
        final Object other$iconColor = other.getIconColor();
        if (this$iconColor == null ? other$iconColor != null : !this$iconColor.equals(other$iconColor)) return false;
        final Object this$iconCustomEmojiId = this.getIconCustomEmojiId();
        final Object other$iconCustomEmojiId = other.getIconCustomEmojiId();
        if (this$iconCustomEmojiId == null ? other$iconCustomEmojiId != null : !this$iconCustomEmojiId.equals(other$iconCustomEmojiId))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ForumTopic;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $messageThreadId = this.getMessageThreadId();
        result = result * PRIME + ($messageThreadId == null ? 43 : $messageThreadId.hashCode());
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $iconColor = this.getIconColor();
        result = result * PRIME + ($iconColor == null ? 43 : $iconColor.hashCode());
        final Object $iconCustomEmojiId = this.getIconCustomEmojiId();
        result = result * PRIME + ($iconCustomEmojiId == null ? 43 : $iconCustomEmojiId.hashCode());
        return result;
    }

    public String toString() {
        return "ForumTopic(messageThreadId=" + this.getMessageThreadId() + ", name=" + this.getName() + ", iconColor=" + this.getIconColor() + ", iconCustomEmojiId=" + this.getIconCustomEmojiId() + ")";
    }

    public static class ForumTopicBuilder {
        private Integer messageThreadId;
        private String name;
        private Integer iconColor;
        private String iconCustomEmojiId;

        ForumTopicBuilder() {
        }

        @JsonProperty("message_thread_id")
        public ForumTopicBuilder messageThreadId(Integer messageThreadId) {
            this.messageThreadId = messageThreadId;
            return this;
        }

        @JsonProperty("name")
        public ForumTopicBuilder name(String name) {
            this.name = name;
            return this;
        }

        @JsonProperty("icon_color")
        public ForumTopicBuilder iconColor(Integer iconColor) {
            this.iconColor = iconColor;
            return this;
        }

        @JsonProperty("icon_custom_emoji_id")
        public ForumTopicBuilder iconCustomEmojiId(String iconCustomEmojiId) {
            this.iconCustomEmojiId = iconCustomEmojiId;
            return this;
        }

        public ForumTopic build() {
            return new ForumTopic(this.messageThreadId, this.name, this.iconColor, this.iconCustomEmojiId);
        }

        public String toString() {
            return "ForumTopic.ForumTopicBuilder(messageThreadId=" + this.messageThreadId + ", name=" + this.name + ", iconColor=" + this.iconColor + ", iconCustomEmojiId=" + this.iconCustomEmojiId + ")";
        }
    }
}
