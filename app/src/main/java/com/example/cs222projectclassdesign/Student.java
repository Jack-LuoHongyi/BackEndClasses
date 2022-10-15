package com.example.cs222projectclassdesign;

import com.google.gson.Gson;

import java.util.ArrayList;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.Log;


public class Student {
  private String name_ = "student";
  private String username_ = "unknown";
  private String password_ = "unknown";


  private Course[] courses_;
  private Assignment[] assignments_;
  private Announcement[] announcements_;


  public void setName(String name) {
    this.name_ = name;
  }

  public String getName() {
    return name_;
  }

  public void setPassword(String password) {
    this.password_ = password;
  }

  public String getPassword() {
    return password_;
  }

  public void setUsername(String username) {
    this.username_ = username;
  }

  public String getUsername() {
    return username_;
  }

  public  Course[] getCourses() {
    return courses_;
  }

  public  Announcement[] getAnnouncements() {
    return announcements_;
  }

  public Assignment[] getAssignments() {
    return assignments_;
  }

  public void setAnnouncements(Announcement[] announcements_) {
    this.announcements_ = announcements_;
  }

  public void setCourses(Course[] courses_) {
    this.courses_ = courses_;
  }

  public void setAssignments(Assignment[] assignments_) {
    this.assignments_ = assignments_;
  }

  public Student(String name_, String password_, String username_, Assignment[] assignments_, Announcement[] announcements_, Course[] courses_) {
    this.name_ = name_;
    this.password_ = password_;
    this.username_ = username_;
    this.assignments_ = assignments_;
    this.announcements_ = announcements_;
    this.courses_ = courses_;
  }

  public Student(String jsonString) {
    Gson gson = new Gson();
    Student student = null;
    try {
      student = gson.fromJson(jsonString, Student.class);
    } catch (Exception e) {
      System.out.println("Error: " + e.getMessage());
    }
    if (student != null) {
      this.name_ = student.name_;
      this.username_ = student.username_;
      this.password_ = student.password_;
      this.courses_ = student.courses_;
      this.announcements_ = student.announcements_;
      this.assignments_ = student.assignments_;
    }
  }

  public void print() {
    System.out.println(toString());
  }

  public void printCourses() {
    for (Course course : courses_) {
      Log.println(Log.DEBUG, "StudentApp", course.toString());
    }
  }

  public void printAnnouncements() {
    for (Announcement announcement : announcements_) {
      Log.println(Log.DEBUG, "StudentApp", announcement.toString());
    }
  }

  public void printAssignments() {
    for (Assignment assignment : assignments_) {
      Log.println(Log.DEBUG, "StudentApp", assignment.toString());
    }
  }
}
