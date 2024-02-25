package com.example.sspgui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
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

    Random random = new Random();

    private String[] cpuChoice = {"Rock", "Paper", "Scissors"};
    private int randomChoice;
    private String playerChoice;
    private int cpuWins = 0;
    private int playerWins = 0;



    @FXML
    protected void scissorsButtonClicked() {
        cpuText.setText("");
        playerWinText.setText("Player wins: " + playerWins);
        cpuWinText.setText("Cpu wins: " + cpuWins);

        playerChoice = "Scissors";
        randomChoice = random.nextInt(3);
        cpuText.setText("Cpu chose: " + cpuChoice[randomChoice]);
        if (cpuChoice[randomChoice].equalsIgnoreCase(playerChoice))
        {
            outcomeText.setStyle("-fx-text-fill: black;");
            outcomeText.setText("It's a tie!");
        }
        else if (cpuChoice[randomChoice].equalsIgnoreCase("Rock"))
        {
            cpuWins++;
            outcomeText.setStyle("-fx-text-fill: red;");
            outcomeText.setText("You lose!");
            cpuWinText.setText("Cpu wins: " + cpuWins);
        }
        else if (cpuChoice[randomChoice].equalsIgnoreCase("Paper"))
        {
            playerWins++;
            outcomeText.setStyle("-fx-text-fill: green;");
            outcomeText.setText("You win!");
            playerWinText.setText("Player wins: " + playerWins);
        }
    }
    @FXML
    protected void paperButtonClicked() {
        cpuText.setText("");
        playerWinText.setText("Player wins: " + playerWins);
        cpuWinText.setText("Cpu wins: " + cpuWins);

        playerChoice = "Paper";
        randomChoice = random.nextInt(3);
        cpuText.setText("Cpu chose: " + cpuChoice[randomChoice]);
        if (cpuChoice[randomChoice].equalsIgnoreCase(playerChoice))
        {
            outcomeText.setStyle("-fx-text-fill: black;");
            outcomeText.setText("It's a tie!");
        }
        else if (cpuChoice[randomChoice].equalsIgnoreCase("Scissors"))
        {
            cpuWins++;
            outcomeText.setStyle("-fx-text-fill: red;");
            outcomeText.setText("You lose!");
            cpuWinText.setText("Cpu wins: " + cpuWins);
        }
        else if (cpuChoice[randomChoice].equalsIgnoreCase("Rock"))
        {
            playerWins++;
            outcomeText.setStyle("-fx-text-fill: green;");
            outcomeText.setText("You win!");
            playerWinText.setText("Player wins: " + playerWins);
        }
    }
    @FXML
    protected void rockButtonClicked() {
        cpuText.setText("");
        playerChoice = "Rock";
        randomChoice = random.nextInt(3);
        cpuText.setText("Cpu chose: " + cpuChoice[randomChoice]);

        if (cpuChoice[randomChoice].equalsIgnoreCase(playerChoice))
        {
            outcomeText.setStyle("-fx-text-fill: black;");
            outcomeText.setText("It's a tie!");
        }
        else if (cpuChoice[randomChoice].equalsIgnoreCase("Paper"))
        {
            outcomeText.setStyle("-fx-text-fill: red;");
            outcomeText.setText("You lose!");
        }
        else if (cpuChoice[randomChoice].equalsIgnoreCase("Scissors"))
        {
            outcomeText.setStyle("-fx-text-fill: green;");
            outcomeText.setText("You win!");
        }
    }
}