package com.sudeepcv.springbootcache.controller;

import com.sudeepcv.springbootcache.entity.Person;
import com.sudeepcv.springbootcache.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class PersonController {
    @Autowired
    PersonService personService;
    @GetMapping("/people")
    public ResponseEntity getPeople(){

         Optional<List<Person>> personList=personService.findAll();

        return personList.isEmpty()?ResponseEntity.notFound().build(): ResponseEntity.ok(personList.get());
    }
}
