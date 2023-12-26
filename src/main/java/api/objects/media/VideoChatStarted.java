package api.objects.media;

import api.objects.BotApiObject;

public class VideoChatStarted implements BotApiObject {

    VideoChatStarted() {
    }

    public static VideoChatStartedBuilder builder() {
        return new VideoChatStartedBuilder();
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof VideoChatStarted)) return false;
        final VideoChatStarted other = (VideoChatStarted) o;
        if (!other.canEqual((Object) this)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof VideoChatStarted;
    }

    public int hashCode() {
        int result = 1;
        return result;
    }

    public String toString() {
        return "VideoChatStarted()";
    }

    public static class VideoChatStartedBuilder {
        VideoChatStartedBuilder() {
        }

        public VideoChatStarted build() {
            return new VideoChatStarted();
        }

        public String toString() {
            return "VideoChatStarted.VideoChatStartedBuilder()";
        }
    }
}
