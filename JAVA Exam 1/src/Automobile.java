public class Automobile {
    //Automobile class with all the defined private attributes

    public static int count = 0;
    private String make ;
    private double price;
    private Tire tire;

    Automobile() {
        this("none",0,new Tire());

        //Default constructor for Automobile, do not need a count++ here since the this references the ++ in the below constructor
    }

    Automobile(String make, double price, Tire tire) {

        //Full constructor using constraints in the prompt, sets price to 0 if not a valid input

        this.make = make;
        if (price > 0) {
            this.price = price;
        }
        this.tire = tire;
        count = count + 1;
    }

    //Method to return a string value whenever it is called
    public String autoToString() {
        return ("Make: " + this.make + "\n" + "Price: " + (this.price) + "\n" + tire.tireToString());
    }

    //Method that returns a print of the current count of the class
    public static void autoCount() {
        System.out.println(Automobile.count);
    }
}
