import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;
import java.io.*;
public class FileTests {

    @Test
    public void testDirectory() throws IOException {
        assertEquals(new ArrayList<>(Arrays.asList(new File("some-files/a.txt"), 
                                                   new File("some-files/even-more-files/a.txt"), new File("some-files/even-more-files/d.java"), 
                                                   new File("some-files/more-files/b.txt"), new File("some-files/more-files/c.java"))), 
                     FileExample.getFiles(new File("some-files")));
    }
    

    @Test
    public void testFile() throws IOException {
        assertEquals(new ArrayList<>(Arrays.asList(new File("some-files/a.txt"))),
                     FileExample.getFiles(new File("some-files/a.txt")));
    }
}
