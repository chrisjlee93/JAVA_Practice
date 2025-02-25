package swf.army.mil;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralServiceTest {

    private RomanNumeralService service;

    @BeforeEach
    // Set up new object for class
    void setUp() {
        service = new RomanNumeralService();
    }

    @Test
    //Tests if method returns value
    void convertNumericIntoRomanNumeral5AndBelow() {
        assertEquals("I",service.toRoman(1));
        assertEquals("II",service.toRoman(2));
        assertEquals("III",service.toRoman(3));
        assertEquals("IV",service.toRoman(4));
        assertEquals("V",service.toRoman(5));

    }

    @Test
    void convertNumericIntoRomanNumeral5To10() {
        assertEquals("VI",service.toRoman(6));
        assertEquals("VII",service.toRoman(7));
        assertEquals("VIII",service.toRoman(8));
        assertEquals("IX",service.toRoman(9));
        assertEquals("X",service.toRoman(10));
    }

    @Test
    void convertIntoRomanNumeralAbove10To38() {
        assertEquals("XIX",service.toRoman(19));
        assertEquals("XXXIX",service.toRoman(39));
        assertEquals("XXVII",service.toRoman(27));
    }

    @Test
    void convertIntoRomanNumeralFrom40To89() {
        assertEquals("XLI",service.toRoman(41));
        assertEquals("LXIX",service.toRoman(69));
        assertEquals("LXXXV",service.toRoman(85));
    }

    @Test
    void convertIntoRomanNumeralFrom100To399() {
        assertEquals("CXCI",service.toRoman(191));
        assertEquals("CCCXCIX",service.toRoman(399));
    }

    @Test
    void convertIntoRomanNumeralFrom400To499() {
        assertEquals("CDXLI",service.toRoman(441));
        assertEquals("CDLXIX",service.toRoman(469));
        assertEquals("CDXCIX",service.toRoman(499));
    }

    @Test
    void convertIntoRomanNumeralFrom500To899() {
        assertEquals("DCCCXLI",service.toRoman(841));
        assertEquals("D",service.toRoman(500));
        assertEquals("DCLXIX",service.toRoman(669));
    }

    @Test
    void convertIntoRomanNumeralFrom900To999() {
        assertEquals("CM", service.toRoman(900));
        assertEquals("CMLXIX", service.toRoman(969));
    }

    @Test
    void convertIntoRomanNumeralFrom1000To3999() {
        assertEquals("MXLI",service.toRoman(1041));
        assertEquals("MMCCCLXIX",service.toRoman(2369));
        assertEquals("M",service.toRoman(1000));
        assertEquals("MMMCMXCIX",service.toRoman(3999));
    }


}