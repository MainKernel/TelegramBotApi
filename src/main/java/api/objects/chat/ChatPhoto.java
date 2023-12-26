package api.objects.chat;

import api.objects.BotApiObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ChatPhoto implements BotApiObject {
    @JsonProperty("small_file_id")
    private String smallFileId;
    @JsonProperty("small_file_unique_id")
    private String smallFileUniqueId;
    @JsonProperty("big_file_id")
    private String bigFileId;
    @JsonProperty("big_file_unique_id")
    private String bigFileUniqueId;
}
