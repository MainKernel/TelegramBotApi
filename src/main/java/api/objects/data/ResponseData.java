package api.objects.data;

import java.util.List;

public class ResponseData {
    private boolean ok;
    private List<ResultItem> result;

    ResponseData(boolean ok, List<ResultItem> result) {
        this.ok = ok;
        this.result = result;
    }

    public static ResponseDataBuilder builder() {
        return new ResponseDataBuilder();
    }

    public boolean isOk() {
        return this.ok;
    }

    public List<ResultItem> getResult() {
        return this.result;
    }

    public void setOk(boolean ok) {
        this.ok = ok;
    }

    public void setResult(List<ResultItem> result) {
        this.result = result;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ResponseData)) return false;
        final ResponseData other = (ResponseData) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.isOk() != other.isOk()) return false;
        final Object this$result = this.getResult();
        final Object other$result = other.getResult();
        if (this$result == null ? other$result != null : !this$result.equals(other$result)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ResponseData;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + (this.isOk() ? 79 : 97);
        final Object $result = this.getResult();
        result = result * PRIME + ($result == null ? 43 : $result.hashCode());
        return result;
    }

    public String toString() {
        return "ResponseData(ok=" + this.isOk() + ", result=" + this.getResult() + ")";
    }

    public static class ResponseDataBuilder {
        private boolean ok;
        private List<ResultItem> result;

        ResponseDataBuilder() {
        }

        public ResponseDataBuilder ok(boolean ok) {
            this.ok = ok;
            return this;
        }

        public ResponseDataBuilder result(List<ResultItem> result) {
            this.result = result;
            return this;
        }

        public ResponseData build() {
            return new ResponseData(this.ok, this.result);
        }

        public String toString() {
            return "ResponseData.ResponseDataBuilder(ok=" + this.ok + ", result=" + this.result + ")";
        }
    }
}
