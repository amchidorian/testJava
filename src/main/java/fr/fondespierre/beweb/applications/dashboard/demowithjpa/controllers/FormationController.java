package fr.fondespierre.beweb.applications.dashboard.demowithjpa.controllers;

import fr.fondespierre.beweb.applications.dashboard.demowithjpa.models.Competence;
import fr.fondespierre.beweb.applications.dashboard.demowithjpa.models.Formation;
import fr.fondespierre.beweb.applications.dashboard.demowithjpa.models.FullCalendar;
import fr.fondespierre.beweb.applications.dashboard.demowithjpa.models.Selection;
import org.json.JSONObject;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

@RestController
@RequestMapping("/formations")
public class FormationController {

    @GetMapping("/get")
    public ResponseEntity<?> getCurrent() {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2019);
        cal.set(Calendar.MONTH, Calendar.JANUARY);
        cal.set(Calendar.DAY_OF_MONTH, 1);
        Date date = cal.getTime();
        Calendar cal1 = Calendar.getInstance();
        cal1.set(Calendar.YEAR, 2019);
        cal1.set(Calendar.MONTH, Calendar.JANUARY);
        cal1.set(Calendar.DAY_OF_MONTH, 1);
        Date date1 = cal.getTime();
        Competence c = new Competence(1, "Outils & environnement open source", new ArrayList() {{
            add("Ubuntu");
            add("Visual Studio Code");
        }});
        Competence c1 = new Competence(2, "Gérer un projet web", new ArrayList() {{
            add("Méthodes agiles");
            add("Gestion de planning (Trello)");
            add("Carnet de bord (Framapad)");
            add("Versionning");
        }});
        HashMap h2 = new HashMap<String, String>() {{
            put("Parkout", "test");
        }};
        HashMap h1 = new HashMap<String, String>() {{
            put("Parkout", "test");
        }};
        ArrayList<HashMap<String, String>> hh = new ArrayList<HashMap<String, String>>(){{add(h2);}};
        ArrayList<HashMap<String, String>> hh1 = new ArrayList<HashMap<String, String>>(){{add(h1);}};
        Selection s = new Selection("Codecademy", "N’hésitez pas à être curieux et passer un maximum de badges ! C’est très important", hh , "Codecademy");
        Selection s1 = new Selection("Pornhub", "N’hésitez pas à être curieux et laisser un maximum de vue ! C’est très important", hh1, "+ de 23 cm");

        Formation f = new Formation(1, "Beweb", "niveau 3", "Lulu", "Rue des mouettes", "C'est la ", date, date1, new ArrayList() {{
            add(c);
            add(c1);
        }}, new ArrayList() {{
            add(s);
            add(s1);
        }});
        Formation f1 = new Formation(1, "Beweb", "niveau 3", "lolo", "Rue des mouettes", "C'est la ", date, date1, new ArrayList() {{
            add(c);
            add(c1);
        }}, new ArrayList() {{
            add(s);
            add(s1);
        }});

        System.out.println(f);

        HttpHeaders h = new HttpHeader();
        h.add("Access-Control-Allow-Origin", "*");
        h.add("Content-Type", "application/json");
        ArrayList<Formation> fs = new ArrayList<>();
        fs.add(f1);
        fs.add(f);
        return ResponseEntity.ok().headers(h).body(fs.toString());
    }
}
