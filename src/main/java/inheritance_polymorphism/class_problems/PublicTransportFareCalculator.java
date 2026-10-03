package inheritance_polymorphism.class_problems;

public class PublicTransportFareCalculator {

    public static abstract class Passenger {
        private String name;

        public Passenger(String name) {
            this.name = name;
        }

        public String getName() { return name; }
        public abstract double calculateFare(double baseFare);
    }

    public static class RegularPassenger extends Passenger {
        public RegularPassenger(String name) { super(name); }
        @Override
        public double calculateFare(double baseFare) {
            return baseFare;
        }
    }

    public static class StudentPassenger extends Passenger {
        public StudentPassenger(String name) { super(name); }
        @Override
        public double calculateFare(double baseFare) {
            return baseFare * 0.50;
        }
    }

    public static class SeniorCitizenPassenger extends Passenger {
        public SeniorCitizenPassenger(String name) { super(name); }
        @Override
        public double calculateFare(double baseFare) {
            return baseFare * 0.60;
        }
    }

    public static void main(String[] args) {
        Passenger[] passengers = {
            new RegularPassenger("Amit"),
            new StudentPassenger("Riya"),
            new SeniorCitizenPassenger("Grandpa")
        };
        double baseFare = 100.0;

        for (Passenger p : passengers) {
            System.out.println(p.getName() + " fare: Rs " + p.calculateFare(baseFare));
        }
    }
}
