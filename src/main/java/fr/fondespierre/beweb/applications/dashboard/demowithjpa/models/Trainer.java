package fr.fondespierre.beweb.applications.dashboard.demowithjpa.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Trainer{

    @Id
    private Long id;

    private String firstname, lastname, email, password;

    public String getFirstname() {
        return firstname;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }


}
