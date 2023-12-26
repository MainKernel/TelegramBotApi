package api.objects.chat;

import api.objects.BotApiObject;
import api.objects.user.User;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ChatInviteLink implements BotApiObject {
    @JsonProperty("invite_link")
    private String inviteLink;
    @JsonProperty("creator")
    private User creator;
    @JsonProperty("creates_join_request")
    private boolean createsJoinRequest;
    @JsonProperty("is_primary")
    private boolean isPrimary;
    @JsonProperty("is_revoked")
    private boolean isRevoked;
    @JsonProperty("name")
    private String name;
    @JsonProperty("expire_date")
    private Integer expireDate;
    @JsonProperty("member_limit")
    private Integer memberLimit;
    @JsonProperty("pending_join_request_count")
    private Integer pendingJoinRequestCount;
}
