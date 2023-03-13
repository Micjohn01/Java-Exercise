package chapter10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    @Test
    public void polymorphismTest(){
        Animal aja = new Cat();
        aja.speak();
    }

}