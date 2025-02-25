import java.util.Scanner;

class Tire{
    private double price ;
    private String make ;
    private int mileage ;

    public Tire(){
        price = 0 ;
        mileage = 0 ;
        make = "none" ;
    }

    public Tire (double p, String m, int mil){
        price = p ;
        make = m ;
        mileage = mil ;

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "Tire{" +
                "price=" + price +
                ", make='" + make + '\'' +
                ", mileage=" + mileage +
                '}';
    }
}

class Auto {
    private static int count = 0 ;
    private String make ;
    private double price ;
    private Tire tire ;

    public static int getCount() {
        return count;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Tire getTire() {
        return tire;
    }

    public void setTire(Tire tire) {
        this.tire = tire;
    }

    public Auto(){
        make = "none" ;
        price = 0 ;
        tire = new Tire() ;
        count ++ ;

    }

    public Auto(double p, String m, Tire t){
        make = m ;
        price = p ;
        tire = t ;
        count ++;

    }

    public Auto(double p, String m, double tprice, int mil, String tmake){
        price = p ;
        make = m ;
        tire = new Tire(tprice, tmake, mil) ;
        count ++ ;

    }

    @Override
    public String toString() {
        return "Auto{" +
                "make='" + make + '\'' +
                ", price=" + price +
                ", tire=" + tire +
                '}';
    }
}




public class Demo {
    public static void main(String[] args) {
        Auto a1, a2, a3 ;
        Scanner obj = new Scanner(System.in);
        System.out.print("Please enter the make of the tire: ");
        String tmake = obj.nextLine();
        System.out.print("Please enter the price of the tire: ");
        double tprice = obj.nextDouble();
        System.out.print("Please enter the mileage of the tire: ");


    }
}
