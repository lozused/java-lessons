package ru.tn.courses.vkalmykova.v4.task1;

import java.util.Scanner;

public class Subtask_1 {
    static double array[];

    public static void initArray(){
        Scanner scanner = new Scanner(System.in);
        array = new double[scanner.nextInt()];
        for(int counter =0; counter<array.length;counter++){
            array[counter] = scanner.nextDouble();
        }
    }
    public static boolean findTendency(){
        for(int counter =0; counter<array.length;counter++){
            if (array[counter]<array[counter+1]){
                return true;
            } else return false;
        }
        return false;
    }
    public static void main(String[] args) {
        initArray();
        findTendency();
    }
}
