package api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
public class Time {
    @Getter @Setter
    @JsonProperty("name")
    private String name;
    @Getter @Setter
    @JsonProperty("total")
    private int total;
}
