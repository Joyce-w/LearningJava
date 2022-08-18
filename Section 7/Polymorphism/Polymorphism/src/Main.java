

    //1a. create Movie Class
    class Movie{
        private String name;

        public Movie(String name) {
            this.name = name;
        }
        public String plot(){
          return "No plot here";
        };

        public String getName() {
            return this.name;
        }
    }


    class Jaws extends Movie {
        public Jaws() {
            //2. use inheritance to initalize name field in name class in Movie Class
            super("Jaws");
        }

        //3. method is the same inside Movie Class, we are overridding
        public String plot() {
            return "A shark eats lots of people";
        }
    }

    class IndependanceDay extends Movie {
        public IndependanceDay() {
            super("IndependenceDay");
        }
    @Override
        public String plot() {
            return "Aliens attack Earth";
        }
    }

    class MazeRunner extends Movie{
        public MazeRunner(){
            super("MazeRunner");
        }

        @Override
        public String plot() {
            return "Kids try to escape maze";
        }
    }

    class StarWars extends Movie{
        public StarWars() {
            super("Star Wars");
        }

        @Override
        public String plot() {
            return "Imperial Forces try to take universe";
        }
    }
    //4. Not an actual movie
    class Forgetable extends Movie{
        public Forgetable(){
            super("Forgetable");
        }
        //5. No plot
    }

public class Main {
    public static void main(String[] args) {
        //method or mechanism in OOP that allows action to act differently
        //based on actual action that is being formed.
        //1. Create many classes inside Main folder. See above
        //10. Create for loop to retrieve random movie
        for(int i = 1; i < 11; i++){
            Movie movie = randomMovie();
            System.out.println("Movie #" + i + " : " + movie.getName() + "\n" +
                    "Plot: " + movie.plot() + "\n");
            //11. Assigning different functionality depending on type of object we created. All plot method is different depending on Class
            //when inheriting from a class and you have a method that is override, gives unique functionality from the Class
        }

    }
    //7. create method to return random movie
    public static Movie randomMovie() {
        //8.Generate random number. Creates a double between 0 to 1
        //Multiply by 5 to return range between 0 and 4, add 1 to make it 1-5
        int randomNumber = (int) (Math.random() * 5) + 1;
        System.out.print("Random number generated was: " + randomNumber + "\n");
        //9. Use switch to create a movie class
        switch(randomNumber){
            case 1:
                return new Jaws();
            //break is optional because return key is already on line before (RETURN new Jaws())
            case 2:
                return new IndependanceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new Forgetable();
            default:
                return null;
        }
        //Return the super class Movie because all the other classes are inheriting from Movie


    }
}