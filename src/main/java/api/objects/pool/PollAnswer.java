package api.objects.pool;

import api.objects.BotApiObject;
import api.objects.chat.Chat;
import api.objects.user.User;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PollAnswer implements BotApiObject {
    @JsonProperty("poll_id")
    private String pollId;

    @JsonProperty("voter_chat")
    private Chat voterChat;

    @JsonProperty("user")
    private User user;

    @JsonProperty("option_ids")
    private Integer[] optionIds;

    PollAnswer(String pollId, Chat voterChat, User user, Integer[] optionIds) {
        this.pollId = pollId;
        this.voterChat = voterChat;
        this.user = user;
        this.optionIds = optionIds;
    }

    public static PollAnswerBuilder builder() {
        return new PollAnswerBuilder();
    }

    public String getPollId() {
        return this.pollId;
    }

    public Chat getVoterChat() {
        return this.voterChat;
    }

    public User getUser() {
        return this.user;
    }

    public Integer[] getOptionIds() {
        return this.optionIds;
    }

    @JsonProperty("poll_id")
    public void setPollId(String pollId) {
        this.pollId = pollId;
    }

    @JsonProperty("voter_chat")
    public void setVoterChat(Chat voterChat) {
        this.voterChat = voterChat;
    }

    @JsonProperty("user")
    public void setUser(User user) {
        this.user = user;
    }

    @JsonProperty("option_ids")
    public void setOptionIds(Integer[] optionIds) {
        this.optionIds = optionIds;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof PollAnswer)) return false;
        final PollAnswer other = (PollAnswer) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$pollId = this.getPollId();
        final Object other$pollId = other.getPollId();
        if (this$pollId == null ? other$pollId != null : !this$pollId.equals(other$pollId)) return false;
        final Object this$voterChat = this.getVoterChat();
        final Object other$voterChat = other.getVoterChat();
        if (this$voterChat == null ? other$voterChat != null : !this$voterChat.equals(other$voterChat)) return false;
        final Object this$user = this.getUser();
        final Object other$user = other.getUser();
        if (this$user == null ? other$user != null : !this$user.equals(other$user)) return false;
        if (!java.util.Arrays.deepEquals(this.getOptionIds(), other.getOptionIds())) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof PollAnswer;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $pollId = this.getPollId();
        result = result * PRIME + ($pollId == null ? 43 : $pollId.hashCode());
        final Object $voterChat = this.getVoterChat();
        result = result * PRIME + ($voterChat == null ? 43 : $voterChat.hashCode());
        final Object $user = this.getUser();
        result = result * PRIME + ($user == null ? 43 : $user.hashCode());
        result = result * PRIME + java.util.Arrays.deepHashCode(this.getOptionIds());
        return result;
    }

    public String toString() {
        return "PollAnswer(pollId=" + this.getPollId() + ", voterChat=" + this.getVoterChat() + ", user=" + this.getUser() + ", optionIds=" + java.util.Arrays.deepToString(this.getOptionIds()) + ")";
    }

    public static class PollAnswerBuilder {
        private String pollId;
        private Chat voterChat;
        private User user;
        private Integer[] optionIds;

        PollAnswerBuilder() {
        }

        @JsonProperty("poll_id")
        public PollAnswerBuilder pollId(String pollId) {
            this.pollId = pollId;
            return this;
        }

        @JsonProperty("voter_chat")
        public PollAnswerBuilder voterChat(Chat voterChat) {
            this.voterChat = voterChat;
            return this;
        }

        @JsonProperty("user")
        public PollAnswerBuilder user(User user) {
            this.user = user;
            return this;
        }

        @JsonProperty("option_ids")
        public PollAnswerBuilder optionIds(Integer[] optionIds) {
            this.optionIds = optionIds;
            return this;
        }

        public PollAnswer build() {
            return new PollAnswer(this.pollId, this.voterChat, this.user, this.optionIds);
        }

        public String toString() {
            return "PollAnswer.PollAnswerBuilder(pollId=" + this.pollId + ", voterChat=" + this.voterChat + ", user=" + this.user + ", optionIds=" + java.util.Arrays.deepToString(this.optionIds) + ")";
        }
    }
}
