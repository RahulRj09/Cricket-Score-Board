package scoreboard;

import java.util.Random;

public class Player {
    private String name;
    private int score;
    private int wickets;

    public Player(String name, int score, int wickets) {
        this.name = name;
        this.score = score;
        this.wickets = wickets;
    }

    public int play() {
        int run = getRun();
        setScore(run);
        return run;

    }

    private int getRun() {
        return new Random().nextInt(6) + 1;
    }

    public void setScore(int score) {
        this.score += score;
    }

    public int getScore() {
        return score;
    }
}
