package api.objects.message;

import api.objects.BotApiObject;
import api.objects.user.User;
import com.fasterxml.jackson.annotation.JsonProperty;

public class MessageEntity implements BotApiObject {
    @JsonProperty("type")
    private String type;

    @JsonProperty("offset")
    private Integer offset;

    @JsonProperty("length")
    private Integer length;

    @JsonProperty("url")
    private String url;

    @JsonProperty("user")
    private User user;

    @JsonProperty("language")
    private String language;

    @JsonProperty("custom_emoji_id")
    private String customEmojiId;

    MessageEntity(String type, Integer offset, Integer length, String url, User user, String language, String customEmojiId) {
        this.type = type;
        this.offset = offset;
        this.length = length;
        this.url = url;
        this.user = user;
        this.language = language;
        this.customEmojiId = customEmojiId;
    }

    public static MessageEntityBuilder builder() {
        return new MessageEntityBuilder();
    }

    public String getType() {
        return this.type;
    }

    public Integer getOffset() {
        return this.offset;
    }

    public Integer getLength() {
        return this.length;
    }

    public String getUrl() {
        return this.url;
    }

    public User getUser() {
        return this.user;
    }

    public String getLanguage() {
        return this.language;
    }

    public String getCustomEmojiId() {
        return this.customEmojiId;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("offset")
    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    @JsonProperty("length")
    public void setLength(Integer length) {
        this.length = length;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("user")
    public void setUser(User user) {
        this.user = user;
    }

    @JsonProperty("language")
    public void setLanguage(String language) {
        this.language = language;
    }

    @JsonProperty("custom_emoji_id")
    public void setCustomEmojiId(String customEmojiId) {
        this.customEmojiId = customEmojiId;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof MessageEntity)) return false;
        final MessageEntity other = (MessageEntity) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        final Object this$offset = this.getOffset();
        final Object other$offset = other.getOffset();
        if (this$offset == null ? other$offset != null : !this$offset.equals(other$offset)) return false;
        final Object this$length = this.getLength();
        final Object other$length = other.getLength();
        if (this$length == null ? other$length != null : !this$length.equals(other$length)) return false;
        final Object this$url = this.getUrl();
        final Object other$url = other.getUrl();
        if (this$url == null ? other$url != null : !this$url.equals(other$url)) return false;
        final Object this$user = this.getUser();
        final Object other$user = other.getUser();
        if (this$user == null ? other$user != null : !this$user.equals(other$user)) return false;
        final Object this$language = this.getLanguage();
        final Object other$language = other.getLanguage();
        if (this$language == null ? other$language != null : !this$language.equals(other$language)) return false;
        final Object this$customEmojiId = this.getCustomEmojiId();
        final Object other$customEmojiId = other.getCustomEmojiId();
        if (this$customEmojiId == null ? other$customEmojiId != null : !this$customEmojiId.equals(other$customEmojiId))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof MessageEntity;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        final Object $offset = this.getOffset();
        result = result * PRIME + ($offset == null ? 43 : $offset.hashCode());
        final Object $length = this.getLength();
        result = result * PRIME + ($length == null ? 43 : $length.hashCode());
        final Object $url = this.getUrl();
        result = result * PRIME + ($url == null ? 43 : $url.hashCode());
        final Object $user = this.getUser();
        result = result * PRIME + ($user == null ? 43 : $user.hashCode());
        final Object $language = this.getLanguage();
        result = result * PRIME + ($language == null ? 43 : $language.hashCode());
        final Object $customEmojiId = this.getCustomEmojiId();
        result = result * PRIME + ($customEmojiId == null ? 43 : $customEmojiId.hashCode());
        return result;
    }

    public String toString() {
        return "MessageEntity(type=" + this.getType() + ", offset=" + this.getOffset() + ", length=" + this.getLength() + ", url=" + this.getUrl() + ", user=" + this.getUser() + ", language=" + this.getLanguage() + ", customEmojiId=" + this.getCustomEmojiId() + ")";
    }

    public static class MessageEntityBuilder {
        private String type;
        private Integer offset;
        private Integer length;
        private String url;
        private User user;
        private String language;
        private String customEmojiId;

        MessageEntityBuilder() {
        }

        @JsonProperty("type")
        public MessageEntityBuilder type(String type) {
            this.type = type;
            return this;
        }

        @JsonProperty("offset")
        public MessageEntityBuilder offset(Integer offset) {
            this.offset = offset;
            return this;
        }

        @JsonProperty("length")
        public MessageEntityBuilder length(Integer length) {
            this.length = length;
            return this;
        }

        @JsonProperty("url")
        public MessageEntityBuilder url(String url) {
            this.url = url;
            return this;
        }

        @JsonProperty("user")
        public MessageEntityBuilder user(User user) {
            this.user = user;
            return this;
        }

        @JsonProperty("language")
        public MessageEntityBuilder language(String language) {
            this.language = language;
            return this;
        }

        @JsonProperty("custom_emoji_id")
        public MessageEntityBuilder customEmojiId(String customEmojiId) {
            this.customEmojiId = customEmojiId;
            return this;
        }

        public MessageEntity build() {
            return new MessageEntity(this.type, this.offset, this.length, this.url, this.user, this.language, this.customEmojiId);
        }

        public String toString() {
            return "MessageEntity.MessageEntityBuilder(type=" + this.type + ", offset=" + this.offset + ", length=" + this.length + ", url=" + this.url + ", user=" + this.user + ", language=" + this.language + ", customEmojiId=" + this.customEmojiId + ")";
        }
    }
}
