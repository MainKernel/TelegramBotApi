package api.objects.media;

import api.objects.BotApiObject;
import api.objects.message.MessageEntity;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class InputMediaDocument implements BotApiObject {
    @JsonProperty("type")
    private String type;

    @JsonProperty("media")
    private String media;

    @JsonProperty("thumbnail")
    private String thumbnail;

    @JsonProperty("caption")
    private String caption;

    @JsonProperty("parse_mode")
    private String parseMode;

    @JsonProperty("caption_entities")
    private List<MessageEntity> captionEntities;

    @JsonProperty("disable_content_type_detection")
    private Boolean disableContentTypeDetection;

    InputMediaDocument(String type, String media, String thumbnail, String caption, String parseMode, List<MessageEntity> captionEntities, Boolean disableContentTypeDetection) {
        this.type = type;
        this.media = media;
        this.thumbnail = thumbnail;
        this.caption = caption;
        this.parseMode = parseMode;
        this.captionEntities = captionEntities;
        this.disableContentTypeDetection = disableContentTypeDetection;
    }

    public static InputMediaDocumentBuilder builder() {
        return new InputMediaDocumentBuilder();
    }

    public String getType() {
        return this.type;
    }

    public String getMedia() {
        return this.media;
    }

    public String getThumbnail() {
        return this.thumbnail;
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

    public Boolean getDisableContentTypeDetection() {
        return this.disableContentTypeDetection;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("media")
    public void setMedia(String media) {
        this.media = media;
    }

    @JsonProperty("thumbnail")
    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
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

    @JsonProperty("disable_content_type_detection")
    public void setDisableContentTypeDetection(Boolean disableContentTypeDetection) {
        this.disableContentTypeDetection = disableContentTypeDetection;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof InputMediaDocument)) return false;
        final InputMediaDocument other = (InputMediaDocument) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        final Object this$media = this.getMedia();
        final Object other$media = other.getMedia();
        if (this$media == null ? other$media != null : !this$media.equals(other$media)) return false;
        final Object this$thumbnail = this.getThumbnail();
        final Object other$thumbnail = other.getThumbnail();
        if (this$thumbnail == null ? other$thumbnail != null : !this$thumbnail.equals(other$thumbnail)) return false;
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
        final Object this$disableContentTypeDetection = this.getDisableContentTypeDetection();
        final Object other$disableContentTypeDetection = other.getDisableContentTypeDetection();
        if (this$disableContentTypeDetection == null ? other$disableContentTypeDetection != null : !this$disableContentTypeDetection.equals(other$disableContentTypeDetection))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof InputMediaDocument;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        final Object $media = this.getMedia();
        result = result * PRIME + ($media == null ? 43 : $media.hashCode());
        final Object $thumbnail = this.getThumbnail();
        result = result * PRIME + ($thumbnail == null ? 43 : $thumbnail.hashCode());
        final Object $caption = this.getCaption();
        result = result * PRIME + ($caption == null ? 43 : $caption.hashCode());
        final Object $parseMode = this.getParseMode();
        result = result * PRIME + ($parseMode == null ? 43 : $parseMode.hashCode());
        final Object $captionEntities = this.getCaptionEntities();
        result = result * PRIME + ($captionEntities == null ? 43 : $captionEntities.hashCode());
        final Object $disableContentTypeDetection = this.getDisableContentTypeDetection();
        result = result * PRIME + ($disableContentTypeDetection == null ? 43 : $disableContentTypeDetection.hashCode());
        return result;
    }

    public String toString() {
        return "InputMediaDocument(type=" + this.getType() + ", media=" + this.getMedia() + ", thumbnail=" + this.getThumbnail() + ", caption=" + this.getCaption() + ", parseMode=" + this.getParseMode() + ", captionEntities=" + this.getCaptionEntities() + ", disableContentTypeDetection=" + this.getDisableContentTypeDetection() + ")";
    }

    public static class InputMediaDocumentBuilder {
        private String type;
        private String media;
        private String thumbnail;
        private String caption;
        private String parseMode;
        private List<MessageEntity> captionEntities;
        private Boolean disableContentTypeDetection;

        InputMediaDocumentBuilder() {
        }

        @JsonProperty("type")
        public InputMediaDocumentBuilder type(String type) {
            this.type = type;
            return this;
        }

        @JsonProperty("media")
        public InputMediaDocumentBuilder media(String media) {
            this.media = media;
            return this;
        }

        @JsonProperty("thumbnail")
        public InputMediaDocumentBuilder thumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
            return this;
        }

        @JsonProperty("caption")
        public InputMediaDocumentBuilder caption(String caption) {
            this.caption = caption;
            return this;
        }

        @JsonProperty("parse_mode")
        public InputMediaDocumentBuilder parseMode(String parseMode) {
            this.parseMode = parseMode;
            return this;
        }

        @JsonProperty("caption_entities")
        public InputMediaDocumentBuilder captionEntities(List<MessageEntity> captionEntities) {
            this.captionEntities = captionEntities;
            return this;
        }

        @JsonProperty("disable_content_type_detection")
        public InputMediaDocumentBuilder disableContentTypeDetection(Boolean disableContentTypeDetection) {
            this.disableContentTypeDetection = disableContentTypeDetection;
            return this;
        }

        public InputMediaDocument build() {
            return new InputMediaDocument(this.type, this.media, this.thumbnail, this.caption, this.parseMode, this.captionEntities, this.disableContentTypeDetection);
        }

        public String toString() {
            return "InputMediaDocument.InputMediaDocumentBuilder(type=" + this.type + ", media=" + this.media + ", thumbnail=" + this.thumbnail + ", caption=" + this.caption + ", parseMode=" + this.parseMode + ", captionEntities=" + this.captionEntities + ", disableContentTypeDetection=" + this.disableContentTypeDetection + ")";
        }
    }
}
