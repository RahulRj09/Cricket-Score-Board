package scoreboard;

import java.util.ArrayList;
import java.util.List;

public class CricketRunner {
    public static void main(String[] args) {
        List<Player> players = new ArrayList<>();
        Player rahul = new Player("rahul", 0, 0);
        Player nitesh = new Player("nitesh", 0, 0);
        players.add(rahul);
        players.add(nitesh);
        Cricket cricket = new Cricket(players, 1);
        cricket.play();
        Board board = new Board(players);
        board.print();
    }
}
