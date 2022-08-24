package academy.learningprogramming;

public class Main {

    public static void main(String[] args) {
	//7. create animal class;
        Animal animal = new Animal("Animal", 1,1,5,5);
    //8. Create new dog
    Dog dog = new Dog("Yorkie",5,5,2,4,1,29,"silkie");
    dog.eat();
    dog.walk();
    }
}
