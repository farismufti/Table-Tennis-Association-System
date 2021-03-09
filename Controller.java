package sample;

import java.net.URL;
import java.util.InputMismatchException;
import java.util.ResourceBundle;
import java.util.stream.Stream;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private ResourceBundle resources;
    @FXML
    private URL location;
    @FXML
    private TextField teamNameTextField;
    @FXML
    private Button addTeamButton;
    @FXML
    private TextField playerNameTextField;
    @FXML
    private Button registerPlayerButton;
    @FXML
    private ChoiceBox<Object> teamNameChoiceBox;
    @FXML
    private Button generateFixturesButton;
    @FXML
    private Button generateTeamStatsButton;
    @FXML
    private Button showAllTeamRankingsButton;
    @FXML
    private Button showAllTeamStatsButton;
    @FXML
    private Button viewFixtureAndResultChartButton;
    @FXML
    private Button viewMatchScoresButton;
    @FXML
    private TextArea fixturesAndResultsTextField;
    @FXML
    private Button newSheetButton;
    @FXML
    private Button modifySheetButton;
    @FXML
    private ChoiceBox<Object> homeTeamChoiceBox;
    @FXML
    private ChoiceBox<Object> awayTeamChoiceBox;
    @FXML
    private ChoiceBox<Object> homePlayer1ChoiceBox;
    @FXML
    private ChoiceBox<Object> homePlayer2ChoiceBox;
    @FXML
    private ChoiceBox<Object> awayPlayer1ChoiceBox;
    @FXML
    private ChoiceBox<Object> awayPlayer2ChoiceBox;
    @FXML
    private TextField set1Game1;
    @FXML
    private TextField set1Game2;
    @FXML
    private TextField set1Game3;
    @FXML
    private TextField set3Game1;
    @FXML
    private TextField set3Game2;
    @FXML
    private TextField set3Game3;
    @FXML
    private TextField set2Game1;
    @FXML
    private TextField set2Game2;
    @FXML
    private TextField set2Game3;
    @FXML
    private TextField set4Game1;
    @FXML
    private TextField set4Game2;
    @FXML
    private TextField set4Game3;
    @FXML
    private TextField doubleSetGame1;
    @FXML
    private TextField doubleSetGame2;
    @FXML
    private TextField doubleSetGame3;
    @FXML
    private TextArea finalScoreTextField;
    @FXML
    private Button calculateAndSubmitScoresButton;

    @FXML
    void addTeam(ActionEvent event) {

        String teamNameInput = null;

        try {

            teamNameInput = teamNameTextField.getText();
            if(teamNameInput.equals("")) throw new InputMismatchException();

            Team t = new Team(teamNameInput);
            AdminPage.teamsList.add(t);

            ObservableList<Object> allTeams = FXCollections.observableArrayList();
            for(Team team : AdminPage.teamsList) {

                allTeams.add(team.getTeamName());
            }

            //Populating the teams choice box with teams.
            teamNameChoiceBox.setItems(allTeams);
            homeTeamChoiceBox.setItems(allTeams);  //Score sheet page
            awayTeamChoiceBox.setItems(allTeams);  //Score sheet page
        }

        catch(InputMismatchException e) {

            System.err.println("Error: No input added, please enter a team name.");
        }

        teamNameTextField.setText(null);

        //For testing purposes
        for(int i = 0; i < AdminPage.teamsList.size(); i++) {  //For testing purposes

            System.out.println("Items in teamsList: " + AdminPage.teamsList.get(i).getTeamName());
        }

    }

    @FXML
    void registerPlayer(ActionEvent event) {

        String playerNameInput = null;

        try {

            playerNameInput = playerNameTextField.getText();
            if(playerNameInput.equals("") || teamNameChoiceBox.getValue() == null) throw new InputMismatchException();

            Player p = new Player(playerNameInput, (String)teamNameChoiceBox.getValue());
            Team.playersList.add(p);

            ObservableList<Object> allPlayers = FXCollections.observableArrayList();
            for(Player player : Team.playersList) {

                allPlayers.add(player.getPlayerName());
            }

            //Populating the player choice boxes in score sheet with players
            homePlayer1ChoiceBox.setItems(allPlayers);
            homePlayer2ChoiceBox.setItems(allPlayers);
            awayPlayer1ChoiceBox.setItems(allPlayers);
            awayPlayer2ChoiceBox.setItems(allPlayers);
        }

        catch(InputMismatchException e) {

            System.err.println("Error: Please enter a player name and choose a team.");
        }

        playerNameTextField.setText(null);

        //For testing purposes
        for(int i = 0; i < Team.playersList.size(); i++) {

            System.out.println("Player -> " + Team.playersList.get(i).getPlayerName()
                    + ", Registered to team -> " + Team.playersList.get(i).getTeamName());
        }
    }

    private int homeTeamTotalScore = 0;
    private int awayTeamTotalScore = 0;

    private void calculateScores(String scores) {

        //48 seems to be added to the scores, a -48 is added to counteract that.
        int[] arr = Stream.of(scores.split(":")).mapToInt(Integer::parseInt).toArray();
        int homeScore = arr[0];
        int awayScore = arr[1];
        homeTeamTotalScore += homeScore;
        awayTeamTotalScore += awayScore;
        homeScore = 0;
        awayScore = 0;
    }

    @FXML
    void calculateAndSubmitScores(ActionEvent event) {


        String scores = null; //Used to store text field inputs to process string and calculate scores.
        int homeScore = 0;
        int awayScore = 0;

        Game game1;
        Game game2;
        Game game3;
        Set set1;
        Set set2;
        Set set3;
        Set set4;
        DoubleSet doubleSet;
        Match match;

        scores = set1Game1.getText();
        calculateScores((String) scores);
        scores = null;

        scores = set1Game2.getText();
        calculateScores(scores);
        scores = null;

        scores = set1Game3.getText();
        calculateScores(scores);
        scores = null;


        scores = set2Game1.getText();
        calculateScores(scores);
        scores = null;

        scores = set2Game2.getText();
        calculateScores(scores);
        scores = null;

        scores = set2Game3.getText();
        calculateScores(scores);
        scores = null;

        scores = set3Game1.getText();
        calculateScores(scores);
        scores = null;

        scores = set3Game2.getText();
        calculateScores(scores);
        scores = null;

        scores = set3Game3.getText();
        calculateScores(scores);
        scores = null;

        scores = set4Game1.getText();
        calculateScores(scores);
        scores = null;

        scores = set4Game2.getText();
        calculateScores(scores);
        scores = null;

        scores = set4Game3.getText();
        calculateScores(scores);
        scores = null;

        scores = doubleSetGame1.getText();
        calculateScores(scores);
        scores = null;

        scores = doubleSetGame2.getText();
        calculateScores(scores);
        scores = null;

        scores = doubleSetGame3.getText();
        calculateScores(scores);
        scores = null;

        finalScoreTextField.setText(homeTeamTotalScore + ":" + awayTeamTotalScore);
        finalScoreTextField.setDisable(true);

    }

    @FXML
    void generateFixtures(ActionEvent event) {

    }

    @FXML
    void generateTeamStats(ActionEvent event) {

    }

    @FXML
    void modifySheet(ActionEvent event) {

    }

    @FXML
    void newSheet(ActionEvent event) {

    }

    @FXML
    void showAllTeamRankings(ActionEvent event) {

    }

    @FXML
    void showAllTeamStats(ActionEvent event) {

    }

    @FXML
    void viewFixtureAndResultChart(ActionEvent event) {

    }

    @FXML
    void viewMatchScores(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert teamNameTextField != null : "fx:id=\"teamNameTextField\" was not injected: check your FXML file 'TableTennisSystemGUI.fxml'.";
        assert addTeamButton != null : "fx:id=\"addTeamButton\" was not injected: check your FXML file 'TableTennisSystemGUI.fxml'.";
        assert playerNameTextField != null : "fx:id=\"playerNameTextField\" was not injected: check your FXML file 'TableTennisSystemGUI.fxml'.";
        assert registerPlayerButton != null : "fx:id=\"registerPlayerButton\" was not injected: check your FXML file 'TableTennisSystemGUI.fxml'.";
        assert teamNameChoiceBox != null : "fx:id=\"teamNameChoiceBox\" was not injected: check your FXML file 'TableTennisSystemGUI.fxml'.";
        assert generateFixturesButton != null : "fx:id=\"generateFixturesButton\" was not injected: check your FXML file 'TableTennisSystemGUI.fxml'.";
        assert generateTeamStatsButton != null : "fx:id=\"generateTeamStatsButton\" was not injected: check your FXML file 'TableTennisSystemGUI.fxml'.";
        assert showAllTeamRankingsButton != null : "fx:id=\"showAllTeamRankingsButton\" was not injected: check your FXML file 'TableTennisSystemGUI.fxml'.";
        assert showAllTeamStatsButton != null : "fx:id=\"showAllTeamStatsButton\" was not injected: check your FXML file 'TableTennisSystemGUI.fxml'.";
        assert viewFixtureAndResultChartButton != null : "fx:id=\"viewFixtureAndResultChartButton\" was not injected: check your FXML file 'TableTennisSystemGUI.fxml'.";
        assert viewMatchScoresButton != null : "fx:id=\"viewMatchScoresButton\" was not injected: check your FXML file 'TableTennisSystemGUI.fxml'.";
        assert fixturesAndResultsTextField != null : "fx:id=\"fixturesAndResultsTextField\" was not injected: check your FXML file 'TableTennisSystemGUI.fxml'.";
        assert newSheetButton != null : "fx:id=\"newSheetButton\" was not injected: check your FXML file 'TableTennisSystemGUI.fxml'.";
        assert modifySheetButton != null : "fx:id=\"modifySheetButton\" was not injected: check your FXML file 'TableTennisSystemGUI.fxml'.";
        assert homeTeamChoiceBox != null : "fx:id=\"homeTeamChoiceBox\" was not injected: check your FXML file 'TableTennisSystemGUI.fxml'.";
        assert awayTeamChoiceBox != null : "fx:id=\"awayTeamChoiceBox\" was not injected: check your FXML file 'TableTennisSystemGUI.fxml'.";
        assert homePlayer1ChoiceBox != null : "fx:id=\"homePlayer1ChoiceBox\" was not injected: check your FXML file 'TableTennisSystemGUI.fxml'.";
        assert homePlayer2ChoiceBox != null : "fx:id=\"homePlayer2ChoiceBox\" was not injected: check your FXML file 'TableTennisSystemGUI.fxml'.";
        assert awayPlayer1ChoiceBox != null : "fx:id=\"awayPlayer1ChoiceBox\" was not injected: check your FXML file 'TableTennisSystemGUI.fxml'.";
        assert awayPlayer2ChoiceBox != null : "fx:id=\"awayPlayer2ChoiceBox\" was not injected: check your FXML file 'TableTennisSystemGUI.fxml'.";
        assert set1Game1 != null : "fx:id=\"set1Game1\" was not injected: check your FXML file 'TableTennisSystemGUI.fxml'.";
        assert set1Game2 != null : "fx:id=\"set1Game2\" was not injected: check your FXML file 'TableTennisSystemGUI.fxml'.";
        assert set1Game3 != null : "fx:id=\"set1Game3\" was not injected: check your FXML file 'TableTennisSystemGUI.fxml'.";
        assert set3Game1 != null : "fx:id=\"set3Game1\" was not injected: check your FXML file 'TableTennisSystemGUI.fxml'.";
        assert set3Game2 != null : "fx:id=\"set3Game2\" was not injected: check your FXML file 'TableTennisSystemGUI.fxml'.";
        assert set3Game3 != null : "fx:id=\"set3Game3\" was not injected: check your FXML file 'TableTennisSystemGUI.fxml'.";
        assert set2Game1 != null : "fx:id=\"set2Game1\" was not injected: check your FXML file 'TableTennisSystemGUI.fxml'.";
        assert set2Game2 != null : "fx:id=\"set2Game2\" was not injected: check your FXML file 'TableTennisSystemGUI.fxml'.";
        assert set2Game3 != null : "fx:id=\"set2Game3\" was not injected: check your FXML file 'TableTennisSystemGUI.fxml'.";
        assert set4Game1 != null : "fx:id=\"set4Game1\" was not injected: check your FXML file 'TableTennisSystemGUI.fxml'.";
        assert set4Game2 != null : "fx:id=\"set4Game2\" was not injected: check your FXML file 'TableTennisSystemGUI.fxml'.";
        assert set4Game3 != null : "fx:id=\"set4Game3\" was not injected: check your FXML file 'TableTennisSystemGUI.fxml'.";
        assert doubleSetGame1 != null : "fx:id=\"doubleSetGame1\" was not injected: check your FXML file 'TableTennisSystemGUI.fxml'.";
        assert doubleSetGame2 != null : "fx:id=\"doubleSetGame2\" was not injected: check your FXML file 'TableTennisSystemGUI.fxml'.";
        assert doubleSetGame3 != null : "fx:id=\"doubleSetGame3\" was not injected: check your FXML file 'TableTennisSystemGUI.fxml'.";
        assert finalScoreTextField != null : "fx:id=\"finalScoreTextField\" was not injected: check your FXML file 'TableTennisSystemGUI.fxml'.";
        assert calculateAndSubmitScoresButton != null : "fx:id=\"calculateAndSubmitScoresButton\" was not injected: check your FXML file 'TableTennisSystemGUI.fxml'.";

    }
}
