package scoreboard;

import java.util.Arrays;
import java.util.List;

public class CricketRunner {
    public static void main(String[] args) {
        List<Player> ind = Arrays.asList(new Player("rahul"), new Player("nitesh"),
                new Player("pralhad"), new Player("pavan"), new Player("pankaj"),
                new Player("mohit"), new Player("pk"), new Player("ritik"),
                new Player("aakash"), new Player("dipesh"), new Player("rishi"));
        List<Player> pak = Arrays.asList(new Player("mohit"), new Player("aman"),
                new Player("pankaj"), new Player("pk"), new Player("rahul"),
                new Player("nitesh"), new Player("pralhad"), new Player("pavan"),
                new Player("ritik"), new Player("aakash"), new Player("dipesh"));
        Team india = new Team(ind, "india");
        Team pakistan = new Team(pak, "pakistan");
        Cricket firstInning = new Cricket(india, pakistan, 50);
        firstInning.play();
        ScoreBoard scoreBoard = new ScoreBoard(firstInning.getBatsman().getPlayers(), firstInning.getBowlers().getPlayers(),
                firstInning.getOver(), firstInning.getTotalWickets());
        Cricket secondInning = new Cricket(pakistan, india, 50);
        secondInning.play();
        scoreBoard.print();
        System.out.println("---------++++++++++++-------------------********************---------------++++++++++++++++-----------");
        ScoreBoard scoreBoard1 = new ScoreBoard(secondInning.getBowlers().getPlayers(), secondInning.getBowlers().getPlayers(),
                secondInning.getOver(), secondInning.getTotalWickets());
        scoreBoard1.print();
    }
}

