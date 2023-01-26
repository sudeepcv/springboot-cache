package com.sudeepcv.springbootcache.service;

import com.sudeepcv.springbootcache.entity.Person;

import java.util.List;
import java.util.Optional;


public interface PersonService {
    Optional<List<Person>> findAll();
}
