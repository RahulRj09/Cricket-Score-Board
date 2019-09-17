package scoreboard;

import java.util.List;
import java.util.Random;

public class Cricket {
    private List<Player> players;
    private int over;
    private int currentPlayerIndex;
    private int currentBowlerIndex;

    public Cricket(List<Player> batsman, List<Player> bowlers, int over) {
        this.players = batsman;
        this.over = over;
        this.currentPlayerIndex = 0;
        this.currentBowlerIndex = bowlers.size() - 1;
    }

    public void play() {
        for (int i = 1; i <= over * 6; i++) {
            Player currentPlayer = players.get(currentPlayerIndex);
            int run = getRun();
            currentPlayer.setBatsmanRuns(run);
            currentPlayer.setBatsmanTotalPlayedBalls();
            Player bowler = players.get(currentBowlerIndex);
            bowler.setBall();
            if (run == 5) {
                bowler.setWickets(1);
            } else {
                bowler.setBowlerRuns(run);
            }
            if (i % 6 == 0) {
                this.currentBowlerIndex -= 1;
            }
            Board board = new Board(players, over);
            board.print();
            currentPlayerIndex = run % 2;
        }
    }

    public int getOver() {
        return over;
    }

    public List<Player> getPlayers() {
        return players;
    }

    private int getRun() {
        return new Random().nextInt(6) + 1;
    }
}
