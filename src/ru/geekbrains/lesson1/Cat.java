package ru.geekbrains.lesson1;

public class Cat extends Animal {
    public Cat(float maxRunLength, float maxJumpHeight) {
        super(maxRunLength, 0, maxJumpHeight);
    }

    @Override
    public void swim(float length) {
        System.out.println("Кошка не умеет плавать");
    }
}
