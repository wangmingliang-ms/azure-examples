package com.microsoft.azure.toolkit.example.connector.sqlserver;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetRepository extends CrudRepository<Pet, Integer> {

}
