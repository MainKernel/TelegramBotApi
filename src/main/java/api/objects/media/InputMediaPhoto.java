package api.objects.media;

import api.objects.BotApiObject;
import api.objects.message.MessageEntity;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class InputMediaPhoto implements BotApiObject {
    @JsonProperty("type")
    private String type;
    @JsonProperty("media")
    private String media;
    @JsonProperty("caption")
    private String caption;
    @JsonProperty("parse_mode")
    private String parseMode;
    @JsonProperty("caption_entities")
    private List<MessageEntity> captionEntities;
    @JsonProperty("has_spoiler")
    private Boolean hasSpoiler;

    InputMediaPhoto(String type, String media, String caption, String parseMode, List<MessageEntity> captionEntities, Boolean hasSpoiler) {
        this.type = type;
        this.media = media;
        this.caption = caption;
        this.parseMode = parseMode;
        this.captionEntities = captionEntities;
        this.hasSpoiler = hasSpoiler;
    }

    public static InputMediaPhotoBuilder builder() {
        return new InputMediaPhotoBuilder();
    }

    public String getType() {
        return this.type;
    }

    public String getMedia() {
        return this.media;
    }

    public String getCaption() {
        return this.caption;
    }

    public String getParseMode() {
        return this.parseMode;
    }

    public List<MessageEntity> getCaptionEntities() {
        return this.captionEntities;
    }

    public Boolean getHasSpoiler() {
        return this.hasSpoiler;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("media")
    public void setMedia(String media) {
        this.media = media;
    }

    @JsonProperty("caption")
    public void setCaption(String caption) {
        this.caption = caption;
    }

    @JsonProperty("parse_mode")
    public void setParseMode(String parseMode) {
        this.parseMode = parseMode;
    }

    @JsonProperty("caption_entities")
    public void setCaptionEntities(List<MessageEntity> captionEntities) {
        this.captionEntities = captionEntities;
    }

    @JsonProperty("has_spoiler")
    public void setHasSpoiler(Boolean hasSpoiler) {
        this.hasSpoiler = hasSpoiler;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof InputMediaPhoto)) return false;
        final InputMediaPhoto other = (InputMediaPhoto) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        final Object this$media = this.getMedia();
        final Object other$media = other.getMedia();
        if (this$media == null ? other$media != null : !this$media.equals(other$media)) return false;
        final Object this$caption = this.getCaption();
        final Object other$caption = other.getCaption();
        if (this$caption == null ? other$caption != null : !this$caption.equals(other$caption)) return false;
        final Object this$parseMode = this.getParseMode();
        final Object other$parseMode = other.getParseMode();
        if (this$parseMode == null ? other$parseMode != null : !this$parseMode.equals(other$parseMode)) return false;
        final Object this$captionEntities = this.getCaptionEntities();
        final Object other$captionEntities = other.getCaptionEntities();
        if (this$captionEntities == null ? other$captionEntities != null : !this$captionEntities.equals(other$captionEntities))
            return false;
        final Object this$hasSpoiler = this.getHasSpoiler();
        final Object other$hasSpoiler = other.getHasSpoiler();
        if (this$hasSpoiler == null ? other$hasSpoiler != null : !this$hasSpoiler.equals(other$hasSpoiler))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof InputMediaPhoto;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        final Object $media = this.getMedia();
        result = result * PRIME + ($media == null ? 43 : $media.hashCode());
        final Object $caption = this.getCaption();
        result = result * PRIME + ($caption == null ? 43 : $caption.hashCode());
        final Object $parseMode = this.getParseMode();
        result = result * PRIME + ($parseMode == null ? 43 : $parseMode.hashCode());
        final Object $captionEntities = this.getCaptionEntities();
        result = result * PRIME + ($captionEntities == null ? 43 : $captionEntities.hashCode());
        final Object $hasSpoiler = this.getHasSpoiler();
        result = result * PRIME + ($hasSpoiler == null ? 43 : $hasSpoiler.hashCode());
        return result;
    }

    public String toString() {
        return "InputMediaPhoto(type=" + this.getType() + ", media=" + this.getMedia() + ", caption=" + this.getCaption() + ", parseMode=" + this.getParseMode() + ", captionEntities=" + this.getCaptionEntities() + ", hasSpoiler=" + this.getHasSpoiler() + ")";
    }

    public static class InputMediaPhotoBuilder {
        private String type;
        private String media;
        private String caption;
        private String parseMode;
        private List<MessageEntity> captionEntities;
        private Boolean hasSpoiler;

        InputMediaPhotoBuilder() {
        }

        @JsonProperty("type")
        public InputMediaPhotoBuilder type(String type) {
            this.type = type;
            return this;
        }

        @JsonProperty("media")
        public InputMediaPhotoBuilder media(String media) {
            this.media = media;
            return this;
        }

        @JsonProperty("caption")
        public InputMediaPhotoBuilder caption(String caption) {
            this.caption = caption;
            return this;
        }

        @JsonProperty("parse_mode")
        public InputMediaPhotoBuilder parseMode(String parseMode) {
            this.parseMode = parseMode;
            return this;
        }

        @JsonProperty("caption_entities")
        public InputMediaPhotoBuilder captionEntities(List<MessageEntity> captionEntities) {
            this.captionEntities = captionEntities;
            return this;
        }

        @JsonProperty("has_spoiler")
        public InputMediaPhotoBuilder hasSpoiler(Boolean hasSpoiler) {
            this.hasSpoiler = hasSpoiler;
            return this;
        }

        public InputMediaPhoto build() {
            return new InputMediaPhoto(this.type, this.media, this.caption, this.parseMode, this.captionEntities, this.hasSpoiler);
        }

        public String toString() {
            return "InputMediaPhoto.InputMediaPhotoBuilder(type=" + this.type + ", media=" + this.media + ", caption=" + this.caption + ", parseMode=" + this.parseMode + ", captionEntities=" + this.captionEntities + ", hasSpoiler=" + this.hasSpoiler + ")";
        }
    }
}
