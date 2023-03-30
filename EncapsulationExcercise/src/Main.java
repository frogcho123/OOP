public class Main {

    public static void main(String[] args) {
    Printer printer=new Printer (50,false);
    System.out.println ("pages counter"+printer.getNumberOfPages ());
    int pagesPrinted=printer.printPages (4);
    System.out.println ("pages were "+pagesPrinted+" new total is "+printer.getNumberOfPages ());
    pagesPrinted=printer.printPages (2);
    System.out.println ("pages were "+pagesPrinted+" new total is "+printer.getNumberOfPages ());

    }
}
