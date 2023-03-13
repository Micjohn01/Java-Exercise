package chapter7.turtle;

import chapter7.turtle.enums.PenPosition;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TurtleTest {
    private Turtle ijapa;

    @BeforeEach
    public void setUp(){
        ijapa = new Turtle();
        Pen biro = new Pen();
        ijapa.setPen(biro);
    }

//    @Test
//    public void changePenPosition(){
//        assertEquals(PenPosition.UP, ijapa.getPen().getPosition());
//        ijapa.changePenPosition(PenPosition.DOWN);
//
//    }
}
