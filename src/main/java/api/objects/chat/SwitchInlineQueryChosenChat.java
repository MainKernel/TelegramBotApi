package api.objects.chat;

import api.objects.BotApiObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SwitchInlineQueryChosenChat implements BotApiObject {
    @JsonProperty("query")
    private String query;
    @JsonProperty("allow_user_chats")
    private Boolean allowUserChats;
    @JsonProperty("allow_bot_chats")
    private Boolean allowBotChats;
    @JsonProperty("allow_group_chats")
    private Boolean allowGroupChats;
    @JsonProperty("allow_channel_chats")
    private Boolean allowChannelChats;
}
