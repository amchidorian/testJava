package fr.fondespierre.beweb.applications.dashboard.demowithjpa.controllers;

import fr.fondespierre.beweb.applications.dashboard.demowithjpa.models.*;
import fr.fondespierre.beweb.applications.dashboard.demowithjpa.models.website.Selection;
import fr.fondespierre.beweb.applications.dashboard.demowithjpa.models.website.Step;
import fr.fondespierre.beweb.applications.dashboard.demowithjpa.tools.Email;
import org.json.JSONObject;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;
import javax.mail.internet.InternetAddress;
import java.io.FileNotFoundException;
import java.util.*;

@RestController
@RequestMapping("/formations")
public class FormationController {

    @GetMapping("/get")
    public void getCurrent() {
        HttpHeaders h = new HttpHeaders();
        h.add("Access-Control-Allow-Origin", "*");
        h.add("Content-Type", "application/json");
        JSONObject js = new JSONObject();
        js.put("test", "test");
        System.out.println(js);
        try {
            Email e = new Email();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
//        try {
//            (new Email()).sendTo(new InternetAddress("loic.derrieux@gmail.com"), "coucou");
//            System.out.printf("suceed");
//            return ResponseEntity.status(400).headers(h).body(js);
//        } catch (MessagingException ex) {
//            System.out.printf("failure");
//            return ResponseEntity.status(500).headers(h).body(ex.getMessage());
//        }
    }
}
//    Date date = Tools.getDate(1, 2, 2019);
//        Date date1 = Tools.getDate(1, 2, 2019);
////        new ArrayList() {{
////            add("Ubuntu");
////            add("Visual Studio Code");
////        }});
//        Step step = new Step(1, "http://", "Codecademy");
//        Step step1 = new Step(2, "http://", "Linkedin");
//        Competence c = new Competence(1, "Outils & environnement open source", "Ubuntu");
//        Competence c1 = new Competence(1, "Outils & environnement open source", "Git");
//        Competence c2 = new Competence(1, "Outils & environnement open source", "IntelliJ");
//        Competence c4 = new Competence(1, "Gérer un projet web", "Carnet de bord (Framapad)");
//        Competence c3 = new Competence(1, "Gérer un projet web", "Versionning");
//        Competence c5 = new Competence(1, "Gérer un projet web", "Méthodes agiles");
//        Selection s = new Selection(1, "Codecademy", "N’hésitez pas à être curieux et passer un maximum de badges ! C’est très important",
//                new HashSet<Step>(Arrays.asList(step, step1)), "Codecademy");
//        Selection s1 = new Selection(2, "Codecademy", "N’hésitez pas à être curieux et passer un maximum de badges ! C’est très important",
//                new HashSet<Step>(Arrays.asList(step, step1)), "Codecademy");
//        Formation f = new Formation(1, "Beweb", "niveau 3", "Lulu", "Rue des mouettes", "C'est la ",
//                date, date1, new HashSet<Competence>(Arrays.asList(c, c1, c2, c3, c4)), new HashSet<Selection>(Arrays.asList(s, s1)));
//        Formation f1 = new Formation(1, "Test", "niveau 3", "Lunel", "Rue des pisselit", "C'est la ",
//                date, date1, new HashSet<Competence>(Arrays.asList(c, c5, c2, c3, c4)), new HashSet<Selection>(Arrays.asList(s, s1)));
//
//        System.out.println(f);
//
//        ArrayList<Formation> fs = new ArrayList<>();
//        fs.add(f1);
//        fs.add(f);
//        return ResponseEntity.ok().headers(h).body(fs.toString());
