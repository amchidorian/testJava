package fr.fondespierre.beweb.applications.dashboard.demowithjpa.models.website;

import fr.fondespierre.beweb.applications.dashboard.demowithjpa.models.Candidature;
import fr.fondespierre.beweb.applications.dashboard.demowithjpa.models.User;

import javax.persistence.Entity;


public class Formulaire {

    private Candidature candidature;

    private User user;

    private Long id;

    public Formulaire() {
    }

    public Formulaire(Integer id, Candidature candidature, User user) {
        this.id = (long)id;
        this.candidature = candidature;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Candidature getCandidature() {
        return candidature;
    }

    public void setCandidature(Candidature candidature) {
        this.candidature = candidature;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
