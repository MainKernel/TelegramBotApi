package api.objects.media;

import api.objects.BotApiObject;
import api.objects.misc.PhotoSize;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Audio implements BotApiObject {
    @JsonProperty("file_id")
    private String fileId;

    @JsonProperty("file_unique_id")
    private String fileUniqueId;

    @JsonProperty("duration")
    private Integer duration;

    @JsonProperty("performer")
    private String performer;

    @JsonProperty("title")
    private String title;

    @JsonProperty("file_name")
    private String fileName;

    @JsonProperty("mime_type")
    private String mimeType;

    @JsonProperty("file_size")
    private Integer fileSize;

    @JsonProperty("thumbnail")
    private PhotoSize thumbnail;

    Audio(String fileId, String fileUniqueId, Integer duration, String performer, String title, String fileName, String mimeType, Integer fileSize, PhotoSize thumbnail) {
        this.fileId = fileId;
        this.fileUniqueId = fileUniqueId;
        this.duration = duration;
        this.performer = performer;
        this.title = title;
        this.fileName = fileName;
        this.mimeType = mimeType;
        this.fileSize = fileSize;
        this.thumbnail = thumbnail;
    }

    public static AudioBuilder builder() {
        return new AudioBuilder();
    }

    public String getFileId() {
        return this.fileId;
    }

    public String getFileUniqueId() {
        return this.fileUniqueId;
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

    public String getFileName() {
        return this.fileName;
    }

    public String getMimeType() {
        return this.mimeType;
    }

    public Integer getFileSize() {
        return this.fileSize;
    }

    public PhotoSize getThumbnail() {
        return this.thumbnail;
    }

    @JsonProperty("file_id")
    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    @JsonProperty("file_unique_id")
    public void setFileUniqueId(String fileUniqueId) {
        this.fileUniqueId = fileUniqueId;
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

    @JsonProperty("file_name")
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @JsonProperty("mime_type")
    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    @JsonProperty("file_size")
    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
    }

    @JsonProperty("thumbnail")
    public void setThumbnail(PhotoSize thumbnail) {
        this.thumbnail = thumbnail;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Audio)) return false;
        final Audio other = (Audio) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$fileId = this.getFileId();
        final Object other$fileId = other.getFileId();
        if (this$fileId == null ? other$fileId != null : !this$fileId.equals(other$fileId)) return false;
        final Object this$fileUniqueId = this.getFileUniqueId();
        final Object other$fileUniqueId = other.getFileUniqueId();
        if (this$fileUniqueId == null ? other$fileUniqueId != null : !this$fileUniqueId.equals(other$fileUniqueId))
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
        final Object this$fileName = this.getFileName();
        final Object other$fileName = other.getFileName();
        if (this$fileName == null ? other$fileName != null : !this$fileName.equals(other$fileName)) return false;
        final Object this$mimeType = this.getMimeType();
        final Object other$mimeType = other.getMimeType();
        if (this$mimeType == null ? other$mimeType != null : !this$mimeType.equals(other$mimeType)) return false;
        final Object this$fileSize = this.getFileSize();
        final Object other$fileSize = other.getFileSize();
        if (this$fileSize == null ? other$fileSize != null : !this$fileSize.equals(other$fileSize)) return false;
        final Object this$thumbnail = this.getThumbnail();
        final Object other$thumbnail = other.getThumbnail();
        if (this$thumbnail == null ? other$thumbnail != null : !this$thumbnail.equals(other$thumbnail)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Audio;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $fileId = this.getFileId();
        result = result * PRIME + ($fileId == null ? 43 : $fileId.hashCode());
        final Object $fileUniqueId = this.getFileUniqueId();
        result = result * PRIME + ($fileUniqueId == null ? 43 : $fileUniqueId.hashCode());
        final Object $duration = this.getDuration();
        result = result * PRIME + ($duration == null ? 43 : $duration.hashCode());
        final Object $performer = this.getPerformer();
        result = result * PRIME + ($performer == null ? 43 : $performer.hashCode());
        final Object $title = this.getTitle();
        result = result * PRIME + ($title == null ? 43 : $title.hashCode());
        final Object $fileName = this.getFileName();
        result = result * PRIME + ($fileName == null ? 43 : $fileName.hashCode());
        final Object $mimeType = this.getMimeType();
        result = result * PRIME + ($mimeType == null ? 43 : $mimeType.hashCode());
        final Object $fileSize = this.getFileSize();
        result = result * PRIME + ($fileSize == null ? 43 : $fileSize.hashCode());
        final Object $thumbnail = this.getThumbnail();
        result = result * PRIME + ($thumbnail == null ? 43 : $thumbnail.hashCode());
        return result;
    }

    public String toString() {
        return "Audio(fileId=" + this.getFileId() + ", fileUniqueId=" + this.getFileUniqueId() + ", duration=" + this.getDuration() + ", performer=" + this.getPerformer() + ", title=" + this.getTitle() + ", fileName=" + this.getFileName() + ", mimeType=" + this.getMimeType() + ", fileSize=" + this.getFileSize() + ", thumbnail=" + this.getThumbnail() + ")";
    }

    public static class AudioBuilder {
        private String fileId;
        private String fileUniqueId;
        private Integer duration;
        private String performer;
        private String title;
        private String fileName;
        private String mimeType;
        private Integer fileSize;
        private PhotoSize thumbnail;

        AudioBuilder() {
        }

        @JsonProperty("file_id")
        public AudioBuilder fileId(String fileId) {
            this.fileId = fileId;
            return this;
        }

        @JsonProperty("file_unique_id")
        public AudioBuilder fileUniqueId(String fileUniqueId) {
            this.fileUniqueId = fileUniqueId;
            return this;
        }

        @JsonProperty("duration")
        public AudioBuilder duration(Integer duration) {
            this.duration = duration;
            return this;
        }

        @JsonProperty("performer")
        public AudioBuilder performer(String performer) {
            this.performer = performer;
            return this;
        }

        @JsonProperty("title")
        public AudioBuilder title(String title) {
            this.title = title;
            return this;
        }

        @JsonProperty("file_name")
        public AudioBuilder fileName(String fileName) {
            this.fileName = fileName;
            return this;
        }

        @JsonProperty("mime_type")
        public AudioBuilder mimeType(String mimeType) {
            this.mimeType = mimeType;
            return this;
        }

        @JsonProperty("file_size")
        public AudioBuilder fileSize(Integer fileSize) {
            this.fileSize = fileSize;
            return this;
        }

        @JsonProperty("thumbnail")
        public AudioBuilder thumbnail(PhotoSize thumbnail) {
            this.thumbnail = thumbnail;
            return this;
        }

        public Audio build() {
            return new Audio(this.fileId, this.fileUniqueId, this.duration, this.performer, this.title, this.fileName, this.mimeType, this.fileSize, this.thumbnail);
        }

        public String toString() {
            return "Audio.AudioBuilder(fileId=" + this.fileId + ", fileUniqueId=" + this.fileUniqueId + ", duration=" + this.duration + ", performer=" + this.performer + ", title=" + this.title + ", fileName=" + this.fileName + ", mimeType=" + this.mimeType + ", fileSize=" + this.fileSize + ", thumbnail=" + this.thumbnail + ")";
        }
    }
}
