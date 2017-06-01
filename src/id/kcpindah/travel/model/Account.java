package id.kcpindah.travel.model;

/**
 * Created by KCPIndah on 6/1/2017.
 */
public class Account {
    /* Class Attributes */
    private String name;
    private String username;
    private String password;
    private String phoneNumber;

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getUsername() {
        return username;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
