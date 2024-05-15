import java.util.Random;
//This class changes the colors of the letters depending on if the player guessed correctly or not
public class WordleGame {
//A word bank that stores all the possinle words you can get in our game
    private static final String[] wordBank = {"WORLD", "HELLO", "MESSI", "MESSY", "MUSIC", "FLOOD", "DREAM", "ADULT", "JIMIN", "ABUSE" ,"EAGLE", "BLACK", "SMACK", "WHALE", "QUEEN", "ERROR", "CRASH", "SPIKE", "DANDY"}; //Word bank to store all the words so the code can cycle through 
    private static final int MAX_ATTEMPTS = 6; // Sets max attemps of guesses to 6

    private String answer;
//Generate a random word from the word bank
    public WordleGame() {
        Random random = new Random();
        answer = wordBank[random.nextInt(wordBank.length)];
    }
//Gives the answer to the player
    public String getAnswer() {
        return answer;
    }
//The player's guess
    public boolean CorrectGuess(String guess) {
        return guess.equals(answer);
    }
//If the letter is correct, change colour to yellow, If the letter is in the right place, change the colour to green and if the letter is wrong, change it to red
    public String Answer(String guess) {
        StringBuilder feedback = new StringBuilder();
        for (int i = 0; i < 5; i++) {
//This part of gthe code is written with the help of page on the New York Times, we've included the source in the submission. 
            char guessedLetter = guess.charAt(i);
            char actualLetter = answer.charAt(i);
            if (guessedLetter == actualLetter) {
                feedback.append("\u001B[32m").append(guessedLetter).append("\u001B[0m"); // Green
            } else if (answer.contains(String.valueOf(guessedLetter))) {
                feedback.append("\u001B[33m").append(guessedLetter).append("\u001B[0m"); // Yellow
            } else {
                feedback.append("\u001B[37m").append(guessedLetter).append("\u001B[0m"); // White
            }
        }
//Return the word with the color
        return feedback.toString();
    }
//Return the amount of attemps the player has used
    public int Maxattempts() {
        return MAX_ATTEMPTS;
    }
}