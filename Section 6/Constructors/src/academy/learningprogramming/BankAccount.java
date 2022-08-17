package academy.learningprogramming;

public class BankAccount {
    private int accNum;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNum;

    //initalize constructor with defaults
    public BankAccount(){
        this(4147, 2300.00, "DefaultName", "default@gmail.com", "6265006186");
    }
    //set constructor with values passed into parameters
    public BankAccount(int accNum, double balance, String customerName, String email, String phoneNum){
        this.accNum = accNum;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNum = phoneNum;
    }
    //construtor with default for 2 parameters
    public BankAccount(String customerName, String email, String phoneNum){
        this(99999, 100.00, customerName, email, phoneNum);
    }

    public void deposit(double depositAmt){
        this.balance += depositAmt;
        System.out.println("Balance is now " + this.balance);
    }
    public void withdrawl(double withdrawalAmount){
        if(this.balance - withdrawalAmount < 0){
            System.out.println("Only " + this.balance + " available. Withdrawal not processed");
        } else {
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " processed. Remaining balance: " + this.balance);
        }
    }

    public int getAccNum(){
        return this.accNum;
    }
    public double getBalance() {
        return balance;
    }
    public String getCustomerName() {
        return customerName;
    }
    public String getEmail() {
        return email;
    }
    public String getPhoneNum() {
        return phoneNum;
    }

}
