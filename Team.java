package sample;
import java.util.ArrayList;

public class Team {

    private String teamName;
    protected static ArrayList<Player> playersList;
    private int matchesPlayed;
    private int matchesWon;
    private int setsWon;

    public Team() {}

    public Team(String teamName) {

        this.teamName = teamName;
        matchesPlayed = 0;
        matchesWon = 0;
        setsWon = 0;
        playersList = new ArrayList<Player>();
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

    public ArrayList<Player> getPlayersList() {

        return playersList;
    }

    public int getMatchesWon() {

        return matchesWon;
    }

    public int getMatchesPlayed() {

        return matchesPlayed;
    }
}