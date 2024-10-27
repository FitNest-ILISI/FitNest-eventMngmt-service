package ilisi.fitnest.fitnest_eventmanagement.Service;

import ilisi.fitnest.fitnest_eventmanagement.Entity.Event;

import java.util.List;
import java.util.UUID;

public interface EventService {
    Event createEvent(Event event);
    Event updateEvent(UUID id, Event event);
    void deleteEvent(UUID id);
    Event getEventById(UUID id);
    List<Event> getAllEvents();
}
