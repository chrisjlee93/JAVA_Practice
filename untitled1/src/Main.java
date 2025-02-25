import java.util.ArrayList;
import java.util.Random;

public class Main {


    Random rand;


    public static void main(String[] args) {
        Charcter c1 = new Charcter("J", 10, 3, 5, 2, "Player");
        Charcter c2 = new Charcter("enemy", 10, 3, 3, 1, "NPC");

        System.out.println("Hello");
        Charcter.status(c1);
        Charcter.status(c2);
        int dmg = Combat.attack(c1, c2);
        c2.setHealth(c2.getHealth() - dmg);
        Charcter.status(c2);




    }


    public ArrayList<String> generateCities() {
        ArrayList<String> cities = new ArrayList<String>();
        cities.add("city1");
        cities.add("city2");
        cities.add("city3");
        return cities;
    }





}










