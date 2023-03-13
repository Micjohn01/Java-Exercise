package TurtleTest;

import static TurtleTest.Direction.*;

public class Turtle {
    private Pen pen;
//    private Pen pen = new Pen();
    private  Direction currentDirection;

    private Position position;

    //    private Pen pen;
//
    public Turtle(){
        pen = new Pen();
        currentDirection = EAST;
        position = new Position(0, 0);
    }
    public void penUp() {
        pen.penUp();
    }


    public boolean isPenUp() {
        return pen.isPenUp();
    }

    public void penDown() {
        pen.penDown();
    }

    public Direction getCurrentDirection() {
        return currentDirection;
    }

    public void turnRight() {
//        if (currentDirection == EAST) currentDirection = SOUTH;
//        if (currentDirection == SOUTH ) currentDirection = WEST;
        switch (currentDirection){
            case EAST -> face(SOUTH);
            case SOUTH -> face(WEST);
            case WEST -> face(NORTH);
            case NORTH -> face(EAST);
        }
    }

    private void face(Direction direction){
        currentDirection = direction;
    }

    public void turnLeft() {
        switch (currentDirection){
            case EAST -> face(NORTH);
            case NORTH -> face(WEST);
            case WEST -> face(SOUTH);
            case SOUTH -> face(EAST);
        }
    }

    public void move(int numberOfSteps) {
        switch (currentDirection){
            case EAST -> position.setColumn(position.getColumn()+numberOfSteps);
            case SOUTH -> position.setRow(position.getRow()+numberOfSteps);
//            case WEST -> position.setRow(position.getRow()+numberOfSteps);
//            case NORTH -> position.setRow(position.getRow()+numberOfSteps);
        }
    }

}
