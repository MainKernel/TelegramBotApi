package api.objects.media;

import api.objects.BotApiObject;
import api.objects.message.MessageEntity;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class InputMediaVideo implements BotApiObject {
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

    @JsonProperty("width")
    private Integer width;

    @JsonProperty("height")
    private Integer height;

    @JsonProperty("duration")
    private Integer duration;

    @JsonProperty("supports_streaming")
    private Boolean supportsStreaming;

    @JsonProperty("has_spoiler")
    private Boolean hasSpoiler;

    InputMediaVideo(String type, String media, String thumbnail, String caption, String parseMode, List<MessageEntity> captionEntities, Integer width, Integer height, Integer duration, Boolean supportsStreaming, Boolean hasSpoiler) {
        this.type = type;
        this.media = media;
        this.thumbnail = thumbnail;
        this.caption = caption;
        this.parseMode = parseMode;
        this.captionEntities = captionEntities;
        this.width = width;
        this.height = height;
        this.duration = duration;
        this.supportsStreaming = supportsStreaming;
        this.hasSpoiler = hasSpoiler;
    }

    public static InputMediaVideoBuilder builder() {
        return new InputMediaVideoBuilder();
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

    public Integer getWidth() {
        return this.width;
    }

    public Integer getHeight() {
        return this.height;
    }

    public Integer getDuration() {
        return this.duration;
    }

    public Boolean getSupportsStreaming() {
        return this.supportsStreaming;
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

    @JsonProperty("width")
    public void setWidth(Integer width) {
        this.width = width;
    }

    @JsonProperty("height")
    public void setHeight(Integer height) {
        this.height = height;
    }

    @JsonProperty("duration")
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    @JsonProperty("supports_streaming")
    public void setSupportsStreaming(Boolean supportsStreaming) {
        this.supportsStreaming = supportsStreaming;
    }

    @JsonProperty("has_spoiler")
    public void setHasSpoiler(Boolean hasSpoiler) {
        this.hasSpoiler = hasSpoiler;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof InputMediaVideo)) return false;
        final InputMediaVideo other = (InputMediaVideo) o;
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
        final Object this$width = this.getWidth();
        final Object other$width = other.getWidth();
        if (this$width == null ? other$width != null : !this$width.equals(other$width)) return false;
        final Object this$height = this.getHeight();
        final Object other$height = other.getHeight();
        if (this$height == null ? other$height != null : !this$height.equals(other$height)) return false;
        final Object this$duration = this.getDuration();
        final Object other$duration = other.getDuration();
        if (this$duration == null ? other$duration != null : !this$duration.equals(other$duration)) return false;
        final Object this$supportsStreaming = this.getSupportsStreaming();
        final Object other$supportsStreaming = other.getSupportsStreaming();
        if (this$supportsStreaming == null ? other$supportsStreaming != null : !this$supportsStreaming.equals(other$supportsStreaming))
            return false;
        final Object this$hasSpoiler = this.getHasSpoiler();
        final Object other$hasSpoiler = other.getHasSpoiler();
        if (this$hasSpoiler == null ? other$hasSpoiler != null : !this$hasSpoiler.equals(other$hasSpoiler))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof InputMediaVideo;
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
        final Object $width = this.getWidth();
        result = result * PRIME + ($width == null ? 43 : $width.hashCode());
        final Object $height = this.getHeight();
        result = result * PRIME + ($height == null ? 43 : $height.hashCode());
        final Object $duration = this.getDuration();
        result = result * PRIME + ($duration == null ? 43 : $duration.hashCode());
        final Object $supportsStreaming = this.getSupportsStreaming();
        result = result * PRIME + ($supportsStreaming == null ? 43 : $supportsStreaming.hashCode());
        final Object $hasSpoiler = this.getHasSpoiler();
        result = result * PRIME + ($hasSpoiler == null ? 43 : $hasSpoiler.hashCode());
        return result;
    }

    public String toString() {
        return "InputMediaVideo(type=" + this.getType() + ", media=" + this.getMedia() + ", thumbnail=" + this.getThumbnail() + ", caption=" + this.getCaption() + ", parseMode=" + this.getParseMode() + ", captionEntities=" + this.getCaptionEntities() + ", width=" + this.getWidth() + ", height=" + this.getHeight() + ", duration=" + this.getDuration() + ", supportsStreaming=" + this.getSupportsStreaming() + ", hasSpoiler=" + this.getHasSpoiler() + ")";
    }

    public static class InputMediaVideoBuilder {
        private String type;
        private String media;
        private String thumbnail;
        private String caption;
        private String parseMode;
        private List<MessageEntity> captionEntities;
        private Integer width;
        private Integer height;
        private Integer duration;
        private Boolean supportsStreaming;
        private Boolean hasSpoiler;

        InputMediaVideoBuilder() {
        }

        @JsonProperty("type")
        public InputMediaVideoBuilder type(String type) {
            this.type = type;
            return this;
        }

        @JsonProperty("media")
        public InputMediaVideoBuilder media(String media) {
            this.media = media;
            return this;
        }

        @JsonProperty("thumbnail")
        public InputMediaVideoBuilder thumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
            return this;
        }

        @JsonProperty("caption")
        public InputMediaVideoBuilder caption(String caption) {
            this.caption = caption;
            return this;
        }

        @JsonProperty("parse_mode")
        public InputMediaVideoBuilder parseMode(String parseMode) {
            this.parseMode = parseMode;
            return this;
        }

        @JsonProperty("caption_entities")
        public InputMediaVideoBuilder captionEntities(List<MessageEntity> captionEntities) {
            this.captionEntities = captionEntities;
            return this;
        }

        @JsonProperty("width")
        public InputMediaVideoBuilder width(Integer width) {
            this.width = width;
            return this;
        }

        @JsonProperty("height")
        public InputMediaVideoBuilder height(Integer height) {
            this.height = height;
            return this;
        }

        @JsonProperty("duration")
        public InputMediaVideoBuilder duration(Integer duration) {
            this.duration = duration;
            return this;
        }

        @JsonProperty("supports_streaming")
        public InputMediaVideoBuilder supportsStreaming(Boolean supportsStreaming) {
            this.supportsStreaming = supportsStreaming;
            return this;
        }

        @JsonProperty("has_spoiler")
        public InputMediaVideoBuilder hasSpoiler(Boolean hasSpoiler) {
            this.hasSpoiler = hasSpoiler;
            return this;
        }

        public InputMediaVideo build() {
            return new InputMediaVideo(this.type, this.media, this.thumbnail, this.caption, this.parseMode, this.captionEntities, this.width, this.height, this.duration, this.supportsStreaming, this.hasSpoiler);
        }

        public String toString() {
            return "InputMediaVideo.InputMediaVideoBuilder(type=" + this.type + ", media=" + this.media + ", thumbnail=" + this.thumbnail + ", caption=" + this.caption + ", parseMode=" + this.parseMode + ", captionEntities=" + this.captionEntities + ", width=" + this.width + ", height=" + this.height + ", duration=" + this.duration + ", supportsStreaming=" + this.supportsStreaming + ", hasSpoiler=" + this.hasSpoiler + ")";
        }
    }
}
