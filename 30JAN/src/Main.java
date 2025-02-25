import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args)
    {
        int x = 3 ;
        func1(x);
        System.out.println("World");

    }

    public static void func1(int a){
        System.out.println(a);
        func2();
    }

    public static void func2(){
        System.out.println("I am in func2");
    }
}