import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Player {
    private Charcter p;
    private int difficulty;
    private int money;
    private int stam;


    public Charcter getP() {
        return p;
    }

    public void setP(Charcter p) {
        this.p = p;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getStam() {
        return stam;
    }

    public void setStam(int stam) {
        this.stam = stam;
    }

    public Player(Charcter p, int money) {
        this.p = p;
        this.money = money;
        this.stam = 3;
    }

    public static void createCharacter() {
        Scanner obj = new Scanner(System.in);
        int nChoice = 0;

        do {
            System.out.println("Please enter the name of your character!");
            String name = obj.nextLine();
            System.out.println("is " + name + "correct?");
            System.out.print("1 for yes, 2 for no");
            nChoice = obj.nextInt();
        } while (nChoice == 2);

        System.out.println("Select a difficulty \n1 - Easy \n2 - Normal \n3 - Hard");

    }
}
