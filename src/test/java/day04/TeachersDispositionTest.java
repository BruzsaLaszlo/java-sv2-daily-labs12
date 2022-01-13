package day04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeachersDispositionTest {

    @Test
    void getLessonsInHour() {

        TeachersDisposition teachersDisposition = new TeachersDisposition();

        assertEquals(3, teachersDisposition.getLessonsInHour("Albatrosz Aladin"));
        assertEquals(2, teachersDisposition.getLessonsInHour("Csincsilla Csilla"));

    }
}