package tddChapter2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practise.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ArithTest {
    Arith arith;

    @BeforeEach
    void startAllTestWith() {
        arith = new Arith();
    }

    @Test
    void doesObjectExist() {
        Arith arith = new Arith();
        assertNotNull(arith);
    }

    @Test
    void testToEnterFirstInteger() {
        assertEquals(4, arith.inputNum1(2));
    }

    @Test
    void testToEnterSecondInteger() {
        assertEquals(9, arith.inputNum2(3));
    }

    @Test
    void testForSquaresOfNumber() {
        assertEquals(50, arith.sumOfSquares(5, 5));
    }

    @Test
    void testSquareDifferencesOfNumber() {
        assertEquals(20, arith.differenceOfSquares(6, 4));
    }


}
