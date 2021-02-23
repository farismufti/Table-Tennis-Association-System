package sample;

public class Game {

    private int homeScore;
    private int awayScore;

    public Game() {}

    public Game(int homeScore, int awayScore) {

        this.homeScore = homeScore;
        this.awayScore = awayScore;
    }

    //Not sure if 'String team' should also be an argument for the set functions.
    public void setHomeScore(int score) {

        homeScore = score;
    }

    public void setAwayScore(int score) {

        awayScore = score;
    }

    public int getHomeScore() {

        return homeScore;
    }

    public int getAwayScore() {

        return awayScore;
    }

    public String toString() {

        return "Home Team Score: " + getHomeScore() + ", Away Team Score: " + getAwayScore();
    }
}
