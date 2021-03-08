package sample;

public class Set {

    private String homePlayer;
    private String awayPlayer;
    private int homePlayerScore;
    private int awayPlayerScore;

    public Set() {}
    
    public Set(String homePlayer, String awayPlayer, int homePlayerScore, int awayPlayerScore) {

        this.homePlayer = homePlayer;
        this.awayPlayer = awayPlayer;
        this.homePlayerScore = homePlayerScore;
        this.awayPlayerScore = awayPlayerScore;
    }

    public void setHomePlayer(String homePlayer) {

        this.homePlayer = homePlayer;
    }

    public void setAwayPlayer(String awayPlayer) {

        this.awayPlayer = awayPlayer;
    }

    public void setHomePlayerScore(int score) {

        this.homePlayerScore = score;
    }

    public void setAwayPlayerScore(int score) {

        this.awayPlayerScore = score;
    }

    public String getHomePlayer() {

        return homePlayer;
    }

    public String getAwayPlayer() {

        return awayPlayer;
    }

    public int getHomePlayerScore() {

        return homePlayerScore;
    }

    public int getAwayPlayerScore() {

        return awayPlayerScore;
    }

    public String toString() {

        return homePlayer + " vs " + awayPlayer + " = ";  //TBC
    }
}