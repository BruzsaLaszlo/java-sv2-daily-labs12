package day04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeachersDispositionTest {

    @Test
    void getLessonsInHour() {

        TeachersDisposition teachersDisposition = new TeachersDisposition();

        assertEquals(25, teachersDisposition.getLessonsInHour("Antilop Anett"));

    }
}