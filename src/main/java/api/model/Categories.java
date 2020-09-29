package api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Categories {
    @JsonProperty("name")
    private String name;
    @JsonProperty("total")
    private String total;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }
}
