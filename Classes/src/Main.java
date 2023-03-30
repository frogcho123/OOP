import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner (System.in);
        int pen=Integer.parseInt (scanner.nextLine ());
        int marker=Integer.parseInt (scanner.nextLine ());
        int page=Integer.parseInt (scanner.nextLine ());
        int discount=Integer.parseInt (scanner.nextLine ());
        double penPrice=pen*5.8;
        double markerPrice=marker*7.2;
        double pagePrice=page*1.2;
        double sum=pagePrice+markerPrice+penPrice;
        double endPrice=sum*discount/100;
        System.out.println (sum-endPrice);

    }
}
