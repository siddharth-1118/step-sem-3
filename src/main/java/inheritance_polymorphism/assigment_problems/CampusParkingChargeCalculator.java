package inheritance_polymorphism.assigment_problems;

public class CampusParkingChargeCalculator {

    public static abstract class Vehicle {
        private String type;
        protected int hours;

        public Vehicle(String type, int hours) {
            this.type = type;
            this.hours = hours;
        }

        public String getType() { return type; }
        public abstract double calculateCharge();
    }

    public static class Bike extends Vehicle {
        public Bike(int hours) { super("BIKE", hours); }
        @Override
        public double calculateCharge() {
            return hours * 10.0;
        }
    }

    public static class Car extends Vehicle {
        public Car(int hours) { super("CAR", hours); }
        @Override
        public double calculateCharge() {
            if (hours <= 0) return 0.0;
            return 30.0 + (hours - 1) * 20.0;
        }
    }

    public static class Truck extends Vehicle {
        public Truck(int hours) { super("TRUCK", hours); }
        @Override
        public double calculateCharge() {
            double charge = hours * 50.0;
            return Math.max(charge, 100.0);
        }
    }

    public static void processVehicles(Vehicle[] vehicles) {
        double total = 0;
        for (Vehicle v : vehicles) {
            double charge = v.calculateCharge();
            total += charge;
            System.out.printf("%s: %.2f%n", v.getType(), charge);
        }
        System.out.printf("Total: %.2f%n", total);
    }

    public static void main(String[] args) {
        Vehicle[] vehicles = {
            new Bike(3),
            new Car(4),
            new Truck(1),
            new Car(1)
        };
        processVehicles(vehicles);
    }
}
