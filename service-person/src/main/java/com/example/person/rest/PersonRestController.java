package com.example.person.rest;

import com.example.person.service.PersonService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "person", tags = "API to manager Persons")
@RestController
@RequestMapping("/api/v1/persons")
public class PersonRestController {

    @Autowired
    private PersonService service;

    @GetMapping
    public ResponseEntity<?> get(){
        return ResponseEntity.ok(service.get());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> get(@PathVariable("id") String id){
        return ResponseEntity.ok(service.get(id));
    }

}
