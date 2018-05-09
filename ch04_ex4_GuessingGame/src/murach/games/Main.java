package murach.games;

//import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        System.out.println("Welcome to the Number Guessing Game");
        System.out.println();

        Scanner sc = new Scanner(System.in);

        // Get upper limit
        System.out.print("Enter the upper limit for the number: ");
        NumberGame numberGame = new NumberGame(Integer.parseInt(sc.nextLine()));
        int upperLimit = numberGame.getUpperLimit();
        
        
        System.out.println("OK, I'm thinking of a number between 0 and " +
                upperLimit);
        System.out.println();
        
        //int number = numberGame.getNumber();
        
        System.out.print("Enter your guess: ");
        int guess = Integer.parseInt(sc.nextLine());
        
        
        //한번에 맞출경우 그냥 넘어가버림. 수정해야됨.
        do {

          int correctGuess = numberGame.isCorrectGuess(guess);
          if (correctGuess == -1) {
              System.out.println("Your guess is too low.\n");
              
          } else if (correctGuess == 1) {
              System.out.println("Your guess is too high.\n");
          }         

          numberGame.incrementGuessCounter();
          System.out.print("Enter your guess: ");
          guess = Integer.parseInt(sc.nextLine());     
          
        }while (numberGame.isCorrectGuess(guess) != 0);
        
        
        System.out.println("Correct!\n");
        
        System.out.println("You guessed the correct number in " + numberGame.getGuessCounter() +
                " guesses.\n");
        System.out.println("Bye!");
        sc.close();
    }
   
}