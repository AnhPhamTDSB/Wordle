import javax.swing.JOptionPane;

public class GuessNumber {
  public void guess(){
    String message = "Guess a number between 1-100:";
    String title = "GUESS NUMBER GAME";
    int guess = Integer.parseInt(JOptionPane.showInputDialog(message, title));

    while (guess != 50) {

    if(guess >50){
      message = "Nope! Too High";
    }
    else if(guess <50){
      message = "Nope! Too Low";
    }
    

    //read user next guess
    guess = Integer.parseInt(JOptionPane.showInputDialog(message, title));
  }
  message = "YAY";

  JOptionPane.showMessageDialog(null, message);
}
}