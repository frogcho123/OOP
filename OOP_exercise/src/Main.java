public class Main {

    public static void main(String[] args) {
    Hamburger hamburger=new Hamburger ("basic","sausage",3.56,"white");
    double price=hamburger.ItemizeHamburger ();
        System.out.println ("");
    hamburger.addHamburgerAddition1 ("tomato",0.27);
    hamburger.addHamburgerAddition2 ("lettuce",0.75);
    hamburger.addHamburgerAddition3 ("cheese",1.13);
    System.out.println ("total burger price is "+ hamburger.ItemizeHamburger ());
        System.out.println ("");
    HealthyBurger healthyBurger=new HealthyBurger ("Bacon",5.67);
    healthyBurger.addHamburgerAddition1 ("egg",5.43);
    healthyBurger.addHealthyAddition1 ("lentil",3.41);
    System.out.println ("total burger price is "+healthyBurger.ItemizeHamburger ());

    DeluxeBurger deluxeBurger=new DeluxeBurger ();
        System.out.println (deluxeBurger.ItemizeHamburger ());

    }
}
