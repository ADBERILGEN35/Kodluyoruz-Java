package com.kodluyoruz.interface_example;

public class Parrot extends Bird implements CanFly{
    public Parrot(String name, int age) {
        super(name, age);
    }

    @Override
    public void fly() {
        System.out.println("Uçabiliyorum");
    }
}
