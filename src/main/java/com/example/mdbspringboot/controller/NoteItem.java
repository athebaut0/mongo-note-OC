package com.example.mdbspringboot.controller;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Document("NoteItem")
@Getter
@Setter
public class NoteItem {

  @Id
  private String id;
  
  private String patId;
  private String patient;
  private String note;

}
