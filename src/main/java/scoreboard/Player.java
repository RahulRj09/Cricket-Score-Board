package scoreboard;

import java.util.Random;

public class Player {
    private String name;
    private int batsmanRuns;
    private int bowlerRuns;
    private int wickets;
    private int batsmanTotalPlayedBalls;
    private int bowlerTotalThrowBalls;

    public Player(String name) {
        this.name = name;
        this.batsmanRuns = 0;
        this.wickets = 0;
        this.bowlerTotalThrowBalls = 0;
        this.bowlerRuns = 0;
        this.batsmanTotalPlayedBalls = 0;
    }

    public int getBowlerRuns() {
        return bowlerRuns;
    }

    public void setBowlerRuns(int bowlerRuns) {
        this.bowlerRuns += bowlerRuns;
    }

    void setBatsmanRuns(int batsmanRuns) {
        this.batsmanRuns += batsmanRuns;
    }

    int getBatsmanRuns() {
        return batsmanRuns;
    }

    String getName() {
        return name;
    }

    int getBowlerTotalThrowBalls() {
        return bowlerTotalThrowBalls;
    }

    void setBall() {
        this.bowlerTotalThrowBalls += 1;
    }

    public int getWickets() {
        return wickets;
    }

    public void setWickets(int wickets) {
        this.wickets += wickets;
    }

    public int getBatsmanTotalPlayedBalls() {
        return batsmanTotalPlayedBalls;
    }

    public void setBatsmanTotalPlayedBalls() {
        this.batsmanTotalPlayedBalls += 1;
    }
}
