package api.objects.keyboard;

import api.objects.BotApiObject;
import api.objects.misc.WebAppInfo;
import com.fasterxml.jackson.annotation.JsonProperty;

public class KeyboardButton implements BotApiObject {
    @JsonProperty("text")
    private String text;

    @JsonProperty("request_user")
    private KeyboardButtonRequestUser requestUser;

    @JsonProperty("request_chat")
    private KeyboardButtonRequestChat requestChat;

    @JsonProperty("request_contact")
    private Boolean requestContact;

    @JsonProperty("request_location")
    private Boolean requestLocation;

    @JsonProperty("request_poll")
    private KeyboardButtonPollType requestPoll;

    @JsonProperty("web_app")
    private WebAppInfo webApp;

    KeyboardButton(String text, KeyboardButtonRequestUser requestUser, KeyboardButtonRequestChat requestChat, Boolean requestContact, Boolean requestLocation, KeyboardButtonPollType requestPoll, WebAppInfo webApp) {
        this.text = text;
        this.requestUser = requestUser;
        this.requestChat = requestChat;
        this.requestContact = requestContact;
        this.requestLocation = requestLocation;
        this.requestPoll = requestPoll;
        this.webApp = webApp;
    }

    public static KeyboardButtonBuilder builder() {
        return new KeyboardButtonBuilder();
    }

    public String getText() {
        return this.text;
    }

    public KeyboardButtonRequestUser getRequestUser() {
        return this.requestUser;
    }

    public KeyboardButtonRequestChat getRequestChat() {
        return this.requestChat;
    }

    public Boolean getRequestContact() {
        return this.requestContact;
    }

    public Boolean getRequestLocation() {
        return this.requestLocation;
    }

    public KeyboardButtonPollType getRequestPoll() {
        return this.requestPoll;
    }

    public WebAppInfo getWebApp() {
        return this.webApp;
    }

    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    @JsonProperty("request_user")
    public void setRequestUser(KeyboardButtonRequestUser requestUser) {
        this.requestUser = requestUser;
    }

    @JsonProperty("request_chat")
    public void setRequestChat(KeyboardButtonRequestChat requestChat) {
        this.requestChat = requestChat;
    }

    @JsonProperty("request_contact")
    public void setRequestContact(Boolean requestContact) {
        this.requestContact = requestContact;
    }

    @JsonProperty("request_location")
    public void setRequestLocation(Boolean requestLocation) {
        this.requestLocation = requestLocation;
    }

    @JsonProperty("request_poll")
    public void setRequestPoll(KeyboardButtonPollType requestPoll) {
        this.requestPoll = requestPoll;
    }

