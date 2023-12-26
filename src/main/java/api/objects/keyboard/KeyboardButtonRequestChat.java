package api.objects.keyboard;

import api.objects.BotApiObject;
import api.objects.chat.ChatAdministratorRights;
import com.fasterxml.jackson.annotation.JsonProperty;

public class KeyboardButtonRequestChat implements BotApiObject {
    @JsonProperty("request_id")
    private int requestId;

    @JsonProperty("chat_is_channel")
    private Boolean chatIsChannel;

    @JsonProperty("chat_is_forum")
    private Boolean chatIsForum;

    @JsonProperty("chat_has_username")
    private Boolean chatHasUsername;

    @JsonProperty("chat_is_created")
    private Boolean chatIsCreated;

    @JsonProperty("user_administrator_rights")
    private ChatAdministratorRights userAdministratorRights;

    @JsonProperty("bot_administrator_rights")
    private ChatAdministratorRights botAdministratorRights;

    @JsonProperty("bot_is_member")
    private Boolean botIsMember;

    KeyboardButtonRequestChat(int requestId, Boolean chatIsChannel, Boolean chatIsForum, Boolean chatHasUsername, Boolean chatIsCreated, ChatAdministratorRights userAdministratorRights, ChatAdministratorRights botAdministratorRights, Boolean botIsMember) {
        this.requestId = requestId;
        this.chatIsChannel = chatIsChannel;
        this.chatIsForum = chatIsForum;
        this.chatHasUsername = chatHasUsername;
        this.chatIsCreated = chatIsCreated;
        this.userAdministratorRights = userAdministratorRights;
        this.botAdministratorRights = botAdministratorRights;
        this.botIsMember = botIsMember;
    }

    public static KeyboardButtonRequestChatBuilder builder() {
        return new KeyboardButtonRequestChatBuilder();
    }

    public int getRequestId() {
        return this.requestId;
    }

    public Boolean getChatIsChannel() {
        return this.chatIsChannel;
    }

    public Boolean getChatIsForum() {
        return this.chatIsForum;
    }

    public Boolean getChatHasUsername() {
        return this.chatHasUsername;
    }

    public Boolean getChatIsCreated() {
        return this.chatIsCreated;
    }

    public ChatAdministratorRights getUserAdministratorRights() {
        return this.userAdministratorRights;
    }

    public ChatAdministratorRights getBotAdministratorRights() {
        return this.botAdministratorRights;
    }

    public Boolean getBotIsMember() {
        return this.botIsMember;
    }

