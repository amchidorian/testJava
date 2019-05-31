package fr.fondespierre.beweb.applications.dashboard.demowithjpa.models;

import fr.fondespierre.beweb.applications.dashboard.demowithjpa.interfaces.ModelBasicMethod;
import org.json.JSONObject;

import javax.persistence.Id;
import java.util.ArrayList;

public class Competence implements ModelBasicMethod {
    @Id
    private Long id;

    private String title;

    private ArrayList<String> list;

    public Competence(Integer id, String title, ArrayList<String> list) {
        this.id = (long) id;
        this.title = title;
        this.list = list;
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

    public ArrayList<String> getList() {
        return list;
    }

    public void setList(ArrayList<String> list) {
        this.list = list;
    }
    
    public void addToList(String l){
        this.list.add(l);
    }

    public void removeFromList(String l){
        this.list.remove(l);
    }

    public JSONObject toJson() {
        JSONObject fullCalendar = new JSONObject();
        fullCalendar.put("id", this.getId());
        fullCalendar.put("list", this.getList());
        fullCalendar.put("title", this.getTitle());
        return fullCalendar;
    }
}
