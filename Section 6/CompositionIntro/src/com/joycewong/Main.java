package com.joycewong;

public class Main {

    public static void main(String[] args) {
        //8. Create Dimensions instance to use in theCase
        Dimensions dimensions = new Dimensions(20, 20, 5);
    //7. Create Case instance
        Case theCase = new Case("220B", "Dell", "240", dimensions);
    //9. create monitor instance.
        // 9a. Can create new instance of class(new Resolution) inside parameter if variable will not be reused.
        Monitor theMonitor = new Monitor("2700 Beast", "Acer", 27, new Resolution(1280, 780));
    //10. Create motheroard
        Motherboard theMotherBoard = new Motherboard("JW-2000", "Asus",4,6,"5.2.0");

    //11. Put the PC together!
        PC thePC = new PC (theCase,theMonitor, theMotherBoard);
    //12. To access methods from withiin class methods use dot notation to access getter method of subClass to get access
        //12a. using dot notation will have access to the subClasses' method.
        thePC.getMonitor().drawPixelAt(20, 40, "red");
    }
}
