package abstraction_interface.class_problems;

public class GardenPlotAreaReport {

    public static abstract class GardenPlot {
        private String owner;
        private String shape;

        public GardenPlot(String owner, String shape) {
            this.owner = owner;
            this.shape = shape;
        }

        public String getOwner() { return owner; }
        public String getShape() { return shape; }
        public abstract double calculateArea();
    }

    public static class CirclePlot extends GardenPlot {
        private double radius;

        public CirclePlot(String owner, double radius) {
            super(owner, "CIRCLE");
            this.radius = radius;
        }

        @Override
        public double calculateArea() {
            return Math.PI * radius * radius;
        }
    }

    public static class RectanglePlot extends GardenPlot {
        private double length;
        private double width;

        public RectanglePlot(String owner, double length, double width) {
            super(owner, "RECTANGLE");
            this.length = length;
            this.width = width;
        }

        @Override
        public double calculateArea() {
            return length * width;
        }
    }

    public static class TrianglePlot extends GardenPlot {
        private double base;
        private double height;

        public TrianglePlot(String owner, double base, double height) {
            super(owner, "TRIANGLE");
            this.base = base;
            this.height = height;
        }

        @Override
        public double calculateArea() {
            return 0.5 * base * height;
        }
    }

    public static void generateReport(GardenPlot[] plots) {
        double totalArea = 0;
        for (GardenPlot p : plots) {
            double area = p.calculateArea();
            totalArea += area;
            System.out.printf("%s (%s): %.2f%n", p.getOwner(), p.getShape(), area);
        }
        System.out.printf("Total Area: %.2f%n", totalArea);
    }

    public static void main(String[] args) {
        GardenPlot[] plots = {
            new CirclePlot("Asha", 5),
            new RectanglePlot("Ravi", 4, 6),
            new TrianglePlot("Neha", 10, 3)
        };
        generateReport(plots);
    }
}
