package com.sfshin5.javadesignpatterns.no05_singleton.practice_1;

public class TicketMaker {
    private static TicketMaker singleton = new TicketMaker();
    private static int ticket = 1000;

    private TicketMaker(){
    }

    public static TicketMaker getInstance(){
        return singleton;
    }

    public synchronized int getNextTicketNumber(){
        return ticket++;
    }
    
}
