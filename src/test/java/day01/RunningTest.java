package day01;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class RunningTest {

    @Test
    void getSumOf() {

        Path path = Path.of("src/main/resources/running.csv");
        Running running = new Running(path);

        assertEquals(7.1, running.getSumOf(2021, 11 ));
        assertEquals(25.9,running.getSumOf(2022,1), 0.0001);

    }
}