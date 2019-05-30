package fr.fondespierre.beweb.applications.dashboard.demowithjpa.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import fr.fondespierre.beweb.applications.dashboard.demowithjpa.models.Trainer;
import fr.fondespierre.beweb.applications.dashboard.demowithjpa.repositories.TrainerRepository;

@Service("trainerService")
public class TrainerService{

  //  @Autowired
    private TrainerRepository trainerRepository;

    public TrainerService(@Qualifier("trainerRepository") TrainerRepository trainerRepository){
        this.trainerRepository = trainerRepository;
    }

    public <trainerRepository> Trainer findByEmail(String email) {
        return trainerRepository.findByEmail(email);
    }
}
