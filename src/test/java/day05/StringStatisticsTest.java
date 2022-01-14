package day05;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringStatisticsTest {

    final String text = """
            Készíts egy StringStatistics nevű osztályt és benne,
            egy metódust aminek bementi paramétere egy szöveg és
            visszatérési értéke egy adatszerkezet, amiből kiolvasható,
            hogy melyik karakterből hány darab szerepel benne!
            """;

    @Test
    void getCharactersStatistics() {

        var characterStat = new StringStatistics()
                .getCharactersStatistics(text);

        printMap(characterStat);

        assertEquals(1, characterStat.get('ű'));
        assertEquals(2, characterStat.get('ő'));
        assertEquals(4, characterStat.get('\n'));

    }

    @Test
    void getCharactersStatisticsWithStream() {

        var characterStat = new StringStatistics()
                .getCharactersStatisticsWithStream(text);

        printMap(characterStat);

        assertEquals(1, characterStat.get('ű'));
        assertEquals(2, characterStat.get('ő'));
        assertEquals(4, characterStat.get('\n'));

    }

    void printMap(Map<Character,Integer> map) {
        map.entrySet().forEach(System.out::println);
    }

}