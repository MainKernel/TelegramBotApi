package api.objects.misc;

import api.objects.BotApiObject;
import com.fasterxml.jackson.annotation.JsonProperty;

public class File implements BotApiObject {
    @JsonProperty("file_id")
    private String fileId;

    @JsonProperty("file_unique_id")
    private String fileUniqueId;

    @JsonProperty("file_size")
    private Integer fileSize;

    //Optional. File path. Use https://api.telegram.org/file/bot<token>/<file_path> to get the file.
    @JsonProperty("file_path")
    private String filePath;

    File(String fileId, String fileUniqueId, Integer fileSize, String filePath) {
        this.fileId = fileId;
        this.fileUniqueId = fileUniqueId;
        this.fileSize = fileSize;
        this.filePath = filePath;
    }

    public static FileBuilder builder() {
        return new FileBuilder();
    }

    public String getFileId() {
        return this.fileId;
    }

    public String getFileUniqueId() {
        return this.fileUniqueId;
    }

    public Integer getFileSize() {
        return this.fileSize;
    }

    public String getFilePath() {
        return this.filePath;
    }

    @JsonProperty("file_id")
    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    @JsonProperty("file_unique_id")
    public void setFileUniqueId(String fileUniqueId) {
        this.fileUniqueId = fileUniqueId;
    }

    @JsonProperty("file_size")
    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
    }

    @JsonProperty("file_path")
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof File)) return false;
        final File other = (File) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$fileId = this.getFileId();
        final Object other$fileId = other.getFileId();
        if (this$fileId == null ? other$fileId != null : !this$fileId.equals(other$fileId)) return false;
        final Object this$fileUniqueId = this.getFileUniqueId();
        final Object other$fileUniqueId = other.getFileUniqueId();
        if (this$fileUniqueId == null ? other$fileUniqueId != null : !this$fileUniqueId.equals(other$fileUniqueId))
            return false;
        final Object this$fileSize = this.getFileSize();
        final Object other$fileSize = other.getFileSize();
        if (this$fileSize == null ? other$fileSize != null : !this$fileSize.equals(other$fileSize)) return false;
        final Object this$filePath = this.getFilePath();
        final Object other$filePath = other.getFilePath();
        if (this$filePath == null ? other$filePath != null : !this$filePath.equals(other$filePath)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof File;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $fileId = this.getFileId();
        result = result * PRIME + ($fileId == null ? 43 : $fileId.hashCode());
        final Object $fileUniqueId = this.getFileUniqueId();
        result = result * PRIME + ($fileUniqueId == null ? 43 : $fileUniqueId.hashCode());
        final Object $fileSize = this.getFileSize();
        result = result * PRIME + ($fileSize == null ? 43 : $fileSize.hashCode());
        final Object $filePath = this.getFilePath();
        result = result * PRIME + ($filePath == null ? 43 : $filePath.hashCode());
        return result;
    }

    public String toString() {
        return "File(fileId=" + this.getFileId() + ", fileUniqueId=" + this.getFileUniqueId() + ", fileSize=" + this.getFileSize() + ", filePath=" + this.getFilePath() + ")";
    }

    public static class FileBuilder {
        private String fileId;
        private String fileUniqueId;
        private Integer fileSize;
        private String filePath;

        FileBuilder() {
        }

        @JsonProperty("file_id")
        public FileBuilder fileId(String fileId) {
            this.fileId = fileId;
            return this;
        }

        @JsonProperty("file_unique_id")
        public FileBuilder fileUniqueId(String fileUniqueId) {
            this.fileUniqueId = fileUniqueId;
            return this;
        }

        @JsonProperty("file_size")
        public FileBuilder fileSize(Integer fileSize) {
            this.fileSize = fileSize;
            return this;
        }

        @JsonProperty("file_path")
        public FileBuilder filePath(String filePath) {
            this.filePath = filePath;
            return this;
        }

        public File build() {
            return new File(this.fileId, this.fileUniqueId, this.fileSize, this.filePath);
        }

        public String toString() {
            return "File.FileBuilder(fileId=" + this.fileId + ", fileUniqueId=" + this.fileUniqueId + ", fileSize=" + this.fileSize + ", filePath=" + this.filePath + ")";
        }
    }
}
