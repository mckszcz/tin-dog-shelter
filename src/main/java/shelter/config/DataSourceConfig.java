package shelter.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import shelter.persistence.model.Dog;
import shelter.persistence.model.Person;
import shelter.persistence.model.Shelter;
import shelter.persistence.repository.DogRepository;
import shelter.persistence.repository.PersonRepository;
import shelter.persistence.repository.ShelterRepository;

@EnableJpaRepositories(basePackageClasses = {DogRepository.class, ShelterRepository.class, PersonRepository.class})
@EntityScan(basePackageClasses = {Dog.class, Shelter.class, Person.class})
public class DataSourceConfig {

}
