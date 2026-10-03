
public class TravelBookingCommonFee {

    public static abstract class TravelBooking {
        private String mode;
        protected double distanceKm;
        protected static final double BOOKING_FEE = 50.0;

        public TravelBooking(String mode, double distanceKm) {
            this.mode = mode;
            this.distanceKm = distanceKm;
        }

        public String getMode() { return mode; }
        public abstract double calculateBaseFare();

        public double calculateTotalFare() {
            return calculateBaseFare() + BOOKING_FEE;
        }
    }

    public static class BusBooking extends TravelBooking {
        public BusBooking(double distanceKm) { super("BUS", distanceKm); }
        @Override
        public double calculateBaseFare() {
            return distanceKm * 2.0;
        }
    }

    public static class TrainBooking extends TravelBooking {
        public TrainBooking(double distanceKm) { super("TRAIN", distanceKm); }
        @Override
        public double calculateBaseFare() {
            return distanceKm * 1.5;
        }
    }

    public static class FlightBooking extends TravelBooking {
        public FlightBooking(double distanceKm) { super("FLIGHT", distanceKm); }
        @Override
        public double calculateBaseFare() {
            return 2500.0 + (distanceKm * 4.0);
        }
    }

    public static void processBookings(TravelBooking[] bookings) {
        for (TravelBooking b : bookings) {
            System.out.printf("%s: %.2f%n", b.getMode(), b.calculateTotalFare());
        }
    }

    public static void main(String[] args) {
        TravelBooking[] bookings = {
            new BusBooking(200),
            new TrainBooking(300),
            new FlightBooking(500)
        };
        processBookings(bookings);
    }
}