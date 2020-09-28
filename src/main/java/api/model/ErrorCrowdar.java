package api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ErrorCrowdar {
    @JsonProperty("timestamp")
    private String timestamp;
    @JsonProperty("message")
    private String message;
    @JsonProperty("error")
    private String error;
    @JsonProperty("path")
    private String path;
    @JsonProperty("status")
    private int status;

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int statatus) {
        this.status = statatus;
    }
}
