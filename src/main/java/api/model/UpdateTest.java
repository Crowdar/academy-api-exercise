package api.model;


public class UpdateTest {
    private boolean bdd;

    private int level;
    private int childNodesLength;

    private String reportName;
    private String name;
    private String status;
    private String bddType;
    private String endTime;
    private String startTime;
    private String description;


    public boolean isBdd() {
        return bdd;
    }

    public void setBdd(boolean bdd) {
        this.bdd = bdd;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getChildNodesLength() {
        return childNodesLength;
    }

    public void setChildNodesLength(int childNodesLength) {
        this.childNodesLength = childNodesLength;
    }

    public String getReportName() {
        return reportName;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName;
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

    public String getBddType() {
        return bddType;
    }

    public void setBddType(String bddType) {
        this.bddType = bddType;
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
}
