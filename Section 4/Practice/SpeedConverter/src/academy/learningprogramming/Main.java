package academy.learningprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println(toMilesPerHour(75.114));
        printConversion(75.114);
    }
    public static long toMilesPerHour(double kilometersPerHour){
        //roundded value off the calculation of type long
        if(kilometersPerHour > 0) {
            long convertedMiles = Math.round(kilometersPerHour / 1.609);
            return convertedMiles;
        }
        return -1;
    }
    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour >= 0) {
            long convertedMiles = Math.round(kilometersPerHour / 1.609);
            System.out.println(kilometersPerHour + "km/h = " + convertedMiles + "mi/h");
        }

        else {
            System.out.println("Invalid Value");
        }
    }
}
