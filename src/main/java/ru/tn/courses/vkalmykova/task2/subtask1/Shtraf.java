package ru.tn.courses.vkalmykova.task2.subtask1;

public abstract class Shtraf {
    public enum Status{
        Active, Paid
    }
    private String name;
    private double price;
    private Status status;

    public Shtraf(String name, double price, Status status) {
        this.name = name;
        this.price = price;
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
