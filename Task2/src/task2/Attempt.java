
package task2;

public class Attempt {
    private int attempt;
    private double score;

    public Attempt(int attempt, double score) {
        this.attempt = attempt;
        this.score = score;
    }

    public int getAttempt() {
        return attempt;
    }

    public double getScore() {
        return score;
    }

    public void setAttempt(int attempt) {
        this.attempt = attempt;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
