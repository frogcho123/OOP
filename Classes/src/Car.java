import java.util.Locale;

public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;



    public void setModel(String model) {
        String valid=model.toLowerCase();
        if(valid.equals ("e90")||valid.equals ("a4")) {
            this.model = model;
        }
        else    this.model="unknown";
    }


    public String getModel() {
        return model;
    }
}
