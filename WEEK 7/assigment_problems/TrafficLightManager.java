
public class TrafficLightManager {

    public static class TrafficLight {
        private final String lightId;
        private String color;

        public TrafficLight(String lightId) {
            this.lightId = lightId;
            this.color = "RED";
        }

        public void next() {
            switch (color) {
                case "RED":
                    color = "GREEN";
                    break;
                case "GREEN":
                    color = "YELLOW";
                    break;
                case "YELLOW":
                    color = "RED";
                    break;
            }
        }

        public String getColor() {
            return color;
        }

        public String getLightId() {
            return lightId;
        }
    }

    public static void main(String[] args) {
        TrafficLight t = new TrafficLight("TL-9");
        System.out.println(t.getColor());
        t.next();
        System.out.println(t.getColor());
        t.next();
        System.out.println(t.getColor());
        t.next();
        System.out.println(t.getColor());
    }
}