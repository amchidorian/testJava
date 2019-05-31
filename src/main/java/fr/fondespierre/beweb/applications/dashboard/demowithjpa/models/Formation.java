package fr.fondespierre.beweb.applications.dashboard.demowithjpa.models;

import fr.fondespierre.beweb.applications.dashboard.demowithjpa.interfaces.ModelBasicMethod;
import org.json.JSONObject;

import javax.persistence.Id;
import java.util.ArrayList;
import java.util.Date;

public class Formation implements ModelBasicMethod {


    @Id
    private Long id;

    private String title, level, city, place, presentation;

    private Date start, end;

    private ArrayList<Competence> competences;

    private ArrayList<Selection> selections;

    public Formation(Integer id, String title, String level, String city, String place, String presentation, Date start, Date end, ArrayList<Competence> competences, ArrayList<Selection> selections) {
        this.id = (long)id;
        this.title = title;
        this.level = level;
        this.city = city;
        this.place = place;
        this.presentation = presentation;
        this.start = start;
        this.end = end;
        this.competences = competences;
        this.selections = selections;
    }

    public String toString() {
        return this.toJson().toString();
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

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getPresentation() {
        return presentation;
    }

    public void setPresentation(String presentation) {
        this.presentation = presentation;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public ArrayList<Competence> getCompetences() {
        return competences;
    }

    public void setCompetences(ArrayList<Competence> competences) {
        this.competences = competences;
    }

    public Formation addToCompetence(Competence c) {
        this.competences.add(c);
        return this;
    }

    public Formation removeFromCompetence(Competence c) {
        this.competences.remove(c);
        return this;
    }

    public ArrayList<Selection> getSelections() {
        return selections;
    }

    public void setSelections(ArrayList<Selection> selections) {
        this.selections = selections;
    }

    public Formation addToSelections(Selection s) {
        this.selections.add(s);
        return this;
    }

    public Formation removeFromSelections(Selection s) {
        this.selections.remove(s);
        return this;
    }

    public JSONObject toJson() {
        JSONObject competence = new JSONObject();
        competence.put("id", this.getId());
        competence.put("start", this.getStart());
        competence.put("end", this.getEnd());
        competence.put("title", this.getTitle());
        competence.put("level", this.getLevel());
        competence.put("city", this.getCity());
        competence.put("presentation", this.getPresentation());
        competence.put("competences", this.getCompetences());
        competence.put("selections", this.getSelections());
        return competence;
    }
}
