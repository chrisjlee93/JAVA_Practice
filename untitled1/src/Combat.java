public class Combat {
    Charcter attacker;
    Charcter defender;

    public static int attack(Charcter a, Charcter d) {
        if (a.getAtt() > d.getDef() ) {
            return (a.getAtt() - d.getDef());
        } else {
            System.out.println("no effect");
            return 0;
        }
    }

    public static void defend()



}
