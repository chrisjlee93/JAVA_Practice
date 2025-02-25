import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);

        int choice; // This determines the case in the switch statement
        double[] in = new double[4]; // Array with values for inpatient
        double[] out = new double[2]; // Array with values for outpatient


        // While loop that will repeat until a valid choice is made
        do {
            System.out.print("Hello!\nPlease enter 1 if you are an inpatient" + "\nPlease enter 2 if you are an outpatient" + "\nPlease enter 1 or 2: ");
            choice = obj.nextInt();
        } while (choice < 1 || choice > 2) ;

        // Branches code based on inpatient and outpatient
        switch (choice) {
            case 1:
                System.out.print("Please enter number of days stayed:");
                in[0] = obj.nextInt();
                verify(in);
                System.out.print("Please enter daily rate:");
                in[1] = obj.nextInt();
                verify(in);
                System.out.print("Please enter service costs:");
                in[2] = obj.nextInt();
                verify(in);
                System.out.print("Please enter medication costs:");
                in[3] = obj.nextInt();
                verify(in);
                System.out.print("Your total sum of charges is: " + total(in,4));
                // Uses overload function total with a 4 denoting array length
                break;
            case 2:
                System.out.print("Please enter service costs:");
                out[0] = obj.nextInt();
                verify(out);
                System.out.print("Please enter medication costs:");
                out[1] = obj.nextInt();
                verify(out);
                // Uses the regular total function
                System.out.print("Your total sum of charges is: " + total(out));
        }

    }

    public static void verify(double[] x) {
        Scanner obj = new Scanner(System.in);
        for (int i = 0; i < x.length ; i++ ) {
            if (x[i] < 0) {
                do {
                    System.out.print("Cannot have a negative value, please return new value: ");
                    x[i] = obj.nextInt();
                } while (x[i] < 0);
            }
        }
    }

    public static double total(double[] x) {
        double sum = 0;
        for (int i = 0 ; i < x.length ; i++) {
            sum = sum + x[i];
        }
        return sum;
    }

    public static double total(double[] x, int length ) {
        // Overloads the total function based on int length
        double sum = 0;
        if (x.length == length) {
            sum = x[0]*x[1] + x[2] + x[3];
        }
        return sum;
    }
}













