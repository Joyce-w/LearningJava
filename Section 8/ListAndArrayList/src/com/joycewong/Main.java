package com.joycewong;

import java.util.Scanner;

public class Main {
    //Add scanner to implement groceryList
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList myGroceries = new GroceryList();

    public static void main(String[] args) {
        // ArrayList inherits from AbstractList
        //List extends Collection interface

        //ArrayList is a resizable array. handles internally
        //As elements are added, it grows it allocates more memory

        //1. Create class called GroceryList

//////////
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit) {
            System.out.println("Enter your choice");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstruction();
                    break;
                case 1:
                    getGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }

}

    private static void printInstructions() {
    }

    //create instructions
    public static void printInstruction(){
        System.out.println("\nPress ");
        System.out.println("\n0 - To print choice options ");
        System.out.println("\n1 - To print grocery list ");
        System.out.println("\n2 - To add item ");
        System.out.println("\n3 - To modify item ");
        System.out.println("\n4 - To remove item ");
        System.out.println("\n5 - search for item  ");
        System.out.println("\n6 - quit the application  ");
    }
    //
    public static void getGroceryList(){
        myGroceries.printGroceryList();
    }
    public static void addItem(){
        System.out.print(("Please enter the grocery item: "));
        //does nothing until next line is enter giving input string
        myGroceries.addGroceryItem(scanner.nextLine());
    }
    public static void modifyItem(){
        System.out.print("Enter item number: ");
        int itemNo = scanner.nextInt();
        //clear the buffer
        scanner.nextLine();
        //enter new item
        System.out.print("Enter replacement item: ");
        String newItem = scanner.nextLine();
        //arrays counting from 0(see modifyGroceryItem()).
        // Deduct 1 by the number entered by the user
        myGroceries.modifyGroceryItem(itemNo-1, newItem);
    }

    //remove item
    public static void removeItem(){
        System.out.print(("Please enter the grocery item: "));
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        myGroceries.removeGroceryItem(itemNo);
    }

    //search item
    public static void searchForItem() {
        System.out.print("Item to search for: ");
        String searchItem = scanner.nextLine();
        if(myGroceries.findItem(searchItem) != null) {
            System.out.println("Found " + searchItem + " in  our grocery list");
        } else {
            System.out.println(searchItem + " is not in the shopping list");
        }
    }


}