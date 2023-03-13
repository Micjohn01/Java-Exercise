package chapter7.ExceptionHandling;

public class BeansMessenger {
    public Beans buyBeans(int amount, int numberOfSpoons, boolean moneyIsFake, boolean withOmiEwa){
//        verify(moneyIsFake);
        verifyValidPrice(amount, numberOfSpoons);
        return buyBeans(numberOfSpoons, withOmiEwa);
    }
    private Beans buyBeans(int numberOfSpoons, boolean withOmiEwa){
        return new Beans(numberOfSpoons, withOmiEwa);
    }

    private void verifyValidPrice(int amount, int numberOfSpoons){
        int price = 50;
        if (numberOfSpoons * price > amount) throw new IllegalArgumentException();
    }
}
