package inheritance_polymorphism.assigment_problems;

import java.time.LocalDate;

public class StreamingPlanRenewalReminder {

    public static abstract class StreamingPlan {
        private String name;
        protected LocalDate startDate;

        public StreamingPlan(String name, LocalDate startDate) {
            this.name = name;
            this.startDate = startDate;
        }

        public String getName() { return name; }
        public abstract LocalDate calculateRenewalDate();
    }

    public static class BasicPlan extends StreamingPlan {
        public BasicPlan(String name, LocalDate startDate) { super(name, startDate); }
        @Override
        public LocalDate calculateRenewalDate() {
            return startDate.plusDays(30);
        }
    }

    public static class StandardPlan extends StreamingPlan {
        public StandardPlan(String name, LocalDate startDate) { super(name, startDate); }
        @Override
        public LocalDate calculateRenewalDate() {
            return startDate.plusDays(90);
        }
    }

    public static class PremiumPlan extends StreamingPlan {
        public PremiumPlan(String name, LocalDate startDate) { super(name, startDate); }
        @Override
        public LocalDate calculateRenewalDate() {
            return startDate.plusDays(365);
        }
    }

    public static void processSubscribers(StreamingPlan[] plans) {
        for (StreamingPlan p : plans) {
            System.out.println(p.getName() + ": " + p.calculateRenewalDate());
        }
    }

    public static void main(String[] args) {
        StreamingPlan[] plans = {
            new BasicPlan("Asha", LocalDate.parse("2024-01-15")),
            new StandardPlan("Ravi", LocalDate.parse("2024-02-01")),
            new PremiumPlan("Neha", LocalDate.parse("2024-03-10")),
            new BasicPlan("Kiran", LocalDate.parse("2024-12-20"))
        };
        processSubscribers(plans);
    }
}
