package api.objects.media;

import api.objects.BotApiObject;
import api.objects.misc.PhotoSize;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Video implements BotApiObject {
    @JsonProperty("file_id")
    private String fileId;

    @JsonProperty("file_unique_id")
    private String fileUniqueId;

    @JsonProperty("width")
    private Integer width;

    @JsonProperty("height")
    private Integer height;

    @JsonProperty("duration")
    private Integer duration;

    @JsonProperty("thumbnail")
    private PhotoSize thumbnail;

    @JsonProperty("file_name")
    private String fileName;

    @JsonProperty("mime_type")
    private String mimeType;

    @JsonProperty("file_size")
    private Integer fileSize;

    Video(String fileId, String fileUniqueId, Integer width, Integer height, Integer duration, PhotoSize thumbnail, String fileName, String mimeType, Integer fileSize) {
        this.fileId = fileId;
        this.fileUniqueId = fileUniqueId;
        this.width = width;
        this.height = height;
        this.duration = duration;
        this.thumbnail = thumbnail;
        this.fileName = fileName;
        this.mimeType = mimeType;
        this.fileSize = fileSize;
    }

    public static VideoBuilder builder() {
        return new VideoBuilder();
    }

    public String getFileId() {
        return this.fileId;
    }

    public String getFileUniqueId() {
        return this.fileUniqueId;
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

    public PhotoSize getThumbnail() {
        return this.thumbnail;
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

    @JsonProperty("file_id")
    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    @JsonProperty("file_unique_id")
    public void setFileUniqueId(String fileUniqueId) {
        this.fileUniqueId = fileUniqueId;
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

    @JsonProperty("thumbnail")
    public void setThumbnail(PhotoSize thumbnail) {
        this.thumbnail = thumbnail;
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

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Video)) return false;
        final Video other = (Video) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$fileId = this.getFileId();
        final Object other$fileId = other.getFileId();
        if (this$fileId == null ? other$fileId != null : !this$fileId.equals(other$fileId)) return false;
        final Object this$fileUniqueId = this.getFileUniqueId();
        final Object other$fileUniqueId = other.getFileUniqueId();
        if (this$fileUniqueId == null ? other$fileUniqueId != null : !this$fileUniqueId.equals(other$fileUniqueId))
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
        final Object this$thumbnail = this.getThumbnail();
        final Object other$thumbnail = other.getThumbnail();
        if (this$thumbnail == null ? other$thumbnail != null : !this$thumbnail.equals(other$thumbnail)) return false;
        final Object this$fileName = this.getFileName();
        final Object other$fileName = other.getFileName();
        if (this$fileName == null ? other$fileName != null : !this$fileName.equals(other$fileName)) return false;
        final Object this$mimeType = this.getMimeType();
        final Object other$mimeType = other.getMimeType();
        if (this$mimeType == null ? other$mimeType != null : !this$mimeType.equals(other$mimeType)) return false;
        final Object this$fileSize = this.getFileSize();
        final Object other$fileSize = other.getFileSize();
        if (this$fileSize == null ? other$fileSize != null : !this$fileSize.equals(other$fileSize)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Video;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $fileId = this.getFileId();
        result = result * PRIME + ($fileId == null ? 43 : $fileId.hashCode());
        final Object $fileUniqueId = this.getFileUniqueId();
        result = result * PRIME + ($fileUniqueId == null ? 43 : $fileUniqueId.hashCode());
        final Object $width = this.getWidth();
        result = result * PRIME + ($width == null ? 43 : $width.hashCode());
        final Object $height = this.getHeight();
        result = result * PRIME + ($height == null ? 43 : $height.hashCode());
        final Object $duration = this.getDuration();
        result = result * PRIME + ($duration == null ? 43 : $duration.hashCode());
        final Object $thumbnail = this.getThumbnail();
        result = result * PRIME + ($thumbnail == null ? 43 : $thumbnail.hashCode());
        final Object $fileName = this.getFileName();
        result = result * PRIME + ($fileName == null ? 43 : $fileName.hashCode());
        final Object $mimeType = this.getMimeType();
        result = result * PRIME + ($mimeType == null ? 43 : $mimeType.hashCode());
        final Object $fileSize = this.getFileSize();
        result = result * PRIME + ($fileSize == null ? 43 : $fileSize.hashCode());
        return result;
    }

    public String toString() {
        return "Video(fileId=" + this.getFileId() + ", fileUniqueId=" + this.getFileUniqueId() + ", width=" + this.getWidth() + ", height=" + this.getHeight() + ", duration=" + this.getDuration() + ", thumbnail=" + this.getThumbnail() + ", fileName=" + this.getFileName() + ", mimeType=" + this.getMimeType() + ", fileSize=" + this.getFileSize() + ")";
    }

    public static class VideoBuilder {
        private String fileId;
        private String fileUniqueId;
        private Integer width;
        private Integer height;
        private Integer duration;
        private PhotoSize thumbnail;
        private String fileName;
        private String mimeType;
        private Integer fileSize;

        VideoBuilder() {
        }

        @JsonProperty("file_id")
        public VideoBuilder fileId(String fileId) {
            this.fileId = fileId;
            return this;
        }

        @JsonProperty("file_unique_id")
        public VideoBuilder fileUniqueId(String fileUniqueId) {
            this.fileUniqueId = fileUniqueId;
            return this;
        }

        @JsonProperty("width")
        public VideoBuilder width(Integer width) {
            this.width = width;
            return this;
        }

        @JsonProperty("height")
        public VideoBuilder height(Integer height) {
            this.height = height;
            return this;
        }

        @JsonProperty("duration")
        public VideoBuilder duration(Integer duration) {
            this.duration = duration;
            return this;
        }

        @JsonProperty("thumbnail")
        public VideoBuilder thumbnail(PhotoSize thumbnail) {
            this.thumbnail = thumbnail;
            return this;
        }

        @JsonProperty("file_name")
        public VideoBuilder fileName(String fileName) {
            this.fileName = fileName;
            return this;
        }

        @JsonProperty("mime_type")
        public VideoBuilder mimeType(String mimeType) {
            this.mimeType = mimeType;
            return this;
        }

        @JsonProperty("file_size")
        public VideoBuilder fileSize(Integer fileSize) {
            this.fileSize = fileSize;
            return this;
        }

        public Video build() {
            return new Video(this.fileId, this.fileUniqueId, this.width, this.height, this.duration, this.thumbnail, this.fileName, this.mimeType, this.fileSize);
        }

        public String toString() {
            return "Video.VideoBuilder(fileId=" + this.fileId + ", fileUniqueId=" + this.fileUniqueId + ", width=" + this.width + ", height=" + this.height + ", duration=" + this.duration + ", thumbnail=" + this.thumbnail + ", fileName=" + this.fileName + ", mimeType=" + this.mimeType + ", fileSize=" + this.fileSize + ")";
        }
    }
}
