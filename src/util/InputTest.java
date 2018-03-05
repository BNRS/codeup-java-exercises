package util;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();

        int num1 = input.getIntWithinRange("Please input an integer between 1 and 10", 1, 10);

        System.out.println("You input the number " + num1);

        boolean choice = input.yesNo("Do you want to input another integer?");

        if(choice) {
            int num2 = input.getInt("Please input ANY valid integer");
            System.out.println("You entered: " + num2);
        }

        if(input.yesNo("Wanna enter an integer?")) {
            int num3 = input.getInt("Please enter any integer");
            System.out.println("You entered: " + num3);
        }

        double someDouble;
        someDouble = input.getDouble("Please input any number");
        System.out.println("You input " + someDouble);

        double getDoubleWithinRange;
        getDoubleWithinRange = input.getDoubleWithinRange("Input any number between 1.1 and 9.9", 1.1, 9.9);

        System.out.println(getDoubleWithinRange);
    }
}