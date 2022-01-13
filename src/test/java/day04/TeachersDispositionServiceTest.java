package day04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeachersDispositionServiceTest {

    @Test
    void getLessonsInHour() {

        TeachersDispositionService teachersDispositionService = new TeachersDispositionService();

        assertEquals(25, teachersDispositionService.getLessonsInHour("Antilop Anett"));

    }
}