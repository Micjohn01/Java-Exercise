package chapter4;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class CryptographerTest {
    @BeforeEach
    public  void setUp(){

    }

    @Test
    public void encrypt(){
        String encryptedCode = Cryptographer.encrypt(4132);
        assertEquals("0918", encryptedCode);
    }


}
