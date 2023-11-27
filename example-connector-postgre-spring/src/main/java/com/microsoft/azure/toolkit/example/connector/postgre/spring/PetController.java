package com.microsoft.azure.toolkit.example.connector.postgre.spring;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequiredArgsConstructor
@RequestMapping("/demo")
public class PetController {
    @Autowired
    private final PetRepository repo;
    @Value("${spring.datasource.url}")
    private String springDatasourceUrl;

    @GetMapping("/datasource")
    @ResponseBody
    public String url() {
        return springDatasourceUrl;
    }

    @PostMapping(path = "/pets")
    @ResponseBody
    public Pet addPet(@RequestBody Pet pet) {
        return repo.save(pet);
    }

    @GetMapping(path = "/pets")
    @ResponseBody
    public Iterable<Pet> getAllPets() {
        return repo.findAll();
    }

    @GetMapping(path = "/pets/{id}")
    @ResponseBody
    public Pet getPet(@PathVariable("id") Integer id) {
        return repo.findById(id).orElse(null);
    }

    @PutMapping(path = "/pets")
    @ResponseBody
    public Pet putPet(@RequestBody Pet pet) {
        return repo.save(pet);
    }

    @DeleteMapping(path = "/pets/{id}")
    @ResponseBody
    public Iterable<Pet> deletePet(@PathVariable("id") Integer id) {
        repo.deleteById(id);
        return getAllPets();
    }
}
