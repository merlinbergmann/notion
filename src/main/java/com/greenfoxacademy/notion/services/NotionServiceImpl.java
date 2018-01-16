package com.greenfoxacademy.notion.services;

import com.greenfoxacademy.notion.models.Notion;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotionServiceImpl implements NotionService {

  @Override
  public List<Notion> getAllNotions() {
    return null;
  }

  @Override
  public Notion getNotionById(int id) {
    return null;
  }

  @Override
  public void modifyNotion(Notion notion) {

  }

  @Override
  public void deleteNotion(int id) {

  }

  @Override
  public void addNotion(Notion notion) {

  }
}
