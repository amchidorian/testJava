package fr.fondespierre.beweb.applications.dashboard.demowithjpa.controllers;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.json.*;

import fr.fondespierre.beweb.applications.dashboard.demowithjpa.models.Trainer;
import fr.fondespierre.beweb.applications.dashboard.demowithjpa.repositories.TrainerRepository;

@RestController
@RequestMapping("/trainer")
public class TrainerController {

    @Autowired
    private TrainerRepository trainerRepository;

    @GetMapping("/new")
    public ResponseEntity<?> getCurrent() {
        Trainer t = this.trainerRepository.findByEmail("l.derrieux@fondespierre.com");
        return ResponseEntity.ok().body("n");
    }

}