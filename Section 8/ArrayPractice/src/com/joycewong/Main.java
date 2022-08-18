package com.joycewong;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        NewArray myNewArr = new NewArray();
        int[] myIntegers = myNewArr.getIntegers(5);
        int[] sorted = myNewArr.sortIntegers(myIntegers);
        myNewArr.printArray(sorted);

    }
}
