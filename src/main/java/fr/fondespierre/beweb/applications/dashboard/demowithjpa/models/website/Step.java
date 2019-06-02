package fr.fondespierre.beweb.applications.dashboard.demowithjpa.models.website;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="step")
public class Step {

    @Id
    private Long id;

    private String name, title;

    public Step(Integer id, String name, String title) {
        this.id = (long)id;
        this.name = name;
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
