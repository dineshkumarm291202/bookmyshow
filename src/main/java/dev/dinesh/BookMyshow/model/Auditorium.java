package dev.dinesh.BookMyshow.model;
import java.util.List;
import dev.dinesh.BookMyshow.model.constants.AuditoriumFeature;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.sql.ClientInfoStatus;

@Getter
@Setter
@Entity

public class Auditorium extends BaseModel{
    private String name;
    private int capacity;
    @OneToMany
    private List<Show> shows;
    @OneToMany
    private List<Seat> seats;
    @ElementCollection
    @Enumerated(EnumType.STRING)//CREATES A RELATIONSHIP BW THE ENTITY CLASS AND THE ENUM AND DB
    private List<AuditoriumFeature>  auditoriumFeature;

}
