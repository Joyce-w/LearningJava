package academy.learningprogramming;

public class Main {

    public static void main(String[] args) {
        //3. create Car class
        //3a. define and initalize the class with the new keyword
	Car porsche = new Car();
	Car holden = new Car();
	//5. update model using setModel method
        porsche.setModel("Carrera");

    //7. can call model name now
    System.out.println("Model is " + porsche.getModel());
    }

}
