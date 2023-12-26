package api.objects.keyboard;

import api.objects.BotApiObject;
import api.objects.chat.SwitchInlineQueryChosenChat;
import api.objects.misc.LoginUrl;
import api.objects.misc.WebAppInfo;
import com.fasterxml.jackson.annotation.JsonProperty;

public class InlineKeyboardButton implements BotApiObject {
    private String text;
    private String url;
    @JsonProperty("callback_data")
    private String callbackData;
    @JsonProperty("web_app")
    private WebAppInfo webApp;
    @JsonProperty("login_url")
    private LoginUrl loginUrl;
    @JsonProperty("switch_inline_query")
    private String switchInlineQuery;
    @JsonProperty("switch_inline_query_current_chat")
    private String switchInlineQueryCurrentChat;
    @JsonProperty("switch_inline_query_chosen_chat")
    private SwitchInlineQueryChosenChat switchInlineQueryChosenChat;
    @JsonProperty("callback_game")
    private CallbackGame callbackGame;
    @JsonProperty("pay")
    private Boolean pay;

    InlineKeyboardButton(String text, String url, String callbackData, WebAppInfo webApp, LoginUrl loginUrl, String switchInlineQuery, String switchInlineQueryCurrentChat, SwitchInlineQueryChosenChat switchInlineQueryChosenChat, CallbackGame callbackGame, Boolean pay) {
        this.text = text;
        this.url = url;
        this.callbackData = callbackData;
        this.webApp = webApp;
        this.loginUrl = loginUrl;
        this.switchInlineQuery = switchInlineQuery;
        this.switchInlineQueryCurrentChat = switchInlineQueryCurrentChat;
        this.switchInlineQueryChosenChat = switchInlineQueryChosenChat;
        this.callbackGame = callbackGame;
        this.pay = pay;
    }

    public static InlineKeyboardButtonBuilder builder() {
        return new InlineKeyboardButtonBuilder();
    }

    public String getText() {
        return this.text;
    }

    public String getUrl() {
        return this.url;
    }

    public String getCallbackData() {
        return this.callbackData;
    }

    public WebAppInfo getWebApp() {
        return this.webApp;
    }

    public LoginUrl getLoginUrl() {
        return this.loginUrl;
    }

    public String getSwitchInlineQuery() {
        return this.switchInlineQuery;
    }

    public String getSwitchInlineQueryCurrentChat() {
        return this.switchInlineQueryCurrentChat;
    }

    public SwitchInlineQueryChosenChat getSwitchInlineQueryChosenChat() {
        return this.switchInlineQueryChosenChat;
    }

    public CallbackGame getCallbackGame() {
        return this.callbackGame;
    }

