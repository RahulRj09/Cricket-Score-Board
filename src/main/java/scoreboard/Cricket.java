package scoreboard;

import java.util.List;
import java.util.Random;

public class Cricket {
    private final List<Player> bowlers;
    private List<Player> batsman;
    private int over;
    private int currentBatsmanIndex = 0;
    private int currentBowlerIndex;
    private int totalBalls = 0;
    private int firstBat = 0;
    private int secondBat = 1;
    private int wickets =0;

    public Cricket(List<Player> batsman, List<Player> bowlers, int over) {
        this.batsman = batsman;
        this.over = over;
        this.bowlers = bowlers;
        this.currentBowlerIndex = bowlers.size() - 1;
        this.totalBalls = bowlers.size() * 6;
    }

    public void play() {

        for (int i = 1; i <= over * 6; i++) {
            Player currentPlayer = batsman.get(currentBatsmanIndex);
            int run = getRun();
            currentPlayer.setBatsmanRuns(run);
            currentPlayer.setBatsmanTotalPlayedBalls();
            Player bowler = bowlers.get(currentBowlerIndex);
            bowler.setBall();
            if (run == 5) {
                bowler.setWickets(1);
                setWickets(1);
                if(getWickets()==batsman.size()-1){
                    break;
                }
            } else {
                bowler.setBowlerRuns(run);
            }
            if (i % 6 == 0) {
                if (this.totalBalls == i) {
                    this.currentBowlerIndex = bowlers.size();
                    this.totalBalls += bowlers.size() * 6;
                }
                this.currentBowlerIndex -= 1;
            }
            ScoreBoard scoreBoard = new ScoreBoard(batsman, bowlers, over);
            scoreBoard.print();
            if (run == 1 || run == 3) {
                rotateBatsman();
            }
        }
    }

    private void rotateBatsman() {
        if (currentBatsmanIndex == firstBat) {
            currentBatsmanIndex = secondBat;
        } else {
            currentBatsmanIndex = firstBat;
        }
    }

    public int getOver() {
        return over;
    }

    public List<Player> getPlayers() {
        return batsman;
    }

    private int getRun() {
        return new Random().nextInt(6) + 1;
    }

    public List<Player> getBowlers() {
        return bowlers;
    }

    public int getWickets() {
        return wickets;
    }

    public void setWickets(int wickets) {
        this.wickets += wickets;
    }
}
