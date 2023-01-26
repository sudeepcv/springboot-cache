package com.sudeepcv.springbootcache;

import com.sudeepcv.springbootcache.entity.Person;
import com.sudeepcv.springbootcache.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

import javax.annotation.PostConstruct;

@SpringBootApplication
@EnableCaching
public class SpringbootCacheApplication {

	@Autowired
	PersonRepository personRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootCacheApplication.class, args);
	}

	@PostConstruct
	public void addPeople(){

		for(int i=0;i<10;i++){
			Person person=new Person();
			person.setName("sudeep "+i);
			person.setAge(33+i);
			personRepository.save(person);
		}

	}

}
