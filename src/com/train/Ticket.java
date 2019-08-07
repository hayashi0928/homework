package com.train;

public class Ticket {
    private int ticket;
    private int roundtrip;
    private int price;

    Ticket(int ticket, int roundtrip){
        this.ticket=ticket;
        this.roundtrip=roundtrip;
        this.price=1000*ticket+800*roundtrip;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString(){
        return "Total tickets: "+ ticket + "\tRound-trip: " + roundtrip +  "\tPrice: " + price;
    }
}
