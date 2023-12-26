package api.objects.misc;

import api.objects.BotApiObject;
import api.objects.message.Message;
import api.objects.user.User;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CallbackQuery implements BotApiObject {
    @JsonProperty("id")
    private String id;
    @JsonProperty("from")
    private User from;
    @JsonProperty("message")
    private Message message;
    @JsonProperty("inline_message_id")
    private String inlineMessageId;
    @JsonProperty("chat_instance")
    private String chatInstance;
    @JsonProperty("data")
    private String data;
    @JsonProperty("game_short_name")
    private String gameShortName;

    CallbackQuery(String id, User from, Message message, String inlineMessageId, String chatInstance, String data, String gameShortName) {
        this.id = id;
        this.from = from;
        this.message = message;
        this.inlineMessageId = inlineMessageId;
        this.chatInstance = chatInstance;
        this.data = data;
        this.gameShortName = gameShortName;
    }

    public static CallbackQueryBuilder builder() {
        return new CallbackQueryBuilder();
    }


    public String getId() {
        return this.id;
    }

    public User getFrom() {
        return this.from;
    }

    public Message getMessage() {
        return this.message;
    }

    public String getInlineMessageId() {
        return this.inlineMessageId;
    }

    public String getChatInstance() {
        return this.chatInstance;
    }

    public String getData() {
        return this.data;
    }

    public String getGameShortName() {
        return this.gameShortName;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("from")
    public void setFrom(User from) {
        this.from = from;
    }

    @JsonProperty("message")
    public void setMessage(Message message) {
        this.message = message;
    }

    @JsonProperty("inline_message_id")
    public void setInlineMessageId(String inlineMessageId) {
        this.inlineMessageId = inlineMessageId;
    }

    @JsonProperty("chat_instance")
    public void setChatInstance(String chatInstance) {
        this.chatInstance = chatInstance;
    }

    @JsonProperty("data")
    public void setData(String data) {
        this.data = data;
    }

    @JsonProperty("game_short_name")
    public void setGameShortName(String gameShortName) {
        this.gameShortName = gameShortName;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof CallbackQuery)) return false;
        final CallbackQuery other = (CallbackQuery) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$from = this.getFrom();
        final Object other$from = other.getFrom();
        if (this$from == null ? other$from != null : !this$from.equals(other$from)) return false;
        final Object this$message = this.getMessage();
        final Object other$message = other.getMessage();
        if (this$message == null ? other$message != null : !this$message.equals(other$message)) return false;
        final Object this$inlineMessageId = this.getInlineMessageId();
        final Object other$inlineMessageId = other.getInlineMessageId();
        if (this$inlineMessageId == null ? other$inlineMessageId != null : !this$inlineMessageId.equals(other$inlineMessageId))
            return false;
        final Object this$chatInstance = this.getChatInstance();
        final Object other$chatInstance = other.getChatInstance();
        if (this$chatInstance == null ? other$chatInstance != null : !this$chatInstance.equals(other$chatInstance))
            return false;
        final Object this$data = this.getData();
        final Object other$data = other.getData();
        if (this$data == null ? other$data != null : !this$data.equals(other$data)) return false;
        final Object this$gameShortName = this.getGameShortName();
        final Object other$gameShortName = other.getGameShortName();
        if (this$gameShortName == null ? other$gameShortName != null : !this$gameShortName.equals(other$gameShortName))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof CallbackQuery;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $from = this.getFrom();
        result = result * PRIME + ($from == null ? 43 : $from.hashCode());
        final Object $message = this.getMessage();
        result = result * PRIME + ($message == null ? 43 : $message.hashCode());
        final Object $inlineMessageId = this.getInlineMessageId();
        result = result * PRIME + ($inlineMessageId == null ? 43 : $inlineMessageId.hashCode());
        final Object $chatInstance = this.getChatInstance();
        result = result * PRIME + ($chatInstance == null ? 43 : $chatInstance.hashCode());
        final Object $data = this.getData();
        result = result * PRIME + ($data == null ? 43 : $data.hashCode());
        final Object $gameShortName = this.getGameShortName();
        result = result * PRIME + ($gameShortName == null ? 43 : $gameShortName.hashCode());
        return result;
    }

    public String toString() {
        return "CallbackQuery(id=" + this.getId() + ", from=" + this.getFrom() + ", message=" + this.getMessage() + ", inlineMessageId=" + this.getInlineMessageId() + ", chatInstance=" + this.getChatInstance() + ", data=" + this.getData() + ", gameShortName=" + this.getGameShortName() + ")";
    }

    public static class CallbackQueryBuilder {
        private String id;
        private User from;
        private Message message;
        private String inlineMessageId;
        private String chatInstance;
        private String data;
        private String gameShortName;

        CallbackQueryBuilder() {
        }

        @JsonProperty("id")
        public CallbackQueryBuilder id(String id) {
            this.id = id;
            return this;
        }

        @JsonProperty("from")
        public CallbackQueryBuilder from(User from) {
            this.from = from;
            return this;
        }

        @JsonProperty("message")
        public CallbackQueryBuilder message(Message message) {
            this.message = message;
            return this;
        }

        @JsonProperty("inline_message_id")
        public CallbackQueryBuilder inlineMessageId(String inlineMessageId) {
            this.inlineMessageId = inlineMessageId;
            return this;
        }

        @JsonProperty("chat_instance")
        public CallbackQueryBuilder chatInstance(String chatInstance) {
            this.chatInstance = chatInstance;
            return this;
        }

        @JsonProperty("data")
        public CallbackQueryBuilder data(String data) {
            this.data = data;
            return this;
        }

        @JsonProperty("game_short_name")
        public CallbackQueryBuilder gameShortName(String gameShortName) {
            this.gameShortName = gameShortName;
            return this;
        }

        public CallbackQuery build() {
            return new CallbackQuery(this.id, this.from, this.message, this.inlineMessageId, this.chatInstance, this.data, this.gameShortName);
        }

        public String toString() {
            return "CallbackQuery.CallbackQueryBuilder(id=" + this.id + ", from=" + this.from + ", message=" + this.message + ", inlineMessageId=" + this.inlineMessageId + ", chatInstance=" + this.chatInstance + ", data=" + this.data + ", gameShortName=" + this.gameShortName + ")";
        }
    }
}
