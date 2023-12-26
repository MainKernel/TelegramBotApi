package api.objects.user;

import api.objects.BotApiObject;
import com.fasterxml.jackson.annotation.JsonProperty;

public class UserShared implements BotApiObject {
    @JsonProperty("request_id")
    private Integer requestId;

    @JsonProperty("user_id")
    private Long userId;

    UserShared(Integer requestId, Long userId) {
        this.requestId = requestId;
        this.userId = userId;
    }

    public static UserSharedBuilder builder() {
        return new UserSharedBuilder();
    }

    public Integer getRequestId() {
        return this.requestId;
    }

    public Long getUserId() {
        return this.userId;
    }

    @JsonProperty("request_id")
    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }

    @JsonProperty("user_id")
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof UserShared)) return false;
        final UserShared other = (UserShared) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$requestId = this.getRequestId();
        final Object other$requestId = other.getRequestId();
        if (this$requestId == null ? other$requestId != null : !this$requestId.equals(other$requestId)) return false;
        final Object this$userId = this.getUserId();
        final Object other$userId = other.getUserId();
        if (this$userId == null ? other$userId != null : !this$userId.equals(other$userId)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof UserShared;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $requestId = this.getRequestId();
        result = result * PRIME + ($requestId == null ? 43 : $requestId.hashCode());
        final Object $userId = this.getUserId();
        result = result * PRIME + ($userId == null ? 43 : $userId.hashCode());
        return result;
    }

    public String toString() {
        return "UserShared(requestId=" + this.getRequestId() + ", userId=" + this.getUserId() + ")";
    }

    public static class UserSharedBuilder {
        private Integer requestId;
        private Long userId;

        UserSharedBuilder() {
        }

        @JsonProperty("request_id")
        public UserSharedBuilder requestId(Integer requestId) {
            this.requestId = requestId;
            return this;
        }

        @JsonProperty("user_id")
        public UserSharedBuilder userId(Long userId) {
            this.userId = userId;
            return this;
        }

        public UserShared build() {
            return new UserShared(this.requestId, this.userId);
        }

        public String toString() {
            return "UserShared.UserSharedBuilder(requestId=" + this.requestId + ", userId=" + this.userId + ")";
        }
    }
}
