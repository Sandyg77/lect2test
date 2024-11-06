package com.oop.iit.Week2;

public class Main {
    public static void main(String[] args) {

        Ticket ticket1 = new Ticket(1, 2000);
        System.out.println(ticket1);
        System.out.println(Ticket.getNumSold());

        Ticket ticket2 = new Ticket(2, 2500);
        System.out.println(ticket2);
        System.out.println(Ticket.getNumSold());

        System.out.println(ticket2.getInfo());
    }
}
