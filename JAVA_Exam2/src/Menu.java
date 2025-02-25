import java.util.Scanner;


public class Menu {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int menu = -1;
        //menu will keep running until user input is 3
        while (menu != 3) {
            System.out.println("Please choose an option\n" +
                    "1 - Calculate Average\n" +
                    "2 - Calculate Minimum\n" +
                    "3 - EXIT");
            System.out.print("Enter your option here : ");
            menu = obj.nextInt();
            obj.nextLine();

            switch (menu) {
                case 1:
                    int totalnum; //total number of numbers to average
                    System.out.print("Please enter a positive amount of numbers to average: ");
                    int a = obj.nextInt();
                    while (a < 0){
                        //input validation for positive number
                        System.out.print("Please enter a valid number: ");
                        a = obj.nextInt();
                    }
                    calcAverage(a);
                    break;
                case 2:
                    int min = calcMinimum();
                    if (min != -99) //only prints out a valid return statement
                        System.out.println("The minimum number is: " + min + "\n");

            }
        }
    }

    public static void calcAverage(int total) {
        Scanner obj = new Scanner(System.in);
        int count = 0;
        double sum = 0;

        //while loop to calculate average from user input
        while (count < total) {
            System.out.print("Please enter number: ");
            double num = obj.nextDouble();
            sum = sum + num;
            count++;
        }
        System.out.print("The average is: ");
        System.out.println(sum / count);
        System.out.println();
    }

    //calculate minimum list based on user input
    public static int calcMinimum() {
        Scanner obj = new Scanner(System.in);
        int valid = 0; //check if the user entered any valid number

        System.out.print("Please enter your first number, -99 will exit: ");
        int num = obj.nextInt(); //initialize num with first user input

        while (num != -99){
            System.out.print("Please enter a number, -99 will exit: ");
            int check = obj.nextInt();
            if ( check == -99){
                return num;
            } else if (check < num) {
                num = check;
            }
            valid = 1 ; //validate inputs are good
        }

        //displays message if -99 given as first input
        if (valid == 0) {
            System.out.println("No valid numbers given");
        }
        return num;
    }

}