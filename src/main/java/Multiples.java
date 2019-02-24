import java.util.stream.IntStream;

public class Multiples {


    public static int solution(int number) {
        return IntStream.range(0, number).filter(x -> x % 3 == 0 || x % 5 == 0).sum();
    }


}
