package com.joycewong;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //a single space is created in memory to hold value
        //if assigning to another variable, it will copy and both will work differently
        int myIntValue = 10;
        int anotherIntValue = myIntValue;

        System.out.println("myIntVal " + myIntValue);
        System.out.println("anotherIntVal " + anotherIntValue);

        anotherIntValue++;
        System.out.println("anotherIntVal " + anotherIntValue);


        //with Reference types like Array and Classes
        //new keyword means new object

        int[] myIntArray = new int[5];
        //array has 5 element with a reference myIntArray
        //reference holds reference to an address but not the object itself
        //reference to array in memory

        int[] anotherArray = myIntArray;
        //we are trying declaring the same in array in memory. both are pointing to the SAME array in memory
        //toString prints out a string of the array with comma as seperator
        System.out.println("myIntArray= " + Arrays.toString(myIntArray));
        System.out.println("myIntArray= " + Arrays.toString(anotherArray));

        anotherArray[0] = 1;
        System.out.println("myIntArray AFTER = " + Arrays.toString(myIntArray));
        System.out.println("myIntArray AFTER = " + Arrays.toString(anotherArray));
    }
}
