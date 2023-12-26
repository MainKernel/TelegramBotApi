package api.objects.forum;

import api.objects.BotApiObject;

public class GeneralForumTopicUnhidden implements BotApiObject {

    GeneralForumTopicUnhidden() {
    }

    public static GeneralForumTopicUnhiddenBuilder builder() {
        return new GeneralForumTopicUnhiddenBuilder();
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof GeneralForumTopicUnhidden)) return false;
        final GeneralForumTopicUnhidden other = (GeneralForumTopicUnhidden) o;
        if (!other.canEqual((Object) this)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof GeneralForumTopicUnhidden;
    }

    public int hashCode() {
        int result = 1;
        return result;
    }

    public String toString() {
        return "GeneralForumTopicUnhidden()";
    }

    public static class GeneralForumTopicUnhiddenBuilder {
        GeneralForumTopicUnhiddenBuilder() {
        }

        public GeneralForumTopicUnhidden build() {
            return new GeneralForumTopicUnhidden();
        }

        public String toString() {
            return "GeneralForumTopicUnhidden.GeneralForumTopicUnhiddenBuilder()";
        }
    }
}
