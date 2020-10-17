package api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
public class Report {
    @Getter @Setter
    @JsonProperty("total")
    private int total;
    @Getter @Setter
    @JsonProperty("passTotal")
    private int passTotal;
    @Getter @Setter
    @JsonProperty("skipTotal")
    private int skipTotal;
    @Getter @Setter
    @JsonProperty("startTime")
    private String startTime;
}
