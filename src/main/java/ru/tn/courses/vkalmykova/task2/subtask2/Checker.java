package ru.tn.courses.vkalmykova.task2.subtask2;

public class Checker {
    public void checker(Animal a){
        if(a.getLegs() > 2 ){
            System.out.println("Animal has more than 2 legs");
        }
        else if(a.getLegs() < 2 && a.getLegs()!=0){
            System.out.println("Animal has less than 2 legs");
        }
    }
}
