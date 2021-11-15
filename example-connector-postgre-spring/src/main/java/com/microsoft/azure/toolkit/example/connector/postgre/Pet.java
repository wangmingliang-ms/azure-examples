package com.microsoft.azure.toolkit.example.connector.postgre;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Pet {
    @Id
    private Integer id;
    private String name;
}
