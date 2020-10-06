package api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CategoryTimeTaken {
    @JsonProperty("name")
    private String name;

    @JsonProperty("total")
    private int total;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
