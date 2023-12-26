package api.objects.data;

import com.fasterxml.jackson.annotation.JsonProperty;

public class From {
    private int id;
    @JsonProperty("is_bot")
    private boolean isBot;
    @JsonProperty("first_name")
    private String firstName;
    private String username;
    @JsonProperty("language_code")
    private String languageCode;

    From(int id, boolean isBot, String firstName, String username, String languageCode) {
        this.id = id;
        this.isBot = isBot;
        this.firstName = firstName;
        this.username = username;
        this.languageCode = languageCode;
    }

    public static FromBuilder builder() {
        return new FromBuilder();
    }

    public int getId() {
        return this.id;
    }

    public boolean isBot() {
        return this.isBot;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getUsername() {
        return this.username;
    }

    public String getLanguageCode() {
        return this.languageCode;
    }

    public void setId(int id) {
        this.id = id;
    }

    @JsonProperty("is_bot")
    public void setBot(boolean isBot) {
        this.isBot = isBot;
    }

    @JsonProperty("first_name")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @JsonProperty("language_code")
    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof From)) return false;
        final From other = (From) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getId() != other.getId()) return false;
        if (this.isBot() != other.isBot()) return false;
        final Object this$firstName = this.getFirstName();
        final Object other$firstName = other.getFirstName();
        if (this$firstName == null ? other$firstName != null : !this$firstName.equals(other$firstName)) return false;
        final Object this$username = this.getUsername();
        final Object other$username = other.getUsername();
        if (this$username == null ? other$username != null : !this$username.equals(other$username)) return false;
        final Object this$languageCode = this.getLanguageCode();
        final Object other$languageCode = other.getLanguageCode();
        if (this$languageCode == null ? other$languageCode != null : !this$languageCode.equals(other$languageCode))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof From;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + this.getId();
        result = result * PRIME + (this.isBot() ? 79 : 97);
        final Object $firstName = this.getFirstName();
        result = result * PRIME + ($firstName == null ? 43 : $firstName.hashCode());
        final Object $username = this.getUsername();
        result = result * PRIME + ($username == null ? 43 : $username.hashCode());
        final Object $languageCode = this.getLanguageCode();
        result = result * PRIME + ($languageCode == null ? 43 : $languageCode.hashCode());
        return result;
    }

    public String toString() {
        return "From(id=" + this.getId() + ", isBot=" + this.isBot() + ", firstName=" + this.getFirstName() + ", username=" + this.getUsername() + ", languageCode=" + this.getLanguageCode() + ")";
    }

    public static class FromBuilder {
        private int id;
        private boolean isBot;
        private String firstName;
        private String username;
        private String languageCode;

        FromBuilder() {
        }

        public FromBuilder id(int id) {
            this.id = id;
            return this;
        }

        @JsonProperty("is_bot")
        public FromBuilder isBot(boolean isBot) {
            this.isBot = isBot;
            return this;
        }

        @JsonProperty("first_name")
        public FromBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public FromBuilder username(String username) {
            this.username = username;
            return this;
        }

        @JsonProperty("language_code")
        public FromBuilder languageCode(String languageCode) {
            this.languageCode = languageCode;
            return this;
        }

        public From build() {
            return new From(this.id, this.isBot, this.firstName, this.username, this.languageCode);
        }

        public String toString() {
            return "From.FromBuilder(id=" + this.id + ", isBot=" + this.isBot + ", firstName=" + this.firstName + ", username=" + this.username + ", languageCode=" + this.languageCode + ")";
        }
    }
}
