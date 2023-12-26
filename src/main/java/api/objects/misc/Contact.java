package api.objects.misc;

import api.objects.BotApiObject;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Contact implements BotApiObject {
    @JsonProperty("phone_number")
    private String phoneNumber;

    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("last_name")
    private String lastName;

    @JsonProperty("user_id")
    private Integer userId;

    @JsonProperty("vcard")
    private String vcard;

    Contact(String phoneNumber, String firstName, String lastName, Integer userId, String vcard) {
        this.phoneNumber = phoneNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userId = userId;
        this.vcard = vcard;
    }

    public static ContactBuilder builder() {
        return new ContactBuilder();
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public String getVcard() {
        return this.vcard;
    }

    @JsonProperty("phone_number")
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @JsonProperty("first_name")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @JsonProperty("last_name")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @JsonProperty("user_id")
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @JsonProperty("vcard")
    public void setVcard(String vcard) {
        this.vcard = vcard;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Contact)) return false;
        final Contact other = (Contact) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$phoneNumber = this.getPhoneNumber();
        final Object other$phoneNumber = other.getPhoneNumber();
        if (this$phoneNumber == null ? other$phoneNumber != null : !this$phoneNumber.equals(other$phoneNumber))
            return false;
        final Object this$firstName = this.getFirstName();
        final Object other$firstName = other.getFirstName();
        if (this$firstName == null ? other$firstName != null : !this$firstName.equals(other$firstName)) return false;
        final Object this$lastName = this.getLastName();
        final Object other$lastName = other.getLastName();
        if (this$lastName == null ? other$lastName != null : !this$lastName.equals(other$lastName)) return false;
        final Object this$userId = this.getUserId();
        final Object other$userId = other.getUserId();
        if (this$userId == null ? other$userId != null : !this$userId.equals(other$userId)) return false;
        final Object this$vcard = this.getVcard();
        final Object other$vcard = other.getVcard();
        if (this$vcard == null ? other$vcard != null : !this$vcard.equals(other$vcard)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Contact;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $phoneNumber = this.getPhoneNumber();
        result = result * PRIME + ($phoneNumber == null ? 43 : $phoneNumber.hashCode());
        final Object $firstName = this.getFirstName();
        result = result * PRIME + ($firstName == null ? 43 : $firstName.hashCode());
        final Object $lastName = this.getLastName();
        result = result * PRIME + ($lastName == null ? 43 : $lastName.hashCode());
        final Object $userId = this.getUserId();
        result = result * PRIME + ($userId == null ? 43 : $userId.hashCode());
        final Object $vcard = this.getVcard();
        result = result * PRIME + ($vcard == null ? 43 : $vcard.hashCode());
        return result;
    }

    public String toString() {
        return "Contact(phoneNumber=" + this.getPhoneNumber() + ", firstName=" + this.getFirstName() + ", lastName=" + this.getLastName() + ", userId=" + this.getUserId() + ", vcard=" + this.getVcard() + ")";
    }

    public static class ContactBuilder {
        private String phoneNumber;
        private String firstName;
        private String lastName;
        private Integer userId;
        private String vcard;

        ContactBuilder() {
        }

        @JsonProperty("phone_number")
        public ContactBuilder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        @JsonProperty("first_name")
        public ContactBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        @JsonProperty("last_name")
        public ContactBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        @JsonProperty("user_id")
        public ContactBuilder userId(Integer userId) {
            this.userId = userId;
            return this;
        }

        @JsonProperty("vcard")
        public ContactBuilder vcard(String vcard) {
            this.vcard = vcard;
            return this;
        }

        public Contact build() {
            return new Contact(this.phoneNumber, this.firstName, this.lastName, this.userId, this.vcard);
        }

        public String toString() {
            return "Contact.ContactBuilder(phoneNumber=" + this.phoneNumber + ", firstName=" + this.firstName + ", lastName=" + this.lastName + ", userId=" + this.userId + ", vcard=" + this.vcard + ")";
        }
    }
}
