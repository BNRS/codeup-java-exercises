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

        for (int i = 1; i <= 100; i++) {
            boolean fizzBuzz = false;
            if (i % 3 == 0) {
                System.out.print("Fizz");
                fizzBuzz = true;
            }
            if (i % 5 == 0) {
                System.out.print("Buzz");
                fizzBuzz = true;
            }
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("");
                fizzBuzz = true;
            }

            if (fizzBuzz) {
                System.out.println();
            } else {
                System.out.println(String.valueOf(i));
            }
        }

    }
}
