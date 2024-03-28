package com.example.sspgui;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.io.File;
import java.util.Random;

public class HelloController {
    @FXML
    private Label cpuChoiceText;
    @FXML
    private Label playerChoiceText;
    @FXML
    private Label outcomeText;
    @FXML
    private Label playerWinText;
    @FXML
    private Label cpuWinText;
    @FXML
    private ImageView cpuChoiceImage;
    @FXML
    private ImageView playerChoiceImage;

    private Random random = new Random();
    private final String[] cpuChoice = {"Rock", "Paper", "Scissors"};
    private int cpuWins = 0;
    private int playerWins = 0;
    Image image;

    @FXML
    protected void scissorsButtonClicked() {  // WHY the buttons scale differently in scenebuilder? God knows.
        playerChoiceText.setText("You chose: Scissors");
        image = new Image(new File("src\\main\\images\\scissors.jpg").toURI().toString());
        playerChoiceImage.setImage(image);
        playRound("Scissors");
    }
    @FXML
    protected void paperButtonClicked() {
        playerChoiceText.setText("You chose: Paper");
        image = new Image(new File("src\\main\\images\\paper.jpg").toURI().toString());
        playerChoiceImage.setImage(image);
        playRound("Paper");
    }
    @FXML
    protected void rockButtonClicked() {
        playerChoiceText.setText("You chose: Rock");
        image = new Image(new File("src\\main\\images\\rock.jpg").toURI().toString());
        playerChoiceImage.setImage(image);
        playRound("Rock");
    }

    private void playRound(String playerChoice) {
        cpuChoiceText.setText("");
        playerWinText.setText("Player wins: " + playerWins);
        cpuWinText.setText("Cpu wins: " + cpuWins);

        int randomChoice = random.nextInt(3);
        cpuChoiceText.setText("Cpu chose: " + cpuChoice[randomChoice]);
        String cpuMove = cpuChoice[randomChoice];


        switch(cpuMove)
        {
            case "Rock":
                image = new Image(new File("src\\main\\images\\rock.jpg").toURI().toString());
                break;
            case "Paper":
                image = new Image(new File("src\\main\\images\\paper.jpg").toURI().toString());
                break;
            case "Scissors":
                image = new Image(new File("src\\main\\images\\scissors.jpg").toURI().toString());
                break;
        }
        cpuChoiceImage.setImage(image);

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