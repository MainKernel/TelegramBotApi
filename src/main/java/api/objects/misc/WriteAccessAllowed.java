package api.objects.misc;

import api.objects.BotApiObject;
import com.fasterxml.jackson.annotation.JsonProperty;

public class WriteAccessAllowed implements BotApiObject {
    @JsonProperty("from_request")
    private Boolean fromRequest;

    @JsonProperty("web_app_name")
    private String webAppName;

    @JsonProperty("from_attachment_menu")
    private Boolean fromAttachmentMenu;

    WriteAccessAllowed(Boolean fromRequest, String webAppName, Boolean fromAttachmentMenu) {
        this.fromRequest = fromRequest;
        this.webAppName = webAppName;
        this.fromAttachmentMenu = fromAttachmentMenu;
    }

    public static WriteAccessAllowedBuilder builder() {
        return new WriteAccessAllowedBuilder();
    }

    public Boolean getFromRequest() {
        return this.fromRequest;
    }

    public String getWebAppName() {
        return this.webAppName;
    }

    public Boolean getFromAttachmentMenu() {
        return this.fromAttachmentMenu;
    }

    @JsonProperty("from_request")
    public void setFromRequest(Boolean fromRequest) {
        this.fromRequest = fromRequest;
    }

    @JsonProperty("web_app_name")
    public void setWebAppName(String webAppName) {
        this.webAppName = webAppName;
    }

    @JsonProperty("from_attachment_menu")
    public void setFromAttachmentMenu(Boolean fromAttachmentMenu) {
        this.fromAttachmentMenu = fromAttachmentMenu;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof WriteAccessAllowed)) return false;
        final WriteAccessAllowed other = (WriteAccessAllowed) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$fromRequest = this.getFromRequest();
        final Object other$fromRequest = other.getFromRequest();
        if (this$fromRequest == null ? other$fromRequest != null : !this$fromRequest.equals(other$fromRequest))
            return false;
        final Object this$webAppName = this.getWebAppName();
        final Object other$webAppName = other.getWebAppName();
        if (this$webAppName == null ? other$webAppName != null : !this$webAppName.equals(other$webAppName))
            return false;
        final Object this$fromAttachmentMenu = this.getFromAttachmentMenu();
        final Object other$fromAttachmentMenu = other.getFromAttachmentMenu();
        if (this$fromAttachmentMenu == null ? other$fromAttachmentMenu != null : !this$fromAttachmentMenu.equals(other$fromAttachmentMenu))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof WriteAccessAllowed;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $fromRequest = this.getFromRequest();
        result = result * PRIME + ($fromRequest == null ? 43 : $fromRequest.hashCode());
        final Object $webAppName = this.getWebAppName();
        result = result * PRIME + ($webAppName == null ? 43 : $webAppName.hashCode());
        final Object $fromAttachmentMenu = this.getFromAttachmentMenu();
        result = result * PRIME + ($fromAttachmentMenu == null ? 43 : $fromAttachmentMenu.hashCode());
        return result;
    }

    public String toString() {
        return "WriteAccessAllowed(fromRequest=" + this.getFromRequest() + ", webAppName=" + this.getWebAppName() + ", fromAttachmentMenu=" + this.getFromAttachmentMenu() + ")";
    }

    public static class WriteAccessAllowedBuilder {
        private Boolean fromRequest;
        private String webAppName;
        private Boolean fromAttachmentMenu;

        WriteAccessAllowedBuilder() {
        }

        @JsonProperty("from_request")
        public WriteAccessAllowedBuilder fromRequest(Boolean fromRequest) {
            this.fromRequest = fromRequest;
            return this;
        }

        @JsonProperty("web_app_name")
        public WriteAccessAllowedBuilder webAppName(String webAppName) {
            this.webAppName = webAppName;
            return this;
        }

        @JsonProperty("from_attachment_menu")
        public WriteAccessAllowedBuilder fromAttachmentMenu(Boolean fromAttachmentMenu) {
            this.fromAttachmentMenu = fromAttachmentMenu;
            return this;
        }

        public WriteAccessAllowed build() {
            return new WriteAccessAllowed(this.fromRequest, this.webAppName, this.fromAttachmentMenu);
        }

        public String toString() {
            return "WriteAccessAllowed.WriteAccessAllowedBuilder(fromRequest=" + this.fromRequest + ", webAppName=" + this.webAppName + ", fromAttachmentMenu=" + this.fromAttachmentMenu + ")";
        }
    }
}
