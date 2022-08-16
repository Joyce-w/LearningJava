package academy.learningprogramming;

public class Main {

    public static void main(String[] args) {
        int switchValue = 1;
        switch(switchValue){
            case 1: //test for literal value
                System.out.println("Value was 1");
                break; //terminates the enclosing switch systen and contines after switch
            case 2:
                System.out.println("Value was 2");
                break;
            default: // prints out all other cases
                System.out.println("was not 1 or 2");
                break;
        }
    }
}
