package scoreboard;

import java.util.Random;

public class Player {
    private String name;
    private int batsmanRuns;
    private int bowlerRuns;
    private int wickets;
    private int ball;

    public Player(String name) {
        this.name = name;
        this.batsmanRuns = 0;
        this.wickets = 0;
        this.ball = 0;
        this.bowlerRuns = 0;
    }

    public int getBowlerRuns() {
        return bowlerRuns;
    }

    public void setBowlerRuns(int bowlerRuns) {
        this.bowlerRuns += bowlerRuns;
    }

    int play() {
        int run = getRun();
        if (run != 5) {
            setBatsmanRuns(run);
        }
        return run;
    }

    private int getRun() {
        return new Random().nextInt(6) + 1;
    }

    private void setBatsmanRuns(int batsmanRuns) {
        this.batsmanRuns += batsmanRuns;
    }

    int getBatsmanRuns() {
        return batsmanRuns;
    }

    String getName() {
        return name;
    }

    int getBall() {
        return ball;
    }

    void setBall() {
        this.ball += 1;
    }

    public int getWickets() {
        return wickets;
    }

    public void setWickets(int wickets) {
        this.wickets += wickets;
    }
}
