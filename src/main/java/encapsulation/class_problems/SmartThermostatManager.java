package encapsulation.class_problems;

public class SmartThermostatManager {

    public static class SmartThermostat {
        private int temperature;
        private final int minTemp = 16;
        private final int maxTemp = 30;

        public SmartThermostat(int initialTemp) {
            setTemperature(initialTemp);
        }

        public void setTemperature(int temp) {
            if (temp < minTemp) {
                this.temperature = minTemp;
            } else if (temp > maxTemp) {
                this.temperature = maxTemp;
            } else {
                this.temperature = temp;
            }
        }

        public int getTemperature() {
            return temperature;
        }
    }

    public static void main(String[] args) {
        SmartThermostat st = new SmartThermostat(22);
        st.setTemperature(35);
        System.out.println("Temperature: " + st.getTemperature());
        st.setTemperature(10);
        System.out.println("Temperature: " + st.getTemperature());
    }
}
