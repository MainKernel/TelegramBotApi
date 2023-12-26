package api.objects.misc;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WebAppInfo {
    @JsonProperty("url")
    private String url;

    WebAppInfo(String url) {
        this.url = url;
    }

    public static WebAppInfoBuilder builder() {
        return new WebAppInfoBuilder();
    }

    public String getUrl() {
        return this.url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof WebAppInfo)) return false;
        final WebAppInfo other = (WebAppInfo) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$url = this.getUrl();
        final Object other$url = other.getUrl();
        if (this$url == null ? other$url != null : !this$url.equals(other$url)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof WebAppInfo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $url = this.getUrl();
        result = result * PRIME + ($url == null ? 43 : $url.hashCode());
        return result;
    }

    public String toString() {
        return "WebAppInfo(url=" + this.getUrl() + ")";
    }

    public static class WebAppInfoBuilder {
        private String url;

        WebAppInfoBuilder() {
        }

        @JsonProperty("url")
        public WebAppInfoBuilder url(String url) {
            this.url = url;
            return this;
        }

        public WebAppInfo build() {
            return new WebAppInfo(this.url);
        }

        public String toString() {
            return "WebAppInfo.WebAppInfoBuilder(url=" + this.url + ")";
        }
    }
}
