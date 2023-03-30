 class Car {
    private boolean engine;
    private int cylinder;
    private String name;
    private int wheels;

    public Car(int cylinder , String name) {
        this.cylinder = cylinder;
        this.name = name;
        this.engine=true;
        this.wheels=4;
    }
    public void startEngine(){
        System.out.println ("Car started engine");
    }
    public void accelerate(){
        System.out.println ("Car accelerate");
    }
    public void brake(){
        System.out.println ("Car brake");
    }
    public boolean isEngine() {
        return engine;
    }

    public int getCylinder() {
        return cylinder;
    }

    public String getName() {
        return name;
    }

    public int getWheels() {
        return wheels;
    }
}
class Bmw extends Car{
    public Bmw(int cylinder , String name) {
        super (cylinder , name);
    }

    @Override
    public void startEngine() {
        System.out.println ("Bmw started engine");
    }

    @Override
    public void accelerate() {
        System.out.println ("Bmw accelerate");
    }

    @Override
    public void brake() {
        System.out.println ("Bmw brake");
    }
}
class Audi extends Car{
    public Audi(int cylinder , String name) {
        super (cylinder , name);
    }

    @Override
    public void startEngine() {
        System.out.println ("Audi started engine");
    }

    @Override
    public void accelerate() {
        System.out.println ("Audi accelerate");
    }

    @Override
    public void brake() {
        System.out.println ("Audi brake");
    }
}
class Mercedes extends Car{
    public Mercedes(int cylinder , String name) {
        super (cylinder , name);
    }

    @Override
    public void startEngine() {
        System.out.println ("Mercedes started engine");
        //getClass ().getSimpleName () returns name of class
    }

    @Override
    public void accelerate() {
        System.out.println ("Mercedes accelerate");
    }

    @Override
    public void brake() {
        System.out.println ("Mercedes brake");
    }
}
public class Main {

    public static void main(String[] args) {
	Car car=new Car (8,"base car");
    car.startEngine ();
    car.accelerate ();
    car.brake ();

    Bmw bmw=new Bmw (6,"M sport");
    bmw.startEngine ();
    bmw.accelerate ();
    bmw.brake ();

    Audi audi=new Audi (10,"S line");
    audi.startEngine ();
    audi.accelerate ();
    audi.brake ();

    Mercedes mercedes=new Mercedes (12,"AMG");
    mercedes.startEngine ();
    mercedes.accelerate ();
    mercedes.brake ();
    }
}
