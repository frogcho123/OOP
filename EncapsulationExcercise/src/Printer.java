public class Printer {
    private int tonerLevel=100;
    private int numberOfPages;
    private boolean isDuplex;

    public Printer(int tonerLevel , boolean isDuplex) {
        if(tonerLevel>=0&&tonerLevel<=100){
            this.tonerLevel = tonerLevel;
        }
        else this.tonerLevel=-1;
        this.numberOfPages = 0;
        this.isDuplex = isDuplex;
    }
    public int fillToner(int percent){
        if(percent>0 && percent<100){
            if((this.tonerLevel+percent)>100){
                return -1;
            }
            else{
                this.tonerLevel+=percent;
                return this.tonerLevel;
            }
        }else return -1;
    }
    public int printPages(int pages){
        int pagesToPrint=pages;
        if(this.isDuplex){
            pagesToPrint=(pages/2)+(pages%2);
            System.out.println ("duplex mode on");
        }
        this.numberOfPages+=pagesToPrint;
        return pagesToPrint;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }
}
