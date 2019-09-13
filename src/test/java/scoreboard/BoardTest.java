package scoreboard;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BoardTest {
    @Test
    public void shouldBeCalculateTheBattingStrikeRate() {
        List<Player> players = new ArrayList<>();
        Board board = new Board(players);
        assertEquals(104, board.calculateStrikeRate(93, 89));
    }
}