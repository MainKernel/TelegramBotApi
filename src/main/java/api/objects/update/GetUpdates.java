package api.objects.update;

import java.util.List;

public class GetUpdates {
    private Integer offset;
    private Integer limit;
    private Integer timeout;
    private List<String> allowedUpdates;

    public GetUpdates(Integer offset, Integer limit, Integer timeout, List<String> allowedUpdates) {
        this.offset = offset;
        this.limit = limit;
        this.timeout = timeout;
        this.allowedUpdates = allowedUpdates;
    }

    public GetUpdates() {
    }

    public static GetUpdatesBuilder builder() {
        return new GetUpdatesBuilder();
    }

    public Integer getOffset() {
        return this.offset;
    }

    public Integer getLimit() {
        return this.limit;
    }

    public Integer getTimeout() {
        return this.timeout;
    }

    public List<String> getAllowedUpdates() {
        return this.allowedUpdates;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    public void setAllowedUpdates(List<String> allowedUpdates) {
        this.allowedUpdates = allowedUpdates;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof GetUpdates)) return false;
        final GetUpdates other = (GetUpdates) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$offset = this.getOffset();
        final Object other$offset = other.getOffset();
        if (this$offset == null ? other$offset != null : !this$offset.equals(other$offset)) return false;
        final Object this$limit = this.getLimit();
        final Object other$limit = other.getLimit();
        if (this$limit == null ? other$limit != null : !this$limit.equals(other$limit)) return false;
        final Object this$timeout = this.getTimeout();
        final Object other$timeout = other.getTimeout();
        if (this$timeout == null ? other$timeout != null : !this$timeout.equals(other$timeout)) return false;
        final Object this$allowedUpdates = this.getAllowedUpdates();
        final Object other$allowedUpdates = other.getAllowedUpdates();
        if (this$allowedUpdates == null ? other$allowedUpdates != null : !this$allowedUpdates.equals(other$allowedUpdates))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof GetUpdates;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $offset = this.getOffset();
        result = result * PRIME + ($offset == null ? 43 : $offset.hashCode());
        final Object $limit = this.getLimit();
        result = result * PRIME + ($limit == null ? 43 : $limit.hashCode());
        final Object $timeout = this.getTimeout();
        result = result * PRIME + ($timeout == null ? 43 : $timeout.hashCode());
        final Object $allowedUpdates = this.getAllowedUpdates();
        result = result * PRIME + ($allowedUpdates == null ? 43 : $allowedUpdates.hashCode());
        return result;
    }

    public String toString() {
        return "GetUpdates(offset=" + this.getOffset() + ", limit=" + this.getLimit() + ", timeout=" + this.getTimeout() + ", allowedUpdates=" + this.getAllowedUpdates() + ")";
    }

    public static class GetUpdatesBuilder {
        private Integer offset;
        private Integer limit;
        private Integer timeout;
        private List<String> allowedUpdates;

        GetUpdatesBuilder() {
        }

        public GetUpdatesBuilder offset(Integer offset) {
            this.offset = offset;
            return this;
        }

        public GetUpdatesBuilder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        public GetUpdatesBuilder timeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }

        public GetUpdatesBuilder allowedUpdates(List<String> allowedUpdates) {
            this.allowedUpdates = allowedUpdates;
            return this;
        }

        public GetUpdates build() {
            return new GetUpdates(this.offset, this.limit, this.timeout, this.allowedUpdates);
        }

        public String toString() {
            return "GetUpdates.GetUpdatesBuilder(offset=" + this.offset + ", limit=" + this.limit + ", timeout=" + this.timeout + ", allowedUpdates=" + this.allowedUpdates + ")";
        }
    }
}
