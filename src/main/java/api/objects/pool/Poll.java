package api.objects.pool;

import api.objects.BotApiObject;
import api.objects.message.MessageEntity;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Poll implements BotApiObject {
    @JsonProperty("id")
    private String id;

    @JsonProperty("question")
    private String question;

    @JsonProperty("options")
    private PollOption[] options;

    @JsonProperty("total_voter_count")
    private Integer totalVoterCount;

    @JsonProperty("is_closed")
    private Boolean isClosed;

    @JsonProperty("is_anonymous")
    private Boolean isAnonymous;

    @JsonProperty("type")
    private String type;

    @JsonProperty("allows_multiple_answers")
    private Boolean allowsMultipleAnswers;

    @JsonProperty("correct_option_id")
    private Integer correctOptionId;

    @JsonProperty("explanation")
    private String explanation;

    @JsonProperty("explanation_entities")
    private MessageEntity[] explanationEntities;

    @JsonProperty("open_period")
    private Integer openPeriod;

    @JsonProperty("close_date")
    private Integer closeDate;

    Poll(String id, String question, PollOption[] options, Integer totalVoterCount, Boolean isClosed, Boolean isAnonymous, String type, Boolean allowsMultipleAnswers, Integer correctOptionId, String explanation, MessageEntity[] explanationEntities, Integer openPeriod, Integer closeDate) {
        this.id = id;
        this.question = question;
        this.options = options;
        this.totalVoterCount = totalVoterCount;
        this.isClosed = isClosed;
        this.isAnonymous = isAnonymous;
        this.type = type;
        this.allowsMultipleAnswers = allowsMultipleAnswers;
        this.correctOptionId = correctOptionId;
        this.explanation = explanation;
        this.explanationEntities = explanationEntities;
        this.openPeriod = openPeriod;
        this.closeDate = closeDate;
    }

    public static PollBuilder builder() {
        return new PollBuilder();
    }

    public String getId() {
        return this.id;
    }

    public String getQuestion() {
        return this.question;
    }

    public PollOption[] getOptions() {
        return this.options;
    }

    public Integer getTotalVoterCount() {
        return this.totalVoterCount;
    }

    public Boolean getIsClosed() {
        return this.isClosed;
    }

    public Boolean getIsAnonymous() {
        return this.isAnonymous;
    }

    public String getType() {
        return this.type;
    }

    public Boolean getAllowsMultipleAnswers() {
        return this.allowsMultipleAnswers;
    }

    public Integer getCorrectOptionId() {
        return this.correctOptionId;
    }

    public String getExplanation() {
        return this.explanation;
    }

    public MessageEntity[] getExplanationEntities() {
        return this.explanationEntities;
    }

    public Integer getOpenPeriod() {
        return this.openPeriod;
    }

    public Integer getCloseDate() {
        return this.closeDate;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("question")
    public void setQuestion(String question) {
        this.question = question;
    }

    @JsonProperty("options")
    public void setOptions(PollOption[] options) {
        this.options = options;
    }

    @JsonProperty("total_voter_count")
    public void setTotalVoterCount(Integer totalVoterCount) {
        this.totalVoterCount = totalVoterCount;
    }

    @JsonProperty("is_closed")
    public void setIsClosed(Boolean isClosed) {
        this.isClosed = isClosed;
    }

    @JsonProperty("is_anonymous")
    public void setIsAnonymous(Boolean isAnonymous) {
        this.isAnonymous = isAnonymous;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("allows_multiple_answers")
    public void setAllowsMultipleAnswers(Boolean allowsMultipleAnswers) {
        this.allowsMultipleAnswers = allowsMultipleAnswers;
    }

    @JsonProperty("correct_option_id")
    public void setCorrectOptionId(Integer correctOptionId) {
        this.correctOptionId = correctOptionId;
    }

    @JsonProperty("explanation")
    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    @JsonProperty("explanation_entities")
    public void setExplanationEntities(MessageEntity[] explanationEntities) {
        this.explanationEntities = explanationEntities;
    }

    @JsonProperty("open_period")
    public void setOpenPeriod(Integer openPeriod) {
        this.openPeriod = openPeriod;
    }

    @JsonProperty("close_date")
    public void setCloseDate(Integer closeDate) {
        this.closeDate = closeDate;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Poll)) return false;
        final Poll other = (Poll) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$question = this.getQuestion();
        final Object other$question = other.getQuestion();
        if (this$question == null ? other$question != null : !this$question.equals(other$question)) return false;
        if (!java.util.Arrays.deepEquals(this.getOptions(), other.getOptions())) return false;
        final Object this$totalVoterCount = this.getTotalVoterCount();
        final Object other$totalVoterCount = other.getTotalVoterCount();
        if (this$totalVoterCount == null ? other$totalVoterCount != null : !this$totalVoterCount.equals(other$totalVoterCount))
            return false;
        final Object this$isClosed = this.getIsClosed();
        final Object other$isClosed = other.getIsClosed();
        if (this$isClosed == null ? other$isClosed != null : !this$isClosed.equals(other$isClosed)) return false;
        final Object this$isAnonymous = this.getIsAnonymous();
        final Object other$isAnonymous = other.getIsAnonymous();
        if (this$isAnonymous == null ? other$isAnonymous != null : !this$isAnonymous.equals(other$isAnonymous))
            return false;
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        final Object this$allowsMultipleAnswers = this.getAllowsMultipleAnswers();
        final Object other$allowsMultipleAnswers = other.getAllowsMultipleAnswers();
        if (this$allowsMultipleAnswers == null ? other$allowsMultipleAnswers != null : !this$allowsMultipleAnswers.equals(other$allowsMultipleAnswers))
            return false;
        final Object this$correctOptionId = this.getCorrectOptionId();
        final Object other$correctOptionId = other.getCorrectOptionId();
        if (this$correctOptionId == null ? other$correctOptionId != null : !this$correctOptionId.equals(other$correctOptionId))
            return false;
        final Object this$explanation = this.getExplanation();
        final Object other$explanation = other.getExplanation();
        if (this$explanation == null ? other$explanation != null : !this$explanation.equals(other$explanation))
            return false;
        if (!java.util.Arrays.deepEquals(this.getExplanationEntities(), other.getExplanationEntities())) return false;
        final Object this$openPeriod = this.getOpenPeriod();
        final Object other$openPeriod = other.getOpenPeriod();
        if (this$openPeriod == null ? other$openPeriod != null : !this$openPeriod.equals(other$openPeriod))
            return false;
        final Object this$closeDate = this.getCloseDate();
        final Object other$closeDate = other.getCloseDate();
        if (this$closeDate == null ? other$closeDate != null : !this$closeDate.equals(other$closeDate)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Poll;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $question = this.getQuestion();
        result = result * PRIME + ($question == null ? 43 : $question.hashCode());
        result = result * PRIME + java.util.Arrays.deepHashCode(this.getOptions());
        final Object $totalVoterCount = this.getTotalVoterCount();
        result = result * PRIME + ($totalVoterCount == null ? 43 : $totalVoterCount.hashCode());
        final Object $isClosed = this.getIsClosed();
        result = result * PRIME + ($isClosed == null ? 43 : $isClosed.hashCode());
        final Object $isAnonymous = this.getIsAnonymous();
        result = result * PRIME + ($isAnonymous == null ? 43 : $isAnonymous.hashCode());
        final Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        final Object $allowsMultipleAnswers = this.getAllowsMultipleAnswers();
        result = result * PRIME + ($allowsMultipleAnswers == null ? 43 : $allowsMultipleAnswers.hashCode());
        final Object $correctOptionId = this.getCorrectOptionId();
        result = result * PRIME + ($correctOptionId == null ? 43 : $correctOptionId.hashCode());
        final Object $explanation = this.getExplanation();
        result = result * PRIME + ($explanation == null ? 43 : $explanation.hashCode());
        result = result * PRIME + java.util.Arrays.deepHashCode(this.getExplanationEntities());
        final Object $openPeriod = this.getOpenPeriod();
        result = result * PRIME + ($openPeriod == null ? 43 : $openPeriod.hashCode());
        final Object $closeDate = this.getCloseDate();
        result = result * PRIME + ($closeDate == null ? 43 : $closeDate.hashCode());
        return result;
    }

    public String toString() {
        return "Poll(id=" + this.getId() + ", question=" + this.getQuestion() + ", options=" + java.util.Arrays.deepToString(this.getOptions()) + ", totalVoterCount=" + this.getTotalVoterCount() + ", isClosed=" + this.getIsClosed() + ", isAnonymous=" + this.getIsAnonymous() + ", type=" + this.getType() + ", allowsMultipleAnswers=" + this.getAllowsMultipleAnswers() + ", correctOptionId=" + this.getCorrectOptionId() + ", explanation=" + this.getExplanation() + ", explanationEntities=" + java.util.Arrays.deepToString(this.getExplanationEntities()) + ", openPeriod=" + this.getOpenPeriod() + ", closeDate=" + this.getCloseDate() + ")";
    }

    public static class PollBuilder {
        private String id;
        private String question;
        private PollOption[] options;
        private Integer totalVoterCount;
        private Boolean isClosed;
        private Boolean isAnonymous;
        private String type;
        private Boolean allowsMultipleAnswers;
        private Integer correctOptionId;
        private String explanation;
        private MessageEntity[] explanationEntities;
        private Integer openPeriod;
        private Integer closeDate;

        PollBuilder() {
        }

        @JsonProperty("id")
        public PollBuilder id(String id) {
            this.id = id;
            return this;
        }

        @JsonProperty("question")
        public PollBuilder question(String question) {
            this.question = question;
            return this;
        }

        @JsonProperty("options")
        public PollBuilder options(PollOption[] options) {
            this.options = options;
            return this;
        }

        @JsonProperty("total_voter_count")
        public PollBuilder totalVoterCount(Integer totalVoterCount) {
            this.totalVoterCount = totalVoterCount;
            return this;
        }

        @JsonProperty("is_closed")
        public PollBuilder isClosed(Boolean isClosed) {
            this.isClosed = isClosed;
            return this;
        }

        @JsonProperty("is_anonymous")
        public PollBuilder isAnonymous(Boolean isAnonymous) {
            this.isAnonymous = isAnonymous;
            return this;
        }

        @JsonProperty("type")
        public PollBuilder type(String type) {
            this.type = type;
            return this;
        }

        @JsonProperty("allows_multiple_answers")
        public PollBuilder allowsMultipleAnswers(Boolean allowsMultipleAnswers) {
            this.allowsMultipleAnswers = allowsMultipleAnswers;
            return this;
        }

        @JsonProperty("correct_option_id")
        public PollBuilder correctOptionId(Integer correctOptionId) {
            this.correctOptionId = correctOptionId;
            return this;
        }

        @JsonProperty("explanation")
        public PollBuilder explanation(String explanation) {
            this.explanation = explanation;
            return this;
        }

        @JsonProperty("explanation_entities")
        public PollBuilder explanationEntities(MessageEntity[] explanationEntities) {
            this.explanationEntities = explanationEntities;
            return this;
        }

        @JsonProperty("open_period")
        public PollBuilder openPeriod(Integer openPeriod) {
            this.openPeriod = openPeriod;
            return this;
        }

        @JsonProperty("close_date")
        public PollBuilder closeDate(Integer closeDate) {
            this.closeDate = closeDate;
            return this;
        }

        public Poll build() {
            return new Poll(this.id, this.question, this.options, this.totalVoterCount, this.isClosed, this.isAnonymous, this.type, this.allowsMultipleAnswers, this.correctOptionId, this.explanation, this.explanationEntities, this.openPeriod, this.closeDate);
        }

        public String toString() {
            return "Poll.PollBuilder(id=" + this.id + ", question=" + this.question + ", options=" + java.util.Arrays.deepToString(this.options) + ", totalVoterCount=" + this.totalVoterCount + ", isClosed=" + this.isClosed + ", isAnonymous=" + this.isAnonymous + ", type=" + this.type + ", allowsMultipleAnswers=" + this.allowsMultipleAnswers + ", correctOptionId=" + this.correctOptionId + ", explanation=" + this.explanation + ", explanationEntities=" + java.util.Arrays.deepToString(this.explanationEntities) + ", openPeriod=" + this.openPeriod + ", closeDate=" + this.closeDate + ")";
        }
    }
}
