package classes_and_objects_revision.class_problems;

public class StudentCollegeManager {

    public static class Student {
        private String name;
        private double attendance;
        public static String collegeName = "SRM Institute of Science and Technology";
        public static int studentCount = 0;

        public Student(String name, double attendance) {
            this.name = name;
            this.attendance = attendance;
            studentCount++;
        }

        public static void printCollegeInfo() {
            System.out.println(collegeName);
            System.out.println("Students created: " + studentCount);
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("Aarav", 85.0);
        Student s2 = new Student("Bhavna", 92.5);

        Student.printCollegeInfo();
    }
}
