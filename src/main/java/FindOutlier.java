import java.util.Arrays;

////

public class FindOutlier{
    static int find(int[] integers){

        int outlier;

        if(integers[0] % 2 == 0 &&integers[1] % 2 == 0)
            outlier = searchOdd(integers);
        else if(integers[0] % 2 == 1 &&integers[1] % 2 == 1)
            outlier = searchEven(integers);
        else if(integers[2] % 2 == 0)
            outlier = searchOdd(integers);
        else
            outlier = searchEven(integers);

        return outlier;

    }

    private static int searchEven(int[] integers) {
        return Arrays.stream(integers).filter(x -> x % 2 == 0).findAny().orElse(0);

    }

    private static int searchOdd(int[] integers) {
        return Arrays.stream(integers).filter(x -> x % 2 == 1 || x % 2 == -1).findAny().orElse(0);

    }

}