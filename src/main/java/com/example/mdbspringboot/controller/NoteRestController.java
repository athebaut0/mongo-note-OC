package com.example.mdbspringboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoteRestController {

  @Autowired
  private ItemRepository itemRepository;
  

  @GetMapping("all")
  public List<NoteItem> all() {
    return itemRepository.findAll();
  }
  
  @GetMapping("patId={patId}")
  public List<NoteItem> getOne(@PathVariable String patId) {
    return itemRepository.findItemByPatId(patId);
  }

  @PostMapping
  public NoteItem updateOne(@RequestBody NoteItem noteItem) {
    return itemRepository.save(noteItem);
  }
  
}
