package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
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
    private Label teamChoiceBox;

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
    private Button calculateAndSubmitScoresButton;

    @FXML
    void addTeam(ActionEvent event) {

        AdminPage.teamsList.add(teamNameTextField.getText());
    }

    @FXML
    void calculateAndSubmitScores(ActionEvent event) {

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
    void registerPlayer(ActionEvent event) {

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
        assert teamChoiceBox != null : "fx:id=\"teamChoiceBox\" was not injected: check your FXML file 'TableTennisSystemGUI.fxml'.";
        assert generateFixturesButton != null : "fx:id=\"generateFixturesButton\" was not injected: check your FXML file 'TableTennisSystemGUI.fxml'.";
        assert generateTeamStatsButton != null : "fx:id=\"generateTeamStatsButton\" was not injected: check your FXML file 'TableTennisSystemGUI.fxml'.";
        assert showAllTeamRankingsButton != null : "fx:id=\"showAllTeamRankingsButton\" was not injected: check your FXML file 'TableTennisSystemGUI.fxml'.";
        assert showAllTeamStatsButton != null : "fx:id=\"showAllTeamStatsButton\" was not injected: check your FXML file 'TableTennisSystemGUI.fxml'.";
        assert viewFixtureAndResultChartButton != null : "fx:id=\"viewFixtureAndResultChartButton\" was not injected: check your FXML file 'TableTennisSystemGUI.fxml'.";
        assert viewMatchScoresButton != null : "fx:id=\"viewMatchScoresButton\" was not injected: check your FXML file 'TableTennisSystemGUI.fxml'.";
        assert fixturesAndResultsTextField != null : "fx:id=\"fixturesAndResultsTextField\" was not injected: check your FXML file 'TableTennisSystemGUI.fxml'.";
        assert newSheetButton != null : "fx:id=\"newSheetButton\" was not injected: check your FXML file 'TableTennisSystemGUI.fxml'.";
        assert modifySheetButton != null : "fx:id=\"modifySheetButton\" was not injected: check your FXML file 'TableTennisSystemGUI.fxml'.";
        assert calculateAndSubmitScoresButton != null : "fx:id=\"calculateAndSubmitScoresButton\" was not injected: check your FXML file 'TableTennisSystemGUI.fxml'.";

    }
}
