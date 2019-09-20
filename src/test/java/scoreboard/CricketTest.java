package scoreboard;

import org.junit.Test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

public class CricketTest {
    @Test
    public void shouldBePlay() {
        List<Player> ind = Arrays.asList(new Player("rahul"), new Player("nitesh"),
                new Player("pralhad"), new Player("pavan"));
        List<Player> pak = Arrays.asList(new Player("mohit"), new Player("aman"),
                new Player("pankaj"), new Player("pk"));
        Team india = new Team(ind, "india");
        Team pakistan = new Team(pak, "pakistan");
        Cricket firstInning = new Cricket(india, pakistan, 4);
        firstInning.play();
        ScoreBoard scoreBoard = new ScoreBoard(firstInning.getBatsman().getPlayers(), firstInning.getBowlers().getPlayers(), firstInning.getOver(), firstInning.getTotalWickets());
    }


    @Test
    public void shouldBeSetWicket() {
        List<Player> batsman = Arrays.asList(new Player("rahul"), new Player("nitesh"), new Player("aman"));
        Player bowler = new Player("pk");
        List<Player> bowlers = new ArrayList<>();
        bowlers.add(bowler);
        Team india = new Team(batsman, "india");
        Team pakistan = new Team(bowlers, "pakistan");
        Cricket cricket= new Cricket(india, pakistan, 4);
        when(cricket.getRun()).thenReturn(5);
        cricket.play();
        assertEquals(2, bowler.getWickets());
    }

    @Test
    public void shouldBeSetBowlerRun() {
        List<Player> batsman = Arrays.asList(new Player("rahul"), new Player("nitesh"), new Player("aman"));
        Player bowler = new Player("pk");
        List<Player> bowlers = new ArrayList<>();
        bowlers.add(bowler);
        Team india = new Team(batsman, "india");
        Team pakistan = new Team(bowlers, "pakistan");
        Cricket cricket = spy(new Cricket(india, pakistan, 1));
        when(cricket.getRun()).thenReturn(1);
        cricket.play();
        assertEquals(6, bowler.getBowlerRuns());
    }

    @Test
    public void shouldBeSetBatsmanRun() {
        List<Player> batsman = Arrays.asList(new Player("rahul"), new Player("nitesh"), new Player("aman"));
        Player bowler = new Player("pk");
        List<Player> bowlers = new ArrayList<>();
        bowlers.add(bowler);
        Team india = new Team(batsman, "india");
        Team pakistan = new Team(bowlers, "pakistan");
        Cricket cricket = spy(new Cricket(india, pakistan, 1));
        when(cricket.getRun()).thenReturn(1);
        cricket.play();
        assertEquals(3, batsman.get(0).getBatsmanRuns());
    }

    @Test
    public void shouldBeBatsmanRotate() {
        List<Player> batsman = Arrays.asList(new Player("rahul"), new Player("nitesh"), new Player("aman"));
        Player bowler = new Player("pk");
        List<Player> bowlers = new ArrayList<>();
        bowlers.add(bowler);
        Team india = new Team(batsman, "india");
        Team pakistan = new Team(bowlers, "pakistan");
        Cricket cricket = spy(new Cricket(india, pakistan, 1));
        when(cricket.getRun()).thenReturn(1);
        cricket.play();
        assertEquals(0, cricket.getCurrentBatsmanIndex());
    }
}