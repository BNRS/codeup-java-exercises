package grocerylist;

import java.util.ArrayList;
import java.util.Scanner;

public class GroceryTest {

    public static void main(String[] args) {
        GroceryList gList = new GroceryList();

        boolean keepGoing;
        do {
            System.out.println("Welcome to the grocery app!");
            System.out.println();

            if (askUserToAdd("Would you like to add an item? [y/n]")){
                keepGoing = true;
                gList.addNewItem(makeGroceryItem(getUserString("Enter item name: ") , getUserDouble("Enter price: ")));
                printGroceryList(gList);
            } else {
                keepGoing = false;
                System.out.println("Here's your final list!");
                printGroceryList(gList);
            }
        } while (keepGoing);
    }

    public static boolean askUserToAdd(String prompt){
        Scanner sc = new Scanner(System.in);
        System.out.print(prompt);
        return sc.next().equalsIgnoreCase("y") || sc.next().equalsIgnoreCase("yes");
    }

    public static void printGroceryList(GroceryList list) {
        System.out.printf("%-10s", "Grocery list\n");
        System.out.println("+-------------------------+");
        System.out.printf("%-15s | %5s", "Item", "Price\n");
        System.out.println("+-------------------------+");
        for (GroceryItem thing : list.getGroceryList()){
            System.out.printf("%-15s", thing.getName());
            System.out.printf(" | $%.2f\n", thing.getPrice());
        }
    }

    public static String getUserString(String prompt){
        Scanner sc = new Scanner(System.in);
        System.out.print(prompt);
        return  sc.nextLine();
    }

    public static double getUserDouble(String prompt){
        Scanner sc = new Scanner(System.in);
        System.out.print(prompt);
        return  sc.nextDouble();
    }


    public static GroceryItem makeGroceryItem(String name, double price){
        GroceryItem item = new GroceryItem(name, price);
        return item;
    }
}