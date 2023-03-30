public class DeluxeBurger extends Hamburger{
    public DeluxeBurger() {
        super ("deluxe" , " sausage and bacon " , 14.54 , "white");
        super.addHamburgerAddition1 ("chips",2.1);
        super.addHamburgerAddition2 ("drink",1.1);
    }

    @Override
    public void addHamburgerAddition1(String name , double price) {
        System.out.println ("cant add");
    }

    @Override
    public void addHamburgerAddition2(String name , double price) {
        System.out.println ("cant add");
    }

    @Override
    public void addHamburgerAddition3(String name , double price) {
        System.out.println ("cant add");
    }

    @Override
    public void addHamburgerAddition4(String name , double price) {
        System.out.println ("cant add");
    }
}
