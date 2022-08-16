package academy.learningprogramming;

public class Main {

    public static void main(String[] args) {
	int result = 1 + 2; //1 + 2 = 3
        System.out.println(result);

    int prevRes = result;
        System.out.println("prevRes " + prevRes);
        result = result - 1;
        System.out.println("new result "+ result);
        System.out.println("prevRes " + prevRes); //does not get affected  by operator


        result = result * 10; // res should be 20
        System.out.println("multiple res " + result);

        result = result / 5; // res should be 4
        System.out.println("division res " + result);

        result = result % 3; // res should be (4 / 3)'s remainder = 1
        System.out.println("modulus res " + result);

        //result = result +1
        result++; // 1 + 1 = 2;
        System.out.println("1 + 1 = " + result);

        result--; // 2 - 1 = 1
        System.out.println("2 - 1 = "+ result);

        result+= 2; //1 + 2 = 3
        System.out.println("1 + 2 = "+ result);

        result *= 10; // 3 * 10 = 30
        System.out.println("3 * 10 = " + 30);

        result /= 3;
        System.out.println("30 / 3 = " + 10 );

        boolean isAlien = false;
        if(isAlien == false)
            System.out.println("It is not an alien");
            System.out.println("I am scared of aliens");

        int topScore = 70;
        if(topScore <= 100){
            System.out.println("You got the high score!");
        }

        //AND operator
        int secondTopScore = 91;
        if(topScore > secondTopScore && topScore < 100){
            System.out.println("Greater than second top score and less than 100");
        }

        //Requires only one of the conditions to be true
        if((topScore > 90) || (secondTopScore <= 90)){
            System.out.println("Either or both conditions are true");
        }

        int newValue = 50;
        if(newValue == 50);
            System.out.println("This is an error");

            boolean isCar = false;
            boolean wasCar = isCar ? true : false;
            if(wasCar) {
                System.out.println("wasCar is true");
            }

            //Operators challenge
        //create a double var with value 20.00
        double doubleVal = 20.00d;
        //creat second double var of 90.00
        double secondDoubleVal = 80.00d;
        //add both nums and multiply by 100.00;
        double resOfDoub = (doubleVal + secondDoubleVal) * 100.00d;
        System.out.println("resOfDoub = " + resOfDoub);
        //use remainder operator to figure out the remainder and 40.00
        double remainder = resOfDoub % 40.00d;
        System.out.println("remainder = " + remainder);
        //create boolean if remainder is 0 or false if not
        boolean isWholeNum = remainder == 0d ? true : false;
        System.out.println("isWholeNum = " + isWholeNum);
        //if-then statement if previous value is not true
        if(!isWholeNum){
            System.out.println("Got some remainder");
        }
    }
}
