package shelter;

import lombok.Setter;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import shelter.persistence.model.Dog;
import shelter.persistence.repository.DogRepository;

import java.util.Date;
import java.util.stream.Stream;

@SpringBootApplication
@Setter
public class Application {
    public static void main(String... args) {
        SpringApplication.run(Application.class);
    }

    @Bean
    ApplicationRunner init(DogRepository dogRepository) {
        return args -> {
            Stream.of("Burek", "Reksio", "Kosa").forEach(dogName -> {
                Dog dog = new Dog();
                dog.setDogName(dogName);
                dog.setAdopted(false);
                dog.setFindDate(new Date(System.currentTimeMillis()));
                dogRepository.save(dog);
            });
        };
    }
}
