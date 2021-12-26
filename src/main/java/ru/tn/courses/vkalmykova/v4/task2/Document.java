package ru.tn.courses.vkalmykova.v4.task2;

abstract class Document {
    protected String felonyName;
    protected double money;
    protected Ticket ticket;

    public Document(String felonyName, double money) {
        this.felonyName = felonyName;
        this.money = money;
    }
    public Document(double money) {
        this.felonyName = "felonyName";
        this.money = money;
    }

    public String getFelonyName() {
        return felonyName;
    }

    public void setFelonyName(String felonyName) {
        this.felonyName = felonyName;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
}