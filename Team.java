package sample;
import java.util.ArrayList;

public class Team {

    private String teamName;
    private int setsWon;
    private boolean isHomeTeam;
    private ArrayList<Player> playersList;

    public Team() {}

    public Team(String teamName, int setsWon, boolean isHomeTeam, ArrayList<Player> playersList) {

        this.teamName = teamName;
        this.setsWon = setsWon;
        this.isHomeTeam = isHomeTeam;
        this.playersList = playersList;
    }

    public void setTeamName(String name) {

        name = teamName;
    }

    public String getTeamName() {

        return teamName;
    }

    public int getSetsWon() {

        return setsWon;
    }

    public boolean isHomeTeam() {

        return isHomeTeam;
    }

    public ArrayList<Player> getPlayersList() {

        return playersList;
    }
}
