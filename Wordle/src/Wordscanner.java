import java.util.Scanner;

public class Wordscanner {
    private Scanner scanner;

    public Wordscanner () {
        scanner = new Scanner(System.in);
    }

    public String Userinput() {
        System.out.print("Enter your guess (5 letters): ");
        return scanner.next().toUpperCase();
    }
}