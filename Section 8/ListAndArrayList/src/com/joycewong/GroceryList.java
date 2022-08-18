package com.joycewong;

import java.util.ArrayList;

public class GroceryList {
    //Arraylist can hold objects, need to tell <what data is going in>
    //ArrayList is a Class that can have constructors
    private ArrayList<String> groceryList = new ArrayList<String>();

    //add something to groceryList
    public void addGroceryItem(String item){
        groceryList.add(item);
    }

    //print groceryList
    public void printGroceryList(){
        System.out.println("You have" + groceryList.size() + " items in your grocery list");
        for(int i = 0; i< groceryList.size(); i++){
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }

    //updating arraylist
    public void modifyGroceryItem(int position, String newItem){
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position+1) + " has been modified.");
    }

    //removing an arralist element
    public void removeGroceryItem(int position){
        String theItem = groceryList.get(position);
        groceryList.remove(position);

    }
}
