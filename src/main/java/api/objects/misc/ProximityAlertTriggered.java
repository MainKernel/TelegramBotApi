package api.objects.misc;

import api.objects.BotApiObject;
import api.objects.user.User;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ProximityAlertTriggered implements BotApiObject {
    @JsonProperty("traveler")
    private User traveler;

    @JsonProperty("watcher")
    private User watcher;

    @JsonProperty("distance")
    private Integer distance;

    ProximityAlertTriggered(User traveler, User watcher, Integer distance) {
        this.traveler = traveler;
        this.watcher = watcher;
        this.distance = distance;
    }

    public static ProximityAlertTriggeredBuilder builder() {
        return new ProximityAlertTriggeredBuilder();
    }

    public User getTraveler() {
        return this.traveler;
    }

    public User getWatcher() {
        return this.watcher;
    }

    public Integer getDistance() {
        return this.distance;
    }

    @JsonProperty("traveler")
    public void setTraveler(User traveler) {
        this.traveler = traveler;
    }

    @JsonProperty("watcher")
    public void setWatcher(User watcher) {
        this.watcher = watcher;
    }

    @JsonProperty("distance")
    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ProximityAlertTriggered)) return false;
        final ProximityAlertTriggered other = (ProximityAlertTriggered) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$traveler = this.getTraveler();
        final Object other$traveler = other.getTraveler();
        if (this$traveler == null ? other$traveler != null : !this$traveler.equals(other$traveler)) return false;
        final Object this$watcher = this.getWatcher();
        final Object other$watcher = other.getWatcher();
        if (this$watcher == null ? other$watcher != null : !this$watcher.equals(other$watcher)) return false;
        final Object this$distance = this.getDistance();
        final Object other$distance = other.getDistance();
        if (this$distance == null ? other$distance != null : !this$distance.equals(other$distance)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ProximityAlertTriggered;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $traveler = this.getTraveler();
        result = result * PRIME + ($traveler == null ? 43 : $traveler.hashCode());
        final Object $watcher = this.getWatcher();
        result = result * PRIME + ($watcher == null ? 43 : $watcher.hashCode());
        final Object $distance = this.getDistance();
        result = result * PRIME + ($distance == null ? 43 : $distance.hashCode());
        return result;
    }

    public String toString() {
        return "ProximityAlertTriggered(traveler=" + this.getTraveler() + ", watcher=" + this.getWatcher() + ", distance=" + this.getDistance() + ")";
    }

    public static class ProximityAlertTriggeredBuilder {
        private User traveler;
        private User watcher;
        private Integer distance;

        ProximityAlertTriggeredBuilder() {
        }

        @JsonProperty("traveler")
        public ProximityAlertTriggeredBuilder traveler(User traveler) {
            this.traveler = traveler;
            return this;
        }

        @JsonProperty("watcher")
        public ProximityAlertTriggeredBuilder watcher(User watcher) {
            this.watcher = watcher;
            return this;
        }

        @JsonProperty("distance")
        public ProximityAlertTriggeredBuilder distance(Integer distance) {
            this.distance = distance;
            return this;
        }

        public ProximityAlertTriggered build() {
            return new ProximityAlertTriggered(this.traveler, this.watcher, this.distance);
        }

        public String toString() {
            return "ProximityAlertTriggered.ProximityAlertTriggeredBuilder(traveler=" + this.traveler + ", watcher=" + this.watcher + ", distance=" + this.distance + ")";
        }
    }
}
