public class Main {

    public static void main(String[] args) {
	// class is a blueprint for a house
    //each house we build is an instance
    //each house has an address reference
    //Example
        House blueHouse = new House ("blue");//we make a new instance of a house
        House anotherHouse=blueHouse;//we have 2 references to the same object(blueHouse)  both references point to
        // the same object in memory


        System.out.println (blueHouse.getColor ());//blue
        System.out.println (anotherHouse.getColor ());//blue

        anotherHouse.setColor ("red");
        System.out.println (blueHouse.getColor ());//red
        System.out.println (anotherHouse.getColor ());//red

        House greenHouse=new House ("green");//2 objects but we have 3 references greenHouse points to different obj
        // in memory
        anotherHouse=greenHouse;//now anotherHouse is pointing to greenHouse

        System.out.println (blueHouse.getColor ());//red
        System.out.println (greenHouse.getColor ());//green
        System.out.println (anotherHouse.getColor ());//green
    }
}
