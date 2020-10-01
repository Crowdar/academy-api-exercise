package api.model;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

public class UserCrowdar {
    private Map<String,String > projectRole;

    private Boolean admin;
    private Boolean root;

    private String lastSignOn;
    private String firstName;
    private String location;
    private String password;
    private String createAt;
    private String updateAt;
    private String lastName;
    private String company;
    private String email;
    private String name;
    private String role;
    private String url;
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
