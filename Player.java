package sample;

public class Player {

    private String name;
    private String team;

    public Player() {}

    public Player(String name, String team) {

        this.name = name;
        this.team= team;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setTeam(String team) {

        this.team = team;
    }

    public String getPlayerName() {

        return name;
    }

    public String getTeamName() {

        return team;
    }

    public String toString() {

        return "Player Name: " + getPlayerName() + ", Team: " + getTeamName();
    }

}