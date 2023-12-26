package api.objects.misc;

import api.objects.BotApiObject;
import com.fasterxml.jackson.annotation.JsonProperty;

public class WebAppData implements BotApiObject {
    @JsonProperty("data")
    private String data;

    @JsonProperty("button_text")
    private String buttonText;

    WebAppData(String data, String buttonText) {
        this.data = data;
        this.buttonText = buttonText;
    }

    public static WebAppDataBuilder builder() {
        return new WebAppDataBuilder();
    }

    public String getData() {
        return this.data;
    }

    public String getButtonText() {
        return this.buttonText;
    }

    @JsonProperty("data")
    public void setData(String data) {
        this.data = data;
    }

    @JsonProperty("button_text")
    public void setButtonText(String buttonText) {
        this.buttonText = buttonText;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof WebAppData)) return false;
        final WebAppData other = (WebAppData) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$data = this.getData();
        final Object other$data = other.getData();
        if (this$data == null ? other$data != null : !this$data.equals(other$data)) return false;
        final Object this$buttonText = this.getButtonText();
        final Object other$buttonText = other.getButtonText();
        if (this$buttonText == null ? other$buttonText != null : !this$buttonText.equals(other$buttonText))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof WebAppData;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $data = this.getData();
        result = result * PRIME + ($data == null ? 43 : $data.hashCode());
        final Object $buttonText = this.getButtonText();
        result = result * PRIME + ($buttonText == null ? 43 : $buttonText.hashCode());
        return result;
    }

    public String toString() {
        return "WebAppData(data=" + this.getData() + ", buttonText=" + this.getButtonText() + ")";
    }

    public static class WebAppDataBuilder {
        private String data;
        private String buttonText;

        WebAppDataBuilder() {
        }

        @JsonProperty("data")
        public WebAppDataBuilder data(String data) {
            this.data = data;
            return this;
        }

        @JsonProperty("button_text")
        public WebAppDataBuilder buttonText(String buttonText) {
            this.buttonText = buttonText;
            return this;
        }

        public WebAppData build() {
            return new WebAppData(this.data, this.buttonText);
        }

        public String toString() {
            return "WebAppData.WebAppDataBuilder(data=" + this.data + ", buttonText=" + this.buttonText + ")";
        }
    }
}
