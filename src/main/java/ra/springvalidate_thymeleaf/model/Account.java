package ra.springvalidate_thymeleaf.model;

public class Account {
    private Long id;
    private String userName;
    private String password;
    private String phone;
    private String fullName;
    private boolean status = true;

    public Account() {
    }

    public Account(Long id, String userName, String password, String phone, String fullName, boolean status) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.phone = phone;
        this.fullName = fullName;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
