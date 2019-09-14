package scoreboard;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CricketTest {
    @Test
    public void shouldBePlay() {
        List<Player> players = new ArrayList<>();
        Player rahul = new Player("rahul");
        Player nitesh = new Player("nitesh");
        players.add(rahul);
        players.add(nitesh);
        Cricket cricket = new Cricket(players, 1);
        cricket.play();
        Board board = new Board(players, over);
    }
}