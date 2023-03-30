class Movie{
    private String name;
     public Movie(String name){
         this.name=name;
     }
     public String plot(){
         return "no plot";
     }

    public String getName() {
        return name;
    }
}
class Jaws extends Movie{
    public Jaws(){
        super("Jaws");
    }
    public String plot(){
        return "A shark eats people";
    }
}
class Independence extends Movie{
    public Independence(){
        super("Independence");
    }

    @Override
    public String plot() {
       return "aliens take over earth";
    }
}
class Mazerunner extends Movie{
    public Mazerunner(){
        super("Mazerunner");
    }
    @Override
    public String plot() {
       return "people run in a maze";
    }
}
class StarWars extends Movie{
    public StarWars(){
        super("Star wars");
    }
    @Override
    public String plot() {
       return "The empire strikes back";
    }
}
class Forgetable extends Movie{
    public Forgetable(){
        super("Forgetable");
    }
}

public class Main {
    public static Movie RandomMovie(){
        //generate a random number
        int randomNum=(int)(Math.random ()*5)+1;//return type double between 0 and 1
        System.out.println ("random number "+ randomNum);
        switch (randomNum){
            case 1:
                return new Jaws ();
            case 2:
                return new Independence ();
            case 3:
                return new Mazerunner ();
            case 4:
                return new StarWars ();
            case 5:
                return new Forgetable ();
            default:
                return null;
        }
    }

    public static void main(String[] args) {
        for (int i=1;i<11;i++){
            Movie movie=RandomMovie ();
            System.out.println ("Movie # "+i+" "+movie.getName ()+"\n"+"plot is "+movie.plot ()+"\n");
        }
    }

}
