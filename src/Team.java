import java.util.HashSet;

public class Team {
    private static int counter = 0;
    private int id;
    private String name;
    private HashSet<FootballPlayer> teamPlayers;

    public Team(String name) {
        this.id = ++counter;
        this.name = name;
        teamPlayers = new HashSet<>();

    }

    public Team(String name, HashSet<FootballPlayer> teamPlayers) {
        this.name = name;
        this.teamPlayers = teamPlayers;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Team.counter = counter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashSet<FootballPlayer> getTeamPlayers() {
        return teamPlayers;
    }

    public void setTeamPlayers(HashSet<FootballPlayer> teamPlayers) {
        this.teamPlayers = teamPlayers;
    }

    public void printTeam() {
        for (FootballPlayer p : teamPlayers) {
            System.out.println(p);
        }
    }
    public void addPlayer(FootballPlayer p) {
        teamPlayers.add(p);
    }
}
