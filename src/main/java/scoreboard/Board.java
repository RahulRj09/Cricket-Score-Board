package scoreboard;

import java.util.List;

public class Board {
    private List<Player> players;
    private int totalScore = 0;

    public Board(List<Player> players) {
        this.players = players;
    }

    private int over;

    void print() {
        System.out.printf("%67s\n", "  Batsman  -----------------------------------------------------");
        System.out.printf("%20s   %10s %10s %15s\n", "Player Name", "Runs", "Balls", "Strike Rate");
        for (Player player : players) {
            if (player.getBatsmanRuns() != 0) {
                over += player.getBall() / 6;
                double strikeRate = calculateStrikeRate(player.getBatsmanRuns(), player.getBall());
                System.out.printf("%20s   %10d %10d %15f \n", player.getName(), player.getBatsmanRuns(), player.getBall(), strikeRate);
                setTotalScore(player.getBatsmanRuns());
            }
        }
        System.out.printf("%67s\n", "  Total ----------------------------------------------------- " + totalScore);
        System.out.println("\n");
        System.out.printf("%67s\n", "  Bowler  -----------------------------------------------------");
        System.out.printf("%20s   %10s %10s %15s %15s\n", "Player Name", "Runs", "Over", "wickets", "EconomyRate");
        for (Player player : players) {
            if (player.getBowlerRuns() != 0) {
                int over = player.getBall() / 6;
                double economyRate = calculateEconomyRate(player.getBowlerRuns(), over);
                System.out.printf("%20s %10d %10d %15d %15f\n", player.getName(), player.getBowlerRuns(),
                        over, player.getWickets(), economyRate);
            }
        }
    }

    private void setTotalScore(int score) {
        totalScore += score;
    }

    public double calculateEconomyRate(int bowlerRuns, int over) {
        return bowlerRuns / over;
    }

    public double calculateStrikeRate(int score, int ball) {
        return (score * 100) / ball;
    }
}
