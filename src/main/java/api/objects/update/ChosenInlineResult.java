package api.objects.update;

public class ChosenInlineResult {
    ChosenInlineResult() {
    }

    public static ChosenInlineResultBuilder builder() {
        return new ChosenInlineResultBuilder();
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ChosenInlineResult)) return false;
        final ChosenInlineResult other = (ChosenInlineResult) o;
        if (!other.canEqual((Object) this)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ChosenInlineResult;
    }

    public int hashCode() {
        int result = 1;
        return result;
    }

    public String toString() {
        return "ChosenInlineResult()";
    }

    public static class ChosenInlineResultBuilder {
        ChosenInlineResultBuilder() {
        }

        public ChosenInlineResult build() {
            return new ChosenInlineResult();
        }

        public String toString() {
            return "ChosenInlineResult.ChosenInlineResultBuilder()";
        }
    }
}
