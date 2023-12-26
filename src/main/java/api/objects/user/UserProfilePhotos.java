package api.objects.user;

import api.objects.BotApiObject;
import api.objects.misc.PhotoSize;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class UserProfilePhotos implements BotApiObject {
    @JsonProperty("total_count")
    private Integer totalCount;

    @JsonProperty("photos")
    private List<List<PhotoSize>> photos;

    UserProfilePhotos(Integer totalCount, List<List<PhotoSize>> photos) {
        this.totalCount = totalCount;
        this.photos = photos;
    }

    public static UserProfilePhotosBuilder builder() {
        return new UserProfilePhotosBuilder();
    }

    public Integer getTotalCount() {
        return this.totalCount;
    }

    public List<List<PhotoSize>> getPhotos() {
        return this.photos;
    }

    @JsonProperty("total_count")
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    @JsonProperty("photos")
    public void setPhotos(List<List<PhotoSize>> photos) {
        this.photos = photos;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof UserProfilePhotos)) return false;
        final UserProfilePhotos other = (UserProfilePhotos) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$totalCount = this.getTotalCount();
        final Object other$totalCount = other.getTotalCount();
        if (this$totalCount == null ? other$totalCount != null : !this$totalCount.equals(other$totalCount))
            return false;
        final Object this$photos = this.getPhotos();
        final Object other$photos = other.getPhotos();
        if (this$photos == null ? other$photos != null : !this$photos.equals(other$photos)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof UserProfilePhotos;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $totalCount = this.getTotalCount();
        result = result * PRIME + ($totalCount == null ? 43 : $totalCount.hashCode());
        final Object $photos = this.getPhotos();
        result = result * PRIME + ($photos == null ? 43 : $photos.hashCode());
        return result;
    }

    public String toString() {
        return "UserProfilePhotos(totalCount=" + this.getTotalCount() + ", photos=" + this.getPhotos() + ")";
    }

    public static class UserProfilePhotosBuilder {
        private Integer totalCount;
        private List<List<PhotoSize>> photos;

        UserProfilePhotosBuilder() {
        }

        @JsonProperty("total_count")
        public UserProfilePhotosBuilder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        @JsonProperty("photos")
        public UserProfilePhotosBuilder photos(List<List<PhotoSize>> photos) {
            this.photos = photos;
            return this;
        }

        public UserProfilePhotos build() {
            return new UserProfilePhotos(this.totalCount, this.photos);
        }

        public String toString() {
            return "UserProfilePhotos.UserProfilePhotosBuilder(totalCount=" + this.totalCount + ", photos=" + this.photos + ")";
        }
    }
}
