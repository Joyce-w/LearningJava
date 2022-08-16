package academy.learningprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println("10k at 2% interest = " + calculateInterest( 10000.0, 2.0));

        for(int i = 2; i < 9; i++){
            System.out.println("Calculated with " + i + "% interest = " + String.format("%.2f", calculateInterest(10000, i)));
        }
    }
    public static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate/100));
    }
}
