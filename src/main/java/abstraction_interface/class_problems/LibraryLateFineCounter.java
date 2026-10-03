package abstraction_interface.class_problems;

public class LibraryLateFineCounter {

    public static abstract class LibraryItem {
        private String title;
        protected int daysLate;

        public LibraryItem(String title, int daysLate) {
            this.title = title;
            this.daysLate = daysLate;
        }

        public String getTitle() { return title; }
        public abstract double calculateFine();
    }

    public static class BookItem extends LibraryItem {
        public BookItem(String title, int daysLate) { super(title, daysLate); }
        @Override
        public double calculateFine() {
            return daysLate * 2.0;
        }
    }

    public static class DvdItem extends LibraryItem {
        public DvdItem(String title, int daysLate) { super(title, daysLate); }
        @Override
        public double calculateFine() {
            double fine = daysLate * 5.0;
            return Math.min(fine, 50.0);
        }
    }

    public static class MagazineItem extends LibraryItem {
        public MagazineItem(String title, int daysLate) { super(title, daysLate); }
        @Override
        public double calculateFine() {
            return daysLate * 1.0;
        }
    }

    public static void processFines(LibraryItem[] items) {
        double totalFines = 0;
        for (LibraryItem item : items) {
            double fine = item.calculateFine();
            totalFines += fine;
            System.out.printf("%s: %.2f%n", item.getTitle(), fine);
        }
        System.out.printf("Total Fines: %.2f%n", totalFines);
    }

    public static void main(String[] args) {
        LibraryItem[] items = {
            new BookItem("Algebra", 4),
            new DvdItem("Inception", 12),
            new MagazineItem("Sports", 3)
        };
        processFines(items);
    }
}
