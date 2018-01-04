package com.example.person.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Person {

    public enum Type {
        CUSTOMER
    }

    private String id;
    private String name;
    private Type type;
    private List<PersonDocument> documents;

}