    public Boolean getPay() {
        return this.pay;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("callback_data")
    public void setCallbackData(String callbackData) {
        this.callbackData = callbackData;
    }

    @JsonProperty("web_app")
    public void setWebApp(WebAppInfo webApp) {
        this.webApp = webApp;
    }

    @JsonProperty("login_url")
    public void setLoginUrl(LoginUrl loginUrl) {
        this.loginUrl = loginUrl;
    }

    @JsonProperty("switch_inline_query")
    public void setSwitchInlineQuery(String switchInlineQuery) {
        this.switchInlineQuery = switchInlineQuery;
    }

    @JsonProperty("switch_inline_query_current_chat")
    public void setSwitchInlineQueryCurrentChat(String switchInlineQueryCurrentChat) {
        this.switchInlineQueryCurrentChat = switchInlineQueryCurrentChat;
    }

    @JsonProperty("switch_inline_query_chosen_chat")
    public void setSwitchInlineQueryChosenChat(SwitchInlineQueryChosenChat switchInlineQueryChosenChat) {
        this.switchInlineQueryChosenChat = switchInlineQueryChosenChat;
    }

    @JsonProperty("callback_game")
    public void setCallbackGame(CallbackGame callbackGame) {
        this.callbackGame = callbackGame;
    }

    @JsonProperty("pay")
    public void setPay(Boolean pay) {
        this.pay = pay;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof InlineKeyboardButton)) return false;
        final InlineKeyboardButton other = (InlineKeyboardButton) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$text = this.getText();
        final Object other$text = other.getText();
        if (this$text == null ? other$text != null : !this$text.equals(other$text)) return false;
        final Object this$url = this.getUrl();
        final Object other$url = other.getUrl();
        if (this$url == null ? other$url != null : !this$url.equals(other$url)) return false;
        final Object this$callbackData = this.getCallbackData();
        final Object other$callbackData = other.getCallbackData();
        if (this$callbackData == null ? other$callbackData != null : !this$callbackData.equals(other$callbackData))
            return false;
        final Object this$webApp = this.getWebApp();
        final Object other$webApp = other.getWebApp();
        if (this$webApp == null ? other$webApp != null : !this$webApp.equals(other$webApp)) return false;
        final Object this$loginUrl = this.getLoginUrl();
        final Object other$loginUrl = other.getLoginUrl();
        if (this$loginUrl == null ? other$loginUrl != null : !this$loginUrl.equals(other$loginUrl)) return false;
        final Object this$switchInlineQuery = this.getSwitchInlineQuery();
        final Object other$switchInlineQuery = other.getSwitchInlineQuery();
        if (this$switchInlineQuery == null ? other$switchInlineQuery != null : !this$switchInlineQuery.equals(other$switchInlineQuery))
            return false;
        final Object this$switchInlineQueryCurrentChat = this.getSwitchInlineQueryCurrentChat();
        final Object other$switchInlineQueryCurrentChat = other.getSwitchInlineQueryCurrentChat();
        if (this$switchInlineQueryCurrentChat == null ? other$switchInlineQueryCurrentChat != null : !this$switchInlineQueryCurrentChat.equals(other$switchInlineQueryCurrentChat))
            return false;
        final Object this$switchInlineQueryChosenChat = this.getSwitchInlineQueryChosenChat();
        final Object other$switchInlineQueryChosenChat = other.getSwitchInlineQueryChosenChat();
        if (this$switchInlineQueryChosenChat == null ? other$switchInlineQueryChosenChat != null : !this$switchInlineQueryChosenChat.equals(other$switchInlineQueryChosenChat))
            return false;
        final Object this$callbackGame = this.getCallbackGame();
        final Object other$callbackGame = other.getCallbackGame();
        if (this$callbackGame == null ? other$callbackGame != null : !this$callbackGame.equals(other$callbackGame))
            return false;
        final Object this$pay = this.getPay();
        final Object other$pay = other.getPay();
        if (this$pay == null ? other$pay != null : !this$pay.equals(other$pay)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof InlineKeyboardButton;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $text = this.getText();
        result = result * PRIME + ($text == null ? 43 : $text.hashCode());
        final Object $url = this.getUrl();
        result = result * PRIME + ($url == null ? 43 : $url.hashCode());
        final Object $callbackData = this.getCallbackData();
        result = result * PRIME + ($callbackData == null ? 43 : $callbackData.hashCode());
        final Object $webApp = this.getWebApp();
        result = result * PRIME + ($webApp == null ? 43 : $webApp.hashCode());
        final Object $loginUrl = this.getLoginUrl();
        result = result * PRIME + ($loginUrl == null ? 43 : $loginUrl.hashCode());
        final Object $switchInlineQuery = this.getSwitchInlineQuery();
        result = result * PRIME + ($switchInlineQuery == null ? 43 : $switchInlineQuery.hashCode());
        final Object $switchInlineQueryCurrentChat = this.getSwitchInlineQueryCurrentChat();
        result = result * PRIME + ($switchInlineQueryCurrentChat == null ? 43 : $switchInlineQueryCurrentChat.hashCode());
        final Object $switchInlineQueryChosenChat = this.getSwitchInlineQueryChosenChat();
        result = result * PRIME + ($switchInlineQueryChosenChat == null ? 43 : $switchInlineQueryChosenChat.hashCode());
        final Object $callbackGame = this.getCallbackGame();
        result = result * PRIME + ($callbackGame == null ? 43 : $callbackGame.hashCode());
        final Object $pay = this.getPay();
        result = result * PRIME + ($pay == null ? 43 : $pay.hashCode());
        return result;
    }

