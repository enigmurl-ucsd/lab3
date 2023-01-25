import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

class StringExample implements StringChecker {
    public boolean checkString(String s) {
        return s.startsWith("Good");
    }
}

public class ListTests {

    @Test
    public void testFilter() {
        ArrayList<String> x = new ArrayList<>();
        x.add("Good1");
        x.add("Good2");
        assertEquals(x, ListExamples.filter(x, new StringExample()));
    }

    @Test(timeout = 10000)
    public void testMerge() {
        ArrayList<String> x = new ArrayList<>();
        ArrayList<String> y = new ArrayList<>();
        y.add("Good1");
        assertEquals(y, ListExamples.merge(x,y));
    }
}
