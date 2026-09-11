public class ContractEmployee extends Employee {

    @Override
    public double calculateSalary() {
        System.out.println("Contract Employee calculate salary");
        return 0;
    }

}
