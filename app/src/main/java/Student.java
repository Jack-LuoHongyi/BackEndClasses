import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;



public class Student {
  private String name_ = "student";
  private String username_ = "unknown";
  private String password_ = "unknown";


  private Map<String, Course> courses_;


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

  public void setCourses(String file) {}

  public Map<String, Course> getCourses() {
    return courses_;
  }

}
