import java.util.stream.Collectors;

public class Isogram {

    public static boolean  isIsogram(String str) {

        return str.toLowerCase().chars().mapToObj(c -> (char) c).distinct().collect(Collectors.toList()).size() == str.toLowerCase().chars().mapToObj(c -> (char) c).collect(Collectors.toList()).size();

    }

}
