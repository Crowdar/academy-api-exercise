package api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UpdateTest {
    @JsonProperty("reportName")
    private String reportName;
    @JsonProperty("level")
    private int level;
    @JsonProperty("name")
    private String name;
    @JsonProperty("status")
    private String status;
    @JsonProperty("bdd")
    private boolean bdd;
    @JsonProperty("bddType")
    private String bddType;
    @JsonProperty("childNodesLength")
    private int childNodesLength;
    @JsonProperty("leaf")
    private boolean leaf;
    @JsonProperty("endTime")
    private String endTime;
    @JsonProperty("startTime")
    private String startTime;
    @JsonProperty("description")
    private String description;
    @JsonProperty("categorized")
    private boolean categorized;

    public String getReportName() {
        return reportName;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isBdd() {
        return bdd;
    }

    public void setBdd(boolean bdd) {
        this.bdd = bdd;
    }

    public String getBddType() {
        return bddType;
    }

    public void setBddType(String bddType) {
        this.bddType = bddType;
    }

    public int getChildNodesLength() {
        return childNodesLength;
    }

    public void setChildNodesLength(int childNodesLength) {
        this.childNodesLength = childNodesLength;
    }

    public boolean isLeaf() {
        return leaf;
    }

    public void setLeaf(boolean leaf) {
        this.leaf = leaf;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCategorized() {
        return categorized;
    }

    public void setCategorized(boolean categorized) {
        this.categorized = categorized;
    }
}
