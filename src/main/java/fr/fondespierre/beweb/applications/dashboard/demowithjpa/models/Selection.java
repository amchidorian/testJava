package fr.fondespierre.beweb.applications.dashboard.demowithjpa.models;

import fr.fondespierre.beweb.applications.dashboard.demowithjpa.interfaces.ModelBasicMethod;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;

public class Selection implements ModelBasicMethod {

    private String platforme, description, inscription;

    private ArrayList<HashMap<String, String>> parcours;

    public Selection(String platforme, String description, ArrayList<HashMap<String, String>> parcours, String inscription) {
        this.platforme = platforme;
        this.description = description;
        this.parcours = parcours;
        this.inscription = inscription;
    }

    public String getPlatforme() {
        return platforme;
    }

    public void setPlatforme(String platforme) {
        this.platforme = platforme;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<HashMap<String, String>> getParcours() {
        return parcours;
    }

    public void setParcours(ArrayList<HashMap<String, String>> parcours) {
        this.parcours = parcours;
    }

    public String getInscription() {
        return inscription;
    }

    public void setInscription(String inscription) {
        this.inscription = inscription;
    }

    @Override
    public JSONObject toJson() {
        return null;
    }
}
