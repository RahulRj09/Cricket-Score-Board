package scoreboard;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;


public class ScoreBoardTest {
    @Test
    public void shouldBeCalculateTheBatsmanBattingStrikeRate() {
        List<Player> batsman = new ArrayList<>();
        List<Player> bowlers = new ArrayList<>();
        ScoreBoard scoreBoard = new ScoreBoard(batsman, bowlers, 2, 2, this.batsman.getTotalScore());
        assertEquals(104.00000, scoreBoard.calculateStrikeRate(93, 89), 0);
    }

    @Test
    public void shouldBeCalculateTheBowlerEconomyRate() {
        List<Player> batsman = new ArrayList<>();
        List<Player> bowlers = new ArrayList<>();
        ScoreBoard scoreBoard = new ScoreBoard(batsman, bowlers, 2, 2, this.batsman.getTotalScore());
        assertEquals(3.00000, scoreBoard.calculateEconomyRate(3, 1), 0);
    }

    @Test
    public void shouldBeCalculateTheCurrentRunRate() {
        List<Player> batsman = new ArrayList<>();
        List<Player> bowlers = new ArrayList<>();
        ScoreBoard scoreBoard = new ScoreBoard(batsman, bowlers, 2, 2, this.batsman.getTotalScore());
        assertEquals(15.0, scoreBoard.getCurrentRunRate(30, 2), 0);
    }


}