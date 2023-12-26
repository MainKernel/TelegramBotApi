package api.objects.keyboard;

import api.objects.BotApiObject;
import com.fasterxml.jackson.annotation.JsonProperty;

public class KeyboardButtonRequestUser implements BotApiObject {
    @JsonProperty("request_id")
    private int requestId;

    @JsonProperty("user_is_bot")
    private Boolean userIsBot;

    @JsonProperty("user_is_premium")
    private Boolean userIsPremium;

    KeyboardButtonRequestUser(int requestId, Boolean userIsBot, Boolean userIsPremium) {
        this.requestId = requestId;
        this.userIsBot = userIsBot;
        this.userIsPremium = userIsPremium;
    }

    public static KeyboardButtonRequestUserBuilder builder() {
        return new KeyboardButtonRequestUserBuilder();
    }

    public int getRequestId() {
        return this.requestId;
    }

    public Boolean getUserIsBot() {
        return this.userIsBot;
    }

    public Boolean getUserIsPremium() {
        return this.userIsPremium;
    }

    @JsonProperty("request_id")
    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }

    @JsonProperty("user_is_bot")
    public void setUserIsBot(Boolean userIsBot) {
        this.userIsBot = userIsBot;
    }

    @JsonProperty("user_is_premium")
    public void setUserIsPremium(Boolean userIsPremium) {
        this.userIsPremium = userIsPremium;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof KeyboardButtonRequestUser)) return false;
        final KeyboardButtonRequestUser other = (KeyboardButtonRequestUser) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getRequestId() != other.getRequestId()) return false;
        final Object this$userIsBot = this.getUserIsBot();
        final Object other$userIsBot = other.getUserIsBot();
        if (this$userIsBot == null ? other$userIsBot != null : !this$userIsBot.equals(other$userIsBot)) return false;
        final Object this$userIsPremium = this.getUserIsPremium();
        final Object other$userIsPremium = other.getUserIsPremium();
        if (this$userIsPremium == null ? other$userIsPremium != null : !this$userIsPremium.equals(other$userIsPremium))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof KeyboardButtonRequestUser;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + this.getRequestId();
        final Object $userIsBot = this.getUserIsBot();
        result = result * PRIME + ($userIsBot == null ? 43 : $userIsBot.hashCode());
        final Object $userIsPremium = this.getUserIsPremium();
        result = result * PRIME + ($userIsPremium == null ? 43 : $userIsPremium.hashCode());
        return result;
    }

    public String toString() {
        return "KeyboardButtonRequestUser(requestId=" + this.getRequestId() + ", userIsBot=" + this.getUserIsBot() + ", userIsPremium=" + this.getUserIsPremium() + ")";
    }

    public static class KeyboardButtonRequestUserBuilder {
        private int requestId;
        private Boolean userIsBot;
        private Boolean userIsPremium;

        KeyboardButtonRequestUserBuilder() {
        }

        @JsonProperty("request_id")
        public KeyboardButtonRequestUserBuilder requestId(int requestId) {
            this.requestId = requestId;
            return this;
        }

        @JsonProperty("user_is_bot")
        public KeyboardButtonRequestUserBuilder userIsBot(Boolean userIsBot) {
            this.userIsBot = userIsBot;
            return this;
        }

        @JsonProperty("user_is_premium")
        public KeyboardButtonRequestUserBuilder userIsPremium(Boolean userIsPremium) {
            this.userIsPremium = userIsPremium;
            return this;
        }

        public KeyboardButtonRequestUser build() {
            return new KeyboardButtonRequestUser(this.requestId, this.userIsBot, this.userIsPremium);
        }

        public String toString() {
            return "KeyboardButtonRequestUser.KeyboardButtonRequestUserBuilder(requestId=" + this.requestId + ", userIsBot=" + this.userIsBot + ", userIsPremium=" + this.userIsPremium + ")";
        }
    }
}
