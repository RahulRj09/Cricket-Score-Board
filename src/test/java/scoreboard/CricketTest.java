package scoreboard;

import org.junit.Test;


import java.util.Arrays;
import java.util.List;

public class CricketTest {
    @Test
    public void shouldBePlay() {
        List<Player> ind = Arrays.asList(new Player("rahul"), new Player("nitesh"),
                new Player("pralhad"), new Player("pavan"));
        List<Player> pak = Arrays.asList(new Player("mohit"), new Player("aman"),
                new Player("pankaj"), new Player("pk"));
        Cricket firstInning = new Cricket(ind, pak, 4);
        firstInning.play();
        ScoreBoard scoreBoard = new ScoreBoard(firstInning.getPlayers(), firstInning.getBowlers(), firstInning.getOver(), firstInning.getTotalWickets());
    }
}