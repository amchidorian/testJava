package fr.fondespierre.beweb.applications.dashboard.demowithjpa.controllers;

import javax.persistence.EntityManager;

import fr.fondespierre.beweb.applications.dashboard.demowithjpa.models.FullCalendar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

import fr.fondespierre.beweb.applications.dashboard.demowithjpa.models.Trainer;
import fr.fondespierre.beweb.applications.dashboard.demowithjpa.repositories.TrainerRepository;

@RestController
@RequestMapping("/trainer")
public class TrainerController {

    @Autowired
    private TrainerRepository trainerRepository;

    @GetMapping("/new")
    public ResponseEntity<?> getCurrent() {
        FullCalendar event = new FullCalendar( 1, "2019-05-30", "2019-05-30", "blue");
//        System.out.println(jsoncars);
        return ResponseEntity.ok().body(event.toString());
    }

}
