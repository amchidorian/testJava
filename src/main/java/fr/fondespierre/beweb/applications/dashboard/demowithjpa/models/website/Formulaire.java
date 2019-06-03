package fr.fondespierre.beweb.applications.dashboard.demowithjpa.models.website;

import fr.fondespierre.beweb.applications.dashboard.demowithjpa.models.Candidature;
import fr.fondespierre.beweb.applications.dashboard.demowithjpa.models.User;

import javax.persistence.Entity;


public class Formulaire {

    private Candidature candidature;

    private User user;

    private Long idFormation;

    public Formulaire() {
    }

    public Formulaire(Integer id, Candidature candidature, User user) {
        this.idFormation = (long)id;
        this.candidature = candidature;
        this.user = user;
    }

    public Long getIdFormation() {
        return idFormation;
    }

    public void setIdFormation(Long idFormation) {
        this.idFormation = idFormation;
    }

    public Candidature getCandidature() {
        return this.candidature;
    }

    public void setCandidature(Candidature candidature) {
        this.candidature = candidature;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
