package com.joycewong;

import java.util.Scanner;

public class NewArray {
    private static Scanner scanner = new Scanner(System.in);

    public static int[] getIntegers(int num) {
        System.out.println("Please enter " + num + " number entries.");
        int[] inputArray = new int[num];
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = scanner.nextInt();
        }
        return inputArray;
    }

    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int[] sortIntegers(int[] arr){
        int[] sortedArray = new int[arr.length];
        //loop thru array
        for(int i = 0; i< arr.length; i++){
            //create copy of array
            sortedArray[i] = arr[i];
        }
        //create while loop and for loop
        boolean flag = true;
        int temp;
        while(flag){
            flag = false;
            //if for loop has not assigned all the numbers, we keep flag false
            for(int i = 0; i<sortedArray.length-1;i++){
                //check if next num is greater than current number, we need to swap
                if(sortedArray[i] < sortedArray[i+1]){
                    //store the smaller number in a temp
                    temp = sortedArray[i];
                    //swap larger num into smaller num;
                    sortedArray[i] = sortedArray[i+1];
                    //move the smaller number 'right'
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}
