package sample;

public class Game {

    private int homeTeamScore;
    private int awayTeamScore;
    private String homeTeam;
    private String awayTeam;

    public Game() {}

    public Game(int homeScore, int awayScore) {

        this.homeTeamScore = homeScore;
        this.awayTeamScore = awayScore;
        String homeTeamName = homeTeam;
        String awayTeamName = awayTeam;
    }

    //Not sure if 'String team' should also be an argument for the set functions.
    public void setHomeScore(int score) {

        homeTeamScore = score;
    }

    public void setAwayScore(int score) {

        awayTeamScore = score;
    }

    public void setHomeTeam(String homeTeam) {

        this.homeTeam = homeTeam;
    }

    public void setAwayTeam(String awayTeam) {

        this.awayTeam = awayTeam;
    }

    public int getHomeTeamScore() {

        return homeTeamScore;
    }

    public int getAwayTeamScore() {

        return awayTeamScore;
    }

    public String getHomeTeam() {

        return homeTeam;
    }

    public String getAwayTeam() {

        return awayTeam;
    }

    public String toString() {

        return homeTeamScore + ":" + awayTeamScore;
    }
}