package ru.tn.courses.vkalmykova.task1.subtask3;

public class SortirovkaVstavkami {
    public void sort(double[] arr){
        for (int c = 0; c < arr.length; c++) {
            double value = arr[c];
            int i = c - 1;
            for (; i >= 0; i--) {
                if (value < arr[i]) {
                    arr[i + 1] = arr[i];
                } else {
                    break;
                }
            }
            arr[i + 1] = value;
        }
    }
}
