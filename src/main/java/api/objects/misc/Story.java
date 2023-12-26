package api.objects.misc;

import api.objects.BotApiObject;

public class Story implements BotApiObject {
    Story() {
    }

    public static StoryBuilder builder() {
        return new StoryBuilder();
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Story)) return false;
        final Story other = (Story) o;
        if (!other.canEqual((Object) this)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Story;
    }

    public int hashCode() {
        int result = 1;
        return result;
    }

    public String toString() {
        return "Story()";
    }

    public static class StoryBuilder {
        StoryBuilder() {
        }

        public Story build() {
            return new Story();
        }

        public String toString() {
            return "Story.StoryBuilder()";
        }
    }
}
