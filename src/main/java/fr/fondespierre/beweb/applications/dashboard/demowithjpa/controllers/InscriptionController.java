package fr.fondespierre.beweb.applications.dashboard.demowithjpa.controllers;

import java.util.ArrayList;
import java.util.List;

import fr.fondespierre.beweb.applications.dashboard.demowithjpa.models.Formation;
import fr.fondespierre.beweb.applications.dashboard.demowithjpa.models.website.Formulaire;
import org.json.JSONObject;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
class InscriptionController {

    @RequestMapping(consumes = MediaType.APPLICATION_JSON_VALUE,method = RequestMethod.POST,path = "/inscription",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> inscription(@RequestBody Formulaire form){
        HttpHeaders options = new HttpHeaders();
        options.add("Access-Control-Allow-Headers", "*");
        System.out.println("formulaire");
        System.out.println(form.getCandidature().getAnglais());
        System.out.println(form.getUser().getDateDeNaissance());
        return ResponseEntity.ok().headers(options).body(form);
    }
}
