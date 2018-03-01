import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {

//addition(2);
//subtraction(2);
//multiplication();
//division(12);
gradeFinder();

    }

    public static void addition(int input) {
        System.out.println(input + 2);
        }

    public static void subtraction(int input) {
        System.out.println(input - 2);;
    }

//    public static void multiplication() {
//        Scanner sc = new Scanner(System.in);
//        int result=0;
//        int x=0;
//        System.out.print("Enter Num1 :");
//        int num1 = sc.nextInt();
//        System.out.print("Enter Numb2 :");
//        int num2 = sc.nextInt();
//
//        while(x<2) {
//            result=result+num1;
//            x++;
//        }
//        System.out.print(result);
//
//    }



    public static void division(int input) {
        System.out.println(input / 2);
        if (input % 2 == 0) {
            System.out.println("this is an even number");
        } else {
            System.out.println("this is an odd number");
        }
    }

    public static void gradeFinder() {
        Scanner sc = new Scanner(System.in);
        String choice = "y";

        while (choice.equalsIgnoreCase("y")) {
            System.out.println("Enter your class grade: ");
            int grade = sc.nextInt();

            if (grade >= 88) {
                System.out.println("Your grade is a A");
            } else if (grade >= 80 & grade <= 87) {
                System.out.println("You received a B");
            } else if (grade >= 67 & grade <= 79) {
                System.out.println("You received a C");
            } else if (grade >= 60 & grade <= 66) {
                System.out.println("You received an D");
            } else if (grade >= 0 & grade <= 59) {
                System.out.println("You received an F");
            }

            System.out.print("Enter another grade? (y/n): ");
            System.out.println();
            choice = sc.next();

        }
    }

}
