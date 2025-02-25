public class Equipment {
    private int hand;
    private int att;
    private int def;
//    private int accuracy;


    public int getHand() {
        return hand;
    }

    public void setHand(int hand) {
        this.hand = hand;
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

    public Equipment(int hand, int att, int def) {
        this.hand = hand;
        this.att = att;
        this.def = def;
    }


}
