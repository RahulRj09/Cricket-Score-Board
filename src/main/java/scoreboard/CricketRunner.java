package scoreboard;

import java.util.Arrays;
import java.util.List;

public class CricketRunner {
    public static void main(String[] args) {
        List<Player> ind = Arrays.asList(new Player("rahul"), new Player("nitesh"),
                new Player("pralhad"), new Player("pavan"));
        List<Player> pak = Arrays.asList(new Player("mohit"), new Player("aman"),
                new Player("pankaj"), new Player("pk"));
        Cricket firstInning = new Cricket(ind,pak, 4);
        firstInning.play();
        Board board = new Board(firstInning.getPlayers(),firstInning.getBowlers(), firstInning.getOver());
        board.print();
        Cricket secondInning = new Cricket(pak,ind,8);
        secondInning.play();
        Board board1 = new Board(secondInning.getPlayers(),secondInning.getBowlers(),secondInning.getOver());

    }
}
