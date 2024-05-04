package dev.dinesh.BookMyshow.model;

import dev.dinesh.BookMyshow.model.constants.PaymentMode;
import dev.dinesh.BookMyshow.model.constants.PaymentStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity

public class Payment extends BaseModel{
    private LocalDateTime paymentTime;
    private double amount;
    private String referenceID;
    @ManyToOne
    private Ticket ticket;
    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus;
    @Enumerated(EnumType.STRING)
    private PaymentMode paymentMode;

}
