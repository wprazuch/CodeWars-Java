//https://www.codewars.com/kata/two-to-one/train/java

import java.util.stream.Collectors;

public class TwoToOne {

    public static String longest (String s1, String s2) {
        String whole = s1 + s2;

        return whole.chars()
                .mapToObj(x -> (char) x).distinct()
                .sorted()
                .map(x -> String.valueOf(x))
                .collect(Collectors.joining());
    }
}