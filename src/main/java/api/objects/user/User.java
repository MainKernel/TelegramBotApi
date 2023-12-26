package api.objects.user;


import api.objects.BotApiObject;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class User implements BotApiObject {
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("is_bot")
    private Boolean isBot;
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("last_name")
    private String lastName;
    @JsonProperty("username")
    private String username;
    @JsonProperty("language_code")
    private String languageCode;
    @JsonProperty("is_premium")
    private Boolean isPremium;
    @JsonProperty("added_to_attachment_menu")
    private Boolean addedToAttachmentMenu;
    @JsonProperty("can_join_groups")
    private Boolean canJoinGroups;
    @JsonProperty("can_read_all_group_messages")
    private Boolean canReadAllGroupMessages;
    @JsonProperty("supports_inline_queries")
    private Boolean supportsInlineQueries;

    public User(Integer id, Boolean isBot, String firstName, String lastName, String username, String languageCode, Boolean isPremium, Boolean addedToAttachmentMenu, Boolean canJoinGroups, Boolean canReadAllGroupMessages, Boolean supportsInlineQueries) {
        this.id = id;
        this.isBot = isBot;
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.languageCode = languageCode;
        this.isPremium = isPremium;
        this.addedToAttachmentMenu = addedToAttachmentMenu;
        this.canJoinGroups = canJoinGroups;
        this.canReadAllGroupMessages = canReadAllGroupMessages;
        this.supportsInlineQueries = supportsInlineQueries;
    }

    public User() {

    }

    public static UserBuilder builder() {
        return new UserBuilder();
    }

    public Integer getId() {
        return this.id;
    }

    public Boolean getIsBot() {
        return this.isBot;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getUsername() {
        return this.username;
    }

    public String getLanguageCode() {
        return this.languageCode;
    }

    public Boolean getIsPremium() {
        return this.isPremium;
    }

    public Boolean getAddedToAttachmentMenu() {
        return this.addedToAttachmentMenu;
    }

    public Boolean getCanJoinGroups() {
        return this.canJoinGroups;
    }

    public Boolean getCanReadAllGroupMessages() {
        return this.canReadAllGroupMessages;
    }

    public Boolean getSupportsInlineQueries() {
        return this.supportsInlineQueries;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("is_bot")
    public void setIsBot(Boolean isBot) {
        this.isBot = isBot;
    }

    @JsonProperty("first_name")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @JsonProperty("last_name")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @JsonProperty("username")
    public void setUsername(String username) {
        this.username = username;
    }

    @JsonProperty("language_code")
    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    @JsonProperty("is_premium")
    public void setIsPremium(Boolean isPremium) {
        this.isPremium = isPremium;
    }

    @JsonProperty("added_to_attachment_menu")
    public void setAddedToAttachmentMenu(Boolean addedToAttachmentMenu) {
        this.addedToAttachmentMenu = addedToAttachmentMenu;
    }

    @JsonProperty("can_join_groups")
    public void setCanJoinGroups(Boolean canJoinGroups) {
        this.canJoinGroups = canJoinGroups;
    }

    @JsonProperty("can_read_all_group_messages")
    public void setCanReadAllGroupMessages(Boolean canReadAllGroupMessages) {
        this.canReadAllGroupMessages = canReadAllGroupMessages;
    }

    @JsonProperty("supports_inline_queries")
    public void setSupportsInlineQueries(Boolean supportsInlineQueries) {
        this.supportsInlineQueries = supportsInlineQueries;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof User)) return false;
        final User other = (User) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$isBot = this.getIsBot();
        final Object other$isBot = other.getIsBot();
        if (this$isBot == null ? other$isBot != null : !this$isBot.equals(other$isBot)) return false;
        final Object this$firstName = this.getFirstName();
        final Object other$firstName = other.getFirstName();
        if (this$firstName == null ? other$firstName != null : !this$firstName.equals(other$firstName)) return false;
        final Object this$lastName = this.getLastName();
        final Object other$lastName = other.getLastName();
        if (this$lastName == null ? other$lastName != null : !this$lastName.equals(other$lastName)) return false;
        final Object this$username = this.getUsername();
        final Object other$username = other.getUsername();
        if (this$username == null ? other$username != null : !this$username.equals(other$username)) return false;
        final Object this$languageCode = this.getLanguageCode();
        final Object other$languageCode = other.getLanguageCode();
        if (this$languageCode == null ? other$languageCode != null : !this$languageCode.equals(other$languageCode))
            return false;
        final Object this$isPremium = this.getIsPremium();
        final Object other$isPremium = other.getIsPremium();
        if (this$isPremium == null ? other$isPremium != null : !this$isPremium.equals(other$isPremium)) return false;
        final Object this$addedToAttachmentMenu = this.getAddedToAttachmentMenu();
        final Object other$addedToAttachmentMenu = other.getAddedToAttachmentMenu();
        if (this$addedToAttachmentMenu == null ? other$addedToAttachmentMenu != null : !this$addedToAttachmentMenu.equals(other$addedToAttachmentMenu))
            return false;
        final Object this$canJoinGroups = this.getCanJoinGroups();
        final Object other$canJoinGroups = other.getCanJoinGroups();
        if (this$canJoinGroups == null ? other$canJoinGroups != null : !this$canJoinGroups.equals(other$canJoinGroups))
            return false;
        final Object this$canReadAllGroupMessages = this.getCanReadAllGroupMessages();
        final Object other$canReadAllGroupMessages = other.getCanReadAllGroupMessages();
        if (this$canReadAllGroupMessages == null ? other$canReadAllGroupMessages != null : !this$canReadAllGroupMessages.equals(other$canReadAllGroupMessages))
            return false;
        final Object this$supportsInlineQueries = this.getSupportsInlineQueries();
        final Object other$supportsInlineQueries = other.getSupportsInlineQueries();
        if (this$supportsInlineQueries == null ? other$supportsInlineQueries != null : !this$supportsInlineQueries.equals(other$supportsInlineQueries))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof User;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $isBot = this.getIsBot();
        result = result * PRIME + ($isBot == null ? 43 : $isBot.hashCode());
        final Object $firstName = this.getFirstName();
        result = result * PRIME + ($firstName == null ? 43 : $firstName.hashCode());
        final Object $lastName = this.getLastName();
        result = result * PRIME + ($lastName == null ? 43 : $lastName.hashCode());
        final Object $username = this.getUsername();
        result = result * PRIME + ($username == null ? 43 : $username.hashCode());
        final Object $languageCode = this.getLanguageCode();
        result = result * PRIME + ($languageCode == null ? 43 : $languageCode.hashCode());
        final Object $isPremium = this.getIsPremium();
        result = result * PRIME + ($isPremium == null ? 43 : $isPremium.hashCode());
        final Object $addedToAttachmentMenu = this.getAddedToAttachmentMenu();
        result = result * PRIME + ($addedToAttachmentMenu == null ? 43 : $addedToAttachmentMenu.hashCode());
        final Object $canJoinGroups = this.getCanJoinGroups();
        result = result * PRIME + ($canJoinGroups == null ? 43 : $canJoinGroups.hashCode());
        final Object $canReadAllGroupMessages = this.getCanReadAllGroupMessages();
        result = result * PRIME + ($canReadAllGroupMessages == null ? 43 : $canReadAllGroupMessages.hashCode());
        final Object $supportsInlineQueries = this.getSupportsInlineQueries();
        result = result * PRIME + ($supportsInlineQueries == null ? 43 : $supportsInlineQueries.hashCode());
        return result;
    }

    public String toString() {
        return "User(id=" + this.getId() + ", isBot=" + this.getIsBot() + ", firstName=" + this.getFirstName() + ", lastName=" + this.getLastName() + ", username=" + this.getUsername() + ", languageCode=" + this.getLanguageCode() + ", isPremium=" + this.getIsPremium() + ", addedToAttachmentMenu=" + this.getAddedToAttachmentMenu() + ", canJoinGroups=" + this.getCanJoinGroups() + ", canReadAllGroupMessages=" + this.getCanReadAllGroupMessages() + ", supportsInlineQueries=" + this.getSupportsInlineQueries() + ")";
    }

    public static class UserBuilder {
        private Integer id;
        private Boolean isBot;
        private String firstName;
        private String lastName;
        private String username;
        private String languageCode;
        private Boolean isPremium;
        private Boolean addedToAttachmentMenu;
        private Boolean canJoinGroups;
        private Boolean canReadAllGroupMessages;
        private Boolean supportsInlineQueries;

        UserBuilder() {
        }

        @JsonProperty("id")
        public UserBuilder id(Integer id) {
            this.id = id;
            return this;
        }

        @JsonProperty("is_bot")
        public UserBuilder isBot(Boolean isBot) {
            this.isBot = isBot;
            return this;
        }

        @JsonProperty("first_name")
        public UserBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        @JsonProperty("last_name")
        public UserBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        @JsonProperty("username")
        public UserBuilder username(String username) {
            this.username = username;
            return this;
        }

        @JsonProperty("language_code")
        public UserBuilder languageCode(String languageCode) {
            this.languageCode = languageCode;
            return this;
        }

        @JsonProperty("is_premium")
        public UserBuilder isPremium(Boolean isPremium) {
            this.isPremium = isPremium;
            return this;
        }

        @JsonProperty("added_to_attachment_menu")
        public UserBuilder addedToAttachmentMenu(Boolean addedToAttachmentMenu) {
            this.addedToAttachmentMenu = addedToAttachmentMenu;
            return this;
        }

        @JsonProperty("can_join_groups")
        public UserBuilder canJoinGroups(Boolean canJoinGroups) {
            this.canJoinGroups = canJoinGroups;
            return this;
        }

        @JsonProperty("can_read_all_group_messages")
        public UserBuilder canReadAllGroupMessages(Boolean canReadAllGroupMessages) {
            this.canReadAllGroupMessages = canReadAllGroupMessages;
            return this;
        }

        @JsonProperty("supports_inline_queries")
        public UserBuilder supportsInlineQueries(Boolean supportsInlineQueries) {
            this.supportsInlineQueries = supportsInlineQueries;
            return this;
        }

        public User build() {
            return new User(this.id, this.isBot, this.firstName, this.lastName, this.username, this.languageCode, this.isPremium, this.addedToAttachmentMenu, this.canJoinGroups, this.canReadAllGroupMessages, this.supportsInlineQueries);
        }

        public String toString() {
            return "User.UserBuilder(id=" + this.id + ", isBot=" + this.isBot + ", firstName=" + this.firstName + ", lastName=" + this.lastName + ", username=" + this.username + ", languageCode=" + this.languageCode + ", isPremium=" + this.isPremium + ", addedToAttachmentMenu=" + this.addedToAttachmentMenu + ", canJoinGroups=" + this.canJoinGroups + ", canReadAllGroupMessages=" + this.canReadAllGroupMessages + ", supportsInlineQueries=" + this.supportsInlineQueries + ")";
        }
    }
}
