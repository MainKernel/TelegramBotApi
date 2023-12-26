package api.objects.misc;

import api.objects.BotApiObject;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Venue implements BotApiObject {
    @JsonProperty("location")
    private Location location;

    @JsonProperty("title")
    private String title;

    @JsonProperty("address")
    private String address;

    @JsonProperty("foursquare_id")
    private String foursquareId;

    @JsonProperty("foursquare_type")
    private String foursquareType;

    @JsonProperty("google_place_id")
    private String googlePlaceId;

    @JsonProperty("google_place_type")
    private String googlePlaceType;

    Venue(Location location, String title, String address, String foursquareId, String foursquareType, String googlePlaceId, String googlePlaceType) {
        this.location = location;
        this.title = title;
        this.address = address;
        this.foursquareId = foursquareId;
        this.foursquareType = foursquareType;
        this.googlePlaceId = googlePlaceId;
        this.googlePlaceType = googlePlaceType;
    }

    public static VenueBuilder builder() {
        return new VenueBuilder();
    }

    public Location getLocation() {
        return this.location;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAddress() {
        return this.address;
    }

    public String getFoursquareId() {
        return this.foursquareId;
    }

    public String getFoursquareType() {
        return this.foursquareType;
    }

    public String getGooglePlaceId() {
        return this.googlePlaceId;
    }

    public String getGooglePlaceType() {
        return this.googlePlaceType;
    }

    @JsonProperty("location")
    public void setLocation(Location location) {
        this.location = location;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("address")
    public void setAddress(String address) {
        this.address = address;
    }

    @JsonProperty("foursquare_id")
    public void setFoursquareId(String foursquareId) {
        this.foursquareId = foursquareId;
    }

    @JsonProperty("foursquare_type")
    public void setFoursquareType(String foursquareType) {
        this.foursquareType = foursquareType;
    }

    @JsonProperty("google_place_id")
    public void setGooglePlaceId(String googlePlaceId) {
        this.googlePlaceId = googlePlaceId;
    }

    @JsonProperty("google_place_type")
    public void setGooglePlaceType(String googlePlaceType) {
        this.googlePlaceType = googlePlaceType;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Venue)) return false;
        final Venue other = (Venue) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$location = this.getLocation();
        final Object other$location = other.getLocation();
        if (this$location == null ? other$location != null : !this$location.equals(other$location)) return false;
        final Object this$title = this.getTitle();
        final Object other$title = other.getTitle();
        if (this$title == null ? other$title != null : !this$title.equals(other$title)) return false;
        final Object this$address = this.getAddress();
        final Object other$address = other.getAddress();
        if (this$address == null ? other$address != null : !this$address.equals(other$address)) return false;
        final Object this$foursquareId = this.getFoursquareId();
        final Object other$foursquareId = other.getFoursquareId();
        if (this$foursquareId == null ? other$foursquareId != null : !this$foursquareId.equals(other$foursquareId))
            return false;
        final Object this$foursquareType = this.getFoursquareType();
        final Object other$foursquareType = other.getFoursquareType();
        if (this$foursquareType == null ? other$foursquareType != null : !this$foursquareType.equals(other$foursquareType))
            return false;
        final Object this$googlePlaceId = this.getGooglePlaceId();
        final Object other$googlePlaceId = other.getGooglePlaceId();
        if (this$googlePlaceId == null ? other$googlePlaceId != null : !this$googlePlaceId.equals(other$googlePlaceId))
            return false;
        final Object this$googlePlaceType = this.getGooglePlaceType();
        final Object other$googlePlaceType = other.getGooglePlaceType();
        if (this$googlePlaceType == null ? other$googlePlaceType != null : !this$googlePlaceType.equals(other$googlePlaceType))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Venue;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $location = this.getLocation();
        result = result * PRIME + ($location == null ? 43 : $location.hashCode());
        final Object $title = this.getTitle();
        result = result * PRIME + ($title == null ? 43 : $title.hashCode());
        final Object $address = this.getAddress();
        result = result * PRIME + ($address == null ? 43 : $address.hashCode());
        final Object $foursquareId = this.getFoursquareId();
        result = result * PRIME + ($foursquareId == null ? 43 : $foursquareId.hashCode());
        final Object $foursquareType = this.getFoursquareType();
        result = result * PRIME + ($foursquareType == null ? 43 : $foursquareType.hashCode());
        final Object $googlePlaceId = this.getGooglePlaceId();
        result = result * PRIME + ($googlePlaceId == null ? 43 : $googlePlaceId.hashCode());
        final Object $googlePlaceType = this.getGooglePlaceType();
        result = result * PRIME + ($googlePlaceType == null ? 43 : $googlePlaceType.hashCode());
        return result;
    }

    public String toString() {
        return "Venue(location=" + this.getLocation() + ", title=" + this.getTitle() + ", address=" + this.getAddress() + ", foursquareId=" + this.getFoursquareId() + ", foursquareType=" + this.getFoursquareType() + ", googlePlaceId=" + this.getGooglePlaceId() + ", googlePlaceType=" + this.getGooglePlaceType() + ")";
    }

    public static class VenueBuilder {
        private Location location;
        private String title;
        private String address;
        private String foursquareId;
        private String foursquareType;
        private String googlePlaceId;
        private String googlePlaceType;

        VenueBuilder() {
        }

        @JsonProperty("location")
        public VenueBuilder location(Location location) {
            this.location = location;
            return this;
        }

        @JsonProperty("title")
        public VenueBuilder title(String title) {
            this.title = title;
            return this;
        }

        @JsonProperty("address")
        public VenueBuilder address(String address) {
            this.address = address;
            return this;
        }

        @JsonProperty("foursquare_id")
        public VenueBuilder foursquareId(String foursquareId) {
            this.foursquareId = foursquareId;
            return this;
        }

        @JsonProperty("foursquare_type")
        public VenueBuilder foursquareType(String foursquareType) {
            this.foursquareType = foursquareType;
            return this;
        }

        @JsonProperty("google_place_id")
        public VenueBuilder googlePlaceId(String googlePlaceId) {
            this.googlePlaceId = googlePlaceId;
            return this;
        }

        @JsonProperty("google_place_type")
        public VenueBuilder googlePlaceType(String googlePlaceType) {
            this.googlePlaceType = googlePlaceType;
            return this;
        }

        public Venue build() {
            return new Venue(this.location, this.title, this.address, this.foursquareId, this.foursquareType, this.googlePlaceId, this.googlePlaceType);
        }

        public String toString() {
            return "Venue.VenueBuilder(location=" + this.location + ", title=" + this.title + ", address=" + this.address + ", foursquareId=" + this.foursquareId + ", foursquareType=" + this.foursquareType + ", googlePlaceId=" + this.googlePlaceId + ", googlePlaceType=" + this.googlePlaceType + ")";
        }
    }
}
