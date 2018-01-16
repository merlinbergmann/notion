package com.greenfoxacademy.notion.services;

import com.greenfoxacademy.notion.models.Notion;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface NotionService {

  List<Notion> getAllNotions();
  Notion getNotionById(int id);
  void modifyNotion(Notion notion);
  void deleteNotion(int id);
  void addNotion(Notion notion);
}
