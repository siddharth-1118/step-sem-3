package abstraction_interface.class_problems;

public class ElectricityConnectionBilling {

    public static abstract class ElectricityConnection {
        private String type;
        protected int units;

        public ElectricityConnection(String type, int units) {
            this.type = type;
            this.units = units;
        }

        public String getType() { return type; }
        public abstract double calculateBill();
    }

    public static class HomeConnection extends ElectricityConnection {
        public HomeConnection(int units) { super("HOME", units); }
        @Override
        public double calculateBill() {
            if (units <= 100) {
                return units * 5.0;
            } else {
                return (100 * 5.0) + ((units - 100) * 7.0);
            }
        }
    }

    public static class ShopConnection extends ElectricityConnection {
        public ShopConnection(int units) { super("SHOP", units); }
        @Override
        public double calculateBill() {
            return (units * 8.0) + 100.0;
        }
    }

    public static class FactoryConnection extends ElectricityConnection {
        public FactoryConnection(int units) { super("FACTORY", units); }
        @Override
        public double calculateBill() {
            double bill = units * 6.0;
            return Math.max(bill, 1000.0);
        }
    }

    public static void processBilling(ElectricityConnection[] connections) {
        double total = 0;
        for (ElectricityConnection conn : connections) {
            double bill = conn.calculateBill();
            total += bill;
            System.out.printf("%s: %.2f%n", conn.getType(), bill);
        }
        System.out.printf("Total: %.2f%n", total);
    }

    public static void main(String[] args) {
        ElectricityConnection[] connections = {
            new HomeConnection(150),
            new ShopConnection(90),
            new FactoryConnection(120)
        };
        processBilling(connections);
    }
}
