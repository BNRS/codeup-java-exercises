package grocerylist;

import java.util.ArrayList;

public class GroceryList {
    ArrayList<GroceryItem> groceryList = new ArrayList<>();

    //Adds new grocery Item to the list
    public void addNewItem(GroceryItem item){
        groceryList.add(item);
    }

    public ArrayList<GroceryItem> getGroceryList() {
        return groceryList;
    }
}