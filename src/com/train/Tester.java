package com.train;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        int numberOfTicket=0;
        int numberOfroundtrip=0;
        List<Ticket> ticketOrder=new ArrayList<>();
        Scanner scanner;
        System.out.println("Please enter number of tickets(enter \"-1\" to end):");
        //輸入訂票數
        while(true) {
            while (true) {
                scanner = new Scanner(System.in);
                if (scanner.hasNextInt()) {
                    numberOfTicket = scanner.nextInt();
                    if ((numberOfTicket >0)||(numberOfTicket==-1)) {
                        break;
                    } else {
                        System.out.println("The number of tickets shall be at least one! Please enter number of tickets:");
                    }
                } else {
                    System.out.println("Invalid number! Please enter number of tickets:");
                }
            }
            //輸入來回票數
            while (numberOfTicket>0) {
                System.out.println("How many round-trip tickets: ");
                scanner = new Scanner(System.in);
                if (scanner.hasNextInt()) {
                    numberOfroundtrip = scanner.nextInt();
                    if (numberOfroundtrip  >= 0) {
                        if (numberOfroundtrip > numberOfTicket) {
                            System.out.println("Round-trip tickets can't be more than total tickets!");
                        } else {
                            break;
                        }
                    } else {
                        System.out.println("The number of tickets shall be above zero!");
                    }
                } else {
                    System.out.println("Invalid number!");
                }
            }
            if(numberOfTicket==-1){
                break;
            }else{
                ticketOrder.add(new Ticket(numberOfTicket,numberOfroundtrip));
                System.out.println("\nSuccessful Booking! \nPlease enter number of tickets for next booking(enter \"-1\" to end):");
            }
        }

        //印出訂票結果
        if(ticketOrder.size()==0){
            System.out.println("Ending without any booking.");
        }else{
            int totalPrice=0;
            System.out.println("\nYour Bookings:");
            for(Ticket tk:ticketOrder){
                totalPrice+=tk.getPrice();
                System.out.println(tk);
            }
            System.out.println("Total Price: " + totalPrice);
        }
    }

}

