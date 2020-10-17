package api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
public class UAuthenticate {
    @Getter @Setter
    private String jwt;
    @Getter @Setter
    @JsonProperty("expires")
    private int expires;
    @Getter @Setter
    @JsonProperty("username")
    private String username;
}
