package com.greenfoxacademy.notion.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String userName;

  @OneToMany
  private List<Notion> userNotions;

  public User() {
  }

  public User(String userName) {
    this.userName = userName;
  }

}
