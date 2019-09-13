package scoreboard;

import java.util.ArrayList;
import java.util.List;

public class CricketRunner {
    public static void main(String[] args) {
        List<Player> players = new ArrayList<>();
        Player rahul = new Player("rahul");
        Player nitesh = new Player("nitesh");
        Player pralhad = new Player("pralhad");
        players.add(rahul);
        players.add(nitesh);
        players.add(pralhad);
        Cricket cricket = new Cricket(players, 1);
        cricket.play();
        Board board = new Board(players);
        board.print();
    }
}
