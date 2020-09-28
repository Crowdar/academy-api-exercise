package api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Data {


    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
