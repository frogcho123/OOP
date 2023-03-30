import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int V=Integer.parseInt (scanner.nextLine ());
        int P1=Integer.parseInt (scanner.nextLine ());
        int P2=Integer.parseInt (scanner.nextLine ());
        double H=Double.parseDouble (scanner.nextLine ());
        double first=P1*H;
        double second=P2*H;
        if((first+second)>=V){
        double percent=(((first+second)*100)/V);
        double percentP1=(first*100)/V;
        double percentP2=(second*100)/V;
            System.out.println (5);
        }

    }
}
