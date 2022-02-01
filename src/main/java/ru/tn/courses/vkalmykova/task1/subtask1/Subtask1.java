package ru.tn.courses.vkalmykova.task1.subtask1;

public class Subtask1 {
    public static void main(String[] args) {
        double[] array = new double[5];
        CheckIfVozrast checkIfVozrast = new CheckIfVozrast();
        boolean result = checkIfVozrast.checkIfVozrast(array);
        System.out.println("Massiv vozrast? " + result);
    }
}
