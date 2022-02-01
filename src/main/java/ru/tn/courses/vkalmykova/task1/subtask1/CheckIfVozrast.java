package ru.tn.courses.vkalmykova.task1.subtask1;

public class CheckIfVozrast {
    public boolean checkIfVozrast(double[] arr){
        for(int c =0; c<arr.length-1;c++){
            if(arr[c+1] < arr[c]){
                return false;
            }
        }
        return true;
    }
}
