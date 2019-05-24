package fr.fondespierre.beweb.applications.dashboard.demowithjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.fondespierre.beweb.applications.dashboard.demowithjpa.models.Trainer;

@Repository("trainerRepository")
public interface TrainerRepository extends CrudRepository<Trainer,Long>{

    Trainer findByEmail(String email);
}