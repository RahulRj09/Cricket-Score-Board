package scoreboard;

import java.util.List;

public class Cricket {
    private List<Player> players;
    private int over;
    private int currentPlayerIndex;
    private int currentBowlerIndex;

    public Cricket(List<Player> players, int over) {
        this.players = players;
        this.over = over;
        this.currentPlayerIndex = 0;
        this.currentBowlerIndex = players.size() - 2;
    }

    public void play() {
        for (int i = 1; i <= over * 6; i++) {
            Player currentPlayer = players.get(currentPlayerIndex);
            int run = currentPlayer.play();
            currentPlayer.setBatsmanTotalPlayedBalls();
            Player bowler = players.get(currentBowlerIndex);
            bowler.setBall();
            if (run == 5) {
                bowler.setWickets(1);
            } else {
                bowler.setBowlerRuns(run);
            }
            if (i % 6 == 0) {
                this.currentBowlerIndex = getCurrentBowlerIndex(currentBowlerIndex);
            }
            Board board = new Board(players,over);
            board.print();
            currentPlayerIndex = run % 2;
        }
    }

    private int getCurrentBowlerIndex(int i) {
        if (i == players.size() - 2) {
            return players.size() - 1;
        }
        return players.size() - 2;
    }

    public int getOver() {
        return over;
    }

    public List<Player> getPlayers() {
        return players;
    }
}
