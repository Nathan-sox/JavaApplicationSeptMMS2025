public class App {

    public static void main(String[] args) throws Exception {
        Employee employee;

        employee = new FullTimeEmployee();
        employee.calculateSalary();

        employee = new PartTimeEmployee();
        employee.calculateSalary();

        employee = new ContractEmployee();
        employee.calculateSalary();
    }
}
