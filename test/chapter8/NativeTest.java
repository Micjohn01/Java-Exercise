package chapter8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NativeTest {

    @Test
    void constructorSetTest(){
        Human human = new Human();
        human.setFirstName("Michael");
        human.setLastName("John");
        human.setPhoneNumber("08136522994");
        human.setEmailAddress("michaelolamilekanjohn@gmail.com");

        Native coolGuy = new Native(human);
        assertEquals("Michael",coolGuy.getFirstName());
        assertEquals("John",coolGuy.getLastName());
    }

}