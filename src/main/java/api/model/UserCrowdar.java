package api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

public class UserCrowdar {
    @JsonProperty("projectRole")
    private Map<String,String > projectRole;
    @JsonProperty("admin")
    private Boolean admin;
    @JsonProperty("root")
    private Boolean root;
    @JsonProperty("lastSignOn")
    private String lastSignOn;
    @JsonProperty("firstName")
    private String firstName;
    @JsonProperty("location")
    private String location;
    @JsonProperty("password")
    private String password;
    @JsonProperty("createAt")
    private String createAt;
    @JsonProperty("updateAt")
    private String updateAt;
    @JsonProperty("lastName")
    private String lastName;
    @JsonProperty("company")
    private String company;
    @JsonProperty("email")
    private String email;
    @JsonProperty("name")
    private String name;
    @JsonProperty("role")
    private String role;
    @JsonProperty("url")
    private String url;
    @JsonProperty("id")
    private String id;

    public Map<String, String> getProjectRole() {
        return projectRole;
    }

    public void setProjectRole(Map<String, String> projectRole) {
        this.projectRole = projectRole;
    }

    public Boolean getAdmin() {
        return admin;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    public Boolean getRoot() {
        return root;
    }

    public void setRoot(Boolean root) {
        this.root = root;
    }

    public String getLastSignOn() {
        return lastSignOn;
    }

    public void setLastSignOn(String lastSignOn) {
        this.lastSignOn = lastSignOn;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }

    public String getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(String updateAt) {
        this.updateAt = updateAt;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
