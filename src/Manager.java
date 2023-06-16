public class Manager extends Employee {
    public static void salaryUp(Employee employee, int raise) {
        if (employee.getClass().getSimpleName().equals("Employee")) {
            employee.setSalary(employee.getSalary() + raise);
        }
    }

    public Manager(String firstName, String lastName, int age, String phoneNumber, String position, int salary) {
        super(firstName, lastName, age, phoneNumber, position, salary);
    }
}
