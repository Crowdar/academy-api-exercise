package api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Report {

    @JsonProperty("total")
    private int total;
    @JsonProperty("passTotal")
    private int passTotal;
    @JsonProperty("skipTotal")
    private int skipTotal;
    @JsonProperty("startTime")
    private String startTime;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getPassTotal() {
        return passTotal;
    }

    public void setPassTotal(int passTotal) {
        this.passTotal = passTotal;
    }

    public int getSkipTotal() {
        return skipTotal;
    }

    public void setSkipTotal(int skipTotal) {
        this.skipTotal = skipTotal;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }
}
