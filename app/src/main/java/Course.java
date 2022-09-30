import java.util.List;
import java.util.ArrayList;

public class Course {
  private String course_number_ = "CS222";
  private String name_ = "Design";
  private String link_ = "";

  private List<Assignment> assignments_;
  private List<Announcement> announcements_;

  public Course(String file) {

  }

  public String getName() {
    return name_;
  }

  public String getCourse_number() {
    return course_number_;
  }

  public List<Announcement> getAnnouncements() {
    return announcements_;
  }

  public List<Assignment> getAssignments() {
    return assignments_;
  }

  public String getLink() {
    return link_;
  }

  public void addAssignments(Assignment assignment) {
    assignments_.add(assignment);
  }

  public void addAnnouncement(Announcement announcement) {
    announcements_.add(announcement);
  }
}
