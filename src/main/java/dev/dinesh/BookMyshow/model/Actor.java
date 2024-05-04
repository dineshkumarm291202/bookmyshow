package dev.dinesh.BookMyshow.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name ="Actor")

public class Actor extends BaseModel{
    private String name;

}
