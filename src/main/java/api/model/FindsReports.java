package api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FindsReports {

    @JsonProperty("sorted")
    private boolean sorted;
    @JsonProperty("pageSize")
    private int pageSize;
    @JsonProperty("pageNumber")
    private int pageNumber;
    @JsonProperty("offset")
    private int offset;

    public boolean isSorted() {
        return sorted;
    }

    public void setSorted(boolean sorted) {
        this.sorted = sorted;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

}
