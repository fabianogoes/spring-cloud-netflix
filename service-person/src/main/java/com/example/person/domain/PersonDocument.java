package com.example.person.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PersonDocument {

    public enum Type {
        RG,
        CPF,
        CNH
    }

    private String id;
    private String number;
    private Type type;

}
