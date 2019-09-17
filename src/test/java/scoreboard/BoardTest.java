package scoreboard;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BoardTest {
    @Test
    public void shouldBeCalculateTheBatsmanBattingStrikeRate() {
        List<Player> batsman = new ArrayList<>();
        List<Player> bowlers = new ArrayList<>();
        Board board = new Board(batsman, bowlers, 2);
        assertEquals(104.00000, board.calculateStrikeRate(93, 89), 0);
    }

    @Test
    public void shouldBeCalculateTheBowlerEconomyRate() {
        List<Player> batsman = new ArrayList<>();
        List<Player> bowlers = new ArrayList<>();
        Board board = new Board(batsman, bowlers, 2);
        assertEquals(3.00000, board.calculateEconomyRate(3, 1), 0);
    }

    @Test
    public void shouldBeCalculateTheCurrentRunRate() {
        List<Player> batsman = new ArrayList<>();
        List<Player> bowlers = new ArrayList<>();
        Board board = new Board(batsman, bowlers, 2);
        assertEquals(15.0, board.getCurrentRunRate(30, 2), 0);
    }

}