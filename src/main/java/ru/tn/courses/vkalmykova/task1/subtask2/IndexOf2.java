package ru.tn.courses.vkalmykova.task1.subtask2;

public class IndexOf2 {
    public void indexOf2(int[] arr) {
        for (int c = 0; c < arr.length; c++) {
            if (c % 2 == 0) {
                System.out.println(arr[c]);
            }
        }
    }
}
