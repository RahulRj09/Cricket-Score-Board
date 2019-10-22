package scoreboard;

import java.util.List;
import java.util.Random;

public class Cricket {

    private Team bowlers;
    private Team batsman;
    private int over;
    private int currentBatsmanIndex = 0;
    private int currentBowlerIndex;
    private int totalBalls = 0;
    private int playedBatsman = 1;
    private int firstBat = 0;
    private int secondBat = 1;
    private int totalWickets = 0;

    public Cricket(Team batsman, Team bowlers, int over) {
        this.batsman = batsman;
        this.over = over;
        this.bowlers = bowlers;
        this.currentBowlerIndex = bowlers.getPlayers().size() - 1;
        this.totalBalls = bowlers.getPlayers().size() * 6;
    }

    public void play() {
        List<Player> batsman = this.batsman.getPlayers();
        List<Player> bowlers = this.bowlers.getPlayers();
        for (int i = 1; i <= over * 6; i++) {
            Player currentPlayer = batsman.get(currentBatsmanIndex);
            int run = getRun();
            currentPlayer.setBatsmanTotalPlayedBalls();
            Player bowler = bowlers.get(currentBowlerIndex);
            bowler.setBall();
            if (run == 5) {
                bowler.setWickets(1);
                setTotalWickets();
                if (getTotalWickets() == batsman.size() - 1) {
                    break;
                }
                if (this.firstBat == this.currentBatsmanIndex) {
                    this.firstBat = this.playedBatsman;
                } else {
                    this.secondBat = this.playedBatsman;
                }
                this.playedBatsman++;
            } else {
                bowler.setBowlerRuns(run);
                currentPlayer.setBatsmanRuns(run);
                this.batsman.setTotalScore(run);
            }
            if (i % 6 == 0) {
                if (this.totalBalls == i) {
                    this.currentBowlerIndex = bowlers.size();
                    this.totalBalls += bowlers.size() * 6;
                }
                this.currentBowlerIndex -= 1;
            }
            ScoreBoard scoreBoard = new ScoreBoard(batsman, bowlers, over, getTotalWickets(), getBatsman().getTotalScore(),getBatsman().getName());
            scoreBoard.print();
            if (run == 1 || run == 3) {
                rotateBatsman();
            }
            System.out.println(getBatsman().getTotalScore()+""+ getBatsman().getName());
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

    public int getRun() {
        return new Random().nextInt(6) + 1;
    }

    public int getTotalWickets() {
        return totalWickets;
    }

    private void setTotalWickets() {
        this.totalWickets += 1;
    }

    public int getCurrentBatsmanIndex() {
        return currentBatsmanIndex;
    }

    public Team getBowlers() {
        return bowlers;
    }

    public Team getBatsman() {
        return batsman;
    }
}
