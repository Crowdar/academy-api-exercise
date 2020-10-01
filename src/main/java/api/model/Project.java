package api.model;

public class Project {
    private String id;
    private String name;
    private String createAt;
    private int levelSettings;
    private String[] users;
    private String[] errorState;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }

    public int getLevelSettings() {
        return levelSettings;
    }

    public void setLevelSettings(int levelSettings) {
        this.levelSettings = levelSettings;
    }

    public String[] getUsers() {
        return users;
    }

    public void setUsers(String[] users) {
        this.users = users;
    }

    public String[] getErrorState() {
        return errorState;
    }

    public void setErrorState(String[] errorState) {
        this.errorState = errorState;
    }
}
