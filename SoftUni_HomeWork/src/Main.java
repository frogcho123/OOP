import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String fuelType = scanner.nextLine ();
        int fuelAmount = Integer.parseInt (scanner.nextLine ());
        String card = scanner.nextLine ();
        double price=0;
        if (card.equals ("Yes")) {
            if (fuelType.equals ("Gasoline")) {
                price=fuelAmount * 2.04;
            } else if (fuelType.equals ("Gas")) {
                price=fuelAmount * 0.85;
            } else if (fuelType.equals ("Diesel")) {
                price=fuelAmount * 2.21;
            }
        }
        if (card.equals ("No")) {
            if (fuelType.equals ("Gasoline")) {
                price=fuelAmount * 2.22;
            } else if (fuelType.equals ("Gas")) {
                price=fuelAmount * 0.93;
            } else if (fuelType.equals ("Diesel")) {
                price=fuelAmount * 2.33;
            }
        }

        if(fuelAmount<20) {
            System.out.printf ("%.2f lv.",price);
        }
        else if(fuelAmount>=20&&fuelAmount<=25){
            price=price-price*0.08;
            System.out.printf ("%.2f lv.",price);
        }
        else {
            price=price-price*0.1;
            System.out.printf ("%.2f lv.",price);
        }
    }
}

