package com.example.sspgui;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

import java.util.Random;

public class HelloController {
    @FXML
    private Label cpuText;
    @FXML
    private Label outcomeText;
    @FXML
    private Label playerWinText;
    @FXML
    private Label cpuWinText;
    @FXML
    private ImageView cpuChoiceImage;

    private Random random = new Random();
    private String[] cpuChoice = {"Rock", "Paper", "Scissors"};
    private int cpuWins = 0;
    private int playerWins = 0;

    @FXML
    protected void scissorsButtonClicked() {
        playRound("Scissors");
    }

    @FXML
    protected void paperButtonClicked() {
        playRound("Paper");
    }

    @FXML
    protected void rockButtonClicked() {
        playRound("Rock");
    }

    private void playRound(String playerChoice) {
        cpuText.setText("");
        playerWinText.setText("Player wins: " + playerWins);
        cpuWinText.setText("Cpu wins: " + cpuWins);

        int randomChoice = random.nextInt(3);
        cpuText.setText("Cpu chose: " + cpuChoice[randomChoice]);

        if (cpuChoice[randomChoice].equalsIgnoreCase(playerChoice)) {
            outcomeText.setStyle("-fx-text-fill: black;");
            outcomeText.setText("It's a tie!");
        } else if ((cpuChoice[randomChoice].equalsIgnoreCase("Rock") && playerChoice.equalsIgnoreCase("Scissors")) ||
                (cpuChoice[randomChoice].equalsIgnoreCase("Paper") && playerChoice.equalsIgnoreCase("Rock")) ||
                (cpuChoice[randomChoice].equalsIgnoreCase("Scissors") && playerChoice.equalsIgnoreCase("Paper"))) {
            cpuWins++;
            outcomeText.setStyle("-fx-text-fill: red;");
            outcomeText.setText("You lose!");
            cpuWinText.setText("Cpu wins: " + cpuWins);
        } else {
            playerWins++;
            outcomeText.setStyle("-fx-text-fill: green;");
            outcomeText.setText("You win!");
            playerWinText.setText("Player wins: " + playerWins);
        }
    }
}