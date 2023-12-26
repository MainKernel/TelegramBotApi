package api.objects.media;

import api.objects.BotApiObject;
import com.fasterxml.jackson.annotation.JsonProperty;

public class VideoChatScheduled implements BotApiObject {
    @JsonProperty("start_date")
    private Integer startDate;

    VideoChatScheduled(Integer startDate) {
        this.startDate = startDate;
    }

    public static VideoChatScheduledBuilder builder() {
        return new VideoChatScheduledBuilder();
    }

    public Integer getStartDate() {
        return this.startDate;
    }

    @JsonProperty("start_date")
    public void setStartDate(Integer startDate) {
        this.startDate = startDate;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof VideoChatScheduled)) return false;
        final VideoChatScheduled other = (VideoChatScheduled) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$startDate = this.getStartDate();
        final Object other$startDate = other.getStartDate();
        if (this$startDate == null ? other$startDate != null : !this$startDate.equals(other$startDate)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof VideoChatScheduled;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $startDate = this.getStartDate();
        result = result * PRIME + ($startDate == null ? 43 : $startDate.hashCode());
        return result;
    }

    public String toString() {
        return "VideoChatScheduled(startDate=" + this.getStartDate() + ")";
    }

    public static class VideoChatScheduledBuilder {
        private Integer startDate;

        VideoChatScheduledBuilder() {
        }

        @JsonProperty("start_date")
        public VideoChatScheduledBuilder startDate(Integer startDate) {
            this.startDate = startDate;
            return this;
        }

        public VideoChatScheduled build() {
            return new VideoChatScheduled(this.startDate);
        }

        public String toString() {
            return "VideoChatScheduled.VideoChatScheduledBuilder(startDate=" + this.startDate + ")";
        }
    }
}
