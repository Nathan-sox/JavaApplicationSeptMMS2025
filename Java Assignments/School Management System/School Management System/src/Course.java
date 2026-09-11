import java.util.ArrayList;
import java.util.List;

public class Course {
    private String name;
    private Teacher teacher;
    private Classroom classroom;
    private ArrayList<Student> students = new ArrayList<>();

    public Course(String name, Teacher teacher, Classroom classroom) {
        this.name = name;
        this.teacher = teacher;
        this.classroom = classroom;
        teacher.addCourse(this);
        classroom.addCourse(this);
    }

    public String getName() {
        return name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    public List<Student> getStudents() {
        return students;
    }

    public void displayStudents() {
        for (Student student : students) {
            System.out.println("- " + student.getName());
        }
    }
}