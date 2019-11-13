package ru.geekbrains.javaone.lessons;

public class Bird extends Animals {
    Bird(String name) {
        super();
        this.name = name;
        this.maxRunLength = 5;
        this.maxSwimLength = 0;
        this.maxJumpHeight = 0.2;
    }

    protected String getAnimalName() {
        return "птица " + name;
    }
}
