import java.util.Scanner;
//This class is used to get the input of gthe player
public class Wordscanner {
    private Scanner scanner;
    
    //Initialize scanner
    public Wordscanner () {
        scanner = new Scanner(System.in);
    }
    
    //Get the user input
    public String Userinput() {
        System.out.print("Enter your guess (5 letters): ");
        return scanner.next().toUpperCase(); // Reads user input and converts it to uppercase
    }
}