package academy.learningprogramming;

//1. to inherit another class use 'extends keyword
public class Dog extends Animal {

    //4. We can add extra state and behavior that are applicable to Dog class
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    //2. Call the constructor of the academy.learningprogramming.Animal class;
    //6. initalize other state from constructor from above
    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        //3. super means to call the constructor of the class we are extending from
        //5. add brain and body default values because this is true for all Dogs
        super(name, 1, 1, size, weight);
        //6. initalize other state from Dogs
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.teeth = teeth;
        this.coat = coat;
    }

    //9. create our own methods
    private void chew() {
        System.out.println("Dog is chewing");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
    }
}
