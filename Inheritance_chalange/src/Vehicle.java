public class Vehicle {
    private String name;
    private String size;

    private int currentVelocity;
    private int currentDirectory;

    public Vehicle(String name , String size) {
        this.name = name;
        this.size = size;

        this.currentVelocity=0;
        this.currentDirectory=0;
    }

    public void steer(int directory){
        this.currentDirectory+=directory;
        System.out.println ("Vehicle.steer() called Steering at "+ currentDirectory+" digrees");
    }

    public void move(int velocity,int directory){
        currentDirectory=directory;
        currentVelocity=velocity;
        System.out.println ("Vehicle.move() called: Moving at "+currentVelocity+" in directory  "+currentDirectory);
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirectory() {
        return currentDirectory;
    }

    public void stop(){
        this.currentVelocity=0;
    }
}
