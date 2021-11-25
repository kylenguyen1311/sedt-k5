package lesson6;

import java.security.SecureRandom;

public class Animal{
        static Dog dog = new Dog();
        static Tiger tiger = new Tiger();
        static Horse horse = new Horse();
    protected static int DOG_SPEED(){
        int speed = new SecureRandom().nextInt(dog.MAX_SPEED());
        return speed;
    }
    protected static int TIGER_SPEED(){
        int speed = new SecureRandom().nextInt(tiger.MAX_SPEED());
        return speed;
    }
    protected static int HORSE_SPEED(){
        int speed = new SecureRandom().nextInt(horse.MAX_SPEED());
        return speed;
    }
    }

