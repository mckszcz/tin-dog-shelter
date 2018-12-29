package shelter.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import shelter.persistence.model.Dog;

@Repository
public interface DogRepository extends JpaRepository<Dog, Integer> {
}
