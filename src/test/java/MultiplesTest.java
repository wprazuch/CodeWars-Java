import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MultiplesTest {

    @Test
    public void test()
    {
        assertEquals(23, Multiples.solution(10));
        assertEquals(33, Multiples.solution(11));
        assertEquals(45, Multiples.solution(13));
        assertEquals(60, Multiples.solution(16));

    }



}
