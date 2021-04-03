package HackerRank;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WordCount {
    public static void main(String[] args) {

        System.out.println(wordCount("Laba diena"));
        System.out.println(wordCount("asd asd asd asd"));
        System.out.println(numberOfTrueInArray());
        System.out.println(checkEnding("abc", "bc"));
        reverseName("Ignotas Tunaitis");

        int[] array = {5, 3, 15, 22, 4};
        System.out.println(existsHigherNumber(array, 10));

    }

    public static int wordCount(String word) {

        int count = 1;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }

    public static int numberOfTrueInArray() {

        boolean[] trueFalse = new boolean[]{true, true, false, true, false};

        int count = 0;
        for (boolean b : trueFalse) {
            if (b == true) {
                count++;
            }
        }
        return count;
    }

    public static boolean checkEnding(String word, String ending) {
        
        if (word.endsWith(ending)) {
            return true;
        } else {
            return false;
        }
    }

    public static void reverseName(String name) {
        String[] split = name.split(" ");
        System.out.println(split[1] + " " + split[0]);
    }

    public static boolean existsHigherNumber(int[] array, int higherNum) {
        return Arrays.stream(array).anyMatch(value -> value >= higherNum);
    }

    public List<String> search(List<String> list) {
        return list.stream().filter(s -> s.startsWith("a", 3)).collect(Collectors.toList());
    }
}

