package ru.tn.courses.vkalmykova.task2.subtask2;

public class Subtask2 {
    public static void main(String[] args) {
        Bird bird = new Bird(2,"Голубь");
        Fish fish = new Fish(0, "Карп");
        Checker checker = new Checker();
        checker.checker(bird);
        checker.checker(fish);
    }
}
