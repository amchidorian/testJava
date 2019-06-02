package fr.fondespierre.beweb.applications.dashboard.demowithjpa.models;

import fr.fondespierre.beweb.applications.dashboard.demowithjpa.interfaces.ModelBasicMethod;
import org.json.JSONObject;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="competence")
public class Competence implements ModelBasicMethod {
    @Id
    private Long id;

    private String title;

    @JoinTable(
            name="practice",
            joinColumns = @JoinColumn( name="id"),
            inverseJoinColumns = @JoinColumn( name="PART_ID")
    )
    private String name;

    public Competence(Integer id, String title, String name) {
        this.id = (long) id;
        this.title = title;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public JSONObject toJson() {
        JSONObject fullCalendar = new JSONObject();
        fullCalendar.put("id", this.getId());
        fullCalendar.put("name", this.getName());
        fullCalendar.put("title", this.getTitle());
        return fullCalendar;
    }
}
