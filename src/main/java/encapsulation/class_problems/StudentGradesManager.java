package encapsulation.class_problems;

import java.util.Arrays;

public class StudentGradesManager {

    public static class StudentGrades {
        private int[] grades;
        private int count;

        public StudentGrades(int capacity) {
            this.grades = new int[capacity];
            this.count = 0;
        }

        public void addGrade(int grade) {
            if (grade >= 0 && grade <= 100 && count < grades.length) {
                grades[count++] = grade;
            }
        }

        public int[] getGrades() {
            return Arrays.copyOf(grades, count);
        }

        public double getAverage() {
            if (count == 0) return 0.0;
            double sum = 0;
            for (int i = 0; i < count; i++) {
                sum += grades[i];
            }
            return sum / count;
        }
    }

    public static void main(String[] args) {
        StudentGrades sg = new StudentGrades(10);
        sg.addGrade(85);
        sg.addGrade(90);
        sg.addGrade(95);

        System.out.println("Grades: " + Arrays.toString(sg.getGrades()));
        System.out.println("Average: " + sg.getAverage());
    }
}
