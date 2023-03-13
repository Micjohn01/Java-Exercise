import org.junit.jupiter.api.Test;
import practise.ArrayOfNumbers;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayOfNumbersTest {

    @Test
    public void sumArray() {
        //ArrayOfNumbers.sumOfArray(new int[]{2,10,4});
        assertEquals(16,ArrayOfNumbers.sumOfArray(new int[]{2,10,4}));
    }
    @Test
    public void minimumArray(){
        ArrayOfNumbers.minimumArray(new int[]{6,15,33,});
        assertEquals(6, ArrayOfNumbers.minimumArray(new int[]{6,15,33,}));
    }
    @Test
    public void maximumArray(){
        ArrayOfNumbers.maximumArray(new int[]{3,6,8,9});
        assertEquals(9, ArrayOfNumbers.maximumArray(new int[]{3,6,8,9}));
    }
    
}
