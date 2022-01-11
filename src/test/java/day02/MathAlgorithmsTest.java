package day02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MathAlgorithmsTest {

    @Test
    void lnko() {

        MathAlgorithms ma = new MathAlgorithms();

        assertThrows(IllegalArgumentException.class, () -> ma.getLNKO(0, 1));

        assertEquals(1, ma.getLNKO(1, 1));
        assertEquals(1, ma.getLNKO(-1, -1));

        assertEquals(1, ma.getLNKO(19, 7));
        assertEquals(1, ma.getLNKO(-19, -7));

        assertEquals(5, ma.getLNKO(15, 20));

        assertEquals(20, ma.getLNKO(100, 80));
        assertEquals(20, ma.getLNKO(-100, -80));

    }
}