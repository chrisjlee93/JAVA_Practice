public class Charcter {
    private final String name;
    private int health;
    private int mana;
    private int att;
    private int def;
    private final String faction;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getAtt() {
        return att;
    }

    public void setAtt(int att) {
        this.att = att;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public Charcter(String name, int health, int mana, int att, int def, String faction) {
        this.name = name;
        this.health = health;
        this.mana = mana;
        this.att = att;
        this.def = def;
        this.faction = faction;
    }

    public Charcter() {
        this.name = "";
        this.health = 0;
        this.mana = 0;
        this.att = 0;
        this.def = 0;
        this.faction = "NPC";
    }

    public static void status(Charcter c) {
        System.out.println("Current Status for " + c.name + ":");
        System.out.println("HP: " + c.getHealth());
        System.out.println("MP: " + c.getMana());
        System.out.println("Attack: " + c.getAtt());
        System.out.println("Def: " + c.getDef() + "\n");
    }

}
