import org.junit.*;
import static org.junit.Assert.*;
import java.util.NoSuchElementException;

public class LinkedListTests {

    @Test
    public void testEmpty() {
        LinkedList a = new LinkedList();
        assertThrows(NoSuchElementException.class, () -> a.first());    
    }

    @Test(timeout = 10000)
    public void testBigAppend() {
        LinkedList a = new LinkedList();
        a.append(0);
        a.append(1);
        a.append(2);
        a.append(3);
        assertEquals("0 1 2 3 ", a.toString()); 
    }
}
