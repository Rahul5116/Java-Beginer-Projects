package Github;

import java.util.Random;
import java.util.Scanner;

public class Guess_the_Number_Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numberToguess = random.nextInt(100)+1;
        int userGuess = 0 ;
        int chances = 0 ;

        System.out.println("Welcome to Guess the number game ! ! ");
        System.out.println("I have selected a random number between 1 to 100");
        System.out.println("Can you guess it ? ");
        while (userGuess != numberToguess){
            System.out.println("Enter your guess: ");
            userGuess = scanner.nextInt();
            chances++;

            if(userGuess < numberToguess){
                System.out.println("Higher !!!!");
            } else if (userGuess > numberToguess) {
                System.out.println("Lower !!!!");

            }else {
                System.out.println("Bingo ! Your guess is correct ");
                System.out.println("You took " + chances +  " tries ");
            }
        }
        scanner.close();

    }
}
