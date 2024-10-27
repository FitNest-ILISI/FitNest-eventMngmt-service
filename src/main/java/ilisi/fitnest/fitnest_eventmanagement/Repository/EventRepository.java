package ilisi.fitnest.fitnest_eventmanagement.Repository;

import ilisi.fitnest.fitnest_eventmanagement.Entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface EventRepository extends JpaRepository<Event, UUID> {
    Optional<Event> findById(UUID id);
}
