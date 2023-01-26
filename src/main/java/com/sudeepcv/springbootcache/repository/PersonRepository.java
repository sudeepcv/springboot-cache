package com.sudeepcv.springbootcache.repository;

import com.sudeepcv.springbootcache.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface PersonRepository  extends JpaRepository<Person,Long> {

//    @Cacheable(value = "person")
//    Optional<List<Person>> findByNameStartingWith(String name);
}
