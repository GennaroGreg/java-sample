package org.example.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;
import java.util.UUID;

@RestController
@RequestMapping("/controller/")
public class SampleController {

    @RequestMapping("/uuid")
    public ResponseEntity<String> getUUID() {
        return ResponseEntity.ok(UUID.randomUUID().toString());
    }
}
