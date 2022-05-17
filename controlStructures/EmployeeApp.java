public class EmployeeApp {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Susan Meyers", 47899, "Accounting", "VP", 89000);
        Employee employee2 = new Employee("Mark Jones", 39119, "IT", "Programmer", 67000);
        Employee employee3 = new Employee("Joy Rogers", 81774, "Manufacturing", "Engineer", 66000);
        // display employees
        System.out.printf("Name: %s, Id Number: %s, Department: %s, Position: %s, salary: %.2f%n",
                employee1.getName(), employee1.getIdNumber(), employee1.getDepartment(), employee1.getPosition(),
                employee1.getsalary());
        System.out.printf("Name: %s, Id Number: %s, Department: %s, Position: %s, salary: %.2f%n",
                employee2.getName(), employee2.getIdNumber(), employee2.getDepartment(), employee2.getPosition(),
                employee2.getsalary());
        System.out.printf("Name: %s, Id Number: %s, Department: %s, Position: %s, salary: %.2f%n",
                employee3.getName(), employee3.getIdNumber(), employee3.getDepartment(), employee3.getPosition(),
                employee3.getsalary());
    }
}
