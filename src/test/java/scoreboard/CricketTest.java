package scoreboard;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CricketTest {
    @Test
    public void shouldBePlay() {
        List<Player> players = new ArrayList<>();
        Player rahul = new Player("rahul", 0, 0);
        Player nitesh = new Player("nitesh", 0, 0);
        players.add(rahul);
        players.add(nitesh);
        Cricket cricket = new Cricket(players, 1);
        cricket.play();
    }
}