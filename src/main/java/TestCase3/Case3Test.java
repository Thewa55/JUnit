package TestCase3;


import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

//import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertAll;

public class Case3Test {

    @DisplayName("JUnit fun!")
    @RepeatedTest(value = 5, name = "{display name} -> {currentRepetition")
    @Test
    public void case3Test1(){
        Case3 test = new Case3();
        assertEquals(2, test.add(1,1), "Doesn't add two numbers");
        assertEquals(-1, test.add(1,-2), "Doesn't add negative numbers");
    }

    @Disabled
    @Test
    public void case3Test2(){
        Case3 test = new Case3();
        assertAll(
                () -> assertEquals(100, test.add(1,1), "Doesn't add two numbers"),
                () -> assertEquals(100, test.add(1,-2), "Doesn't add negative numbers"),
                () -> assertNotNull(test, "Calculator did not initialize")
        );
    }
}
