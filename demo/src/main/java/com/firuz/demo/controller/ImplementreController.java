package com.firuz.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.firuz.demo.entity.Implementer;

@RestController
@RequestMapping("/api/implementers")
public class ImplementreController {

    @GetMapping("/report")
    public ResponseEntity<Implementer> showImplementers() {
        Implementer impl = new Implementer();
        impl.setFirstName("Firuz");
        impl.setLastName("Chamarov");

        return new ResponseEntity<Implementer>(impl, HttpStatus.OK);
    }
}
