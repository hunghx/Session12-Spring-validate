package ra.springvalidation_jsp.model;

import ra.springvalidation_jsp.validate.Password;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class FormRegister {
    @NotBlank
    @Size(min = 10)
    private String userName;
    @NotBlank
    @Password
    private String password;
    @Password
    private String rePassword;
    @NotBlank
    @Pattern(regexp = "^0[0-9]{9,10}$")
    private String phone;
    @NotBlank
    private String fullName;

    public FormRegister() {
    }

    public FormRegister(String userName, String password, String rePassword, String phone, String fullName) {
        this.userName = userName;
        this.password = password;
        this.rePassword = rePassword;
        this.phone = phone;
        this.fullName = fullName;
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

    public String getRePassword() {
        return rePassword;
    }

    public void setRePassword(String rePassword) {
        this.rePassword = rePassword;
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
}
