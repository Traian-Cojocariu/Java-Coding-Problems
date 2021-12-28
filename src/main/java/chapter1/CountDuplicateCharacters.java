package chapter1;

import java.util.HashMap;
import java.util.Map;

/*
 * Write a program that counts duplicate characters from a given string
 */
public class CountDuplicateCharacters {

    public static String countDuplicates(String str) {
        Map<String, Long> resultMap = new HashMap<>();
        String[] arrayOfCharacters = str.split("");

        for (String character : arrayOfCharacters) {
            resultMap.compute(character, (key, value) -> (value == null) ? 1 : ++value);
        }

        return resultMap.toString();
    }
}
