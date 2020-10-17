package api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
public class Users {
    @Getter @Setter
    @JsonProperty("id")
    private String id;
    @Getter @Setter
    @JsonProperty("name")
    private String name;
    @Getter @Setter
    @JsonProperty("password")
    private String password;
    @Getter @Setter
    @JsonProperty("role")
    private String role;
    @Getter @Setter
    @JsonProperty("admin")
    private String admin;
}
