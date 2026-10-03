package inheritance_polymorphism.assigment_problems;

public class CanteenBillingCounter {

    public static abstract class Customer {
        private String type;
        protected double amount;

        public Customer(String type, double amount) {
            this.type = type;
            this.amount = amount;
        }

        public String getType() { return type; }
        public abstract double calculateFinalAmount();
    }

    public static class StudentCustomer extends Customer {
        public StudentCustomer(double amount) { super("STUDENT", amount); }
        @Override
        public double calculateFinalAmount() {
            return amount * 0.90;
        }
    }

    public static class StaffCustomer extends Customer {
        public StaffCustomer(double amount) { super("STAFF", amount); }
        @Override
        public double calculateFinalAmount() {
            return amount * 0.95;
        }
    }

    public static class GuestCustomer extends Customer {
        public GuestCustomer(double amount) { super("GUEST", amount); }
        @Override
        public double calculateFinalAmount() {
            return amount + 10.0;
        }
    }

    public static void processBills(Customer[] customers) {
        double total = 0;
        for (Customer c : customers) {
            double finalAmt = c.calculateFinalAmount();
            total += finalAmt;
            System.out.printf("%s: %.2f%n", c.getType(), finalAmt);
        }
        System.out.printf("Total: %.2f%n", total);
    }

    public static void main(String[] args) {
        Customer[] customers = {
            new StudentCustomer(200),
            new StaffCustomer(300),
            new GuestCustomer(150)
        };
        processBills(customers);
    }
}
