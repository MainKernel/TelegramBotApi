package api.objects.media;

import api.objects.BotApiObject;
import api.objects.user.User;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class VideoChatParticipantsInvited implements BotApiObject {
    @JsonProperty("users")
    private List<User> users;

    VideoChatParticipantsInvited(List<User> users) {
        this.users = users;
    }

    public static VideoChatParticipantsInvitedBuilder builder() {
        return new VideoChatParticipantsInvitedBuilder();
    }

    public List<User> getUsers() {
        return this.users;
    }

    @JsonProperty("users")
    public void setUsers(List<User> users) {
        this.users = users;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof VideoChatParticipantsInvited)) return false;
        final VideoChatParticipantsInvited other = (VideoChatParticipantsInvited) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$users = this.getUsers();
        final Object other$users = other.getUsers();
        if (this$users == null ? other$users != null : !this$users.equals(other$users)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof VideoChatParticipantsInvited;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $users = this.getUsers();
        result = result * PRIME + ($users == null ? 43 : $users.hashCode());
        return result;
    }

    public String toString() {
        return "VideoChatParticipantsInvited(users=" + this.getUsers() + ")";
    }

    public static class VideoChatParticipantsInvitedBuilder {
        private List<User> users;

        VideoChatParticipantsInvitedBuilder() {
        }

        @JsonProperty("users")
        public VideoChatParticipantsInvitedBuilder users(List<User> users) {
            this.users = users;
            return this;
        }

        public VideoChatParticipantsInvited build() {
            return new VideoChatParticipantsInvited(this.users);
        }

        public String toString() {
            return "VideoChatParticipantsInvited.VideoChatParticipantsInvitedBuilder(users=" + this.users + ")";
        }
    }
}
