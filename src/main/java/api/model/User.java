package api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {

    @JsonProperty("jwt")
    private String jwt;
    @JsonProperty("expires")
    private int expires;
    @JsonProperty("username")
    private String username;
    @JsonProperty("role")
    private String[] role;
    @JsonProperty("timestamp")
    private String timestamp;
    @JsonProperty("status")
    private int status;
    @JsonProperty("error")
    private String error;
    @JsonProperty("message")
    private String message;
    @JsonProperty("path")
    private String path;
    

    public String getJwt() {
        return jwt;
    }

    public void setJwt(String jwt) {
        this.jwt = jwt;
    }

    public int getExpires() {
        return expires;
    }

    public void setEmail(int expires) {
        this.expires = expires;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String[] getRole() {
        return role;
    }

    public void setRole(String[] role) {
        this.role = role;
    }
    
    public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}


}
