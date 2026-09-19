

public class Scorecard {

    private final boolean[] answers;
    private int answerCount;

    public Scorecard(int totalQuestions) {
        answers = new boolean[totalQuestions];
        answerCount = 0;
    }

    public void recordAnswer(boolean correct) {
        if (answerCount < answers.length) {
            answers[answerCount] = correct;
            answerCount++;
        } else {
            System.out.println("Answer rejected: question limit reached");
        }
    }

    public int getScore() {
        int score = 0;

        for (int i = 0; i < answerCount; i++) {
            if (answers[i]) {
                score++;
            }
        }

        return score;
    }

    public static void main(String[] args) {

        Scorecard sc = new Scorecard(4);

        sc.recordAnswer(true);
        sc.recordAnswer(true);
        sc.recordAnswer(false);
        sc.recordAnswer(true);

        System.out.println("Final score: " + sc.getScore());
    }
}