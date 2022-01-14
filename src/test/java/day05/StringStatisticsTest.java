package day05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringStatisticsTest {

    String text = """
            Készíts egy StringStatistics nevű osztályt és benne,
            egy metódust aminek bementi paramétere egy szöveg és
            visszatérési értéke egy adatszerkezet, amiből kiolvasható,
            hogy melyik karakterből hány darab szerepel benne!
            """;

    StringStatistics stat = new StringStatistics();

    @Test
    void getCharactersStatistics() {

        assertEquals(1, stat.getCharactersStatistics(text).get('ű'));
        assertEquals(2, stat.getCharactersStatistics(text).get('ő'));
        assertEquals(4, stat.getCharactersStatistics(text).get('\n'));

    }

    @Test
    void getCharactersStatisticsWithStream() {

        assertEquals(1, stat.getCharactersStatisticsWithStream(text).get('ű'));
        assertEquals(2, stat.getCharactersStatisticsWithStream(text).get('ő'));
        assertEquals(4, stat.getCharactersStatisticsWithStream(text).get('\n'));

    }
}