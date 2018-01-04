package com.example.person.repository;

import com.example.person.domain.Person;
import com.example.person.domain.PersonDocument;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Repository
public interface PersonRepository {

    public static List<PersonDocument> documents = Arrays.asList(
            new PersonDocument(UUID.randomUUID().toString(), UUID.randomUUID().toString(), PersonDocument.Type.RG),
            new PersonDocument(UUID.randomUUID().toString(), UUID.randomUUID().toString(), PersonDocument.Type.CPF),
            new PersonDocument(UUID.randomUUID().toString(), UUID.randomUUID().toString(), PersonDocument.Type.CNH)
    );
    public static List<Person> persons = Arrays.asList(
            new Person(UUID.randomUUID().toString(), UUID.randomUUID().toString(), Person.Type.CUSTOMER, documents),
            new Person(UUID.randomUUID().toString(), UUID.randomUUID().toString(), Person.Type.CUSTOMER, documents),
            new Person(UUID.randomUUID().toString(), UUID.randomUUID().toString(), Person.Type.CUSTOMER, documents),
            new Person(UUID.randomUUID().toString(), UUID.randomUUID().toString(), Person.Type.CUSTOMER, documents),
            new Person(UUID.randomUUID().toString(), UUID.randomUUID().toString(), Person.Type.CUSTOMER, documents)
    );


}
