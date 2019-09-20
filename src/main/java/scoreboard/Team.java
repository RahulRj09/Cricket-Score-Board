package scoreboard;

import java.util.List;

public class Team {
    private List<Player> players;
    private String name;
    public Team(List<Player> players, String name) {
        this.players = players;
        this.name = name;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public String getName() {
        return name;
    }
}
