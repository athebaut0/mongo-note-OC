package com.example.mdbspringboot.controller;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface ItemRepository extends MongoRepository<NoteItem, String> {
	
	@Query("{patId:'?0'}")
	List<NoteItem> findItemByPatId(String patId);
	
}
