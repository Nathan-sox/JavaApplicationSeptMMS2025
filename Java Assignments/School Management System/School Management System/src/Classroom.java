import java.util.ArrayList;
import java.util.List;

public class Classroom {
    private String name;
    private ArrayList<Course> courses = new ArrayList<>();

    public Classroom(String name) {
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
}