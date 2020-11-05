package Gabriella.exerciseA3;

public class  Dog extends Animal {
    @Override
    public void greeting () {
        System.out.println("dogWoof!");
    }

    public  void greeting(Dog another) {
        System.out.println("dog anotherWOOOOOOF!");
    }
}