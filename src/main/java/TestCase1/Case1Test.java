package TestCase1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Case1Test {
    @Test
    public void testConcatenate(){
        Case1 case1 = new Case1();

        String result =case1.concatenate("one","two");

        assertEquals("onetwo", result);
    }
}
