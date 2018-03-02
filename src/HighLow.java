//import java.util.Scanner;
//
//public class HighLow {
//    public static void main(String[] args) {
//
//        highOrlow();
//    }
//
//    public static void highOrlow() {
//        Scanner sc = new Scanner(System.in);
//        String choice = "y";
//        int randomNumber = (int)(Math.random()*50);
//        while (choice.equalsIgnoreCase("y")) {
//            System.out.println("Guess a number between 1 and 50: ");
//            int userGuess = sc.nextInt();
//            System.out.println("You guessed ["+ userGuess + "] The random number is: " + randomNumber);
//
//
//            if (userGuess == randomNumber) {
//                System.out.println("You're amazing! You guessed the number!!");
//            } else if (userGuess > randomNumber) {
//                System.out.println("GO LOWER!");
//            } else if (userGuess < randomNumber) {
//                System.out.println("GO HIGHER");
//            }
//
//            System.out.print("Would you like to play again? (y/n): ");
//            System.out.println();
//            choice = sc.next();
//
//        }
//    }
//}
