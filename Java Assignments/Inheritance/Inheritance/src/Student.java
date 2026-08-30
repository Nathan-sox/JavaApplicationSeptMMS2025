public class Student extends Person {
    private String course;
    private int level;

    public Student(String name, int age, String course, int level) {
        super(name, age);
        this.course = course;
        this.level = level;
    }

    // Overriden methods
    @Override
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println("Level: " + level);
    }
}
