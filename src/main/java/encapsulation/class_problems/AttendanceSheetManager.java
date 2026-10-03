package encapsulation.class_problems;

public class AttendanceSheetManager {

    public static class AttendanceSheet {
        private String[] presentStudents;
        private int count;

        public AttendanceSheet(int capacity) {
            this.presentStudents = new String[capacity];
            this.count = 0;
        }

        public void markPresent(String studentName) {
            if (studentName == null || isPresent(studentName)) return;
            if (count < presentStudents.length) {
                presentStudents[count++] = studentName;
            }
        }

        public boolean isPresent(String studentName) {
            for (int i = 0; i < count; i++) {
                if (presentStudents[i].equalsIgnoreCase(studentName)) {
                    return true;
                }
            }
            return false;
        }

        public int getPresentCount() {
            return count;
        }
    }

    public static void main(String[] args) {
        AttendanceSheet sheet = new AttendanceSheet(30);
        sheet.markPresent("Ana");
        sheet.markPresent("Ben");
        sheet.markPresent("Ana");

        System.out.println("Present count: " + sheet.getPresentCount());
        System.out.println("Ben present: " + sheet.isPresent("Ben"));
    }
}
