package ru.geekbrains.lesson1;

public abstract class Animal {
    protected float maxRunLength;
    protected float maxSwimLength;
    protected float maxJumpHeight;

    public Animal(float maxRunLength, float maxSwimLength, float maxJumpHeight) {
        this.maxRunLength = maxRunLength;
        this.maxSwimLength = maxSwimLength;
        this.maxJumpHeight = maxJumpHeight;
    }

    public void run(float length) {
        System.out.println("run: " + isAvailableAction(length, maxRunLength));
    }

    public void swim(float length) {
        System.out.println("swim: " + isAvailableAction(length, maxSwimLength));
    }

    public void jump(float height) {
        System.out.println("jump: " + isAvailableAction(height, maxJumpHeight));
    }

    private boolean isAvailableAction(float required, float expected) {
        return required <= expected;
    }
}
