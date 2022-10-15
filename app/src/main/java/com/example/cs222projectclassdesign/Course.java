package com.example.cs222projectclassdesign;

import com.google.gson.Gson;

public class Course {
  private String course_number_ = "CS222";
  private String name_ = "Design";
  private String link_ = "";


//  public Course(String jsonString) {
//    Gson gson = new Gson();
//    Course course = null;
//    try {
//      course = gson.fromJson(jsonString, Course.class);
//    } catch (Exception e) {
//      System.out.println("Error: " + e.getMessage());
//    }
//    if (course != null) {
//      this.course_number_ = course.course_number_;
//      this.name_ = course.name_;
//      this.link_ = course.link_;
//    }
//  }

  Course(String name, String course_number, String link) {
    name_ = name;
    course_number_ = course_number;
    link_ = link;
  }

  public String getName() {
    return name_;
  }

  public String getCourse_number() {
    return course_number_;
  }


  public String getLink() {
    return link_;
  }

  public void setLink_(String link_) {
    this.link_ = link_;
  }

  public void setCourse_number_(String course_number_) {
    this.course_number_ = course_number_;
  }

  public void setName_(String name_) {
    this.name_ = name_;
  }
}
