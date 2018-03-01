import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
//addition(2, 4);
//subtraction(2, 4);
//multiplication(2, 2);
//division(8, 2);
//gradeFinder();
//factorial(0, 0);
rollDice(0, 0);


    }


//    public static void addition(int a, int b) {
//        System.out.println(a + b);
//        }
//
//    public static void subtraction(int a, int b) {
//        System.out.println(a - b);
//    }
//
//    public static void multiplication(int a, int b) {
//        System.out.println(a * b);
//    }
//
//    public static void division(int a, int b) {
//        if (a/b % 2 == 0) {
//            System.out.println( (a/b) + " is an even number");
//        } else {
//            System.out.println( (a/b) + " is an odd number");
//        }
//    }

//    public static void gradeFinder() {
//        Scanner sc = new Scanner(System.in);
//        String choice = "y";
//
//        while (choice.equalsIgnoreCase("y")) {
//            System.out.println("Enter your class grade: ");
//            int grade = sc.nextInt();
//
//            if (grade >= 88) {
//                System.out.println("Your grade is a A");
//            } else if (grade >= 80 & grade <= 87) {
//                System.out.println("You received a B");
//            } else if (grade >= 67 & grade <= 79) {
//                System.out.println("You received a C");
//            } else if (grade >= 60 & grade <= 66) {
//                System.out.println("You received an D");
//            } else if (grade >= 0 & grade <= 59) {
//                System.out.println("You received an F");
//            }
//
//            System.out.print("Enter another grade? (y/n): ");
//            System.out.println();
//            choice = sc.next();
//
//        }
//    }


//    public static int factorial(int min, int max) {
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter a number between 1 and 10: ");
//        int userInput = sc.nextInt();
//
//        if (userInput > 0 && userInput <= 10) {
//            System.out.print("You are within range! Good job!: ");
//        } else {
//            System.out.print("You're not within range bro.. ");
//        }
//        return userInput;
//    }

    public static int rollDice(int die1, int die2) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of sides for the dice: ");
        int userInput = sc.nextInt();

        die1 = (int) (Math.random() * userInput);
        die2 = (int) (Math.random() * userInput);
        int roll = die1 + die2;

        System.out.println("The first die comes up " + die1);
        System.out.println("The second die comes up " + die2);
        System.out.println("Your total roll is " + roll);


    return userInput;

    }

}




