
package task2;


public class Routine {
    private String description;
    private int difficultyRating;

    public Routine(String description, int difficultyRating) {
        this.description = description;
        this.difficultyRating = difficultyRating;
    }

    public String getDescription() {
        return description;
    }

    public int getDifficultyRating() {
        return difficultyRating;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDifficultyRating(int difficultyRating) {
        this.difficultyRating = difficultyRating;
    } 
}
