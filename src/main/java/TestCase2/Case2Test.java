package TestCase2;
import org.junit.Test;
import static org.junit.Assert.*;

public class Case2Test {
    @Test
    public void testFindMax1(){
        assertEquals(4, Case2.findMax1(new int[]{1,3,4,2}));
        assertEquals(-1,Case2.findMax1(new int[]{-12,-1,-3,-4,-2}));
    }

    @Test
    public void testFindMax2(){
        assertEquals(4, Case2.findMax2(new int[]{1,3,4,2}));
        assertEquals(-1,Case2.findMax2(new int[]{-12,-1,-3,-4,-2}));
    }
}
