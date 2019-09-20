package scoreboard;

import java.util.List;

public class Team {
    List<Player> players;
    String name;
    public Team(List<Player> players, String name) {
        this.players = players;
        this.name = name;
    }
}
