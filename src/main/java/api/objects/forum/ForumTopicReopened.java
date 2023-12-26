package api.objects.forum;

import api.objects.BotApiObject;

public class ForumTopicReopened implements BotApiObject {

    ForumTopicReopened() {
    }

    public static ForumTopicReopenedBuilder builder() {
        return new ForumTopicReopenedBuilder();
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ForumTopicReopened)) return false;
        final ForumTopicReopened other = (ForumTopicReopened) o;
        if (!other.canEqual((Object) this)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ForumTopicReopened;
    }

    public int hashCode() {
        int result = 1;
        return result;
    }

    public String toString() {
        return "ForumTopicReopened()";
    }

    public static class ForumTopicReopenedBuilder {
        ForumTopicReopenedBuilder() {
        }

        public ForumTopicReopened build() {
            return new ForumTopicReopened();
        }

        public String toString() {
            return "ForumTopicReopened.ForumTopicReopenedBuilder()";
        }
    }
}
