public class App {
    public static void main(String[] args) throws Exception {
        Teacher teacher1 = new Teacher("Mr. Jacob", 32, "Science", 150000);
        Student student1 = new Student("Charles", 14, "Geography", 150000);

        teacher1.displayDetails();
        student1.displayDetails();

    }
}
