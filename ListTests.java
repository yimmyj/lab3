import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;

public class ListTests {
	@Test 
	public void filterTest() {
        List<String> lst = new ArrayList<String>();
        lst.add("hi");
        lst.add("hillo");
        lst.add("rachel");
        lst.add("himmy");

        List<String> testLst = new ArrayList<String>();
        testLst.add("hi");
        testLst.add("hillo");
        testLst.add("himmy");
        
        StringChecker sc = new bruh();

        assertEquals(testLst, ListExamples.filter(lst, sc));
        
    
	}

    @Test
    public void mergeTest() {
        List<String> lst = new ArrayList<String>();
        lst.add("a");
        lst.add("c");
        lst.add("e");
        
        List<String> lst2 = new ArrayList<String>();
        lst2.add("b");
        lst2.add("d");
        lst2.add("f");

        List<String> expected = new ArrayList<String>();
        expected.add("a");
        expected.add("b");
        expected.add("c");
        expected.add("d");
        expected.add("e");
        expected.add("f");

        assertEquals(expected, ListExamples.merge(lst, lst2));
        
    
	}


}