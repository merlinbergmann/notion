package com.greenfoxacademy.notion.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "notions_data")
public class Notion {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String title;
  private String content;
  private int voting;
  private LocalDateTime createDate;

  public Notion() {
    createDate = LocalDateTime.now();
  }

  public Notion(String title, String content) {
    this.title = title;
    this.content = content;
    createDate = LocalDateTime.now();
  }

}
