package com.joycewong;

public class Motherboard {
    private String model;
    private String manufacturere;
    private int ramSlots;
    private int cardSlots;
    private String bios;

    public Motherboard(String model, String manufacturere, int ramSlots, int cardSlots, String bios) {
        this.model = model;
        this.manufacturere = manufacturere;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    //1. add public method
    public void loadProgram(String programName){
        System.out.println("Program " + programName + " is now loading...");
    }
    public String getModel() {
        return model;
    }

    public String getManufacturere() {
        return manufacturere;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public String getBios() {
        return bios;
    }
}
