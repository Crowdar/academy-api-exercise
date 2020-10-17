package api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
public class UpdateTest {
    @Getter @Setter
    @JsonProperty("reportName")
    private String reportName;
    @Getter @Setter
    @JsonProperty("level")
    private int level;
    @Getter @Setter
    @JsonProperty("name")
    private String name;
    @Getter @Setter
    @JsonProperty("status")
    private String status;
    @Getter @Setter
    @JsonProperty("bdd")
    private boolean bdd;
    @Getter @Setter
    @JsonProperty("bddType")
    private String bddType;
    @Getter @Setter
    @JsonProperty("childNodesLength")
    private int childNodesLength;
    @Getter @Setter
    @JsonProperty("leaf")
    private boolean leaf;
    @Getter @Setter
    @JsonProperty("endTime")
    private String endTime;
    @Getter @Setter
    @JsonProperty("startTime")
    private String startTime;
    @Getter @Setter
    @JsonProperty("description")
    private String description;
    @Getter @Setter
    @JsonProperty("categorized")
    private boolean categorized;
}
