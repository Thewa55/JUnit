package TestCase4;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class Case4Test {
    @ParameterizedTest
    @ValueSource(ints = {1,2,3,5,6})
    public void case4Test1(int number){
        Case4 case4 = new Case4();
        assertTrue(case4.lessThenTen(number), "Number is less then 10");
    }
}
