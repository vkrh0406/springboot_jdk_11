package com.ciss.test.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ciss.test.dto.ServiceDto;

@RestController
@RequestMapping("/api/service")
public class ServiceController {

    @GetMapping("/")
    public ResponseEntity<ServiceDto> getData(@ModelAttribute ServiceDto serviceDto) {
        return ResponseEntity.ok(serviceDto);
    }

    @PostMapping("/")
    public ResponseEntity<ServiceDto> createData(@RequestBody ServiceDto serviceDto) {
        return ResponseEntity.ok(serviceDto);
    }
}
