package chapter7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PlayerTest {
    private Player player;

    @BeforeEach
    public void setUp(){
        player = new Player();
    }

    @Test
    public void testThatPlayerCanBeCreated(){
        assertNotNull(player);
    }
}
