package scoreboard;

import java.util.Arrays;
import java.util.List;

public class CricketRunner {
    public static void main(String[] args) {
        List<Player> batsman = Arrays.asList(new Player("rahul"), new Player("nitesh"),
                new Player("pralhad"), new Player("pavan"));
        List<Player> bowlers = Arrays.asList(new Player("rahul"), new Player("nitesh"),
                new Player("pralhad"), new Player("pavan"));
        Cricket cricket = new Cricket(batsman,bowlers, 4);
        cricket.play();
        Board board = new Board(cricket.getPlayers(),cricket.getBowlers(), cricket.getOver());
        board.print();
    }
}
