package com.example;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface DemoRepository extends CrudRepository<Contact, Long> { 

	 List<Contact> findByName(String name);
}
