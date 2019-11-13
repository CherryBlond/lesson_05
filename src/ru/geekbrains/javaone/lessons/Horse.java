package ru.geekbrains.javaone.lessons;

public class Horse extends Animals {
    Horse(String name) {
        super();
        this.name = name;
        this.maxRunLength = 1500;
        this.maxSwimLength = 100;
        this.maxJumpHeight = 3;
    }

    protected String getAnimalName() {
        return "лошадь " + name;
    }
}