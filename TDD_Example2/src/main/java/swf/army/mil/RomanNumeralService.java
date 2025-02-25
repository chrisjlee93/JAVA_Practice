package swf.army.mil;

import java.util.ArrayList;
import java.util.Scanner;

public class RomanNumeralService {

    ArrayList<String> num = new ArrayList<String>();
    String[] through10 = {"I","II","III","IV","V","VI","VII","VIII","IX","X"};
    int holder ;

    public String toRoman(int x) {
        if (x > 0) {
            while (x >= 1000 ) {
                num.add("M");
                x = x - 1000;
            }
            while (x >= 900 ) {
                num.add("CM");
                x = x - 900;
            }
            while (x >= 500 ) {
                num.add("D");
                x = x - 500;
            }
            while (x >= 400 ) {
                num.add("CD");
                x = x - 400;
            }
            while (x >= 100 ) {
                num.add("C");
                x = x - 100;
            }
            while (x >= 90) {
                num.add("XC");
                x = x - 90;
            }
            while (x >= 50) {
                num.add("L");
                x = x -50;
            }
            while (x >= 40) {
                num.add("XL");
                x = x - 40;
            }
            while (x > 10) {
                for (int i = x / 10; i > 0; i--) {
                    num.add("X");
                }
                num.add(through10[(x % 10 - 1)]);
                String toR = String.join("", num);
                num.clear();
                return toR;
            }
            if (x <= 10 && x > 0) {
                num.add(through10[x - 1]);
                String toR = String.join("", num);
                num.clear();
                return toR;
            } else {
                String toR = String.join("", num);
                num.clear();
                return toR;
            }
        }
        return "";
    }
}

