package api.objects.misc;

import api.objects.BotApiObject;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PhotoSize implements BotApiObject {
    @JsonProperty("file_id")
    private String fileId;

    @JsonProperty("file_unique_id")
    private String fileUniqueId;

    @JsonProperty("width")
    private Integer width;

    @JsonProperty("height")
    private Integer height;

    @JsonProperty("file_size")
    private Integer fileSize;

    PhotoSize(String fileId, String fileUniqueId, Integer width, Integer height, Integer fileSize) {
        this.fileId = fileId;
        this.fileUniqueId = fileUniqueId;
        this.width = width;
        this.height = height;
        this.fileSize = fileSize;
    }

    public static PhotoSizeBuilder builder() {
        return new PhotoSizeBuilder();
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

    @JsonProperty("file_size")
    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof PhotoSize)) return false;
        final PhotoSize other = (PhotoSize) o;
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
        final Object this$fileSize = this.getFileSize();
        final Object other$fileSize = other.getFileSize();
        if (this$fileSize == null ? other$fileSize != null : !this$fileSize.equals(other$fileSize)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof PhotoSize;
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
        final Object $fileSize = this.getFileSize();
        result = result * PRIME + ($fileSize == null ? 43 : $fileSize.hashCode());
        return result;
    }

    public String toString() {
        return "PhotoSize(fileId=" + this.getFileId() + ", fileUniqueId=" + this.getFileUniqueId() + ", width=" + this.getWidth() + ", height=" + this.getHeight() + ", fileSize=" + this.getFileSize() + ")";
    }

    public static class PhotoSizeBuilder {
        private String fileId;
        private String fileUniqueId;
        private Integer width;
        private Integer height;
        private Integer fileSize;

        PhotoSizeBuilder() {
        }

        @JsonProperty("file_id")
        public PhotoSizeBuilder fileId(String fileId) {
            this.fileId = fileId;
            return this;
        }

        @JsonProperty("file_unique_id")
        public PhotoSizeBuilder fileUniqueId(String fileUniqueId) {
            this.fileUniqueId = fileUniqueId;
            return this;
        }

        @JsonProperty("width")
        public PhotoSizeBuilder width(Integer width) {
            this.width = width;
            return this;
        }

        @JsonProperty("height")
        public PhotoSizeBuilder height(Integer height) {
            this.height = height;
            return this;
        }

        @JsonProperty("file_size")
        public PhotoSizeBuilder fileSize(Integer fileSize) {
            this.fileSize = fileSize;
            return this;
        }

        public PhotoSize build() {
            return new PhotoSize(this.fileId, this.fileUniqueId, this.width, this.height, this.fileSize);
        }

        public String toString() {
            return "PhotoSize.PhotoSizeBuilder(fileId=" + this.fileId + ", fileUniqueId=" + this.fileUniqueId + ", width=" + this.width + ", height=" + this.height + ", fileSize=" + this.fileSize + ")";
        }
    }
}
