package scoreboard;

import java.util.ArrayList;
import java.util.List;

public class CricketRunner {
    public static void main(String[] args) {
        List<Player> players = new ArrayList<>();
        Player rahul = new Player("rahul");
        Player nitesh = new Player("nitesh");
        Player pralhad = new Player("pralhad");
        Player pavan = new Player("pavan");
        players.add(rahul);
        players.add(nitesh);
        players.add(pralhad);
        players.add(pavan);
        Cricket cricket = new Cricket(players, 2);
        int over = cricket.getOver();
        cricket.play();
        Board board = new Board(players, over);
        board.print();
    }
}
