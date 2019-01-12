package shelter.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import shelter.persistence.model.Dog;
import shelter.persistence.repository.DogRepository;

import java.util.Collection;

@RestController
@Slf4j
public class HomeController {

    private DogRepository dogRepository;

    @Autowired
    public HomeController(DogRepository dogRepository) {
        this.dogRepository = dogRepository;
    }

    @GetMapping("/dogs/all")
    @CrossOrigin(origins = {"http://localhost:4200"})
    public Collection<Dog> allDogs() {
        return dogRepository.findAll();
    }
}
