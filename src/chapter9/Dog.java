package chapter9;

public class Dog extends Animal{
    @Override
    public void speak() {
        System.out.println("Bark like a local dog");
    }
    public void fathersSpeak(){
        super.speak();
    }
}
