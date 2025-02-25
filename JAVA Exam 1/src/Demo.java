import java.util.Scanner;

// Demo class that tests to make sure that the functions are being passed properly and the classes work correctly

public class Demo {
    private Tire tire;

    public static void main(String[] args) {
        //Creating an Automobile object that uses only the default constructors for both classes
        Automobile a = defaultAuto();
        System.out.println("Default automobile created, please update values");
        //Creates an object for class demo to run the non static functions below
        Demo d0 = new Demo();
        //Runs a function to update the values of the default object
        a = d0.changeAuto();

        //Created an object and ran a function to input values for a new Automobile object and prints out the current Automobile count
        Demo d1 = new Demo();
        Automobile b = d1.newAuto();

        //Repeats the steps above
        Demo d2 = new Demo();
        Automobile c = d2.newAuto();

        //Prints out the three objects that were created
        System.out.println("\nAutomobile 1 \n" + a.autoToString() + "\n \nAutomobile 2 \n" + b.autoToString() + "\n \nAutomobile 3 \n" + c.autoToString());

    }

        //Function uses methods from the Automobile class to create a default object in the Automobile class and show the count
        public static Automobile defaultAuto() {
            Automobile a1 = new Automobile();
            System.out.println(a1.autoToString());
            Automobile.autoCount();
            return a1;
        }

        //Function that creates a new Automobile object and asks user for values to input into it
        //Will give you a prompt if you input incorrect values
        public Automobile newAuto() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter automobile make: ");
            String aMake = sc.nextLine();
            System.out.println("Enter automobile price as a positive number: ");
            double aPrice = sc.nextDouble();
            if (aPrice < 0 ) {
                while (aPrice < 0) {
                    System.out.println("Enter a positive number: ");
                    aPrice = sc.nextDouble();
                }
            }
            sc.nextLine();
            System.out.println("Enter tire make: ");
            String tMake = sc.nextLine();
            System.out.println("Enter tire price as a positive number: ");
            double tPrice = sc.nextDouble();
            if (tPrice < 0 ) {
                while (tPrice < 0) {
                    System.out.println("Enter a positive number: ");
                    tPrice = sc.nextDouble();
                }
            }
            sc.nextLine();
            System.out.println("Enter mileage as a number above 5000: ");
            int mileage = sc.nextInt();
            if (mileage <= 5000 ) {
                while (mileage < 5000) {
                    System.out.println("Enter a valid mileage: ");
                    mileage = sc.nextInt();
                }
            }
            sc.nextLine();
            tire = new Tire(tPrice, tMake, mileage);
            Automobile a = new Automobile(aMake, aPrice, tire);
            System.out.println("Newly created automobile details: ");
            System.out.println(a.autoToString());
            Automobile.autoCount();
            return a;
        }

        //function that changes an Automobile object to update the values and make sure the count stays the same
        public Automobile changeAuto (){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter updated automobile make: ");
            String aMake = sc.nextLine();
            System.out.println("Enter updated automobile price as a positive number: ");
            double aPrice = sc.nextDouble();
            if (aPrice < 0 ) {
                while (aPrice < 0) {
                    System.out.println("Enter a positive number: ");
                    aPrice = sc.nextDouble();
                }
            }
            sc.nextLine();
            System.out.println("Enter updated tire make: ");
            String tMake = sc.nextLine();
            System.out.println("Enter updated tire price as a positive number: ");
            double tPrice = sc.nextDouble();
            if (tPrice < 0 ) {
                while (tPrice < 0) {
                    System.out.println("Enter a positive number: ");
                    tPrice = sc.nextDouble();
                }
            }
            sc.nextLine();
            System.out.println("Enter updated mileage as a number above 5000: ");
            int mileage = sc.nextInt();
            if (mileage <= 5000 ) {
                while (mileage < 5000) {
                    System.out.println("Enter a valid mileage: ");
                    mileage = sc.nextInt();
                }
            }
            sc.nextLine();
            tire = new Tire(tPrice, tMake, mileage);
            Automobile n = new Automobile(aMake, aPrice, tire);
            System.out.println("Updated automobile details: ");
            System.out.println(n.autoToString());
            Automobile.count--;
            Automobile.autoCount();
            return n;
        }

    }
