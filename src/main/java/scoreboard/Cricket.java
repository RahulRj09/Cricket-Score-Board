package scoreboard;

import java.util.List;
import java.util.Random;

public class Cricket {
    private final List<Player> bowlers;
    private List<Player> batsman;
    private int over;
    private int currentPlayerIndex;
    private int currentBowlerIndex;

    public Cricket(List<Player> batsman, List<Player> bowlers, int over) {
        this.batsman = batsman;
        this.over = over;
        this.bowlers = bowlers;
        this.currentPlayerIndex = 0;
        this.currentBowlerIndex = bowlers.size() - 1;
    }

    public void play() {
        for (int i = 1; i <= over * 6; i++) {
            Player currentPlayer = batsman.get(currentPlayerIndex);
            int run = getRun();
            currentPlayer.setBatsmanRuns(run);
            currentPlayer.setBatsmanTotalPlayedBalls();
            Player bowler = bowlers.get(currentBowlerIndex);
            bowler.setBall();
            if (run == 5) {
                bowler.setWickets(1);
            } else {
                bowler.setBowlerRuns(run);
            }
            if (i % 6 == 0) {
                if (bowlers.size() * 6 == i) {
                    this.currentBowlerIndex = bowlers.size();
                }
                this.currentBowlerIndex -= 1;
            }
            ScoreBoard scoreBoard = new ScoreBoard(batsman, bowlers, over);
            scoreBoard.print();
            currentPlayerIndex = run % 2;
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

}
