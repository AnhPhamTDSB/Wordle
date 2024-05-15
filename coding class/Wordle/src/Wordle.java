public class Wordle {
    public static void main(String[] args) {
        WordleGame game = new WordleGame();
        Wordscanner inputHandler = new Wordscanner();

        for (int attempt = 1; attempt <= game.Maxattempts(); attempt++) {
            System.out.println("Attempt " + attempt + ":");
            String guess = inputHandler.Userinput();
//If the user gets the word correctly, system will display:, if the guess is not correct. the user can continue guessing until reaching max attemps
            if (game.CorrectGuess(guess)) {
                System.out.println("Congratulations! The word was: " + game.getAnswer());
                return;
            } else {
                System.out.println("Feedback: " + game.Answer(guess));
            }
        }
// If the user uses all their guesses, the code will display: and then show what the word was
        System.out.println("Sorry, you've used up all your attempts. The word was: " + game.getAnswer());
    }
}