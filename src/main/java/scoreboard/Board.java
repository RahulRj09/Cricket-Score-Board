package scoreboard;


import java.util.List;

public class Board {

    private final List<Player> batsman;
    private final int over;
    private final List<Player> bowlers;
    private int totalScore = 0;

    public Board(List<Player> batsman, List<Player> bowlers, int over) {
        this.batsman = batsman;
        this.bowlers = bowlers;
        this.over = over;
    }


    void print() {
        System.out.printf("%67s\n", "  Batsman  -----------------------------------------------------");
        System.out.printf("%20s   %10s %10s %15s\n", "Player Name", "Runs", "Balls", "Strike Rate");
        for (Player player : batsman) {
            double strikeRate = calculateStrikeRate(player.getBatsmanRuns(), player.getBatsmanTotalPlayedBalls());
            System.out.printf("%20s   %10d %10d %15f \n", player.getName(), player.getBatsmanRuns(), player.getBatsmanTotalPlayedBalls(), strikeRate);
            setTotalScore(player.getBatsmanRuns());
        }
        double currentRunRate = getCurrentRunRate(totalScore, over);
        System.out.printf("%55s %5f %5d\n", "------------------------------------------ ", currentRunRate, totalScore);
        System.out.println("\n");
        System.out.printf("%67s\n", "  Bowler  -----------------------------------------------------");
        System.out.printf("%20s   %10s %10s %15s %15s\n", "Player Name", "Runs", "Over", "wickets", "EconomyRate");
        for (Player player : bowlers) {
            int over = player.getBowlerTotalThrowBalls() / 6;
            double economyRate = calculateEconomyRate(player.getBowlerRuns(), over);
            System.out.printf("%20s %10d %10d %15d %15f\n", player.getName(), player.getBowlerRuns(),
                    over, player.getWickets(), economyRate);

        }
    }

    public double getCurrentRunRate(int score, int over) {
        return score / over;
    }

    private void setTotalScore(int score) {
        totalScore += score;
    }

    public double calculateEconomyRate(int bowlerRuns, int over) {
        try {
            return bowlerRuns / over;
        } catch (ArithmeticException e) {
            return 0.0;
        }
    }

    public double calculateStrikeRate(int score, int ball) {
        try {
            return (score * 100) / ball;
        } catch (ArithmeticException e) {
            return 0.0;
        }

    }
}
