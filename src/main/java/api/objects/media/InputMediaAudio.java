package api.objects.media;

import api.objects.BotApiObject;
import api.objects.message.MessageEntity;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class InputMediaAudio implements BotApiObject {

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

    @JsonProperty("duration")
    private Integer duration;

    @JsonProperty("performer")
    private String performer;

    @JsonProperty("title")
    private String title;

    InputMediaAudio(String type, String media, String thumbnail, String caption, String parseMode, List<MessageEntity> captionEntities, Integer duration, String performer, String title) {
        this.type = type;
        this.media = media;
        this.thumbnail = thumbnail;
        this.caption = caption;
        this.parseMode = parseMode;
        this.captionEntities = captionEntities;
        this.duration = duration;
        this.performer = performer;
        this.title = title;
    }

    public static InputMediaAudioBuilder builder() {
        return new InputMediaAudioBuilder();
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

    public Integer getDuration() {
        return this.duration;
    }

    public String getPerformer() {
        return this.performer;
    }

    public String getTitle() {
        return this.title;
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

    @JsonProperty("duration")
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    @JsonProperty("performer")
    public void setPerformer(String performer) {
        this.performer = performer;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof InputMediaAudio)) return false;
        final InputMediaAudio other = (InputMediaAudio) o;
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
        final Object this$duration = this.getDuration();
        final Object other$duration = other.getDuration();
        if (this$duration == null ? other$duration != null : !this$duration.equals(other$duration)) return false;
        final Object this$performer = this.getPerformer();
        final Object other$performer = other.getPerformer();
        if (this$performer == null ? other$performer != null : !this$performer.equals(other$performer)) return false;
        final Object this$title = this.getTitle();
        final Object other$title = other.getTitle();
        if (this$title == null ? other$title != null : !this$title.equals(other$title)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof InputMediaAudio;
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
        final Object $duration = this.getDuration();
        result = result * PRIME + ($duration == null ? 43 : $duration.hashCode());
        final Object $performer = this.getPerformer();
        result = result * PRIME + ($performer == null ? 43 : $performer.hashCode());
        final Object $title = this.getTitle();
        result = result * PRIME + ($title == null ? 43 : $title.hashCode());
        return result;
    }

    public String toString() {
        return "InputMediaAudio(type=" + this.getType() + ", media=" + this.getMedia() + ", thumbnail=" + this.getThumbnail() + ", caption=" + this.getCaption() + ", parseMode=" + this.getParseMode() + ", captionEntities=" + this.getCaptionEntities() + ", duration=" + this.getDuration() + ", performer=" + this.getPerformer() + ", title=" + this.getTitle() + ")";
    }

    public static class InputMediaAudioBuilder {
        private String type;
        private String media;
        private String thumbnail;
        private String caption;
        private String parseMode;
        private List<MessageEntity> captionEntities;
        private Integer duration;
        private String performer;
        private String title;

        InputMediaAudioBuilder() {
        }

        @JsonProperty("type")
        public InputMediaAudioBuilder type(String type) {
            this.type = type;
            return this;
        }

        @JsonProperty("media")
        public InputMediaAudioBuilder media(String media) {
            this.media = media;
            return this;
        }

        @JsonProperty("thumbnail")
        public InputMediaAudioBuilder thumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
            return this;
        }

        @JsonProperty("caption")
        public InputMediaAudioBuilder caption(String caption) {
            this.caption = caption;
            return this;
        }

        @JsonProperty("parse_mode")
        public InputMediaAudioBuilder parseMode(String parseMode) {
            this.parseMode = parseMode;
            return this;
        }

        @JsonProperty("caption_entities")
        public InputMediaAudioBuilder captionEntities(List<MessageEntity> captionEntities) {
            this.captionEntities = captionEntities;
            return this;
        }

        @JsonProperty("duration")
        public InputMediaAudioBuilder duration(Integer duration) {
            this.duration = duration;
            return this;
        }

        @JsonProperty("performer")
        public InputMediaAudioBuilder performer(String performer) {
            this.performer = performer;
            return this;
        }

        @JsonProperty("title")
        public InputMediaAudioBuilder title(String title) {
            this.title = title;
            return this;
        }

        public InputMediaAudio build() {
            return new InputMediaAudio(this.type, this.media, this.thumbnail, this.caption, this.parseMode, this.captionEntities, this.duration, this.performer, this.title);
        }

        public String toString() {
            return "InputMediaAudio.InputMediaAudioBuilder(type=" + this.type + ", media=" + this.media + ", thumbnail=" + this.thumbnail + ", caption=" + this.caption + ", parseMode=" + this.parseMode + ", captionEntities=" + this.captionEntities + ", duration=" + this.duration + ", performer=" + this.performer + ", title=" + this.title + ")";
        }
    }
}
