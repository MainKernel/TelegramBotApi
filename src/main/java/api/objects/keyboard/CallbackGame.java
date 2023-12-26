package api.objects.keyboard;

public class CallbackGame {
    CallbackGame() {
    }

    public static CallbackGameBuilder builder() {
        return new CallbackGameBuilder();
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof CallbackGame)) return false;
        final CallbackGame other = (CallbackGame) o;
        if (!other.canEqual((Object) this)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof CallbackGame;
    }

    public int hashCode() {
        int result = 1;
        return result;
    }

    public String toString() {
        return "CallbackGame()";
    }

    public static class CallbackGameBuilder {
        CallbackGameBuilder() {
        }

        public CallbackGame build() {
            return new CallbackGame();
        }

        public String toString() {
            return "CallbackGame.CallbackGameBuilder()";
        }
    }
}
