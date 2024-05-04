package dev.dinesh.BookMyshow.model;

import com.fasterxml.jackson.databind.ser.Serializers;
import dev.dinesh.BookMyshow.model.constants.SeatStatus;
import dev.dinesh.BookMyshow.model.constants.SeatType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

import java.awt.print.Book;

@Getter
@Setter
@Entity

public class Seat extends BaseModel {
    private int row;
    private int col;
    private String seatNumber;
    @Enumerated(EnumType.STRING)
    private SeatType seatType;
    @Enumerated(EnumType.STRING)
    private SeatStatus seatstatus;
}
