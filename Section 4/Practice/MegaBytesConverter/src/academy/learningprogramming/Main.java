package academy.learningprogramming;

public class Main {

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-2500);
        printMegaBytesAndKiloBytes(5000);
        printMegaBytesAndKiloBytes(0);
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes){

        int megaBytes = kiloBytes / 1024;
        int remainingKb = kiloBytes % 1024;
        if(kiloBytes >= 0){
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainingKb + " KB");
        } else {
            System.out.println("Invalid Value");
        }

    }
}
