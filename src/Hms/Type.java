package Hms;

public enum Type {
    EXECUTIVE(15000),
    STANDARD(10000),
    CHEAP(5000);

    private final int price;

    Type(int price){
        this.price = price;
    }
}
