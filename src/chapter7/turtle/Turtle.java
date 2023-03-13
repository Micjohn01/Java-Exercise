package chapter7.turtle;

import chapter7.turtle.enums.Cardinal;
import chapter7.turtle.enums.PenPosition;

public class Turtle {
    private  int xCoordination;
    private  int yCoordination;
    private Cardinal direction = Cardinal.EAST;
    private Pen pen;

    public Turtle(){}
    public Turtle(int x, int y){
        xCoordination = x;
        yCoordination = y;
    }
    public Turtle(int x, int y, Cardinal direction){
        this(x, y);
        this.direction = direction;
    }

    public void changePenPosition(PenPosition position){

    }

    public int getxCoordination() {
        return xCoordination;
    }

    public void setxCoordination(int xCoordination) {
        this.xCoordination = xCoordination;
    }

    public int getyCoordination() {
        return yCoordination;
    }

    public void setyCoordination(int yCoordination) {
        this.yCoordination = yCoordination;
    }

    public Cardinal getDirection() {
        return direction;
    }

    public void setDirection(Cardinal direction) {
        this.direction = direction;
    }

    public Pen getPen() {
        return pen;
    }

    public void setPen(Pen pen) {
        this.pen = pen;
    }
}
