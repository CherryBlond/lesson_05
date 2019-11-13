package ru.geekbrains.javaone.lessons;

public class Animals {
    String name;
    int maxRunLength = 0;
    int maxSwimLength = 0;
    double maxJumpHeight = 0;

    protected Animals() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMaxRunLength(int length) {
        maxRunLength = length;
    }

    public void setMaxSwimLength(int length) {
        maxSwimLength = length;
    }

    public void setMaxJumpHeight(double height) {
        maxJumpHeight = height;
    }

    public void run(int length) {
        if (maxRunLength == 0) {
            System.out.println(getAnimalName() + " не умеет бегать");
            return;
        }

        if (length > maxRunLength) {
            System.out.println(getAnimalName() + " не смог пробежать - слишком далеко");
            return;
        }

        System.out.println(getAnimalName() + " пробежал");
    }

    public void swim(int length) {
        if (maxSwimLength == 0) {
            System.out.println(getAnimalName() + " не умеет плавать");
            return;
        }

        if (length > maxSwimLength) {
            System.out.println(getAnimalName() + " не смог проплыть - слишком далеко");
            return;
        }

        System.out.println(getAnimalName() + " проплыл");
    }

    public void jump(double height) {
        if (maxJumpHeight == 0) {
            System.out.println(getAnimalName() + " не умеет прыгать");
            return;
        }

        if (height > maxJumpHeight) {
            System.out.println(getAnimalName() + " не смог допрыгнуть - слишком высоко");
            return;
        }

        System.out.println(getAnimalName() + " допрыгнул");
    }

    protected String getAnimalName() {
        return "животное " + name;
    }
}
