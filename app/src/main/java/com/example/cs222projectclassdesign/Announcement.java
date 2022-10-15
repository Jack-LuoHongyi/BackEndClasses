package com.example.cs222projectclassdesign;

import com.google.gson.Gson;

public class Announcement {
  private String title_;
  private String content_;
  private String date_;
  private String publisher_;
  private String link_;

  public Announcement(String title_, String content, String date_, String publisher_, String link_) {
    this.title_ = title_;
    this.content_ = content;
    this.date_ = date_;
    this.publisher_ = publisher_;
    this.link_ = link_;
  }

  public String getContent() {
    return content_;
  }

  public String getDate_() {
    return date_;
  }

  public String getPublisher_() {
    return publisher_;
  }

  public String getTitle_() {
    return title_;
  }

  public String getLink_() {
    return link_;
  }

  public void setContent(String content_) {
    this.content_ = content_;
  }

  public void setDate_(String date_) {
    this.date_ = date_;
  }

  public void setPublisher_(String publisher_) {
    this.publisher_ = publisher_;
  }

  public void setTitle_(String title_) {
    this.title_ = title_;
  }

  public void setLink_(String link_) {
    this.link_ = link_;
  }

//  public Announcement(String jsonString) {
//    Gson gson = new Gson();
//    Announcement announcement = null;
//    try {
//      announcement = gson.fromJson(jsonString, Announcement.class);
//    } catch (Exception e) {
//      System.out.println("Error: " + e.getMessage());
//    }
//    if (announcement != null) {
//      this.content = announcement.content;
//      this.date_ = announcement.date_;
//      this.publisher_ = announcement.publisher_;
//      this.title_ = announcement.title_;
//      this.link_ = announcement.link_;
//    }
//  }
}
