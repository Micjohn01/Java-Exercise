package TurtleTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static TurtleTest.Direction.*;
import static org.junit.jupiter.api.Assertions.*;

public class TurtleGraphicsTest {
    private Turtle ijapa;

    @BeforeEach
    void setUp() {
        ijapa = new Turtle();
    }

    @Test
    public void turtleExistTest() {
        Turtle ijapa = new Turtle();
        assertNotNull(ijapa);
    }

    @Test
    public void turtleCanMovePenUpTest() {
        Turtle ijapa = new Turtle();
        ijapa.penUp();
        assertTrue(ijapa.isPenUp());
//        assertEquals(true, ijapa.isPenUp());
    }

    @Test
    public void turtleCanMovePenDownTest() {
        Turtle ijapa = new Turtle();
        ijapa.penDown();
        assertFalse(ijapa.isPenUp());
    }

    @Test
    public void turtleCanTurnRightWhileFacingEastTest() {
        assertEquals(EAST, ijapa.getCurrentDirection()); //Given that I'm facing East
        ijapa.turnRight(); //When I turn right
        assertEquals(SOUTH, ijapa.getCurrentDirection()); //Then, I should face South(this is the assertion to check for)
    }

    @Test
    public void turtleCanTurnRightWhileFacingSouthTest() {
        ijapa.turnRight();
        assertEquals(SOUTH, ijapa.getCurrentDirection());

        ijapa.turnRight();
        assertEquals(WEST, ijapa.getCurrentDirection());
    }

    @Test
    public void turtleCanTurnRightWhileFacingWestTest() {
        ijapa.turnRight();
        assertEquals(SOUTH, ijapa.getCurrentDirection());

        ijapa.turnRight();
        assertEquals(WEST, ijapa.getCurrentDirection());

        ijapa.turnRight();
        assertEquals(NORTH, ijapa.getCurrentDirection());
    }

    @Test
    public void turtleCanTurnRightWhileFacingNorthTest() {
        ijapa.turnRight();
        assertEquals(SOUTH, ijapa.getCurrentDirection());

        ijapa.turnRight();
        assertEquals(WEST, ijapa.getCurrentDirection());

        ijapa.turnRight();
        assertEquals(NORTH, ijapa.getCurrentDirection());

        ijapa.turnRight();
        assertEquals(EAST, ijapa.getCurrentDirection());
    }

    @Test
    public void turtleCanTurnLeftWhileFacingEastTest() {
        ijapa.turnLeft();
        assertEquals(NORTH, ijapa.getCurrentDirection());

        ijapa.turnLeft();
        assertEquals(WEST, ijapa.getCurrentDirection());
    }

    @Test
    public void turtleCanTurnLeftWhileFacingNorthTest() {
        ijapa.turnLeft();
        assertEquals(NORTH, ijapa.getCurrentDirection());

        ijapa.turnLeft();
        assertEquals(WEST, ijapa.getCurrentDirection());

        ijapa.turnLeft();
        assertEquals(SOUTH, ijapa.getCurrentDirection());
    }

    @Test
    public void turtleCanTurnLeftWhileFacingWestTest() {
        ijapa.turnLeft();
        assertEquals(NORTH, ijapa.getCurrentDirection());

        ijapa.turnLeft();
        assertEquals(WEST, ijapa.getCurrentDirection());

        ijapa.turnLeft();
        assertEquals(SOUTH, ijapa.getCurrentDirection());
    }

    @Test
    public void turtleCanTurnLeftWhileFacingSouthTest() {
        ijapa.turnLeft();
        assertEquals(NORTH, ijapa.getCurrentDirection());

        ijapa.turnLeft();
        assertEquals(WEST, ijapa.getCurrentDirection());

        ijapa.turnLeft();
        assertEquals(SOUTH, ijapa.getCurrentDirection());

        ijapa.turnLeft();
        assertEquals(EAST, ijapa.getCurrentDirection());
    }

    @Test
    public void turtleCanMoveForwardWhileFacingEastTest(){
        assertEquals(new Position(0,0), ijapa.getCurrentDirection());
        ijapa.getCurrentDirection();

        assertEquals(new Position(0, 5), ijapa.getCurrentDirection());
        ijapa.getCurrentDirection();

    }

}
