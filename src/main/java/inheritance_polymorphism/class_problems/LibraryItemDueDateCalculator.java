package inheritance_polymorphism.class_problems;

public class LibraryItemDueDateCalculator {

    public static abstract class LibraryItem {
        private String title;

        public LibraryItem(String title) {
            this.title = title;
        }

        public String getTitle() { return title; }
        public abstract int getLoanDays();
    }

    public static class Book extends LibraryItem {
        public Book(String title) { super(title); }
        @Override
        public int getLoanDays() { return 14; }
    }

    public static class Magazine extends LibraryItem {
        public Magazine(String title) { super(title); }
        @Override
        public int getLoanDays() { return 7; }
    }

    public static class Dvd extends LibraryItem {
        public Dvd(String title) { super(title); }
        @Override
        public int getLoanDays() { return 3; }
    }

    public static void main(String[] args) {
        LibraryItem[] items = {
            new Book("Effective Java"),
            new Magazine("National Geographic"),
            new Dvd("Inception")
        };

        for (LibraryItem item : items) {
            System.out.println(item.getTitle() + " loan period: " + item.getLoanDays() + " days");
        }
    }
}
