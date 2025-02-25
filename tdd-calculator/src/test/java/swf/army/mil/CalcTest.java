package swf.army.mil;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcTest {
    private Calc c;

    @BeforeEach
    void setUp() {
        c = new Calc();

    }

    @Test
    void shouldAddTwoIntegers() {
        int actual = c.addition(2,2);
        assertEquals(4, actual);
    }

    @Test
    void shouldSubtractTwoIntegers() {
        int actual = c.subtraction(4,-1);
        assertEquals(5, actual);
    }

    @Test
    void shouldMultiplyTwoIntegers() {
        int actual = c.multiplication(3,5);
        assertEquals(15, actual);
    }

    @Test
    void shouldDivideTwoIntegers() {
        int actual = c.division(6,2);
        assertEquals(3, actual);
    }

    @Test
    void shouldReturnLogOfRecords() {
        c.addition(3,4);
        c.multiplication(3,2);
        c.division(6,2);
        c.subtraction(3,7);
        String actual = c.record(3);
        assertEquals("[3-7=-4]\n",actual);

    }

    @Test
    void shouldDisplayWholeLog() {
        c.addition(4,5);
        c.subtraction(5,2);
        c.addition(3,2);
        String actual = String.join(", ", c.logs());
        assertEquals("[4+5=9], [5-2=3], [3+2=5]",actual);
    }
}
