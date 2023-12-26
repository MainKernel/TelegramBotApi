package api.objects.misc;

import api.objects.BotApiObject;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Document implements BotApiObject {
    @JsonProperty("file_id")
    private String fileId;

    @JsonProperty("file_unique_id")
    private String fileUniqueId;

    @JsonProperty("thumbnail")
    private PhotoSize thumbnail;

    @JsonProperty("file_name")
    private String fileName;

    @JsonProperty("mime_type")
    private String mimeType;

    @JsonProperty("file_size")
    private Integer fileSize;

    Document(String fileId, String fileUniqueId, PhotoSize thumbnail, String fileName, String mimeType, Integer fileSize) {
        this.fileId = fileId;
        this.fileUniqueId = fileUniqueId;
        this.thumbnail = thumbnail;
        this.fileName = fileName;
        this.mimeType = mimeType;
        this.fileSize = fileSize;
    }

    public static DocumentBuilder builder() {
        return new DocumentBuilder();
    }

    public String getFileId() {
        return this.fileId;
    }

    public String getFileUniqueId() {
        return this.fileUniqueId;
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
        if (!(o instanceof Document)) return false;
        final Document other = (Document) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$fileId = this.getFileId();
        final Object other$fileId = other.getFileId();
        if (this$fileId == null ? other$fileId != null : !this$fileId.equals(other$fileId)) return false;
        final Object this$fileUniqueId = this.getFileUniqueId();
        final Object other$fileUniqueId = other.getFileUniqueId();
        if (this$fileUniqueId == null ? other$fileUniqueId != null : !this$fileUniqueId.equals(other$fileUniqueId))
            return false;
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
        return other instanceof Document;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $fileId = this.getFileId();
        result = result * PRIME + ($fileId == null ? 43 : $fileId.hashCode());
        final Object $fileUniqueId = this.getFileUniqueId();
        result = result * PRIME + ($fileUniqueId == null ? 43 : $fileUniqueId.hashCode());
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
        return "Document(fileId=" + this.getFileId() + ", fileUniqueId=" + this.getFileUniqueId() + ", thumbnail=" + this.getThumbnail() + ", fileName=" + this.getFileName() + ", mimeType=" + this.getMimeType() + ", fileSize=" + this.getFileSize() + ")";
    }

    public static class DocumentBuilder {
        private String fileId;
        private String fileUniqueId;
        private PhotoSize thumbnail;
        private String fileName;
        private String mimeType;
        private Integer fileSize;

        DocumentBuilder() {
        }

        @JsonProperty("file_id")
        public DocumentBuilder fileId(String fileId) {
            this.fileId = fileId;
            return this;
        }

        @JsonProperty("file_unique_id")
        public DocumentBuilder fileUniqueId(String fileUniqueId) {
            this.fileUniqueId = fileUniqueId;
            return this;
        }

        @JsonProperty("thumbnail")
        public DocumentBuilder thumbnail(PhotoSize thumbnail) {
            this.thumbnail = thumbnail;
            return this;
        }

        @JsonProperty("file_name")
        public DocumentBuilder fileName(String fileName) {
            this.fileName = fileName;
            return this;
        }

        @JsonProperty("mime_type")
        public DocumentBuilder mimeType(String mimeType) {
            this.mimeType = mimeType;
            return this;
        }

        @JsonProperty("file_size")
        public DocumentBuilder fileSize(Integer fileSize) {
            this.fileSize = fileSize;
            return this;
        }

        public Document build() {
            return new Document(this.fileId, this.fileUniqueId, this.thumbnail, this.fileName, this.mimeType, this.fileSize);
        }

        public String toString() {
            return "Document.DocumentBuilder(fileId=" + this.fileId + ", fileUniqueId=" + this.fileUniqueId + ", thumbnail=" + this.thumbnail + ", fileName=" + this.fileName + ", mimeType=" + this.mimeType + ", fileSize=" + this.fileSize + ")";
        }
    }
}
