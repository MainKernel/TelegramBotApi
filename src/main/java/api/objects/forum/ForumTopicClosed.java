package api.objects.forum;

import api.objects.BotApiObject;

public class ForumTopicClosed implements BotApiObject {

    ForumTopicClosed() {
    }

    public static ForumTopicClosedBuilder builder() {
        return new ForumTopicClosedBuilder();
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ForumTopicClosed)) return false;
        final ForumTopicClosed other = (ForumTopicClosed) o;
        if (!other.canEqual((Object) this)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ForumTopicClosed;
    }

    public int hashCode() {
        int result = 1;
        return result;
    }

    public String toString() {
        return "ForumTopicClosed()";
    }

    public static class ForumTopicClosedBuilder {
        ForumTopicClosedBuilder() {
        }

        public ForumTopicClosed build() {
            return new ForumTopicClosed();
        }

        public String toString() {
            return "ForumTopicClosed.ForumTopicClosedBuilder()";
        }
    }
}
