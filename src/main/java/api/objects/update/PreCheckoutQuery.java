package api.objects.update;

public class PreCheckoutQuery {
    PreCheckoutQuery() {
    }

    public static PreCheckoutQueryBuilder builder() {
        return new PreCheckoutQueryBuilder();
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof PreCheckoutQuery)) return false;
        final PreCheckoutQuery other = (PreCheckoutQuery) o;
        if (!other.canEqual((Object) this)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof PreCheckoutQuery;
    }

    public int hashCode() {
        int result = 1;
        return result;
    }

    public String toString() {
        return "PreCheckoutQuery()";
    }

    public static class PreCheckoutQueryBuilder {
        PreCheckoutQueryBuilder() {
        }

        public PreCheckoutQuery build() {
            return new PreCheckoutQuery();
        }

        public String toString() {
            return "PreCheckoutQuery.PreCheckoutQueryBuilder()";
        }
    }
}
