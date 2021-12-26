package ru.tn.courses.vkalmykova.v4.task1;

public class Subtask_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int array[] = new int[scanner.nextInt()];
        for(int counter =0; counter<array.length;counter++){
            array[counter] = scanner.nextInt();
            if((array[counter] > 0) && ((array[counter] & (array[counter] - 1)) == 0)) {
                System.out.println(array[counter]);
            }
        }
    }
}
