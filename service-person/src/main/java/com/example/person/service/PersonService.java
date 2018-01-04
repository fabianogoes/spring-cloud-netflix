package com.example.person.service;

import com.example.person.domain.Person;
import com.example.person.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {


    public List<Person> get() {
        return PersonRepository.persons;
    }

    public Person get(String id) {
        return PersonRepository.persons
                .stream()
                .filter(p -> p.getId().equalsIgnoreCase(id))
                .findAny()
                .orElse(null);
    }
}
