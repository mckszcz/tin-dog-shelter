package shelter.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import shelter.persistence.model.Shelter;

@RepositoryRestResource
@CrossOrigin(origins = {"http://localhost:4200"})
public interface ShelterRepository extends JpaRepository<Shelter, Integer> {
}
