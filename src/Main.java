import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        FootballPlayer cr7 = new FootballPlayer("Cristiano", "Ronaldo", 10, 8, 5);
        FootballPlayer leoMessi = new FootballPlayer("Leo", "Messi", 10, 9, 6);
        FootballPlayer andreaPirlo = new FootballPlayer("Andrea", "Pirlo", 10, 10, 20);
        FootballPlayer fraTotti = new FootballPlayer("Francesco", "Totti", 10, 2, 3);
        FootballPlayer alexDelpiero = new FootballPlayer("Alessandro", "Del Piero", 10, 1, 2);

        HashSet<FootballPlayer> giocatoriTeamA = new HashSet<>();

        giocatoriTeamA.add(cr7);
        giocatoriTeamA.add(leoMessi);
        giocatoriTeamA.add(andreaPirlo);

        Team teamA = new Team("teamA", giocatoriTeamA);
        Team teamB = new Team("teamB");
        teamB.addPlayer(fraTotti);
        teamB.addPlayer(alexDelpiero);

        System.out.println("I giocatori con MIN 5 gol e 7 assist e che hanno almeno MIN 20 presenze sono:");
        for (FootballPlayer p : teamA.getTeamPlayers()) {
            if (p.getGoals() >= 5 || p.getAssists() >= 7 && p.getPresences() > 20) {
                System.out.println(p.getName() + " " + p.getSurname());
            }
        }

        HashSet<FootballPlayer> giocatoriTeamC = new HashSet<>();
        giocatoriTeamC.addAll(teamA.getTeamPlayers());
        giocatoriTeamC.addAll(teamB.getTeamPlayers());


        Team teamC = new Team("teamC", giocatoriTeamC);

        HashMap<FootballPlayer, Double> playerMap = new HashMap<>();
        for (FootballPlayer p : teamC.getTeamPlayers()) {
            playerMap.put(p, p.score());
        }

        System.out.println("\nI giocatori con un punteggio minimo di 0.6 sono: ");
        for (Map.Entry<FootballPlayer, Double> entry : playerMap.entrySet()) {
            if (entry.getValue() > 0.6) {
                System.out.println(entry.getKey().getName() + " " + entry.getKey().getSurname() + " con un punteggio " + entry.getValue());
            }
        }
    }
}