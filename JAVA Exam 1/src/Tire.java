public class Tire {

    //Attributes of class Tire as defined by the prompt

    private double price ;
    private String make ;
    private int mileage ;

    //default constructor
    public Tire(){
        this(0,"none",0);
    }

    //fully built constructor with constraints that set none valid values to 0 for numeric values
    public Tire(double price, String make, int mileage){
        if (price > 0) {
            this.price = price;
        }
        this.make = make;
        if (mileage > 5000) {
            this.mileage = mileage;
        }
    }

    //Getters and Setters
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getTMake() {
        return make;
    }
    public void setTMake(String make) {
        this.make = make;
    }
    public int getMileage() {
        return mileage;
    }
    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    //Class method to return a string value to whatever you are calling
    public String tireToString() {
        return "Tire price: " + price + "\n" + "Tire make: " + this.make + "\n" + "Tire mileage: " + this.mileage;
    }


    }

}
