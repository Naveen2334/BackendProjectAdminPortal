package parameters.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import parameters.models.State;

@Repository
public interface StateRepository extends JpaRepository<State, Integer> {

}
