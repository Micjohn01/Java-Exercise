package chapter9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {
    @Test
    public void speakTest(){
        Dog aja = new Dog();
        aja.speak();
    }

}