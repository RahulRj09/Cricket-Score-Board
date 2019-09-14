package scoreboard;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BoardTest {
    @Test
    public void shouldBeCalculateTheBatsmanBattingStrikeRate() {
        List<Player> players = new ArrayList<>();
        Board board = new Board(players);
        assertEquals(104.00000, board.calculateStrikeRate(93, 89),0);
    }
    @Test
    public void shouldBeCalculateTheBowlerEconomyRate(){
        List<Player> players = new ArrayList<>();
        Board board = new Board(players);
        assertEquals(3.00000,board.calculateEconomyRate(3,1),0);
    }

}