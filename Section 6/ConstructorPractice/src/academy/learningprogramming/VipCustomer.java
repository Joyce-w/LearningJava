package academy.learningprogramming;

public class VipCustomer {
    private String customerName;
    private int creditLimit;
    private String email;

    //Constructor with default values
    public VipCustomer(){
        this("CustomeName", 3000, "DefaultEmail");
    }
    //Constructor with all saved fields
    public VipCustomer(String customerName, int creditLimit, String email){
        this.customerName = customerName;
        this.creditLimit = creditLimit;
        this.email = email;
    }
    //Constructor with 2 default values and a passed in 3rd
    public VipCustomer(int creditLimit){
        this("CustomerName2", creditLimit, "DefaultEmail2");
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
