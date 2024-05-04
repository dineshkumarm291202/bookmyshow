package dev.dinesh.BookMyshow.model.constants;

import dev.dinesh.BookMyshow.model.BaseModel;
import jakarta.persistence.Entity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.swing.*;
import java.util.List;

@Getter
@Setter
@Entity
public class User extends BaseModel {
    private String name;
    private String email;
    private List<Ticket> ticket;

}
