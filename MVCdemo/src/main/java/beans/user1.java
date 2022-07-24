package beans;

import org.springframework.stereotype.Component;


public class user1 {
    private String name;
    private  String address;
    private  String email;
    private  String message;
    private  String success;

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getMessage() {
        return message;
    }

    public String getSuccess() {
        return success;
    }

    @Override
    public String toString() {
        return "user1{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", message='" + message + '\'' +
                ", success='" + success + '\'' +
                '}';
    }
}
