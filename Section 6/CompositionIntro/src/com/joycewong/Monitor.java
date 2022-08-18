package com.joycewong;

public class Monitor {
    private String model;
    private String manufacturer;
    private int size;
    private Resolution nativeResolution;
    //3. Resolution class is part of the Monitor class, but the monitor isn't a resolution.

    public Monitor(String model, String manufacturer, int size, Resolution nativeResolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSize() {
        return size;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }

    //2. create public method
    public void drawPixelAt(int x, int y, String color){
        System.out.println("Drawing pixel at "+ x + " , " + y + " in color " + color);
    }
}
