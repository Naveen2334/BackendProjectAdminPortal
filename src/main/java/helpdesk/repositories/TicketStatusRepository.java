package helpdesk.repositories;

import helpdesk.models.TicketStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketStatusRepository extends JpaRepository<helpdesk.models.TicketStatus, Integer> {

}
