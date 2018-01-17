package com.greenfoxacademy.notion.controllers;

import com.greenfoxacademy.notion.factories.NotionFactory;
import com.greenfoxacademy.notion.models.Notion;
import com.greenfoxacademy.notion.services.NotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class NotionController {

  @Autowired
  NotionService notionService;
  @Autowired
  NotionFactory notionFactory;

  @GetMapping({"/notion"})
  public String showIndexPage(Model model) {
    List<Notion> notions = notionService.getAllNotions();
    model.addAttribute("notions", notions);
    return "index";
  }

  @GetMapping({"/notion/add"})
  public String showAddPage(Model model) {
    model.addAttribute("newNotion", notionFactory.getEmptyNotion());
    return "addnotion";
  }
}
