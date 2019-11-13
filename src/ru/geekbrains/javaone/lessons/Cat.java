package ru.geekbrains.javaone.lessons;

public class Cat extends Animals {
    Cat(String name) {
        super();
        this.name = name;
        this.maxRunLength = 200;
        this.maxSwimLength = 0;
        this.maxJumpHeight = 2;
    }

    protected String getAnimalName() {
        return "кот " + name;
    }
}
