package scoreboard;

import java.util.List;

public class Cricket {
    private List<Player> players;
    private int over;

    public Cricket(List<Player> players, int over) {
        this.players = players;
        this.over = over;
    }
}
