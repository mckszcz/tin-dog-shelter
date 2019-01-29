package shelter.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import shelter.persistence.model.Shelter;
import shelter.persistence.repository.ShelterRepository;

import static shelter.controllers.DogsController.ORIGIN;


@RestController
@Slf4j
public class SheltersController {

    private ShelterRepository shelterRepository;

    @Autowired
    public void setShelterRepository(ShelterRepository shelterRepository) {
        this.shelterRepository = shelterRepository;
    }

    @GetMapping("/shelters/{id}")
    @CrossOrigin(origins = {ORIGIN})
    public Shelter getShelterById(@PathVariable Integer id) {
        return shelterRepository.findById(id).get();
    }
}
