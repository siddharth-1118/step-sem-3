
public class EmployeeCompanyManagement {

    public static class Employee {
        private String empName;
        private double salary;
        public static String companyName = "Bright Horizon Technologies";
        public static int employeeCount = 0;

        public Employee(String empName, double salary) {
            this.empName = empName;
            this.salary = salary;
            employeeCount++;
        }

        public static void printCompanyInfo() {
            System.out.println(companyName);
            System.out.println("Employees on record: " + employeeCount);
        }
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Amit", 50000);
        Employee e2 = new Employee("Neha", 60000);
        Employee e3 = new Employee("Raj", 55000);

        Employee.printCompanyInfo();
    }
}