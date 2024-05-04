package dev.dinesh.BookMyshow.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ManyToAny;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity

public class Show extends BaseModel{
    private LocalDateTime starttime;
    private LocalDateTime endtime;
    @ManyToOne
    private Movie movie;
    @ManyToMany
    private Auditorium auditorium;
    private List<ShowSeat> showseat;

}
