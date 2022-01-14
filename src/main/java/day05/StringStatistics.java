package day05;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class StringStatistics {

    public Map<Character, Integer> getCharactersStatistics(String text) {
        var result = new TreeMap<Character, Integer>();
        for (Character c : text.toCharArray()) {
            if (result.containsKey(c)) {
                result.put(c, result.get(c) + 1);
            } else {
                result.put(c, 1);
            }
        }
        return result;
    }

    public Map<Character, Integer> getCharactersStatisticsWithStream(String text) {
        return text.chars().collect(
                HashMap::new,
                (map, value) -> {
                    char c = (char) value;
                    if (map.containsKey(c))
                        map.put(c, map.get(c) + 1);
                    else map.put(c, 1);
                },
                HashMap::putAll
        );
    }

}
