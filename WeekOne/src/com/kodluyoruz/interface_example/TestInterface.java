package com.kodluyoruz.interface_example;

public class TestInterface {
    public static void main(String[] args) {
        Bird bird1 = new Penguin("p", 1);
        Bird bird2 = new Parrot("parrot", 1);

        print(bird1);
        print(bird2);
    }

    private static void print(Bird bird) {
        System.out.println(bird.getName() + " " + bird.getAge());
        if (bird instanceof CanFly) {
            CanFly flyBird = (CanFly) bird;
            flyBird.fly();
        }
    }
}
