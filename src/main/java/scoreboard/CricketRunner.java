package scoreboard;

import java.util.Arrays;
import java.util.List;

public class CricketRunner {
    public static void main(String[] args) {
        List<Player> players = Arrays.asList(new Player("rahul"), new Player("nitesh"),
                new Player("pralhad"), new Player("pavan"));
        Cricket cricket = new Cricket(players, 4);
        cricket.play();
        Board board = new Board(cricket.getPlayers(), cricket.getOver());
        board.print();
    }
}
