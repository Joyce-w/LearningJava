package academy.learningprogramming;

public class Main {

    public static void main(String[] args) {
//        //default constructor values
	    VipCustomer customer1 = new VipCustomer();
        System.out.println(customer1.getCustomerName());
        System.out.println(customer1.getCreditLimit());
        System.out.println(customer1.getEmail());

//        //default 2 name and email;
        VipCustomer customer2 = new VipCustomer(50000);
        System.out.println(customer2.getCustomerName());
        System.out.println(customer2.getCreditLimit());
        System.out.println(customer2.getEmail());

        //Passed in all values;
        VipCustomer customer3 = new VipCustomer("Joyce",50000, "email.com");
        System.out.println(customer3.getCustomerName());
        System.out.println(customer3.getCreditLimit());
        System.out.println(customer3.getEmail());
    }
}
