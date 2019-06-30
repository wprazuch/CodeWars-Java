//https://www.codewars.com/kata/get-the-middle-character/train/java
//https://www.codewars.com/kata/shortest-word/train/java

import java.util.stream.Stream;

class Kata {
    public static String getMiddle(String word) {
        int length = word.length();
        return length % 2 == 0 ? word.substring(length/2-1, length/2+1) : String.valueOf(word.charAt(length/2));
    }

    public static int findShort(String s) {
        return Stream.of(s.split(" "))
                .mapToInt(word -> word.length())
                .min()
                .getAsInt();
    }

}
