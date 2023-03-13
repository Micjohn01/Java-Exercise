package chapter10;

public class Dog extends Animal implements Movable{
    public void speak(){
        System.out.println("Bark");
    }

    public void eat(){
        System.out.println("eat bone");
    }

    @Override
    public void move() {
        System.out.println("dog walk");
    }
}
