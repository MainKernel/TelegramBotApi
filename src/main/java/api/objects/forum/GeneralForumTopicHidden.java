package api.objects.forum;

import api.objects.BotApiObject;

public class GeneralForumTopicHidden implements BotApiObject {

    GeneralForumTopicHidden() {
    }

    public static GeneralForumTopicHiddenBuilder builder() {
        return new GeneralForumTopicHiddenBuilder();
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof GeneralForumTopicHidden)) return false;
        final GeneralForumTopicHidden other = (GeneralForumTopicHidden) o;
        if (!other.canEqual((Object) this)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof GeneralForumTopicHidden;
    }

    public int hashCode() {
        int result = 1;
        return result;
    }

    public String toString() {
        return "GeneralForumTopicHidden()";
    }

    public static class GeneralForumTopicHiddenBuilder {
        GeneralForumTopicHiddenBuilder() {
        }

        public GeneralForumTopicHidden build() {
            return new GeneralForumTopicHidden();
        }

        public String toString() {
            return "GeneralForumTopicHidden.GeneralForumTopicHiddenBuilder()";
        }
    }
}
