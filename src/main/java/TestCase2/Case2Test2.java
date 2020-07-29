package TestCase2;
import org.junit.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.*;


public class Case2Test2 {
    @AfterAll
    public static void setupAfterClass() throws Exception{
        System.out.println("After All");
    }

    @AfterEach
    public void setupAfterTest() throws Exception{
        System.out.println("After Each");
    }

    @BeforeEach
    public void setUpBeforeTest() throws Exception{
        System.out.println("Before Each");
    }

    @BeforeAll
    public static void setUpBeforeClass() throws Exception{
        System.out.println("Before All");
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
