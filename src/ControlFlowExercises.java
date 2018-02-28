import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

//        int i = 5;
//        while (i < 15) {
//            System.out.print(" " + i);
//            i++;
//        }

//        int i = 0;
//        do {
//            System.out.println("i is " + i);
//            i+=2;
//        } while (i <= 100);

//        int i = 100;
//        do {
//            System.out.println("i is " + i);
//            i-=5;
//        } while (i >= -10);

//        int i = 2;
//        do {
//            System.out.println("i is " + i);
//            i *= 2;
//        } while (i <= 1000000);

//        for(int i = 5; i <= 15; i ++) {
//            System.out.println("i is " + i);
//        }

//        for(int i = 100; i >= -10; i -= 5) {
//            System.out.println("i is " + i);
//        }

//        for(int i = 2; i <= 1000000; i *= 2) {
//            System.out.println("i is " + i);
//        }

//        for (int i = 1; i <= 100; i++) {
//            boolean fizzBuzz = false;
//            if (i % 3 == 0) {
//                System.out.print("Fizz");
//                fizzBuzz = true;
//            }
//            if (i % 5 == 0) {
//                System.out.print("Buzz");
//                fizzBuzz = true;
//            }
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.print("");
//                fizzBuzz = true;
//            }
//
//            if (fizzBuzz) {
//                System.out.println();
//            } else {
//                System.out.println(String.valueOf(i));
//            }
//        }

//        for (int i = 1; i <= 100; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(String.valueOf(i));
//            }
//        }

//        System.out.println("Welcome to the Squares and Cubes Table");
//        System.out.println();
//
//        Scanner sc = new Scanner(System.in);
//        String choice = "y";
//
//        while(choice.equalsIgnoreCase("y")) {
//
//            // get the input from the user
//            System.out.println("Enter an Integer: ");
//            int integerNext = sc.nextInt();
//
//            System.out.println("Number" + "  " + "Squared" + "  " + "Cubed");
//            System.out.println("======" + "  " + "======" + "  " + "======");
//
//            for(int i = 1; i <= integerNext; i++) {
//
//                i = integerNext;
//                int numberSquared = (int) Math.pow(i, 2);
//                int numberCubed = (int) Math.pow (i, 3);
//
//                String message = "\n" + i + "       " + numberSquared + "       " + numberCubed;
//
//                System.out.println(message);
//                System.out.println();
//
//                // see if the user wants to continue
//                System.out.print("Continue? (y/n): ");
//                choice = sc.next();
//                System.out.println();
//            }
//        }

        Scanner sc = new Scanner(System.in);

        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            System.out.println("Enter your class grade: ");
            int grade = sc.nextInt();

            if (grade >= 88) {
                System.out.println("Your grade is a A");
            } else if (grade >= 80 & grade <= 87) {
                System.out.println("You received a B letter grade");
            } else if (grade >= 67 & grade <= 79) {
                System.out.println("You received a C letter grade");
            } else if (grade >= 60 & grade <= 66) {
                System.out.println("You received an D letter grade");
            } else if (grade >= 0 & grade <= 59) {
                System.out.println("You received an F letter grade");
            }

            System.out.print("Enter another grade? (y/n): ");
            System.out.println();
            choice = sc.next();



        }
    }
}