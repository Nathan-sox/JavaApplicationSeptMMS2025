public class App {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Dr. Ada Lovelace");
        Classroom classroom = new Classroom("Room 101");

        Course programming = new Course("Programming Fundamentals", teacher, classroom);
        Course databases = new Course("Database Systems", teacher, classroom);

        Student amina = new Student("Amina Yusuf");
        Student brian = new Student("Brian Okafor");

        amina.enrollIn(programming);
        amina.enrollIn(databases);
        brian.enrollIn(programming);

        System.out.println("Students registered for " + programming.getName() + ":");
        programming.displayStudents();

        System.out.println("\nCourses taught by " + teacher.getName() + ":");
        teacher.displayCourses();
    }
}
