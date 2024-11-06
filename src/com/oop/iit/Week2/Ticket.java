package com.oop.iit.Week2;

public class Ticket {
    private static  int numTicketSold = 0; // shared
    private int ticketNo; // one per object
    private double price;


    // Constructor for the ticket class

    public Ticket(int ticketNo, double price){
        super();
        this.ticketNo = ticketNo;
        this.price = price;
        numTicketSold++;
    }
    public Ticket(){
        numTicketSold++;
        ticketNo = numTicketSold;
    }

    public static int getNumSold(){
        return numTicketSold;
    }

    public int getTicketNo(){
        return ticketNo;
    }

    public String getInfo(){
        return "ticket # " + ticketNo + "; " + numTicketSold + " ticket(s) sold.";
    }
}