    @JsonProperty("request_id")
    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }

    @JsonProperty("chat_is_channel")
    public void setChatIsChannel(Boolean chatIsChannel) {
        this.chatIsChannel = chatIsChannel;
    }

    @JsonProperty("chat_is_forum")
    public void setChatIsForum(Boolean chatIsForum) {
        this.chatIsForum = chatIsForum;
    }

    @JsonProperty("chat_has_username")
    public void setChatHasUsername(Boolean chatHasUsername) {
        this.chatHasUsername = chatHasUsername;
    }

    @JsonProperty("chat_is_created")
    public void setChatIsCreated(Boolean chatIsCreated) {
        this.chatIsCreated = chatIsCreated;
    }

    @JsonProperty("user_administrator_rights")
    public void setUserAdministratorRights(ChatAdministratorRights userAdministratorRights) {
        this.userAdministratorRights = userAdministratorRights;
    }

    @JsonProperty("bot_administrator_rights")
    public void setBotAdministratorRights(ChatAdministratorRights botAdministratorRights) {
        this.botAdministratorRights = botAdministratorRights;
    }

    @JsonProperty("bot_is_member")
    public void setBotIsMember(Boolean botIsMember) {
        this.botIsMember = botIsMember;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof KeyboardButtonRequestChat)) return false;
        final KeyboardButtonRequestChat other = (KeyboardButtonRequestChat) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getRequestId() != other.getRequestId()) return false;
        final Object this$chatIsChannel = this.getChatIsChannel();
        final Object other$chatIsChannel = other.getChatIsChannel();
        if (this$chatIsChannel == null ? other$chatIsChannel != null : !this$chatIsChannel.equals(other$chatIsChannel))
            return false;
        final Object this$chatIsForum = this.getChatIsForum();
        final Object other$chatIsForum = other.getChatIsForum();
        if (this$chatIsForum == null ? other$chatIsForum != null : !this$chatIsForum.equals(other$chatIsForum))
            return false;
        final Object this$chatHasUsername = this.getChatHasUsername();
        final Object other$chatHasUsername = other.getChatHasUsername();
        if (this$chatHasUsername == null ? other$chatHasUsername != null : !this$chatHasUsername.equals(other$chatHasUsername))
            return false;
        final Object this$chatIsCreated = this.getChatIsCreated();
        final Object other$chatIsCreated = other.getChatIsCreated();
        if (this$chatIsCreated == null ? other$chatIsCreated != null : !this$chatIsCreated.equals(other$chatIsCreated))
            return false;
        final Object this$userAdministratorRights = this.getUserAdministratorRights();
        final Object other$userAdministratorRights = other.getUserAdministratorRights();
        if (this$userAdministratorRights == null ? other$userAdministratorRights != null : !this$userAdministratorRights.equals(other$userAdministratorRights))
            return false;
        final Object this$botAdministratorRights = this.getBotAdministratorRights();
        final Object other$botAdministratorRights = other.getBotAdministratorRights();
        if (this$botAdministratorRights == null ? other$botAdministratorRights != null : !this$botAdministratorRights.equals(other$botAdministratorRights))
            return false;
        final Object this$botIsMember = this.getBotIsMember();
        final Object other$botIsMember = other.getBotIsMember();
        if (this$botIsMember == null ? other$botIsMember != null : !this$botIsMember.equals(other$botIsMember))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof KeyboardButtonRequestChat;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + this.getRequestId();
        final Object $chatIsChannel = this.getChatIsChannel();
        result = result * PRIME + ($chatIsChannel == null ? 43 : $chatIsChannel.hashCode());
        final Object $chatIsForum = this.getChatIsForum();
        result = result * PRIME + ($chatIsForum == null ? 43 : $chatIsForum.hashCode());
        final Object $chatHasUsername = this.getChatHasUsername();
        result = result * PRIME + ($chatHasUsername == null ? 43 : $chatHasUsername.hashCode());
        final Object $chatIsCreated = this.getChatIsCreated();
        result = result * PRIME + ($chatIsCreated == null ? 43 : $chatIsCreated.hashCode());
        final Object $userAdministratorRights = this.getUserAdministratorRights();
        result = result * PRIME + ($userAdministratorRights == null ? 43 : $userAdministratorRights.hashCode());
        final Object $botAdministratorRights = this.getBotAdministratorRights();
        result = result * PRIME + ($botAdministratorRights == null ? 43 : $botAdministratorRights.hashCode());
        final Object $botIsMember = this.getBotIsMember();
        result = result * PRIME + ($botIsMember == null ? 43 : $botIsMember.hashCode());
        return result;
    }

    public String toString() {
        return "KeyboardButtonRequestChat(requestId=" + this.getRequestId() + ", chatIsChannel=" + this.getChatIsChannel() + ", chatIsForum=" + this.getChatIsForum() + ", chatHasUsername=" + this.getChatHasUsername() + ", chatIsCreated=" + this.getChatIsCreated() + ", userAdministratorRights=" + this.getUserAdministratorRights() + ", botAdministratorRights=" + this.getBotAdministratorRights() + ", botIsMember=" + this.getBotIsMember() + ")";
    }

    public static class KeyboardButtonRequestChatBuilder {
        private int requestId;
        private Boolean chatIsChannel;
        private Boolean chatIsForum;
        private Boolean chatHasUsername;
        private Boolean chatIsCreated;
        private ChatAdministratorRights userAdministratorRights;
        private ChatAdministratorRights botAdministratorRights;
        private Boolean botIsMember;

        KeyboardButtonRequestChatBuilder() {
        }

        @JsonProperty("request_id")
        public KeyboardButtonRequestChatBuilder requestId(int requestId) {
            this.requestId = requestId;
            return this;
        }

        @JsonProperty("chat_is_channel")
        public KeyboardButtonRequestChatBuilder chatIsChannel(Boolean chatIsChannel) {
            this.chatIsChannel = chatIsChannel;
            return this;
        }

        @JsonProperty("chat_is_forum")
        public KeyboardButtonRequestChatBuilder chatIsForum(Boolean chatIsForum) {
            this.chatIsForum = chatIsForum;
            return this;
        }

        @JsonProperty("chat_has_username")
        public KeyboardButtonRequestChatBuilder chatHasUsername(Boolean chatHasUsername) {
            this.chatHasUsername = chatHasUsername;
            return this;
        }

        @JsonProperty("chat_is_created")
        public KeyboardButtonRequestChatBuilder chatIsCreated(Boolean chatIsCreated) {
            this.chatIsCreated = chatIsCreated;
            return this;
        }

        @JsonProperty("user_administrator_rights")
        public KeyboardButtonRequestChatBuilder userAdministratorRights(ChatAdministratorRights userAdministratorRights) {
            this.userAdministratorRights = userAdministratorRights;
            return this;
        }

        @JsonProperty("bot_administrator_rights")
        public KeyboardButtonRequestChatBuilder botAdministratorRights(ChatAdministratorRights botAdministratorRights) {
            this.botAdministratorRights = botAdministratorRights;
            return this;
        }

        @JsonProperty("bot_is_member")
        public KeyboardButtonRequestChatBuilder botIsMember(Boolean botIsMember) {
            this.botIsMember = botIsMember;
            return this;
        }

        public KeyboardButtonRequestChat build() {
            return new KeyboardButtonRequestChat(this.requestId, this.chatIsChannel, this.chatIsForum, this.chatHasUsername, this.chatIsCreated, this.userAdministratorRights, this.botAdministratorRights, this.botIsMember);
        }

        public String toString() {
            return "KeyboardButtonRequestChat.KeyboardButtonRequestChatBuilder(requestId=" + this.requestId + ", chatIsChannel=" + this.chatIsChannel + ", chatIsForum=" + this.chatIsForum + ", chatHasUsername=" + this.chatHasUsername + ", chatIsCreated=" + this.chatIsCreated + ", userAdministratorRights=" + this.userAdministratorRights + ", botAdministratorRights=" + this.botAdministratorRights + ", botIsMember=" + this.botIsMember + ")";
        }
    }
}
