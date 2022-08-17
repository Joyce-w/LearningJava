package academy.learningprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BankAccount first = new BankAccount();
//        first.setAccNum(123456);
//        System.out.println(first.getAccNum());
//
//        first.setCustomerName("Joyce");
//        System.out.println(first.setCustomerName());
//
//        first.setBalance(200.00);
//        System.out.println(first.getBalance());
//
//        first.deposit(50);
//        first.withdrawl(20);

        //with passed in values into constructor
//        BankAccount withConstructors = new BankAccount(1256, 3232.32, "Joyce", "j@gmail.com", "2923822929");
//        System.out.println(withConstructors.getAccNum());
//        System.out.println(withConstructors.getBalance());
//
//        withConstructors.deposit(50);
//        withConstructors.withdrawl(20);

        //default values from constructor
//        BankAccount newAccount = new BankAccount();
//        System.out.println(newAccount.getCustomerName());

        //default with some values passed in
        BankAccount someDefaults = new BankAccount("notDefaultName", "d@gmail.com", "1011011111");
        System.out.println(someDefaults.getAccNum());
        System.out.println(someDefaults.getCustomerName());
    }
}
