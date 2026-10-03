package inheritance_polymorphism.assigment_problems;

public class FestivalBonusCalculator {

    public static abstract class Employee {
        private String name;
        protected double monthlySalary;

        public Employee(String name, double monthlySalary) {
            this.name = name;
            this.monthlySalary = monthlySalary;
        }

        public String getName() { return name; }
        public abstract double calculateBonus();
    }

    public static class FullTimeEmployee extends Employee {
        public FullTimeEmployee(String name, double monthlySalary) { super(name, monthlySalary); }
        @Override
        public double calculateBonus() {
            return monthlySalary * 0.10;
        }
    }

    public static class PartTimeEmployee extends Employee {
        public PartTimeEmployee(String name, double monthlySalary) { super(name, monthlySalary); }
        @Override
        public double calculateBonus() {
            return monthlySalary * 0.05;
        }
    }

    public static class InternEmployee extends Employee {
        public InternEmployee(String name, double monthlySalary) { super(name, monthlySalary); }
        @Override
        public double calculateBonus() {
            return 2000.0;
        }
    }

    public static void processEmployees(Employee[] employees) {
        double total = 0;
        for (Employee e : employees) {
            double bonus = e.calculateBonus();
            total += bonus;
            System.out.printf("%s: %.2f%n", e.getName(), bonus);
        }
        System.out.printf("Total Bonus: %.2f%n", total);
    }

    public static void main(String[] args) {
        Employee[] employees = {
            new FullTimeEmployee("Asha", 50000),
            new PartTimeEmployee("Ravi", 30000),
            new InternEmployee("Neha", 15000)
        };
        processEmployees(employees);
    }
}
