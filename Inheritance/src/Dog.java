public class Dog extends Animal{//Animal е super клас
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;
    public Dog(String name , int size , int weight,int eyes,int legs,int teeth,int tail,String coat) {
        super (name , 1 , 1 , size , weight);
        this.eyes=eyes;
        this.legs=legs;
        this.teeth=teeth;
        this.tail=tail;
        this.coat=coat;
    }
    private void chew(){
        System.out.println ("Dog.chew() is called");
    }

    @Override
    public void eat() {
        System.out.println ("Dog.eat() called");
        chew ();
        super.eat ();
    }
    public void walk(){
        System.out.println ("Dog.walk() called");
        super.move (5);
    }
    public void run(){
        System.out.println ("Dog.run() called");
        move (10);
    }
    private void moveLegs(int speed){
        System.out.println ("Dog.moveLegs() called");
    }
    @Override
    public void move(int speed){
        System.out.println ("Dog.move() called");
        moveLegs(speed);
        super.move (speed);//по добре без супер понеже ако предефинираме функцията(метода) супер ще извика функцията
        // от Animal класа a не предефинираната ф-я
    }
}
