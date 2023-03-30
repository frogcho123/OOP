public class Bank {
    private int num;
    private double balance;
    private String name;
    private String mail;
    private String phoneNum;
    public Bank(){
        this(9876,2.50,"Default name for user","Default adress","Deafualt phone number");

    }
    public Bank(int num , double balance , String name , String mail , String phoneNum) {
        this.num = num;
        this.balance = balance;
        this.name = name;
        this.mail = mail;
        this.phoneNum = phoneNum;
    }
    public Bank(String name , String mail , String phoneNum){
        this(99999,2.50,name,mail,phoneNum);
    }

    public void deposit(double deposit){
        this.balance+=deposit;
    }
    public void withdraw(double withdraw){
        if (balance-withdraw<0) System.out.println (balance+"available cant withdraw");
        else {
            balance -= withdraw;
            System.out.println (withdraw + "    " + balance);
        }
    }

    public int getNum() {
        return num;
    }



    public void setNum(int num) {
        this.num = num;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
}
