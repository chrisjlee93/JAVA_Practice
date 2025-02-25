package swf.army.mil;

public class BowlingKata {
    private int pins = 10;


    public int pinsUp() {
        return pins;
    }

    public int roll(int i) {
        pins = pins - i;
        if (pins < 0)
            pins = 0 ;
        return pinsUp();
    }
}
