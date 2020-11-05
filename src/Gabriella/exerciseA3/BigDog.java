package Gabriella.exerciseA3;

public class BigDog extends Dog {
    @Override
    public  void greeting() {
        System.out.println("bigdog Woow!");
    }

    @Override
    public  void greeting(Dog another) {
        System.out.println("bigdogWoooooowwwww!");
    }
}
