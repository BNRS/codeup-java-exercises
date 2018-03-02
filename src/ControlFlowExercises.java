import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

//        int i=5;
//        while (i<15) {
//            System.out.print(i+" ");
//            i+=1;
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

//        long i = 2;
//        do {
//            System.out.println("i is " + i);
//            i *= i;
//        } while (i <= 1000000);

//        for(int i = 5; i <= 15; i ++) {
//            System.out.println("i is " + i);
//        }

//        for(int i = 100; i >= -10; i -= 5) {
//            System.out.println("i is " + i);
//        }

//        for(long i = 2; i <= 1000000; i *= i) {
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

//        for (int i = 1; i <= 45; i++) {
//            if (i % 15 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(String.valueOf(i));
//            }
//        }


//        ======================================================= Display a table of powers.
//
//        Prompt the user to enter an integer.
//        Display a table of squares and cubes from 1 to the value entered.
//        Ask if the user wants to continue.
//        Assume that the user will enter valid data.
//        Only continue if the user agrees to.
//        Example Output
//
//
//        What number would you like to go up to? 5
//
//        Here is your table!
//
//        number | squared | cubed
//        ------ | ------- | -----
//        1      | 1       | 1
//        2      | 4       | 8
//        3      | 9       | 27
//        4      | 16      | 64
//        5      | 25      | 125


//            Scanner sc = new Scanner(System.in);
//            boolean userContinues = true;
//
//            do {
//                System.out.print("What number would you like to go up to? ");
//                int userInt = sc.nextInt();
//                System.out.println();
//                System.out.println("Here is your table!");
//                System.out.println();
//                System.out.println("number | squared | cubed");
//                System.out.println("------ | ------- | -----");
//                for (int i = 1; i <= userInt; i += 1) {
//                    System.out.format("%-7d", i);
//                    System.out.print("|");
//                    System.out.format(" %-8d", i * i);
//                    System.out.print("|");
//                    System.out.format(" %-9d", i * i * i);
//                    System.out.println();
//                }
//                System.out.print("Would you like to enter another number (y/n)? ");
//                String userResponse = sc.next();
//                if (!userResponse.equalsIgnoreCase("y")) {
//                    userContinues = false;
//                }
//            } while (userContinues);



//        Scanner sc = new Scanner(System.in);
//        String choice = "y";
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



    }
}