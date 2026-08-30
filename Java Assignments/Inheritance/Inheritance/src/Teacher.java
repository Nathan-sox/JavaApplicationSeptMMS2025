public class Teacher extends Person {
    private String department;
    private double salary;

    public Teacher(String name, int age, String department, double salary) {
        super(name, age);
        this.department = department;
        this.salary = salary;
    }

    // Overriden methods
    @Override
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}
