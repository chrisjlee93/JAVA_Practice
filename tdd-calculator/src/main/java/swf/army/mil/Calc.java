package swf.army.mil;

import java.util.*;


public class Calc {
    public int c = 0;
    public ArrayList<String> log = new ArrayList<String>(c);


    public int addition(int i, int i1) {
        int x = i + i1;
        log.add(c, "[" + i + "+" + i1 + "=" + x + "]");
        c++;
        return x;
    }

    public int subtraction(int i, int i1) {
        int x = i - i1;
        log.add(c, "[" + i + "-" + i1 + "=" + x + "]");
        c++;
        return x;

    }

    public int multiplication(int i, int i1) {
        int x = i * i1;
        log.add(c, "[" + i + "*" + i1 + "=" + x + "]");
        c++;
        return x;
    }

    public int division(int i, int i1) {
        int x = i/i1;
        log.add(c, "[" + i + "/" + i1 + "=" + x + "]");
        c++;
        return x;
    }

    public String record(int i) {
        return log.get(i);

    }

    public ArrayList<String> logs() {
        System.out.println(log);
        return log;
    }
}
