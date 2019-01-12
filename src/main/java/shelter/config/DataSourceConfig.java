package shelter.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import shelter.persistence.model.Dog;
import shelter.persistence.repository.DogRepository;

@EnableJpaRepositories(basePackageClasses = DogRepository.class)
@EntityScan(basePackageClasses = Dog.class)
public class DataSourceConfig {

}
