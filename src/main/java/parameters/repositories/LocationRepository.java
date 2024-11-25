package parameters.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import parameters.models.Location;

@Repository
public interface LocationRepository extends CrudRepository<Location, Integer> {

}
