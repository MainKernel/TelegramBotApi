package api.objects.media;

import api.objects.BotApiObject;
import com.fasterxml.jackson.annotation.JsonProperty;

public class VideoChatEnded implements BotApiObject {
    @JsonProperty("start_date")
    private Integer startDate;

    @JsonProperty("duration")
    private Integer duration;

    VideoChatEnded(Integer startDate, Integer duration) {
        this.startDate = startDate;
        this.duration = duration;
    }

    public static VideoChatEndedBuilder builder() {
        return new VideoChatEndedBuilder();
    }

    public Integer getStartDate() {
        return this.startDate;
    }

    public Integer getDuration() {
        return this.duration;
    }

    @JsonProperty("start_date")
    public void setStartDate(Integer startDate) {
        this.startDate = startDate;
    }

    @JsonProperty("duration")
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof VideoChatEnded)) return false;
        final VideoChatEnded other = (VideoChatEnded) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$startDate = this.getStartDate();
        final Object other$startDate = other.getStartDate();
        if (this$startDate == null ? other$startDate != null : !this$startDate.equals(other$startDate)) return false;
        final Object this$duration = this.getDuration();
        final Object other$duration = other.getDuration();
        if (this$duration == null ? other$duration != null : !this$duration.equals(other$duration)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof VideoChatEnded;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $startDate = this.getStartDate();
        result = result * PRIME + ($startDate == null ? 43 : $startDate.hashCode());
        final Object $duration = this.getDuration();
        result = result * PRIME + ($duration == null ? 43 : $duration.hashCode());
        return result;
    }

    public String toString() {
        return "VideoChatEnded(startDate=" + this.getStartDate() + ", duration=" + this.getDuration() + ")";
    }

    public static class VideoChatEndedBuilder {
        private Integer startDate;
        private Integer duration;

        VideoChatEndedBuilder() {
        }

        @JsonProperty("start_date")
        public VideoChatEndedBuilder startDate(Integer startDate) {
            this.startDate = startDate;
            return this;
        }

        @JsonProperty("duration")
        public VideoChatEndedBuilder duration(Integer duration) {
            this.duration = duration;
            return this;
        }

        public VideoChatEnded build() {
            return new VideoChatEnded(this.startDate, this.duration);
        }

        public String toString() {
            return "VideoChatEnded.VideoChatEndedBuilder(startDate=" + this.startDate + ", duration=" + this.duration + ")";
        }
    }
}
