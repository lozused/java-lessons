package ru.tn.courses.vkalmykova.v4.task2;

public class Subtask_1 {
    public static void main(String[] args) {
        Speeding speeding = new Speeding("Speeding",1000);
        Stopline stopline = new Stopline("Stopline",2000);
        WrongParking wrongParking = new WrongParking("Wrong", 3000);
        speeding.setTicket(Ticket.SPEEDING);
        stopline.setTicket(Ticket.STOPLINE);
        wrongParking.setTicket(Ticket.WRONGPARKING);
        ArrayList<Document> t = new ArrayList<>();
        t.add(stopline);
        t.add(wrongParking);
        t.add(speeding);
        for(Document document: t){
            if(document.ticket==Ticket.SPEEDING){

            }
            if(document.ticket==Ticket.STOPLINE){

            }
            if(document.ticket==Ticket.WRONGPARKING){

            }
        }
    }
    enum Ticket{

        SPEEDING,
        WRONGPARKING,
        STOPLINE
    }
}
