package swf.army.mil;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BowlingKataTest {

    private BowlingKata service;

    @BeforeEach
    void setUp() {
        service = new BowlingKata();
    }

    @Test
    void shouldDisplayNumberOfPinsStanding() {
        assertEquals(10,service.pinsUp());
    }

    @Test
    void shouldRollForHowManyPinsAreLeft() {
        assertEquals(5,service.roll(5));
        assertEquals(2,service.roll(3));
        assertEquals(0,service.roll(4));
    }
}