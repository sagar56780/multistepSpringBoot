package edu.qsp.multistep.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
@Component
public class UserInfo {
    @Id
    private String email;
    private String name;
    private String phone;

    public UserInfo(String name2, String email2, String phone2) {
        // TODO Auto-generated constructor stub
    }

    public UserInfo() {
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}
