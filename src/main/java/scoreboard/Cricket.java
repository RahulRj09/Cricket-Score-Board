package scoreboard;

import java.util.List;

public class Cricket {
    private List<Player> players;
    private int over;
    private int currentPlayerIndex = 0;

    public Cricket(List<Player> players, int over) {
        this.players = players;
        this.over = over;
    }

    public void play() {
        Player currentPlayer = players.get(currentPlayerIndex);
        for (int i = 0; i < over * 6; i++) {
            int run = currentPlayer.play();
            if (run % 2 != 0 && currentPlayerIndex == 0) {
                currentPlayerIndex = 1;
            }
            if (run % 2 != 0 && currentPlayerIndex == 1) {
                currentPlayerIndex = 0;
            }
        }
    }
}
