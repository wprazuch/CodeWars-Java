import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class SquareDigit {

    public static int squareDigits(int n){

        IntStream digits = String.valueOf(n).chars().map(c -> Character.getNumericValue(c)).map(digit -> digit*digit);

        String number = digits.mapToObj(digit -> ((Integer) digit).toString()).collect(Collectors.joining(""));

        return Integer.parseInt(number);


    }

}
