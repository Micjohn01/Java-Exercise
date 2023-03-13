package tddChapter2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ComparingIntegersTest {
    Comparing number;
    @BeforeEach
    void setThisForAllTest() {
        number = new Comparing();
    }

    @Test
    void testThatObjectExist() {
        assertNotNull(number);
    }

    @Test
    void numberEntered() {
        assertEquals(6, number.numberInput(6));
    }

    @Test
    void numberLessThan100() {
        assertEquals("Number less than 100", number.Numberless(60));
    }
    @Test
    void numberGreaterThan100() {
        assertEquals("Number Greater than 100", number.NumberGreat(110));
    }
    @Test
    void numberEqualTo100() {
        assertEquals("Number is equal to 100", number.NumberEqual(100));
    }

    @Test
    void numberNotEqualTo100() {
        assertEquals("Number is not equal to 100", number.NumberNotEqual(150));
    }

    @Test
    void squareOfNumber() {
        assertEquals(16,number.numberSquare(4));
    }

    @Test
    void squareOfNumberGreaterThan100() {
        assertEquals("Number squared is greater than 100",number.numberSquareGreater(25));
    }

    @Test
    void squareOfNumberEqualTo100() {
        assertEquals("Number squared equal to 100",number.numberSquareEqual(10));
    }


    @Test
    void squareOfNumberNotEqualTo100() {
        assertEquals("Number squared not equal to 100",number.numberSquareNotEqual(4));
    }

    @Test
    void squareOfNumberLessThan100() {
        assertEquals("Number squared is less than 100",number.numberSquareLess(4));
    }

}
