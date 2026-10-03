package inheritance_polymorphism.class_problems;

public class ExaminationQuestionGrader {

    public static abstract class Question {
        protected String questionText;
        protected int maxMarks;

        public Question(String questionText, int maxMarks) {
            this.questionText = questionText;
            this.maxMarks = maxMarks;
        }

        public abstract int gradeAnswer(String answer);
    }

    public static class MultipleChoiceQuestion extends Question {
        private String correctOption;

        public MultipleChoiceQuestion(String questionText, int maxMarks, String correctOption) {
            super(questionText, maxMarks);
            this.correctOption = correctOption;
        }

        @Override
        public int gradeAnswer(String answer) {
            return (correctOption.equalsIgnoreCase(answer.trim())) ? maxMarks : 0;
        }
    }

    public static class TrueFalseQuestion extends Question {
        private boolean correctAnswer;

        public TrueFalseQuestion(String questionText, int maxMarks, boolean correctAnswer) {
            super(questionText, maxMarks);
            this.correctAnswer = correctAnswer;
        }

        @Override
        public int gradeAnswer(String answer) {
            boolean userAns = Boolean.parseBoolean(answer.trim());
            return (userAns == correctAnswer) ? maxMarks : 0;
        }
    }

    public static void main(String[] args) {
        Question q1 = new MultipleChoiceQuestion("Java is compiled to?", 5, "Bytecode");
        Question q2 = new TrueFalseQuestion("Java supports multiple inheritance for classes?", 5, false);

        System.out.println("Q1 marks: " + q1.gradeAnswer("Bytecode"));
        System.out.println("Q2 marks: " + q2.gradeAnswer("false"));
    }
}
