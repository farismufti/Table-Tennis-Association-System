package sample;

public class Set {

    private int firstGameScore;
    private int secondGameScore;
    private int thirdGameScore;

    public Set() {}

    //Not sure what format the score will be in (int : int)
    public Set(int firstGameScore, int secondGameScore, int thirdGameScore) {

        this.firstGameScore = firstGameScore;
        this.secondGameScore = secondGameScore;
        this.thirdGameScore = thirdGameScore;
    }

    public void setFirstGameScore(int score) {

        firstGameScore = score;
    }

    public void setSecondGameScore(int score) {

        secondGameScore = score;
    }

    public void setThirdGameScore(int score) {

        thirdGameScore = score;
    }

    public int getFirstGameScore() {

        return firstGameScore;
    }

    public int getSecondGameScore() {

        return secondGameScore;
    }

    public int getThirdGameScore() {

        return thirdGameScore;
    }

    public String toString() {

        return "";  //Not sure how to represent this.
    }
}
