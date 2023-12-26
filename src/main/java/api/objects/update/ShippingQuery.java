package api.objects.update;

public class ShippingQuery {
    ShippingQuery() {
    }

    public static ShippingQueryBuilder builder() {
        return new ShippingQueryBuilder();
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ShippingQuery)) return false;
        final ShippingQuery other = (ShippingQuery) o;
        if (!other.canEqual((Object) this)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ShippingQuery;
    }

    public int hashCode() {
        int result = 1;
        return result;
    }

    public String toString() {
        return "ShippingQuery()";
    }

    public static class ShippingQueryBuilder {
        ShippingQueryBuilder() {
        }

        public ShippingQuery build() {
            return new ShippingQuery();
        }

        public String toString() {
            return "ShippingQuery.ShippingQueryBuilder()";
        }
    }
}
