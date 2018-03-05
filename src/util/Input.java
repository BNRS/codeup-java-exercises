package util;

import java.util.Scanner;

public class Input {

    private Scanner scan;

    public Input() {
        scan = new Scanner(System.in).useDelimiter("\n");
    }

    public String getString(String prompt) {
        System.out.println(prompt);
        String userInput = scan.nextLine();
        return userInput;
    }

    public boolean yesNo(String prompt) {
        String userInput = getString(prompt);
        if(userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes")) {
            return true;
        } else {
            return false;
        }
    }

    public int getInt(String prompt) {
        System.out.println(prompt);
        String intInput = scan.nextLine();

        try {
            return Integer.valueOf(intInput);
        } catch (NumberFormatException e) {
            System.out.println("ERROR - Input must be an integer");
            return getInt(prompt);
        }
    }

    public int getIntWithinRange(String prompt, int min, int max) {
        int userInt = getInt(prompt);
        if(userInt < min || userInt > max) {
            System.out.println("ERROR - please enter a number within range of " + min + " and " + max);
            return getIntWithinRange(prompt, min, max);
        } else {
            return userInt;
        }
    }

    public double getDouble(String prompt) {
        System.out.println(prompt);
        return getDouble(prompt);
    }

    public double getDoubleWithinRange(String prompt, double min, double max) {
        double number = getDouble(prompt);
        if(number < min || number > max) {
            return getDoubleWithinRange(prompt, min, max);
        } else {
            return number;
        }
    }
}