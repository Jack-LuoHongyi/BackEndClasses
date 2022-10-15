package com.example.cs222projectclassdesign;

import com.google.gson.Gson;

public class Assignment {
  private String name_;
  private String description_;
  private String due_;
  private String link_;
  private String status_;

  public Assignment(String name_, String description_, String due_, String link_, String status_) {
    this.name_ = name_;
    this.due_ = due_;
    this.description_ = description_;
    this.link_ = link_;
    this.status_ = status_;
  }

  public void setDescription_(String description_) {
    this.description_ = description_;
  }

  public void setDue_(String due_) {
    this.due_ = due_;
  }

  public void setLink_(String link_) {
    this.link_ = link_;
  }

  public void setName_(String name_) {
    this.name_ = name_;
  }

  public void setStatus_(String status_) {
    this.status_ = status_;
  }

  public String getDescription_() {
    return description_;
  }

  public String getDue_() {
    return due_;
  }

  public String getLink_() {
    return link_;
  }

  public String getName_() {
    return name_;
  }

  public String getStatus_() {
    return status_;
  }

//  public Assignment(String jsonString) {
//    Gson gson = new Gson();
//    Assignment assignment = null;
//    try {
//      assignment = gson.fromJson(jsonString, Assignment.class);
//    } catch (Exception e) {
//      System.out.println("Error: " + e.getMessage());
//    }
//    if (assignment != null) {
//      this.name_ = assignment.name_;
//      this.description_ = assignment.description_;
//      this.due_ = assignment.due_;
//      this.link_ = assignment.link_;
//      this.status_ = assignment.status_;
//    }
//  }
}
