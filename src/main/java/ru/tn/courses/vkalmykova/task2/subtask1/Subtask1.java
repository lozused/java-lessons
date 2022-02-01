package ru.tn.courses.vkalmykova.task2.subtask1;

public class Subtask1 {
    public static void main(String[] args) {
        LineCrossed lineCrossed = new LineCrossed("LineTicket", 100, Shtraf.Status.Active);
        SpeedLimit speedLimit = new SpeedLimit("SpeedTicket", 200, Shtraf.Status.Active);
        WrongParking wrongParking = new WrongParking("ParkingTicket", 300, Shtraf.Status.Paid);

    }
}
