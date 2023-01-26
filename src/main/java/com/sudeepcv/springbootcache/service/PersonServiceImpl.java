package com.sudeepcv.springbootcache.service;

import com.sudeepcv.springbootcache.entity.Person;
import com.sudeepcv.springbootcache.repository.PersonRepository;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class PersonServiceImpl implements PersonService{

    PersonRepository personRepository;

    public PersonServiceImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    @Cacheable(value = "person")
    public Optional<List<Person>> findAll() {
        return Optional.of(personRepository.findAll());
    }
}
