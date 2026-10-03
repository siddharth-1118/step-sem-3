package inheritance_polymorphism.class_problems;

public class DeliveryFeeCalculator {

    public static abstract class DeliveryOrder {
        protected double distanceKm;

        public DeliveryOrder(double distanceKm) {
            this.distanceKm = distanceKm;
        }

        public abstract double calculateDeliveryFee();
    }

    public static class StandardDelivery extends DeliveryOrder {
        public StandardDelivery(double distanceKm) { super(distanceKm); }
        @Override
        public double calculateDeliveryFee() {
            double fee = distanceKm * 5.0;
            return Math.max(fee, 50.0);
        }
    }

    public static class ExpressDelivery extends DeliveryOrder {
        public ExpressDelivery(double distanceKm) { super(distanceKm); }
        @Override
        public double calculateDeliveryFee() {
            return (distanceKm * 10.0) + 100.0;
        }
    }

    public static class SameDayDelivery extends DeliveryOrder {
        public SameDayDelivery(double distanceKm) { super(distanceKm); }
        @Override
        public double calculateDeliveryFee() {
            return (distanceKm * 15.0) + 200.0;
        }
    }

    public static void main(String[] args) {
        DeliveryOrder[] orders = {
            new StandardDelivery(8),
            new ExpressDelivery(12),
            new SameDayDelivery(5)
        };

        for (DeliveryOrder order : orders) {
            System.out.println("Fee: Rs " + order.calculateDeliveryFee());
        }
    }
}