    @JsonProperty("web_app")
    public void setWebApp(WebAppInfo webApp) {
        this.webApp = webApp;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof KeyboardButton)) return false;
        final KeyboardButton other = (KeyboardButton) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$text = this.getText();
        final Object other$text = other.getText();
        if (this$text == null ? other$text != null : !this$text.equals(other$text)) return false;
        final Object this$requestUser = this.getRequestUser();
        final Object other$requestUser = other.getRequestUser();
        if (this$requestUser == null ? other$requestUser != null : !this$requestUser.equals(other$requestUser))
            return false;
        final Object this$requestChat = this.getRequestChat();
        final Object other$requestChat = other.getRequestChat();
        if (this$requestChat == null ? other$requestChat != null : !this$requestChat.equals(other$requestChat))
            return false;
        final Object this$requestContact = this.getRequestContact();
        final Object other$requestContact = other.getRequestContact();
        if (this$requestContact == null ? other$requestContact != null : !this$requestContact.equals(other$requestContact))
            return false;
        final Object this$requestLocation = this.getRequestLocation();
        final Object other$requestLocation = other.getRequestLocation();
        if (this$requestLocation == null ? other$requestLocation != null : !this$requestLocation.equals(other$requestLocation))
            return false;
        final Object this$requestPoll = this.getRequestPoll();
        final Object other$requestPoll = other.getRequestPoll();
        if (this$requestPoll == null ? other$requestPoll != null : !this$requestPoll.equals(other$requestPoll))
            return false;
        final Object this$webApp = this.getWebApp();
        final Object other$webApp = other.getWebApp();
        if (this$webApp == null ? other$webApp != null : !this$webApp.equals(other$webApp)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof KeyboardButton;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $text = this.getText();
        result = result * PRIME + ($text == null ? 43 : $text.hashCode());
        final Object $requestUser = this.getRequestUser();
        result = result * PRIME + ($requestUser == null ? 43 : $requestUser.hashCode());
        final Object $requestChat = this.getRequestChat();
        result = result * PRIME + ($requestChat == null ? 43 : $requestChat.hashCode());
        final Object $requestContact = this.getRequestContact();
        result = result * PRIME + ($requestContact == null ? 43 : $requestContact.hashCode());
        final Object $requestLocation = this.getRequestLocation();
        result = result * PRIME + ($requestLocation == null ? 43 : $requestLocation.hashCode());
        final Object $requestPoll = this.getRequestPoll();
        result = result * PRIME + ($requestPoll == null ? 43 : $requestPoll.hashCode());
        final Object $webApp = this.getWebApp();
        result = result * PRIME + ($webApp == null ? 43 : $webApp.hashCode());
        return result;
    }

    public String toString() {
        return "KeyboardButton(text=" + this.getText() + ", requestUser=" + this.getRequestUser() + ", requestChat=" + this.getRequestChat() + ", requestContact=" + this.getRequestContact() + ", requestLocation=" + this.getRequestLocation() + ", requestPoll=" + this.getRequestPoll() + ", webApp=" + this.getWebApp() + ")";
    }

    public static class KeyboardButtonBuilder {
        private String text;
        private KeyboardButtonRequestUser requestUser;
        private KeyboardButtonRequestChat requestChat;
        private Boolean requestContact;
        private Boolean requestLocation;
        private KeyboardButtonPollType requestPoll;
        private WebAppInfo webApp;

        KeyboardButtonBuilder() {
        }

        @JsonProperty("text")
        public KeyboardButtonBuilder text(String text) {
            this.text = text;
            return this;
        }

        @JsonProperty("request_user")
        public KeyboardButtonBuilder requestUser(KeyboardButtonRequestUser requestUser) {
            this.requestUser = requestUser;
            return this;
        }

        @JsonProperty("request_chat")
        public KeyboardButtonBuilder requestChat(KeyboardButtonRequestChat requestChat) {
            this.requestChat = requestChat;
            return this;
        }

        @JsonProperty("request_contact")
        public KeyboardButtonBuilder requestContact(Boolean requestContact) {
            this.requestContact = requestContact;
            return this;
        }

        @JsonProperty("request_location")
        public KeyboardButtonBuilder requestLocation(Boolean requestLocation) {
            this.requestLocation = requestLocation;
            return this;
        }

        @JsonProperty("request_poll")
        public KeyboardButtonBuilder requestPoll(KeyboardButtonPollType requestPoll) {
            this.requestPoll = requestPoll;
            return this;
        }

        @JsonProperty("web_app")
        public KeyboardButtonBuilder webApp(WebAppInfo webApp) {
            this.webApp = webApp;
            return this;
        }

        public KeyboardButton build() {
            return new KeyboardButton(this.text, this.requestUser, this.requestChat, this.requestContact, this.requestLocation, this.requestPoll, this.webApp);
        }

        public String toString() {
            return "KeyboardButton.KeyboardButtonBuilder(text=" + this.text + ", requestUser=" + this.requestUser + ", requestChat=" + this.requestChat + ", requestContact=" + this.requestContact + ", requestLocation=" + this.requestLocation + ", requestPoll=" + this.requestPoll + ", webApp=" + this.webApp + ")";
        }
    }
}
