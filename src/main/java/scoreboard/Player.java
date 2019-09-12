package scoreboard;

public class Player {
    private String name;
    private int score;
    private int wickets;

    public Player(String name, int score, int wickets) {
        this.name = name;
        this.score = score;
        this.wickets = wickets;
    }

    public void play() {
        int run = getRun();
    }

    private int getRun() {
    }
}
