package academy.learningprogramming;

public class Car {
    //1 .create fields for clases to define the template of a Car
    //1a. this is the state of a Car
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    //3. create an object we can start using
    //3a. Go to Main class
    //4. Create method to update the model
    //4a. parameter model needs to be the same as field
    public void setModel(String model){
        //4b. do so by using .this to refer to the field
        //update field with the parameter that is passed in
        //8. Add check to make sure model is allowed
        String validModel = model.toLowerCase();
        System.out.println("validModel " + validModel);
        if(validModel.equals("carrera")|| validModel.equals("911")){
            this.model = model;
        } else {
            this.model = "Unknown";
        }

    }

    //6. Create a getter method to get the name of the model
    public String getModel(){
        return this.model;
    }
}
