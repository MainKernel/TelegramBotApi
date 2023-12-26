package api.objects.menu;

import api.objects.BotApiObject;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseParameters implements BotApiObject {
    @JsonProperty("migrate_to_chat_id")
    private Integer migrateToChatId;
    @JsonProperty("retry_after")
    private Integer retryAfter;

    ResponseParameters(Integer migrateToChatId, Integer retryAfter) {
        this.migrateToChatId = migrateToChatId;
        this.retryAfter = retryAfter;
    }

    public static ResponseParametersBuilder builder() {
        return new ResponseParametersBuilder();
    }

    public Integer getMigrateToChatId() {
        return this.migrateToChatId;
    }

    public Integer getRetryAfter() {
        return this.retryAfter;
    }

    @JsonProperty("migrate_to_chat_id")
    public void setMigrateToChatId(Integer migrateToChatId) {
        this.migrateToChatId = migrateToChatId;
    }

    @JsonProperty("retry_after")
    public void setRetryAfter(Integer retryAfter) {
        this.retryAfter = retryAfter;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ResponseParameters)) return false;
        final ResponseParameters other = (ResponseParameters) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$migrateToChatId = this.getMigrateToChatId();
        final Object other$migrateToChatId = other.getMigrateToChatId();
        if (this$migrateToChatId == null ? other$migrateToChatId != null : !this$migrateToChatId.equals(other$migrateToChatId))
            return false;
        final Object this$retryAfter = this.getRetryAfter();
        final Object other$retryAfter = other.getRetryAfter();
        if (this$retryAfter == null ? other$retryAfter != null : !this$retryAfter.equals(other$retryAfter))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ResponseParameters;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $migrateToChatId = this.getMigrateToChatId();
        result = result * PRIME + ($migrateToChatId == null ? 43 : $migrateToChatId.hashCode());
        final Object $retryAfter = this.getRetryAfter();
        result = result * PRIME + ($retryAfter == null ? 43 : $retryAfter.hashCode());
        return result;
    }

    public String toString() {
        return "ResponseParameters(migrateToChatId=" + this.getMigrateToChatId() + ", retryAfter=" + this.getRetryAfter() + ")";
    }

    public static class ResponseParametersBuilder {
        private Integer migrateToChatId;
        private Integer retryAfter;

        ResponseParametersBuilder() {
        }

        @JsonProperty("migrate_to_chat_id")
        public ResponseParametersBuilder migrateToChatId(Integer migrateToChatId) {
            this.migrateToChatId = migrateToChatId;
            return this;
        }

        @JsonProperty("retry_after")
        public ResponseParametersBuilder retryAfter(Integer retryAfter) {
            this.retryAfter = retryAfter;
            return this;
        }

        public ResponseParameters build() {
            return new ResponseParameters(this.migrateToChatId, this.retryAfter);
        }

        public String toString() {
            return "ResponseParameters.ResponseParametersBuilder(migrateToChatId=" + this.migrateToChatId + ", retryAfter=" + this.retryAfter + ")";
        }
    }
}
