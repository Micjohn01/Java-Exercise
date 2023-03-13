import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practise.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CalculatorTest {
    Calculator calculator;
    @BeforeEach
    void startAllTestWith(){
        calculator = new Calculator();
    }
    @Test
    void seyObjectDeyExist(){
        assertNotNull(calculator);
    }

    @Test
    void eFitAddNumbers(){
        Calculator calculator = new Calculator();
        calculator.addTwoNumbers(5,8);
        assertEquals(13, calculator.addTwoNumbers(5,8));
    }

    @Test
    void subtractNumbers(){
        calculator.subtractTwoNumbers(9,2);
        assertEquals(7, calculator.subtractTwoNumbers(9,2));
    }
}