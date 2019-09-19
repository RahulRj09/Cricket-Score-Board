package scoreboard;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

public class ScoreBoardTest {
    @Test
    public void shouldBeCalculateTheBatsmanBattingStrikeRate() {
        List<Player> batsman = new ArrayList<>();
        List<Player> bowlers = new ArrayList<>();
        ScoreBoard scoreBoard = new ScoreBoard(batsman, bowlers, 2, 2);
        assertEquals(104.00000, scoreBoard.calculateStrikeRate(93, 89), 0);
    }

    @Test
    public void shouldBeCalculateTheBowlerEconomyRate() {
        List<Player> batsman = new ArrayList<>();
        List<Player> bowlers = new ArrayList<>();
        ScoreBoard scoreBoard = new ScoreBoard(batsman, bowlers, 2, 2);
        assertEquals(3.00000, scoreBoard.calculateEconomyRate(3, 1), 0);
    }

    @Test
    public void shouldBeCalculateTheCurrentRunRate() {
        List<Player> batsman = new ArrayList<>();
        List<Player> bowlers = new ArrayList<>();
        ScoreBoard scoreBoard = new ScoreBoard(batsman, bowlers, 2, 2);
        assertEquals(15.0, scoreBoard.getCurrentRunRate(30, 2), 0);
    }

    @Test
    public void shouldBeSetWicket() {
        List<Player> batsman = Arrays.asList(new Player("rahul"), new Player("nitesh"),new Player("aman"));
        Player bowler = new Player("pk");
        List<Player> bowlers = new ArrayList<>();
        bowlers.add(bowler);
        Cricket cricket = spy(new Cricket(batsman, bowlers, 1));
        when(cricket.getRun()).thenReturn(5);
        cricket.play();
        assertEquals(2, bowler.getWickets());
    }
}