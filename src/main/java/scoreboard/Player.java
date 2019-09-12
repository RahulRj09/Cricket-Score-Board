package scoreboard;

import java.util.Random;

public class Player {
    private String name;
    private int score;
    private int wickets;
    private int ball;
    public Player(String name) {
        this.name = name;
        this.score = 0;
        this.wickets = 0;
        this.ball = 0;
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

    public String getName() {
        return name;
    }

    public int getBall() {
        return ball;
    }

    public void setBall() {
        this.ball += 1;
    }
}
