package academy.learningprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println(canPack(1,0,4)); // false
        System.out.println(canPack(1,0,5)); // true
        System.out.println(canPack(0,5,4)); // true
    }
    public static boolean canPack(int bigCount, int smallCount,int goal){
        //bigCount = 5kilo
        //smallCount = 1kilo
        //goal = goal amount
        int bigCapacity = goal - (bigCount * 5);
        System.out.println("bigCap" + bigCapacity);
        int smallCapacity = goal - (smallCount * 1);
        System.out.println("smallCount" + smallCount);

        //fill using smallCapacity
        if(bigCapacity < 1){
            if(smallCapacity < 1){
                return false;
            } else {
                if(smallCapacity <= 0){
                    return true;
                } else {
                    return false;
                }
            }
        }
        if(bigCapacity <= 0){
            return true;
        }
        return false;


    }
}
