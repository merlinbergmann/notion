package com.greenfoxacademy.notion.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Notion {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
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

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public int getVoting() {
    return voting;
  }

  public void setVoting(int voting) {
    this.voting = voting;
  }

  public LocalDateTime getCreateDate() {
    return createDate;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }
}
