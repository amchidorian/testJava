package fr.fondespierre.beweb.applications.dashboard.demowithjpa.models;

import fr.fondespierre.beweb.applications.dashboard.demowithjpa.interfaces.ModelBasicMethod;
import org.json.JSONObject;

import javax.persistence.Id;
import java.util.Hashtable;

public class FullCalendar implements ModelBasicMethod {


    @Id
    private Long id;

    private String start, end, color;

    public FullCalendar(Integer id, String start, String end, String color) {
        this.id = (long)id;
        this.start = start;
        this.end = end;
        this.color = color;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public JSONObject toJson() {
        JSONObject fullCalendar = new JSONObject();
        fullCalendar.put("id", this.getId());
        fullCalendar.put("start", this.getStart());
        fullCalendar.put("end", this.getEnd());
        fullCalendar.put("color", this.getColor());
        return fullCalendar;
    }

    public String toString() {
        return this.toJson().toString();
    }



}
