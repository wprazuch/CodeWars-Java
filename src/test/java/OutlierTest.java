import org.junit.Test;
import static org.junit.Assert.assertEquals;



public class OutlierTest{
    @Test
    public void testExample() {
        int[] exampleTest1 = {2,6,8,-10,3};
        int[] exampleTest2 = {206847684,1056521,7,17,1901,21104421,7,1,35521,1,7781};
        int[] exampleTest3 = {Integer.MAX_VALUE, 0, 1};
        assertEquals(3, FindOutlier.find(exampleTest1));
        assertEquals(206847684, FindOutlier.find(exampleTest2));
        assertEquals(0, FindOutlier.find(exampleTest3));

        assertEquals(6, FindOutlier.find(new int[]{1, 3, 5, 7, 6, 3, 9, 13}));
        assertEquals(131, FindOutlier.find(new int[]{32, 68, 92, 102, 131, 144}));
        assertEquals(-3, FindOutlier.find(new int[]{0, 2, 4, 6, -3}));
    }}
     