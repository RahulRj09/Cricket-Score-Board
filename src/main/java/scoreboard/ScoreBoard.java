package scoreboard;


import java.util.List;

public class ScoreBoard {

    private final List<Player> batsman;
    private final int over;
    private final List<Player> bowlers;
    private final int wickets;
    private int totalScore = 0;

    public ScoreBoard(List<Player> batsman, List<Player> bowlers, int over, int wickets) {
        this.batsman = batsman;
        this.bowlers = bowlers;
        this.over = over;
        this.wickets = wickets;
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
        System.out.printf("%55s %5f %1d %1s %1d\n", "------------------------------------------ ", currentRunRate,wickets,"-",totalScore);
        System.out.println("\n");
        System.out.printf("%67s\n", "  Bowler  -----------------------------------------------------");
        System.out.printf("%20s   %10s %10s %15s %15s\n", "Player Name", "Runs", "Over", "wickets", "EconomyRate");
        for (Player player : bowlers) {
            int over = player.getBowlerTotalThrowBalls() / 6;
            double economyRate = calculateEconomyRate(player.getBowlerRuns(), over);
            System.out.printf("%20s %10d %10d %15d %15f\n", player.getName(), player.getBowlerRuns(),
                    over, player.getWickets(), economyRate);

        }
        System.out.println("\n");
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
