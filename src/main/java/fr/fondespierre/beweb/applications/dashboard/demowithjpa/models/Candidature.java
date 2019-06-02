package fr.fondespierre.beweb.applications.dashboard.demowithjpa.models;

import javax.persistence.Entity;

public class Candidature {

    private Long id;

    private String poleEmploi, status, diplome, anglais, lien1, lien2, description, project, actuTech, vielleTechno;

    public Candidature() {
    }

    public Candidature(Integer id, String poleEmploi, String status, String diplome, String anglais, String lien1, String lien2, String description, String project, String actuTech, String vielleTechno) {
        this.id = (long)id;
        this.poleEmploi = poleEmploi;
        this.status = status;
        this.diplome = diplome;
        this.anglais = anglais;
        this.lien1 = lien1;
        this.lien2 = lien2;
        this.description = description;
        this.project = project;
        this.actuTech = actuTech;
        this.vielleTechno = vielleTechno;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPoleEmploi() {
        return poleEmploi;
    }

    public void setPoleEmploi(String poleEmploi) {
        this.poleEmploi = poleEmploi;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDiplome() {
        return diplome;
    }

    public void setDiplome(String diplome) {
        this.diplome = diplome;
    }

    public String getAnglais() {
        return anglais;
    }

    public void setAnglais(String anglais) {
        this.anglais = anglais;
    }

    public String getLien1() {
        return lien1;
    }

    public void setLien1(String lien1) {
        this.lien1 = lien1;
    }

    public String getLien2() {
        return lien2;
    }

    public void setLien2(String lien2) {
        this.lien2 = lien2;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getActuTech() {
        return actuTech;
    }

    public void setActuTech(String actuTech) {
        this.actuTech = actuTech;
    }

    public String getVielleTechno() {
        return vielleTechno;
    }

    public void setVielleTechno(String vielleTechno) {
        this.vielleTechno = vielleTechno;
    }
}
