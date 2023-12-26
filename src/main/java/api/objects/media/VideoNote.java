package api.objects.media;

import api.objects.BotApiObject;
import api.objects.misc.PhotoSize;
import com.fasterxml.jackson.annotation.JsonProperty;

public class VideoNote implements BotApiObject {
    @JsonProperty("file_id")
    private String fileId;

    @JsonProperty("file_unique_id")
    private String fileUniqueId;

    @JsonProperty("length")
    private Integer length;

    @JsonProperty("duration")
    private Integer duration;

    @JsonProperty("thumbnail")
    private PhotoSize thumbnail;

    @JsonProperty("file_size")
    private Integer fileSize;

    VideoNote(String fileId, String fileUniqueId, Integer length, Integer duration, PhotoSize thumbnail, Integer fileSize) {
        this.fileId = fileId;
        this.fileUniqueId = fileUniqueId;
        this.length = length;
        this.duration = duration;
        this.thumbnail = thumbnail;
        this.fileSize = fileSize;
    }

    public static VideoNoteBuilder builder() {
        return new VideoNoteBuilder();
    }

    public String getFileId() {
        return this.fileId;
    }

    public String getFileUniqueId() {
        return this.fileUniqueId;
    }

    public Integer getLength() {
        return this.length;
    }

    public Integer getDuration() {
        return this.duration;
    }

    public PhotoSize getThumbnail() {
        return this.thumbnail;
    }

    public Integer getFileSize() {
        return this.fileSize;
    }

    @JsonProperty("file_id")
    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    @JsonProperty("file_unique_id")
    public void setFileUniqueId(String fileUniqueId) {
        this.fileUniqueId = fileUniqueId;
    }

    @JsonProperty("length")
    public void setLength(Integer length) {
        this.length = length;
    }

    @JsonProperty("duration")
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    @JsonProperty("thumbnail")
    public void setThumbnail(PhotoSize thumbnail) {
        this.thumbnail = thumbnail;
    }

    @JsonProperty("file_size")
    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof VideoNote)) return false;
        final VideoNote other = (VideoNote) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$fileId = this.getFileId();
        final Object other$fileId = other.getFileId();
        if (this$fileId == null ? other$fileId != null : !this$fileId.equals(other$fileId)) return false;
        final Object this$fileUniqueId = this.getFileUniqueId();
        final Object other$fileUniqueId = other.getFileUniqueId();
        if (this$fileUniqueId == null ? other$fileUniqueId != null : !this$fileUniqueId.equals(other$fileUniqueId))
            return false;
        final Object this$length = this.getLength();
        final Object other$length = other.getLength();
        if (this$length == null ? other$length != null : !this$length.equals(other$length)) return false;
        final Object this$duration = this.getDuration();
        final Object other$duration = other.getDuration();
        if (this$duration == null ? other$duration != null : !this$duration.equals(other$duration)) return false;
        final Object this$thumbnail = this.getThumbnail();
        final Object other$thumbnail = other.getThumbnail();
        if (this$thumbnail == null ? other$thumbnail != null : !this$thumbnail.equals(other$thumbnail)) return false;
        final Object this$fileSize = this.getFileSize();
        final Object other$fileSize = other.getFileSize();
        if (this$fileSize == null ? other$fileSize != null : !this$fileSize.equals(other$fileSize)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof VideoNote;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $fileId = this.getFileId();
        result = result * PRIME + ($fileId == null ? 43 : $fileId.hashCode());
        final Object $fileUniqueId = this.getFileUniqueId();
        result = result * PRIME + ($fileUniqueId == null ? 43 : $fileUniqueId.hashCode());
        final Object $length = this.getLength();
        result = result * PRIME + ($length == null ? 43 : $length.hashCode());
        final Object $duration = this.getDuration();
        result = result * PRIME + ($duration == null ? 43 : $duration.hashCode());
        final Object $thumbnail = this.getThumbnail();
        result = result * PRIME + ($thumbnail == null ? 43 : $thumbnail.hashCode());
        final Object $fileSize = this.getFileSize();
        result = result * PRIME + ($fileSize == null ? 43 : $fileSize.hashCode());
        return result;
    }

    public String toString() {
        return "VideoNote(fileId=" + this.getFileId() + ", fileUniqueId=" + this.getFileUniqueId() + ", length=" + this.getLength() + ", duration=" + this.getDuration() + ", thumbnail=" + this.getThumbnail() + ", fileSize=" + this.getFileSize() + ")";
    }

    public static class VideoNoteBuilder {
        private String fileId;
        private String fileUniqueId;
        private Integer length;
        private Integer duration;
        private PhotoSize thumbnail;
        private Integer fileSize;

        VideoNoteBuilder() {
        }

        @JsonProperty("file_id")
        public VideoNoteBuilder fileId(String fileId) {
            this.fileId = fileId;
            return this;
        }

        @JsonProperty("file_unique_id")
        public VideoNoteBuilder fileUniqueId(String fileUniqueId) {
            this.fileUniqueId = fileUniqueId;
            return this;
        }

        @JsonProperty("length")
        public VideoNoteBuilder length(Integer length) {
            this.length = length;
            return this;
        }

        @JsonProperty("duration")
        public VideoNoteBuilder duration(Integer duration) {
            this.duration = duration;
            return this;
        }

        @JsonProperty("thumbnail")
        public VideoNoteBuilder thumbnail(PhotoSize thumbnail) {
            this.thumbnail = thumbnail;
            return this;
        }

        @JsonProperty("file_size")
        public VideoNoteBuilder fileSize(Integer fileSize) {
            this.fileSize = fileSize;
            return this;
        }

        public VideoNote build() {
            return new VideoNote(this.fileId, this.fileUniqueId, this.length, this.duration, this.thumbnail, this.fileSize);
        }

        public String toString() {
            return "VideoNote.VideoNoteBuilder(fileId=" + this.fileId + ", fileUniqueId=" + this.fileUniqueId + ", length=" + this.length + ", duration=" + this.duration + ", thumbnail=" + this.thumbnail + ", fileSize=" + this.fileSize + ")";
        }
    }
}
