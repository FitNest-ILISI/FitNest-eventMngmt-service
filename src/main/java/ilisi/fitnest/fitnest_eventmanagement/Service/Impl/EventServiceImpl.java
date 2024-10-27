package ilisi.fitnest.fitnest_eventmanagement.Service.Impl;

import ilisi.fitnest.fitnest_eventmanagement.Entity.Event;
import ilisi.fitnest.fitnest_eventmanagement.Repository.EventRepository;
import ilisi.fitnest.fitnest_eventmanagement.Service.EventService;
import ilisi.fitnest.fitnest_eventmanagement.Service.Impl.Exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class EventServiceImpl implements EventService {
    @Autowired
    private EventRepository eventRepository;

    @Override
    public Event createEvent(Event event) {
        return eventRepository.save(event);
    }

    @Override
    public Event updateEvent(UUID id, Event event) {
        Optional<Event> existingEvent = eventRepository.findById(id);
        if (existingEvent.isPresent()) {
            Event updatedEvent = existingEvent.get();
            updatedEvent.setTitle(event.getTitle());
            updatedEvent.setDescription(event.getDescription());
            updatedEvent.setStartDate(event.getStartDate());
            updatedEvent.setEndDate(event.getEndDate());
            updatedEvent.setMaxParticipants(event.getMaxParticipants());
            updatedEvent.setCurrentNumParticipants(event.getCurrentNumParticipants());
            updatedEvent.setSportCategory(event.getSportCategory());
           // updatedEvent.setLocation(event.getLocation());
            return eventRepository.save(updatedEvent);
        } else {
            throw new ResourceNotFoundException("Event not found with id " + id);
        }
    }

    @Override
    public void deleteEvent(UUID id) {
        eventRepository.deleteById(id);
    }

    @Override
    public Event getEventById(UUID id) {
        return eventRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Event not found with id " + id));
    }

    @Override
    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }
}
