package sample;

public class Player {

    private String name;
    private String team;

    public Player() {}

    public Player(String name, String team) {

        this.name = name;
        this.team = team;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setTeam(String team) {

        this.team = team;
    }

    public String getName() {

        return name;
    }

    public String getTeam() {

        return team;
    }

    public String toString() {

        return "Player Name: " + getName() + ", Team: " + getTeam();
    }

}
