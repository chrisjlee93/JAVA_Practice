import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);   //This links the object to the user's keyboard

        System.out.println("Please enter your age");
        int age = obj.nextInt();
        obj.nextLine();

        System.out.println("Please enter your name"); //Reads user input
        String name = obj.nextLine();

        System.out.println("Please enter your salary");
        float salary = obj.nextFloat();
        obj.nextLine();

        System.out.println(name + " is making " + salary + " a year at " + age );
        System.out.print(name + " is making ");
        System.out.printf("%,.2f",salary);
        System.out.print(" a year at " + age);

    }
}
