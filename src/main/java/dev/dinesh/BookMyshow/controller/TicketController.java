package dev.dinesh.BookMyshow.controller;

import dev.dinesh.BookMyshow.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketController {

    @Autowired //create dependency object and inject inside controller
    private TicketService ticketService;

    @GetMapping("/Hello")
    public ResponseEntity greet() {
        String greet = ticketService.greet();
        return ResponseEntity.ok(greet);
    }

}
