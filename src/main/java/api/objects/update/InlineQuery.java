package api.objects.update;

public class InlineQuery {
    InlineQuery() {
    }

    public static InlineQueryBuilder builder() {
        return new InlineQueryBuilder();
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof InlineQuery)) return false;
        final InlineQuery other = (InlineQuery) o;
        if (!other.canEqual((Object) this)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof InlineQuery;
    }

    public int hashCode() {
        int result = 1;
        return result;
    }

    public String toString() {
        return "InlineQuery()";
    }

    public static class InlineQueryBuilder {
        InlineQueryBuilder() {
        }

        public InlineQuery build() {
            return new InlineQuery();
        }

        public String toString() {
            return "InlineQuery.InlineQueryBuilder()";
        }
    }
}
