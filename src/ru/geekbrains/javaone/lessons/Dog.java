package ru.geekbrains.javaone.lessons;

public class Dog extends Animals {
    Dog(String name) {
        super();
        this.name = name;
        this.maxRunLength = 500;
        this.maxSwimLength = 10;
        this.maxJumpHeight = 0.5;
    }

    protected String getAnimalName() {
        return "собака " + name;
    }
}