    public String toString() {
        return "InlineKeyboardButton(text=" + this.getText() + ", url=" + this.getUrl() + ", callbackData=" + this.getCallbackData() + ", webApp=" + this.getWebApp() + ", loginUrl=" + this.getLoginUrl() + ", switchInlineQuery=" + this.getSwitchInlineQuery() + ", switchInlineQueryCurrentChat=" + this.getSwitchInlineQueryCurrentChat() + ", switchInlineQueryChosenChat=" + this.getSwitchInlineQueryChosenChat() + ", callbackGame=" + this.getCallbackGame() + ", pay=" + this.getPay() + ")";
    }

    public static class InlineKeyboardButtonBuilder {
        private String text;
        private String url;
        private String callbackData;
        private WebAppInfo webApp;
        private LoginUrl loginUrl;
        private String switchInlineQuery;
        private String switchInlineQueryCurrentChat;
        private SwitchInlineQueryChosenChat switchInlineQueryChosenChat;
        private CallbackGame callbackGame;
        private Boolean pay;

        InlineKeyboardButtonBuilder() {
        }

        public InlineKeyboardButtonBuilder text(String text) {
            this.text = text;
            return this;
        }

        public InlineKeyboardButtonBuilder url(String url) {
            this.url = url;
            return this;
        }

        @JsonProperty("callback_data")
        public InlineKeyboardButtonBuilder callbackData(String callbackData) {
            this.callbackData = callbackData;
            return this;
        }

        @JsonProperty("web_app")
        public InlineKeyboardButtonBuilder webApp(WebAppInfo webApp) {
            this.webApp = webApp;
            return this;
        }

        @JsonProperty("login_url")
        public InlineKeyboardButtonBuilder loginUrl(LoginUrl loginUrl) {
            this.loginUrl = loginUrl;
            return this;
        }

        @JsonProperty("switch_inline_query")
        public InlineKeyboardButtonBuilder switchInlineQuery(String switchInlineQuery) {
            this.switchInlineQuery = switchInlineQuery;
            return this;
        }

        @JsonProperty("switch_inline_query_current_chat")
        public InlineKeyboardButtonBuilder switchInlineQueryCurrentChat(String switchInlineQueryCurrentChat) {
            this.switchInlineQueryCurrentChat = switchInlineQueryCurrentChat;
            return this;
        }

        @JsonProperty("switch_inline_query_chosen_chat")
        public InlineKeyboardButtonBuilder switchInlineQueryChosenChat(SwitchInlineQueryChosenChat switchInlineQueryChosenChat) {
            this.switchInlineQueryChosenChat = switchInlineQueryChosenChat;
            return this;
        }

        @JsonProperty("callback_game")
        public InlineKeyboardButtonBuilder callbackGame(CallbackGame callbackGame) {
            this.callbackGame = callbackGame;
            return this;
        }

        @JsonProperty("pay")
        public InlineKeyboardButtonBuilder pay(Boolean pay) {
            this.pay = pay;
            return this;
        }

        public InlineKeyboardButton build() {
            return new InlineKeyboardButton(this.text, this.url, this.callbackData, this.webApp, this.loginUrl, this.switchInlineQuery, this.switchInlineQueryCurrentChat, this.switchInlineQueryChosenChat, this.callbackGame, this.pay);
        }

        public String toString() {
            return "InlineKeyboardButton.InlineKeyboardButtonBuilder(text=" + this.text + ", url=" + this.url + ", callbackData=" + this.callbackData + ", webApp=" + this.webApp + ", loginUrl=" + this.loginUrl + ", switchInlineQuery=" + this.switchInlineQuery + ", switchInlineQueryCurrentChat=" + this.switchInlineQueryCurrentChat + ", switchInlineQueryChosenChat=" + this.switchInlineQueryChosenChat + ", callbackGame=" + this.callbackGame + ", pay=" + this.pay + ")";
        }
    }
}
