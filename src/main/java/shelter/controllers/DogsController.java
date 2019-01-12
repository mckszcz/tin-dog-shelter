package shelter.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import shelter.persistence.model.Dog;
import shelter.persistence.repository.DogRepository;

import java.util.Collection;

@RestController
@Slf4j
public class DogsController {

    private final static String ORIGIN = "http://localhost:4200";
    private DogRepository dogRepository;

    @Autowired
    public DogsController(DogRepository dogRepository) {
        this.dogRepository = dogRepository;
    }

    @GetMapping("/dogs/all")
    @CrossOrigin(origins = {ORIGIN})
    public Collection<Dog> getAllDogs() {
        return dogRepository.findAllByOrderByDogId();
    }

    @GetMapping("/dogs/{id}")
    @CrossOrigin(origins = {ORIGIN})
    public Dog getDogById(@PathVariable Integer id) {
        return dogRepository.findById(id).get();
    }

}