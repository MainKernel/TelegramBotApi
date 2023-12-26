package api.objects.update;

import api.objects.BotApiObject;
import api.objects.chat.ChatJoinRequest;
import api.objects.chat.ChatMemberUpdated;
import api.objects.message.Message;
import api.objects.misc.CallbackQuery;
import api.objects.pool.Poll;
import api.objects.pool.PollAnswer;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Update implements BotApiObject {

    @JsonProperty("update_id")
    private Integer updateId;

    @JsonProperty("message")
    private Message message;

    @JsonProperty("edited_message")
    private Message editedMessage;

    @JsonProperty("channel_post")
    private Message channelPost;

    @JsonProperty("edited_channel_post")
    private Message editedChannelPost;

    @JsonProperty("inline_query")
    private InlineQuery inlineQuery;

    @JsonProperty("chosen_inline_result")
    private ChosenInlineResult chosenInlineResult;

    @JsonProperty("callback_query")
    private CallbackQuery callbackQuery;

    @JsonProperty("shipping_query")
    private ShippingQuery shippingQuery;

    @JsonProperty("pre_checkout_query")
    private PreCheckoutQuery preCheckoutQuery;

    @JsonProperty("poll")
    private Poll poll;

    @JsonProperty("poll_answer")
    private PollAnswer pollAnswer;

    @JsonProperty("my_chat_member")
    private ChatMemberUpdated myChatMember;

    @JsonProperty("chat_member")
    private ChatMemberUpdated chatMember;

    @JsonProperty("chat_join_request")
    private ChatJoinRequest chatJoinRequest;

    Update(Integer updateId, Message message, Message editedMessage, Message channelPost, Message editedChannelPost, InlineQuery inlineQuery, ChosenInlineResult chosenInlineResult, CallbackQuery callbackQuery, ShippingQuery shippingQuery, PreCheckoutQuery preCheckoutQuery, Poll poll, PollAnswer pollAnswer, ChatMemberUpdated myChatMember, ChatMemberUpdated chatMember, ChatJoinRequest chatJoinRequest) {
        this.updateId = updateId;
        this.message = message;
        this.editedMessage = editedMessage;
        this.channelPost = channelPost;
        this.editedChannelPost = editedChannelPost;
        this.inlineQuery = inlineQuery;
        this.chosenInlineResult = chosenInlineResult;
        this.callbackQuery = callbackQuery;
        this.shippingQuery = shippingQuery;
        this.preCheckoutQuery = preCheckoutQuery;
        this.poll = poll;
        this.pollAnswer = pollAnswer;
        this.myChatMember = myChatMember;
        this.chatMember = chatMember;
        this.chatJoinRequest = chatJoinRequest;
    }

    public static UpdateBuilder builder() {
        return new UpdateBuilder();
    }

    @Override
    public String toString() {
        return "Update{" +
                "updateId=" + updateId +
                ", message=" + message +
                ", editedMessage=" + editedMessage +
                ", channelPost=" + channelPost +
                ", editedChannelPost=" + editedChannelPost +
                ", poll=" + poll +
                ", pollAnswer=" + pollAnswer +
                ", myChatMember=" + myChatMember +
                ", chatMember=" + chatMember +
                ", chatJoinRequest=" + chatJoinRequest +
                '}';
    }

    public Integer getUpdateId() {
        return this.updateId;
    }

    public Message getMessage() {
        return this.message;
    }

    public Message getEditedMessage() {
        return this.editedMessage;
    }

    public Message getChannelPost() {
        return this.channelPost;
    }

    public Message getEditedChannelPost() {
        return this.editedChannelPost;
    }

    public InlineQuery getInlineQuery() {
        return this.inlineQuery;
    }

    public ChosenInlineResult getChosenInlineResult() {
        return this.chosenInlineResult;
    }

    public CallbackQuery getCallbackQuery() {
        return this.callbackQuery;
    }

    public ShippingQuery getShippingQuery() {
        return this.shippingQuery;
    }

    public PreCheckoutQuery getPreCheckoutQuery() {
        return this.preCheckoutQuery;
    }

    public Poll getPoll() {
        return this.poll;
    }

    public PollAnswer getPollAnswer() {
        return this.pollAnswer;
    }

    public ChatMemberUpdated getMyChatMember() {
        return this.myChatMember;
    }

    public ChatMemberUpdated getChatMember() {
        return this.chatMember;
    }

    public ChatJoinRequest getChatJoinRequest() {
        return this.chatJoinRequest;
    }

    @JsonProperty("update_id")
    public void setUpdateId(Integer updateId) {
        this.updateId = updateId;
    }

    @JsonProperty("message")
    public void setMessage(Message message) {
        this.message = message;
    }

    @JsonProperty("edited_message")
    public void setEditedMessage(Message editedMessage) {
        this.editedMessage = editedMessage;
    }

    @JsonProperty("channel_post")
    public void setChannelPost(Message channelPost) {
        this.channelPost = channelPost;
    }

    @JsonProperty("edited_channel_post")
    public void setEditedChannelPost(Message editedChannelPost) {
        this.editedChannelPost = editedChannelPost;
    }

    @JsonProperty("inline_query")
    public void setInlineQuery(InlineQuery inlineQuery) {
        this.inlineQuery = inlineQuery;
    }

    @JsonProperty("chosen_inline_result")
    public void setChosenInlineResult(ChosenInlineResult chosenInlineResult) {
        this.chosenInlineResult = chosenInlineResult;
    }

    @JsonProperty("callback_query")
    public void setCallbackQuery(CallbackQuery callbackQuery) {
        this.callbackQuery = callbackQuery;
    }

    @JsonProperty("shipping_query")
    public void setShippingQuery(ShippingQuery shippingQuery) {
        this.shippingQuery = shippingQuery;
    }

    @JsonProperty("pre_checkout_query")
    public void setPreCheckoutQuery(PreCheckoutQuery preCheckoutQuery) {
        this.preCheckoutQuery = preCheckoutQuery;
    }

    @JsonProperty("poll")
    public void setPoll(Poll poll) {
        this.poll = poll;
    }

    @JsonProperty("poll_answer")
    public void setPollAnswer(PollAnswer pollAnswer) {
        this.pollAnswer = pollAnswer;
    }

    @JsonProperty("my_chat_member")
    public void setMyChatMember(ChatMemberUpdated myChatMember) {
        this.myChatMember = myChatMember;
    }

    @JsonProperty("chat_member")
    public void setChatMember(ChatMemberUpdated chatMember) {
        this.chatMember = chatMember;
    }

    @JsonProperty("chat_join_request")
    public void setChatJoinRequest(ChatJoinRequest chatJoinRequest) {
        this.chatJoinRequest = chatJoinRequest;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Update)) return false;
        final Update other = (Update) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$updateId = this.getUpdateId();
        final Object other$updateId = other.getUpdateId();
        if (this$updateId == null ? other$updateId != null : !this$updateId.equals(other$updateId)) return false;
        final Object this$message = this.getMessage();
        final Object other$message = other.getMessage();
        if (this$message == null ? other$message != null : !this$message.equals(other$message)) return false;
        final Object this$editedMessage = this.getEditedMessage();
        final Object other$editedMessage = other.getEditedMessage();
        if (this$editedMessage == null ? other$editedMessage != null : !this$editedMessage.equals(other$editedMessage))
            return false;
        final Object this$channelPost = this.getChannelPost();
        final Object other$channelPost = other.getChannelPost();
        if (this$channelPost == null ? other$channelPost != null : !this$channelPost.equals(other$channelPost))
            return false;
        final Object this$editedChannelPost = this.getEditedChannelPost();
        final Object other$editedChannelPost = other.getEditedChannelPost();
        if (this$editedChannelPost == null ? other$editedChannelPost != null : !this$editedChannelPost.equals(other$editedChannelPost))
            return false;
        final Object this$inlineQuery = this.getInlineQuery();
        final Object other$inlineQuery = other.getInlineQuery();
        if (this$inlineQuery == null ? other$inlineQuery != null : !this$inlineQuery.equals(other$inlineQuery))
            return false;
        final Object this$chosenInlineResult = this.getChosenInlineResult();
        final Object other$chosenInlineResult = other.getChosenInlineResult();
        if (this$chosenInlineResult == null ? other$chosenInlineResult != null : !this$chosenInlineResult.equals(other$chosenInlineResult))
            return false;
        final Object this$callbackQuery = this.getCallbackQuery();
        final Object other$callbackQuery = other.getCallbackQuery();
        if (this$callbackQuery == null ? other$callbackQuery != null : !this$callbackQuery.equals(other$callbackQuery))
            return false;
        final Object this$shippingQuery = this.getShippingQuery();
        final Object other$shippingQuery = other.getShippingQuery();
        if (this$shippingQuery == null ? other$shippingQuery != null : !this$shippingQuery.equals(other$shippingQuery))
            return false;
        final Object this$preCheckoutQuery = this.getPreCheckoutQuery();
        final Object other$preCheckoutQuery = other.getPreCheckoutQuery();
        if (this$preCheckoutQuery == null ? other$preCheckoutQuery != null : !this$preCheckoutQuery.equals(other$preCheckoutQuery))
            return false;
        final Object this$poll = this.getPoll();
        final Object other$poll = other.getPoll();
        if (this$poll == null ? other$poll != null : !this$poll.equals(other$poll)) return false;
        final Object this$pollAnswer = this.getPollAnswer();
        final Object other$pollAnswer = other.getPollAnswer();
        if (this$pollAnswer == null ? other$pollAnswer != null : !this$pollAnswer.equals(other$pollAnswer))
            return false;
        final Object this$myChatMember = this.getMyChatMember();
        final Object other$myChatMember = other.getMyChatMember();
        if (this$myChatMember == null ? other$myChatMember != null : !this$myChatMember.equals(other$myChatMember))
            return false;
        final Object this$chatMember = this.getChatMember();
        final Object other$chatMember = other.getChatMember();
        if (this$chatMember == null ? other$chatMember != null : !this$chatMember.equals(other$chatMember))
            return false;
        final Object this$chatJoinRequest = this.getChatJoinRequest();
        final Object other$chatJoinRequest = other.getChatJoinRequest();
        if (this$chatJoinRequest == null ? other$chatJoinRequest != null : !this$chatJoinRequest.equals(other$chatJoinRequest))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Update;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $updateId = this.getUpdateId();
        result = result * PRIME + ($updateId == null ? 43 : $updateId.hashCode());
        final Object $message = this.getMessage();
        result = result * PRIME + ($message == null ? 43 : $message.hashCode());
        final Object $editedMessage = this.getEditedMessage();
        result = result * PRIME + ($editedMessage == null ? 43 : $editedMessage.hashCode());
        final Object $channelPost = this.getChannelPost();
        result = result * PRIME + ($channelPost == null ? 43 : $channelPost.hashCode());
        final Object $editedChannelPost = this.getEditedChannelPost();
        result = result * PRIME + ($editedChannelPost == null ? 43 : $editedChannelPost.hashCode());
        final Object $inlineQuery = this.getInlineQuery();
        result = result * PRIME + ($inlineQuery == null ? 43 : $inlineQuery.hashCode());
        final Object $chosenInlineResult = this.getChosenInlineResult();
        result = result * PRIME + ($chosenInlineResult == null ? 43 : $chosenInlineResult.hashCode());
        final Object $callbackQuery = this.getCallbackQuery();
        result = result * PRIME + ($callbackQuery == null ? 43 : $callbackQuery.hashCode());
        final Object $shippingQuery = this.getShippingQuery();
        result = result * PRIME + ($shippingQuery == null ? 43 : $shippingQuery.hashCode());
        final Object $preCheckoutQuery = this.getPreCheckoutQuery();
        result = result * PRIME + ($preCheckoutQuery == null ? 43 : $preCheckoutQuery.hashCode());
        final Object $poll = this.getPoll();
        result = result * PRIME + ($poll == null ? 43 : $poll.hashCode());
        final Object $pollAnswer = this.getPollAnswer();
        result = result * PRIME + ($pollAnswer == null ? 43 : $pollAnswer.hashCode());
        final Object $myChatMember = this.getMyChatMember();
        result = result * PRIME + ($myChatMember == null ? 43 : $myChatMember.hashCode());
        final Object $chatMember = this.getChatMember();
        result = result * PRIME + ($chatMember == null ? 43 : $chatMember.hashCode());
        final Object $chatJoinRequest = this.getChatJoinRequest();
        result = result * PRIME + ($chatJoinRequest == null ? 43 : $chatJoinRequest.hashCode());
        return result;
    }

    public static class UpdateBuilder {
        private Integer updateId;
        private Message message;
        private Message editedMessage;
        private Message channelPost;
        private Message editedChannelPost;
        private InlineQuery inlineQuery;
        private ChosenInlineResult chosenInlineResult;
        private CallbackQuery callbackQuery;
        private ShippingQuery shippingQuery;
        private PreCheckoutQuery preCheckoutQuery;
        private Poll poll;
        private PollAnswer pollAnswer;
        private ChatMemberUpdated myChatMember;
        private ChatMemberUpdated chatMember;
        private ChatJoinRequest chatJoinRequest;

        UpdateBuilder() {
        }

        @JsonProperty("update_id")
        public UpdateBuilder updateId(Integer updateId) {
            this.updateId = updateId;
            return this;
        }

        @JsonProperty("message")
        public UpdateBuilder message(Message message) {
            this.message = message;
            return this;
        }

        @JsonProperty("edited_message")
        public UpdateBuilder editedMessage(Message editedMessage) {
            this.editedMessage = editedMessage;
            return this;
        }

        @JsonProperty("channel_post")
        public UpdateBuilder channelPost(Message channelPost) {
            this.channelPost = channelPost;
            return this;
        }

        @JsonProperty("edited_channel_post")
        public UpdateBuilder editedChannelPost(Message editedChannelPost) {
            this.editedChannelPost = editedChannelPost;
            return this;
        }

        @JsonProperty("inline_query")
        public UpdateBuilder inlineQuery(InlineQuery inlineQuery) {
            this.inlineQuery = inlineQuery;
            return this;
        }

        @JsonProperty("chosen_inline_result")
        public UpdateBuilder chosenInlineResult(ChosenInlineResult chosenInlineResult) {
            this.chosenInlineResult = chosenInlineResult;
            return this;
        }

        @JsonProperty("callback_query")
        public UpdateBuilder callbackQuery(CallbackQuery callbackQuery) {
            this.callbackQuery = callbackQuery;
            return this;
        }

        @JsonProperty("shipping_query")
        public UpdateBuilder shippingQuery(ShippingQuery shippingQuery) {
            this.shippingQuery = shippingQuery;
            return this;
        }

        @JsonProperty("pre_checkout_query")
        public UpdateBuilder preCheckoutQuery(PreCheckoutQuery preCheckoutQuery) {
            this.preCheckoutQuery = preCheckoutQuery;
            return this;
        }

        @JsonProperty("poll")
        public UpdateBuilder poll(Poll poll) {
            this.poll = poll;
            return this;
        }

        @JsonProperty("poll_answer")
        public UpdateBuilder pollAnswer(PollAnswer pollAnswer) {
            this.pollAnswer = pollAnswer;
            return this;
        }

        @JsonProperty("my_chat_member")
        public UpdateBuilder myChatMember(ChatMemberUpdated myChatMember) {
            this.myChatMember = myChatMember;
            return this;
        }

        @JsonProperty("chat_member")
        public UpdateBuilder chatMember(ChatMemberUpdated chatMember) {
            this.chatMember = chatMember;
            return this;
        }

        @JsonProperty("chat_join_request")
        public UpdateBuilder chatJoinRequest(ChatJoinRequest chatJoinRequest) {
            this.chatJoinRequest = chatJoinRequest;
            return this;
        }

        public Update build() {
            return new Update(this.updateId, this.message, this.editedMessage, this.channelPost, this.editedChannelPost, this.inlineQuery, this.chosenInlineResult, this.callbackQuery, this.shippingQuery, this.preCheckoutQuery, this.poll, this.pollAnswer, this.myChatMember, this.chatMember, this.chatJoinRequest);
        }

        public String toString() {
            return "Update.UpdateBuilder(updateId=" + this.updateId + ", message=" + this.message + ", editedMessage=" + this.editedMessage + ", channelPost=" + this.channelPost + ", editedChannelPost=" + this.editedChannelPost + ", inlineQuery=" + this.inlineQuery + ", chosenInlineResult=" + this.chosenInlineResult + ", callbackQuery=" + this.callbackQuery + ", shippingQuery=" + this.shippingQuery + ", preCheckoutQuery=" + this.preCheckoutQuery + ", poll=" + this.poll + ", pollAnswer=" + this.pollAnswer + ", myChatMember=" + this.myChatMember + ", chatMember=" + this.chatMember + ", chatJoinRequest=" + this.chatJoinRequest + ")";
        }
    }
}
