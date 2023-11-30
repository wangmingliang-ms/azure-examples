package com.microsoft.azure.toolkit.example.connector.sqlserver.spring;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Pet {
    @Id
    private Integer id;
    private String name;
}
