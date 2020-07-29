package TestCase2;
import org.junit.*;

import org.junit.jupiter.api.Test;

//import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;


public class Case2Test {
    @AfterClass
    public static void setupAfterClass() throws Exception{
        System.out.println("After Class");
    }

    @After
    public void setupAfterTest() throws Exception{
        System.out.println("After Test");
    }

    @BeforeClass
    public static void setUpBeforeClass() throws Exception{
        System.out.println("Before Class");
    }

    @Before
    public void setUpBeforeTest() throws Exception{
        System.out.println("Before Test");
    }

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
