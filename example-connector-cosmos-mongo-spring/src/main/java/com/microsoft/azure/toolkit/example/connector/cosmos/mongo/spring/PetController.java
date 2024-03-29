/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for
 * license information.
 */

package com.microsoft.azure.toolkit.example.connector.cosmos.mongo.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;


@Controller
@RequestMapping(path = "/pets")
public class PetController {

    /**
     * using spring data source defined in application.properties,autowire petrepository as an entity.
     */
    @Autowired
    private PetRepository petRepository;

    /**
     * createPet used the spring framework to create the sql statement using the method save(...).
     *
     * @param pet
     * @return String like "Added ......"
     */
    @PostMapping
    public @ResponseBody String createPet(@RequestBody Pet pet) {
        pet.setId(UUID.randomUUID());
        petRepository.save(pet);
        return String.format("Added %s.", pet);
    }

    /**
     * getAllPets used the spring framework to create the sql statement using the method findAll().
     *
     * @return all pets you created
     */
    @GetMapping
    public @ResponseBody Iterable<Pet> getAllPets() {
        return petRepository.findAll();
    }

    /**
     * getPet used the spring framework to create the sql statement using the method findById(...)
     *
     * @param id
     * @return the pet by id
     */
    @GetMapping("/{id}")
    public @ResponseBody Optional<Pet> getPet(@PathVariable UUID id) {
        return petRepository.findById(id);
    }

    /**
     * deletePet used the spring framework to create the sql statement using the method deleteById(...)
     *
     * @param id
     * @return String like "Deleted (id)"
     */
    @DeleteMapping("/{id}")
    public @ResponseBody String deletePet(@PathVariable UUID id) {
        petRepository.deleteById(id);
        return "Deleted " + id;
    }
}
