package fr.fondespierre.beweb.applications.dashboard.demowithjpa.controllers;

import java.util.ArrayList;
import java.util.List;

import fr.fondespierre.beweb.applications.dashboard.demowithjpa.models.Formation;
import fr.fondespierre.beweb.applications.dashboard.demowithjpa.models.website.Formulaire;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/formations")
public class InscriptionController {

    @PostMapping("/formulaire")
    void newEmployee(@RequestBody ArrayList<Formation> f) {
        System.out.println("Formation");
        System.out.println(f.get(0));
    }
}
