package Gabriella.exerciseA3;

public class AnimalMain {
    public  static void main(String[] args) {
        // Using the subclasses
        Cat cat1 = new Cat();
        cat1.greeting();
        Dog dog1 = new Dog();
        dog1.greeting();
        BigDog bigDog1 = new BigDog();
        bigDog1.greeting();

        // Using Polymorphism
        System.out.println("********Animal animal1 = new Cat()-- *****the result:");
        Animal animal1 = new Cat();
        animal1.greeting();
        System.out.println("********Animal animal2 = new Dog()-- *****the result:");
        Animal animal2 = new Dog();
        animal2.greeting();

        System.out.println("********Animal animal3 = new BigDog()-- *****the result:");
        Animal animal3 = new BigDog();
        animal3.greeting();
        //Animal animal4 = new Animal();   Hier Error!!!!!

        // Downcast

        Dog dog2 = (Dog)animal2;

        BigDog bigDog2 = (BigDog)animal3;
        Dog dog3 = (Dog)animal3;
        //Cat cat2 = (Cat)animal2;    //animal2 is a dog!!!

        System.out.println("down cast  -Animal animal2 = new Dog()-**- Dog dog2 = (Dog)animal2*****");
        dog2.greeting(dog3);
        dog3.greeting(dog2);
        dog2.greeting(bigDog2);
        bigDog2.greeting(dog2);
        bigDog2.greeting(bigDog1);
    }





}





