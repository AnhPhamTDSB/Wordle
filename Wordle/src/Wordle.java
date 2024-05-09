public class Wordle {
    public static void main(String[] args) {
        WordleGame game = new WordleGame();
        Wordscanner inputHandler = new Wordscanner();

        for (int attempt = 1; attempt <= game.Maxattempts(); attempt++) {
            System.out.println("Attempt " + attempt + ":");
            String guess = inputHandler.Userinput();

            if (game.CorrectGuess(guess)) {
                System.out.println("Congratulations! The word was: " + game.getAnswer());
                return;
            } else {
                System.out.println("Feedback: " + game.Answer(guess));
            }
        }

        System.out.println("Sorry, you've used up all your attempts. The word was: " + game.getAnswer());
    }
}