package ilisi.fitnest.fitnest_eventmanagement.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.locationtech.jts.geom.Point;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idEvent;
    private Long idCoordinator;
    private String title;
    private String description;
    private Date startDate;
    private Date endDate;
    private int maxParticipants;
    private int currentNumParticipants;
   // @Column(columnDefinition = "GEOGRAPHY(Point,4326)")
   // private Point location;
    @ManyToOne
    @JoinColumn(name = "id")
    private SportCategory sportCategory;
}
