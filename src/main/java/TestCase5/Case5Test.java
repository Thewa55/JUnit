package TestCase5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Start of the JUnit test: ")
public class Case5Test {
    Case5 case5;

    @BeforeEach
    void init(){
        case5 = new Case5();
    }

    @Nested
    @DisplayName("Testing With Addition")
    class Addition{

        @Test
        @DisplayName("Should add positive numbers")
        void positive(){
            assertEquals(100, case5.add(50,50), "The result should be the sum of the numbers");
        }

        @Test
        @DisplayName("Should add negative numbers")
        void negative(){
            assertEquals(-5, case5.add(-3,-2), "The result should be the sum of two negative numbers");
        }
    }

    @Nested
    @DisplayName("Testing With Subtraction")
    class Subtraction{

        @Test
        @DisplayName("Should be able to subtract positive numbers")
        void positive(){
            assertEquals(5, case5.subtract(10,5), "The result should be the difference between two positive numbers");
        }

        @Test
        @DisplayName("Should be able to subtract negative numbers")
        void negative(){
            assertEquals(-5, case5.subtract(-7,-2), "Should return the difference when subtracting two negative numbers");
        }
    }

    @Nested
    @DisplayName("Testing With Multiplication")
    class Multiplication{

        @Test
        @DisplayName("Should be able to multiply two positive numbers")
        void positive(){
            assertEquals(100, case5.multiply(5,20), "Should return the product of two positive numbers");
        }

        @Test
        @DisplayName("Should be able to multiply two negative numbers")
        void negative(){
            assertEquals(100, case5.multiply(-5,-20), "Should return the product of two negative numbers");
        }
    }

    @Nested
    @DisplayName("Testing With Division")
    class Division{

        @Test
        @DisplayName("Should be able to get the quotient from two positive number")
        void positive(){
            assertEquals(10, case5.divide(100,10), "Should return the quotient of two positive numbers");
        }

        @Test
        @DisplayName("Should be able to get the quotient from two negative numbers")
        void negative(){
            assertEquals(-2.5, case5.divide(-5,2), "Should return the quotient of two negative numbers");
        }

        @Test
        @DisplayName("With 0 as the divisor")
        void divideByZero(){
            assertThrows(ArithmeticException.class, () -> case5.divide(5,0), "This should throw an exception");
        }
    }
}
