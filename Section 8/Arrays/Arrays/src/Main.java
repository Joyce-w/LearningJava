import java.util.Scanner;

public class Main {
    //creating RL example
    //define static scanner and takes in input
    private static Scanner scanner = new Scanner(System.in);

    //
    public static int[] getIntegers(int number){
        System.out.println("Enter " + number + " integer values.\r");
        int [] values = new int[number];

        //loop thru length of array. values from scanner will be saved to array
        for(int i = 0; i<values.length; i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }



    public static void main(String[] args) {
        int [] myIntegers = getIntegers(5);
        for(int i = 0; i<myIntegers.length; i++){
            System.out.println("Element " + i + " typed: " + myIntegers[i]);
        }



        //RL example ^^//


        //CREATING array [] after type to tell Java complier that we have an array
        int[] myVariable;
        //type in number of elements we want to assign to the array
        myVariable = new int[10];

        //SAVING element to array, determine position and pass in value
        //save int 50 to position 6!  b
        myVariable[5] = 50;

        //RETRIEVING
        System.out.println(myVariable[5]);

        //Declare & Assign:If you know elements ahead of time, wrap in brackets
        int[] newArray = {2,5,7,8,10};

        //Use for loop to initalize
        int[] loopedArray = new int[10];
        for(int i = 0; i < loopedArray.length; i++){
            loopedArray[i] = i*10 ;
        }

        //call method that loops array
//        printArray(loopedArray);
    }

    //crate method that loops and fills array
    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++){
            array[i] = i*10 ;
            System.out.println("Element " +i+ " has value " + i*10);
        }
    }


}