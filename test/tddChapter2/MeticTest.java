package tddChapter2;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

    public class MeticTest {

        Metic metic;

        @BeforeEach
        void setThisForAllTest(){
            metic = new Metic();
        }

        @Test
        void sum(){
            metic.sumOfThreeNumbers(5,4,2);
            assertEquals(11,metic.sumOfThreeNumbers(5,4,2));
        }

        @Test
        void average(){
            metic.averageOfThreeNumbers(4,2,6);
            assertEquals(4,metic.averageOfThreeNumbers(4,2,6));

        }

        @Test
        void product(){
            metic.productOfThreeNumbers(3,3,2);
            assertEquals(18, metic.productOfThreeNumbers(3,3,2));
        }

        @Test
        void smallest(){
            metic.smallestOfThreeNumbers(1,5,6);
            assertEquals(1, metic.smallestOfThreeNumbers(1,5,6));
        }

        @Test
        void largest(){
            metic.largestOfThreeNumbers(7,8,9);
            assertEquals(9, metic.largestOfThreeNumbers(7,8,9));
        }

        @Test
        void square(){
            metic.squareOfANumber(2);
            assertEquals(4, metic.squareOfANumber(2));
        }

        @Test
        void sumOfSquares(){
            metic.sumOfSquaresOfNumber(2,2);
            assertEquals(8, metic.sumOfSquaresOfNumber(2,2));
        }

        @Test
        void differencesOfASquareOfNumbers(){
            metic.differencesOfASquareOfNumber(3,3);
            assertEquals(0, metic.differencesOfASquareOfNumber(3,3));

        }

    }

