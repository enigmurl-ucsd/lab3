import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
    @Test 
    public void testReverseInPlace() {
        int[] input1 = { 3 };
        ArrayExamples.reverseInPlace(input1);
        assertArrayEquals(new int[]{3}, input1);
    }

    @Test
    public void testReversed() {
        int[] input1 = {};
        assertArrayEquals(new int[]{}, ArrayExamples.reversed(input1));
    }
    
    @Test
    public void testEvenInPlace() {
        int[] input1 = {1,2};
        ArrayExamples.reverseInPlace(input1);
        assertArrayEquals(new int[]{2, 1}, input1); 
    }
    
    @Test
    public void testCopyReverse() {
        int[] input1 = {1,2};
        assertArrayEquals(new int[]{2, 1}, ArrayExamples.reversed(input1)); 
    }

    @Test
    public void testLowestMultiple() {
        double[] input1 = {2,1,3,1};
        assertEquals(2.0, ArrayExamples.averageWithoutLowest(input1));
    }
}
