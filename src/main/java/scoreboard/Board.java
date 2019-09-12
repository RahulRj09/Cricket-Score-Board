package scoreboard;

import java.util.List;

public class Board {
    List<Player> players;

    public Board(List<Player> players) {
        this.players = players;
    }

    void print() {
        System.out.printf("%20s   %5s \n", "Player Name" , "Score");
        for (Player player : players) {
            System.out.printf("%20s   %5d \n", player.getName(), player.getScore());

        }
    }

}
