package scoreboard;

import java.util.List;

public class Cricket {
    private List<Player> players;
    private int over;
    private int currentPlayerIndex;

    public Cricket(List<Player> players, int over) {
        this.players = players;
        this.over = over;
        this.currentPlayerIndex = 0;
    }

    public void play() {
        for (int i = 0; i < over * 6; i++) {
            Player currentPlayer = players.get(currentPlayerIndex);
            int run = currentPlayer.play();
            currentPlayer.setBall();
            Player bowler = players.get(players.size() - 1);
            bowler.setBall();
            if (run == 5) {
                bowler.setWickets(1);
            } else {
                bowler.setBowlerRuns(run);
            }
            currentPlayerIndex = run % 2;
        }
    }
}
