package com.train;

import java.util.Scanner;

public class Ticket {
    private int ticket=0;
    private int roundtrip=0;

    public void order(){
        int x;
        Scanner scanner;
        System.out.println("Please enter number of tickets:");
        while(true) {
            scanner= new Scanner(System.in);
            if (scanner.hasNextInt()) {
                if((x= scanner.nextInt()) > 0) {
                    ticket = x;
                    break;
                }else{
                    System.out.println("The number of tickets shall be at least one! Please enter number of tickets:");
                }
            }else {
                System.out.println("Invalid number! Please enter number of tickets:");
            }
        }
        System.out.println("How many round-trip tickets: ");
        while(true) {
            scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                if ((x = scanner.nextInt()) >= 0) {
                    if(x>ticket){
                        System.out.println("Round-trip tickets can't be more than total tickets! Please enter how many round-trip tickets:");
                    }else{
                        roundtrip = x;
                        break;
                    }
                } else {
                    System.out.println("The number of tickets shall be above zero! Please enter how many round-trip tickets:");
                }
            } else {
                System.out.println("Invalid number! Please enter how many round-trip tickets:");
            }
        }
        this.showReceipt();
    }
    public void showReceipt(){
        System.out.printf("Total tickets:%d\nRound-trip:%d\nTotal:%d",ticket,roundtrip,1000*ticket+800*roundtrip);
    }
}
