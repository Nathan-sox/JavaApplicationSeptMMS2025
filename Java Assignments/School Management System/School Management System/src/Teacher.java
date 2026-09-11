import java.util.ArrayList;
import java.util.List;

public class Teacher {
    private String name;
    private ArrayList<Course> courses = new ArrayList<>();

    public Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
        }
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void displayCourses() {
        for (Course course : courses) {
            System.out.println("- " + course.getName());
        }
    }
}