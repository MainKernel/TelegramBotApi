package api.objects.misc;

import api.objects.BotApiObject;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Location implements BotApiObject {
    @JsonProperty("longitude")
    private Float longitude;

    @JsonProperty("latitude")
    private Float latitude;

    @JsonProperty("horizontal_accuracy")
    private Float horizontalAccuracy;

    @JsonProperty("live_period")
    private Integer livePeriod;

    @JsonProperty("heading")
    private Integer heading;

    @JsonProperty("proximity_alert_radius")
    private Integer proximityAlertRadius;

    Location(Float longitude, Float latitude, Float horizontalAccuracy, Integer livePeriod, Integer heading, Integer proximityAlertRadius) {
        this.longitude = longitude;
        this.latitude = latitude;
        this.horizontalAccuracy = horizontalAccuracy;
        this.livePeriod = livePeriod;
        this.heading = heading;
        this.proximityAlertRadius = proximityAlertRadius;
    }

    public static LocationBuilder builder() {
        return new LocationBuilder();
    }

    public Float getLongitude() {
        return this.longitude;
    }

    public Float getLatitude() {
        return this.latitude;
    }

    public Float getHorizontalAccuracy() {
        return this.horizontalAccuracy;
    }

    public Integer getLivePeriod() {
        return this.livePeriod;
    }

    public Integer getHeading() {
        return this.heading;
    }

    public Integer getProximityAlertRadius() {
        return this.proximityAlertRadius;
    }

    @JsonProperty("longitude")
    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    @JsonProperty("latitude")
    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    @JsonProperty("horizontal_accuracy")
    public void setHorizontalAccuracy(Float horizontalAccuracy) {
        this.horizontalAccuracy = horizontalAccuracy;
    }

    @JsonProperty("live_period")
    public void setLivePeriod(Integer livePeriod) {
        this.livePeriod = livePeriod;
    }

    @JsonProperty("heading")
    public void setHeading(Integer heading) {
        this.heading = heading;
    }

    @JsonProperty("proximity_alert_radius")
    public void setProximityAlertRadius(Integer proximityAlertRadius) {
        this.proximityAlertRadius = proximityAlertRadius;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Location)) return false;
        final Location other = (Location) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$longitude = this.getLongitude();
        final Object other$longitude = other.getLongitude();
        if (this$longitude == null ? other$longitude != null : !this$longitude.equals(other$longitude)) return false;
        final Object this$latitude = this.getLatitude();
        final Object other$latitude = other.getLatitude();
        if (this$latitude == null ? other$latitude != null : !this$latitude.equals(other$latitude)) return false;
        final Object this$horizontalAccuracy = this.getHorizontalAccuracy();
        final Object other$horizontalAccuracy = other.getHorizontalAccuracy();
        if (this$horizontalAccuracy == null ? other$horizontalAccuracy != null : !this$horizontalAccuracy.equals(other$horizontalAccuracy))
            return false;
        final Object this$livePeriod = this.getLivePeriod();
        final Object other$livePeriod = other.getLivePeriod();
        if (this$livePeriod == null ? other$livePeriod != null : !this$livePeriod.equals(other$livePeriod))
            return false;
        final Object this$heading = this.getHeading();
        final Object other$heading = other.getHeading();
        if (this$heading == null ? other$heading != null : !this$heading.equals(other$heading)) return false;
        final Object this$proximityAlertRadius = this.getProximityAlertRadius();
        final Object other$proximityAlertRadius = other.getProximityAlertRadius();
        if (this$proximityAlertRadius == null ? other$proximityAlertRadius != null : !this$proximityAlertRadius.equals(other$proximityAlertRadius))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Location;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $longitude = this.getLongitude();
        result = result * PRIME + ($longitude == null ? 43 : $longitude.hashCode());
        final Object $latitude = this.getLatitude();
        result = result * PRIME + ($latitude == null ? 43 : $latitude.hashCode());
        final Object $horizontalAccuracy = this.getHorizontalAccuracy();
        result = result * PRIME + ($horizontalAccuracy == null ? 43 : $horizontalAccuracy.hashCode());
        final Object $livePeriod = this.getLivePeriod();
        result = result * PRIME + ($livePeriod == null ? 43 : $livePeriod.hashCode());
        final Object $heading = this.getHeading();
        result = result * PRIME + ($heading == null ? 43 : $heading.hashCode());
        final Object $proximityAlertRadius = this.getProximityAlertRadius();
        result = result * PRIME + ($proximityAlertRadius == null ? 43 : $proximityAlertRadius.hashCode());
        return result;
    }

    public String toString() {
        return "Location(longitude=" + this.getLongitude() + ", latitude=" + this.getLatitude() + ", horizontalAccuracy=" + this.getHorizontalAccuracy() + ", livePeriod=" + this.getLivePeriod() + ", heading=" + this.getHeading() + ", proximityAlertRadius=" + this.getProximityAlertRadius() + ")";
    }

    public static class LocationBuilder {
        private Float longitude;
        private Float latitude;
        private Float horizontalAccuracy;
        private Integer livePeriod;
        private Integer heading;
        private Integer proximityAlertRadius;

        LocationBuilder() {
        }

        @JsonProperty("longitude")
        public LocationBuilder longitude(Float longitude) {
            this.longitude = longitude;
            return this;
        }

        @JsonProperty("latitude")
        public LocationBuilder latitude(Float latitude) {
            this.latitude = latitude;
            return this;
        }

        @JsonProperty("horizontal_accuracy")
        public LocationBuilder horizontalAccuracy(Float horizontalAccuracy) {
            this.horizontalAccuracy = horizontalAccuracy;
            return this;
        }

        @JsonProperty("live_period")
        public LocationBuilder livePeriod(Integer livePeriod) {
            this.livePeriod = livePeriod;
            return this;
        }

        @JsonProperty("heading")
        public LocationBuilder heading(Integer heading) {
            this.heading = heading;
            return this;
        }

        @JsonProperty("proximity_alert_radius")
        public LocationBuilder proximityAlertRadius(Integer proximityAlertRadius) {
            this.proximityAlertRadius = proximityAlertRadius;
            return this;
        }

        public Location build() {
            return new Location(this.longitude, this.latitude, this.horizontalAccuracy, this.livePeriod, this.heading, this.proximityAlertRadius);
        }

        public String toString() {
            return "Location.LocationBuilder(longitude=" + this.longitude + ", latitude=" + this.latitude + ", horizontalAccuracy=" + this.horizontalAccuracy + ", livePeriod=" + this.livePeriod + ", heading=" + this.heading + ", proximityAlertRadius=" + this.proximityAlertRadius + ")";
        }
    }
}
