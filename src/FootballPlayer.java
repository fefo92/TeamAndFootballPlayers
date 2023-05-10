public class FootballPlayer {
    private int counter = 0;
    private int id;
    private String name;
    private String surname;
    private int presences;
    private int goals;
    private int assists;
    private String nameTeamThatPlays;

    public FootballPlayer(String name, String surname, int presences, int goals, int assists) {
        this.id = ++counter;
        this.name = name;
        this.surname = surname;
        this.presences = presences;
        this.goals = goals;
        this.assists = assists;
    }

    public FootballPlayer(String name, String surname) {
        this.id = ++counter;
        this.name = name;
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getPresences() {
        return presences;
    }

    public int getGoals() {
        return goals;
    }

    public int getAssists() {
        return assists;
    }

    public void setPresences(int presences) {
        this.presences = presences;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    public double score() {
        return (goals + (0.75*assists) / presences);
    }

    public String getNameTeamThatPlays() {
        return nameTeamThatPlays;
    }

    public void setNameTeamThatPlays(String nameTeamThatPlays) {
        this.nameTeamThatPlays = nameTeamThatPlays;
    }
}
