package dev.dinesh.BookMyshow.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@MappedSuperclass //says it will be the super class for all the upcoming entity class
public class BaseModel
{
    @Id// PRIMARY KEYY
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String createdBy;
    private String updatedBy;
}
