package shelter.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import shelter.persistence.model.Dog;

import java.util.List;

@RepositoryRestResource
@CrossOrigin(origins = {"http://localhost:4200"})
public interface DogRepository extends JpaRepository<Dog, Integer> {
    public List<Dog> findAllByOrderByDogId();
}
