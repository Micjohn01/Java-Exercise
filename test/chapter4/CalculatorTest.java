package chapter4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @BeforeEach
    public  void setUp(){

    }

    @Test
    public void getFactorial(){
        long factorial = Calculator.factorial(5);
        assertEquals(120L, factorial);
        factorial = Calculator.factorial(13);
        assertEquals(6227020800L, factorial);

    }
}
