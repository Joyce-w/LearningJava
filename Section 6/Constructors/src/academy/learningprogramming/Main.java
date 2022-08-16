package academy.learningprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BankAccount first = new BankAccount();
        first.setAccNum(123456);
        System.out.println(first.getAccNum());

        first.setCustomerName("Joyce");
        System.out.println(first.setCustomerName());
    }
}
