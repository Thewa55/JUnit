package TestCase6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

public class Case6Test {

    Case6 case6;
    boolean bool;

    @BeforeEach
    void init(){
        System.out.println("Before each");
        bool = false;
        case6 = new Case6();
    }

    @Test
    void additionTest1(){
        assumeTrue(bool, "Assumption isn't true -> Test aborted");
        System.out.println("Inside Test1");
        assertAll(
                () -> assertEquals(2, case6.add(1,1), "Doesn't add positive numbers up properly"),
                () -> assertEquals(-2, case6.add(1,1), "Doesn't add negative numbers up properly")
        );
    }

    @Test
    void additionTest2(){
        assumeFalse(bool, "Assumption isn't true -> Test aborted");
        System.out.println("Inside Test1");
        assertAll(
                () -> assertEquals(2, case6.add(1,1), "Doesn't add positive numbers up properly"),
                () -> assertNotEquals(-3, case6.add(-1,-1), "Doesn't add negative numbers up properly")
        );
    }
}
