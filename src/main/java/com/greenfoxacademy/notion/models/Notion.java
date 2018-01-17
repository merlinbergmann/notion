package com.greenfoxacademy.notion.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
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

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
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

  public void setCreateDate(LocalDateTime createDate) {
    this.createDate = createDate;
  }
}
