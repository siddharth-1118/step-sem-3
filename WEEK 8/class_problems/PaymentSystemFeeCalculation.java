
public class PaymentSystemFeeCalculation {

    public static abstract class PaymentMethod {
        private String name;

        public PaymentMethod(String name) {
            this.name = name;
        }

        public String getName() { return name; }
        public abstract double calculateFee(double amount);
    }

    public static class CreditCard extends PaymentMethod {
        public CreditCard() { super("Credit Card"); }
        @Override
        public double calculateFee(double amount) {
            return amount * 0.025;
        }
    }

    public static class Upi extends PaymentMethod {
        public Upi() { super("UPI"); }
        @Override
        public double calculateFee(double amount) {
            return 0.0;
        }
    }

    public static class BankTransfer extends PaymentMethod {
        public BankTransfer() { super("Bank Transfer"); }
        @Override
        public double calculateFee(double amount) {
            return 15.0;
        }
    }

    public static void main(String[] args) {
        PaymentMethod[] methods = { new CreditCard(), new Upi(), new BankTransfer() };
        double amount = 1000.0;

        for (PaymentMethod pm : methods) {
            System.out.println(pm.getName() + " Fee for Rs " + amount + ": Rs " + pm.calculateFee(amount));
        }
    }
}