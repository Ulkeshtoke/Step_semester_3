
abstract class Question {
    protected String question;
    protected String correctAnswer;
    protected double points;

    public Question(String question, String correctAnswer, double points) {
        this.question = question;
        this.correctAnswer = correctAnswer;
        this.points = points;
    }

    public abstract double grade(String answer);
}

class MCQQuestion extends Question {
    public MCQQuestion(String question, String correctAnswer, double points) {
        super(question, correctAnswer, points);
    }

    @Override
    public double grade(String answer) {
        return answer.equals(correctAnswer) ? points : 0;
    }
}

class TrueFalseQuestion extends Question {
    public TrueFalseQuestion(String question, String correctAnswer, double points) {
        super(question, correctAnswer, points);
    }

    @Override
    public double grade(String answer) {
        return answer.equals(correctAnswer) ? points : 0;
    }
}

class EssayQuestion extends Question {
    private String[] keywords;

    public EssayQuestion(String question, String correctAnswer,
                         String keywords, double points) {
        super(question, correctAnswer, points);
        this.keywords = keywords.split(",");
    }

    @Override
    public double grade(String answer) {
        int count = 0;

        for (String keyword : keywords) {
            if (answer.toLowerCase().contains(keyword.trim().toLowerCase())) {
                count++;
            }
        }

        if (count >= 2) {
            return points * 0.75;
        } else if (count == 1) {
            return points * 0.50;
        }

        return 0;
    }
}

public class ExaminationQuestionGrader {
    public static void main(String[] args) {

        Question[] questions = {
            new MCQQuestion(
                "What is the capital of France?",
                "Paris",
                10
            ),
            new TrueFalseQuestion(
                "The Earth is flat?",
                "False",
                5
            ),
            new EssayQuestion(
                "Name two primary OOP principles.",
                "Inheritance, Polymorphism, Encapsulation",
                "Inheritance, Polymorphism, Encapsulation",
                20
            ),
            new EssayQuestion(
                "Describe abstraction and composition.",
                "Abstraction, Composition",
                "Abstraction, Composition",
                15
            )
        };

        String[] answers = {
            "Paris",
            "True",
            "Polymorphism is one.",
            "I talked about abstraction."
        };

        double total = 0;

        for (int i = 0; i < questions.length; i++) {
            double score = questions[i].grade(answers[i]);

            if (questions[i] instanceof MCQQuestion) {
                System.out.printf("MCQ: %.2f%n", score);
            } else if (questions[i] instanceof TrueFalseQuestion) {
                System.out.printf("TF: %.2f%n", score);
            } else {
                System.out.printf("ESSAY: %.2f%n", score);
            }

            total += score;
        }

        System.out.printf("Total Score: %.2f%n", total);
    }
}