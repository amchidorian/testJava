package fr.fondespierre.beweb.applications.dashboard.demowithjpa.models.website;

import fr.fondespierre.beweb.applications.dashboard.demowithjpa.interfaces.ModelBasicMethod;
import org.json.JSONObject;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

@Entity
@Table(name="selection")
public class Selection implements ModelBasicMethod {

    @Id
    private Long id;

    private String platform, description, inscription;

    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "journey",
            joinColumns = { @JoinColumn(name = "id") },
            inverseJoinColumns = { @JoinColumn(name = "selection") }
    )
    private Set<Step> journeys;

    public Selection(Integer id, String platform, String description, Set<Step> journeys, String inscription) {
        this.id = (long)id;
        this.platform = platform;
        this.description = description;
        this.journeys = journeys;
        this.inscription = inscription;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Step> getJourneys() {
        return journeys;
    }

    public void setJourneys(Set<Step> journeys) {
        this.journeys = journeys;
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
