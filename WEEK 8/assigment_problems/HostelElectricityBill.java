
public class HostelElectricityBill {

    public static abstract class Room {
        private String type;
        protected int units;

        public Room(String type, int units) {
            this.type = type;
            this.units = units;
        }

        public String getType() { return type; }
        public abstract double calculateBill();
    }

    public static class SingleRoom extends Room {
        public SingleRoom(int units) { super("SINGLE", units); }
        @Override
        public double calculateBill() {
            return units * 8.0;
        }
    }

    public static class SharedRoom extends Room {
        private int occupants;

        public SharedRoom(int units, int occupants) {
            super("SHARED", units);
            this.occupants = (occupants > 0) ? occupants : 1;
        }

        @Override
        public double calculateBill() {
            return (units * 6.0) / occupants;
        }
    }

    public static class AcRoom extends Room {
        public AcRoom(int units) { super("AC", units); }
        @Override
        public double calculateBill() {
            return (units * 10.0) + 200.0;
        }
    }

    public static void processRooms(Room[] rooms) {
        double total = 0;
        for (Room r : rooms) {
            double bill = r.calculateBill();
            total += bill;
            System.out.printf("%s: %.2f%n", r.getType(), bill);
        }
        System.out.printf("Total: %.2f%n", total);
    }

    public static void main(String[] args) {
        Room[] rooms = {
            new SingleRoom(120),
            new SharedRoom(150, 3),
            new AcRoom(100)
        };
        processRooms(rooms);
    }
}