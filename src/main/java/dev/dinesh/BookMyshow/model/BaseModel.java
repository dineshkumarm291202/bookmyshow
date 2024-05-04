package dev.dinesh.BookMyshow.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.time.LocalDateTime;
@Getter
@Setter
@MappedSuperclass //says it will be the super class for all the upcoming entity class
public class BaseModel
{
    @Id// PRIMARY KEYY
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name ="ID")
    private int id;
    @Column(name="CREATED_AT")
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String createdBy;
    private String updatedBy;
}
