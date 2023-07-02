/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args ){

        //create a scanner object with the name of userInput and initialize with system.in input
        Scanner userInput = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String userName = userInput.nextLine();

            while (!(userName.equals("Alice") || userName.equals("Bob"))) {

                System.out.print("Please enter another name: ");
                userName = userInput.nextLine();

            }
                    System.out.print("Greetings: " + userName );

    }
}
