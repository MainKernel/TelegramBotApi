package api.objects.misc;

import api.objects.BotApiObject;
import com.fasterxml.jackson.annotation.JsonProperty;

public class LoginUrl implements BotApiObject {
    @JsonProperty("url")
    private String url;
    @JsonProperty("forward_text")
    private String forwardText;
    @JsonProperty("bot_username")
    private String botUsername;
    @JsonProperty("request_write_access")
    private Boolean requestWriteAccess;

    LoginUrl(String url, String forwardText, String botUsername, Boolean requestWriteAccess) {
        this.url = url;
        this.forwardText = forwardText;
        this.botUsername = botUsername;
        this.requestWriteAccess = requestWriteAccess;
    }

    public static LoginUrlBuilder builder() {
        return new LoginUrlBuilder();
    }

    public String getUrl() {
        return this.url;
    }

    public String getForwardText() {
        return this.forwardText;
    }

    public String getBotUsername() {
        return this.botUsername;
    }

    public Boolean getRequestWriteAccess() {
        return this.requestWriteAccess;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("forward_text")
    public void setForwardText(String forwardText) {
        this.forwardText = forwardText;
    }

    @JsonProperty("bot_username")
    public void setBotUsername(String botUsername) {
        this.botUsername = botUsername;
    }

    @JsonProperty("request_write_access")
    public void setRequestWriteAccess(Boolean requestWriteAccess) {
        this.requestWriteAccess = requestWriteAccess;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof LoginUrl)) return false;
        final LoginUrl other = (LoginUrl) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$url = this.getUrl();
        final Object other$url = other.getUrl();
        if (this$url == null ? other$url != null : !this$url.equals(other$url)) return false;
        final Object this$forwardText = this.getForwardText();
        final Object other$forwardText = other.getForwardText();
        if (this$forwardText == null ? other$forwardText != null : !this$forwardText.equals(other$forwardText))
            return false;
        final Object this$botUsername = this.getBotUsername();
        final Object other$botUsername = other.getBotUsername();
        if (this$botUsername == null ? other$botUsername != null : !this$botUsername.equals(other$botUsername))
            return false;
        final Object this$requestWriteAccess = this.getRequestWriteAccess();
        final Object other$requestWriteAccess = other.getRequestWriteAccess();
        if (this$requestWriteAccess == null ? other$requestWriteAccess != null : !this$requestWriteAccess.equals(other$requestWriteAccess))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof LoginUrl;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $url = this.getUrl();
        result = result * PRIME + ($url == null ? 43 : $url.hashCode());
        final Object $forwardText = this.getForwardText();
        result = result * PRIME + ($forwardText == null ? 43 : $forwardText.hashCode());
        final Object $botUsername = this.getBotUsername();
        result = result * PRIME + ($botUsername == null ? 43 : $botUsername.hashCode());
        final Object $requestWriteAccess = this.getRequestWriteAccess();
        result = result * PRIME + ($requestWriteAccess == null ? 43 : $requestWriteAccess.hashCode());
        return result;
    }

    public String toString() {
        return "LoginUrl(url=" + this.getUrl() + ", forwardText=" + this.getForwardText() + ", botUsername=" + this.getBotUsername() + ", requestWriteAccess=" + this.getRequestWriteAccess() + ")";
    }

    public static class LoginUrlBuilder {
        private String url;
        private String forwardText;
        private String botUsername;
        private Boolean requestWriteAccess;

        LoginUrlBuilder() {
        }

        @JsonProperty("url")
        public LoginUrlBuilder url(String url) {
            this.url = url;
            return this;
        }

        @JsonProperty("forward_text")
        public LoginUrlBuilder forwardText(String forwardText) {
            this.forwardText = forwardText;
            return this;
        }

        @JsonProperty("bot_username")
        public LoginUrlBuilder botUsername(String botUsername) {
            this.botUsername = botUsername;
            return this;
        }

        @JsonProperty("request_write_access")
        public LoginUrlBuilder requestWriteAccess(Boolean requestWriteAccess) {
            this.requestWriteAccess = requestWriteAccess;
            return this;
        }

        public LoginUrl build() {
            return new LoginUrl(this.url, this.forwardText, this.botUsername, this.requestWriteAccess);
        }

        public String toString() {
            return "LoginUrl.LoginUrlBuilder(url=" + this.url + ", forwardText=" + this.forwardText + ", botUsername=" + this.botUsername + ", requestWriteAccess=" + this.requestWriteAccess + ")";
        }
    }
}
