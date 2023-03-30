public class VipCustomer {
    private String name;
    private String email;
    private double limit;
    public VipCustomer(){
        this("mitko","mitko@abv.bg",9999.0);
    }
    public VipCustomer(String name , String email , double limit) {
        this.name = name;
        this.email = email;
        this.limit = limit;
    }
    public VipCustomer(String name,String email){
        this(name,email,1234);
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public double getLimit() {
        return limit;
    }
}
