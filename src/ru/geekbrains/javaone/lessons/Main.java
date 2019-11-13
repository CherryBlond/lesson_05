package ru.geekbrains.javaone.lessons;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Черныш");
        checkDog(dog);
        Cat cat = new Cat("Мурзик");
        checkCat(cat);
        Horse horse = new Horse("Облако");
        checkHorse(horse);
        Bird bird = new Bird("Чижик");
        checBird(bird);

        Dog dog2 = new Dog("Беляш");
        dog2.setMaxRunLength(1000);
        dog2.setMaxJumpHeight(2);
        dog2.setMaxSwimLength(100);
        checkDog(dog2);

        Dog dog3 = new Dog("Кругляш");
        dog3.setMaxRunLength(0);
        dog3.setMaxJumpHeight(0);
        dog3.setMaxSwimLength(0);
        checkDog(dog3);
    }

    static void checkDog(Dog dog) {
        dog.run(500);
        dog.run(600);

        dog.jump(0.5);
        dog.jump(0.6);

        dog.swim(10);
        dog.swim(20);
    }

    static void checkCat(Cat cat) {
        cat.run(200);
        cat.run(300);

        cat.jump(2);
        cat.jump(3);

        cat.swim(10);
    }

    static void checkHorse(Horse horse) {
        horse.run(1500);
        horse.run(1600);

        horse.jump(3);
        horse.jump(4);

        horse.swim(100);
        horse.swim(200);
    }

    static void checBird(Bird bird) {
        bird.run(5);
        bird.run(6);

        bird.jump(0.2);
        bird.jump(0.3);

        bird.swim(10);
    }

}
