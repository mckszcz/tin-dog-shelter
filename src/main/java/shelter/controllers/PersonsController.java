package shelter.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import shelter.persistence.model.Person;
import shelter.persistence.repository.PersonRepository;

import static shelter.controllers.DogsController.ORIGIN;

@RestController
public class PersonsController {

    private PersonRepository personRepository;

    @Autowired
    public void setPersonRepository(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @GetMapping("/persons/{id}")
    @CrossOrigin(origins = {ORIGIN})
    public Person getShelterById(@PathVariable Integer id) {
        return personRepository.findById(id).get();
    }
}
