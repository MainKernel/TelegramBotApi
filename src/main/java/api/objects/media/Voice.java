package api.objects.media;

import api.objects.BotApiObject;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Voice implements BotApiObject {
    @JsonProperty("file_id")
    private String fileId;

    @JsonProperty("file_unique_id")
    private String fileUniqueId;

    @JsonProperty("duration")
    private Integer duration;

    @JsonProperty("mime_type")
    private String mimeType;

    @JsonProperty("file_size")
    private Integer fileSize;

    Voice(String fileId, String fileUniqueId, Integer duration, String mimeType, Integer fileSize) {
        this.fileId = fileId;
        this.fileUniqueId = fileUniqueId;
        this.duration = duration;
        this.mimeType = mimeType;
        this.fileSize = fileSize;
    }

    public static VoiceBuilder builder() {
        return new VoiceBuilder();
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

    @JsonProperty("duration")
    public void setDuration(Integer duration) {
        this.duration = duration;
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
        if (!(o instanceof Voice)) return false;
        final Voice other = (Voice) o;
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
        final Object this$mimeType = this.getMimeType();
        final Object other$mimeType = other.getMimeType();
        if (this$mimeType == null ? other$mimeType != null : !this$mimeType.equals(other$mimeType)) return false;
        final Object this$fileSize = this.getFileSize();
        final Object other$fileSize = other.getFileSize();
        if (this$fileSize == null ? other$fileSize != null : !this$fileSize.equals(other$fileSize)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Voice;
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
        final Object $mimeType = this.getMimeType();
        result = result * PRIME + ($mimeType == null ? 43 : $mimeType.hashCode());
        final Object $fileSize = this.getFileSize();
        result = result * PRIME + ($fileSize == null ? 43 : $fileSize.hashCode());
        return result;
    }

    public String toString() {
        return "Voice(fileId=" + this.getFileId() + ", fileUniqueId=" + this.getFileUniqueId() + ", duration=" + this.getDuration() + ", mimeType=" + this.getMimeType() + ", fileSize=" + this.getFileSize() + ")";
    }

    public static class VoiceBuilder {
        private String fileId;
        private String fileUniqueId;
        private Integer duration;
        private String mimeType;
        private Integer fileSize;

        VoiceBuilder() {
        }

        @JsonProperty("file_id")
        public VoiceBuilder fileId(String fileId) {
            this.fileId = fileId;
            return this;
        }

        @JsonProperty("file_unique_id")
        public VoiceBuilder fileUniqueId(String fileUniqueId) {
            this.fileUniqueId = fileUniqueId;
            return this;
        }

        @JsonProperty("duration")
        public VoiceBuilder duration(Integer duration) {
            this.duration = duration;
            return this;
        }

        @JsonProperty("mime_type")
        public VoiceBuilder mimeType(String mimeType) {
            this.mimeType = mimeType;
            return this;
        }

        @JsonProperty("file_size")
        public VoiceBuilder fileSize(Integer fileSize) {
            this.fileSize = fileSize;
            return this;
        }

        public Voice build() {
            return new Voice(this.fileId, this.fileUniqueId, this.duration, this.mimeType, this.fileSize);
        }

        public String toString() {
            return "Voice.VoiceBuilder(fileId=" + this.fileId + ", fileUniqueId=" + this.fileUniqueId + ", duration=" + this.duration + ", mimeType=" + this.mimeType + ", fileSize=" + this.fileSize + ")";
        }
    }
}
