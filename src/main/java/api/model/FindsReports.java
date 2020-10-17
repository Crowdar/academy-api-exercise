package api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
public class FindsReports {
    @Getter @Setter
    @JsonProperty("sorted")
    private boolean sorted;
    @Getter @Setter
    @JsonProperty("pageSize")
    private int pageSize;
    @Getter @Setter
    @JsonProperty("pageNumber")
    private int pageNumber;
    @Getter @Setter
    @JsonProperty("offset")
    private int offset;
}
