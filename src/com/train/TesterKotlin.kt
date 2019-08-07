package com.train

import java.lang.NumberFormatException

fun main(){
    var numberOfTicket=0
    var numberOfRoundtrip=0
    val ticketBooking:MutableList<TicketKotlin> = ArrayList()
    println("Please enter number of tickets(enter \"-1\" to end):")
    booking@ while(true) {
        bookTicket@ while (true) {
            //輸入訂票數
            try {
                numberOfTicket = Integer.parseInt(readLine())
                if (numberOfTicket > 0 ) {
                    break@bookTicket
                }else if(numberOfTicket == -1){
                    break@booking
                }
                else {
                    println("The number of tickets shall be at least one! Please enter number of tickets:")
                }
            } catch (ex: NumberFormatException) {
                println("Invalid number! Please enter number of tickets:")
            }
        }
        //輸入來回票數
        bookRoundtrip@ while (numberOfTicket > 0) {
            println("How many round-trip tickets: ")
            try {
                numberOfRoundtrip = Integer.parseInt(readLine())
                if (numberOfRoundtrip >= 0) {
                    if (numberOfRoundtrip > numberOfTicket) {
                        println("Round-trip tickets can't be more than total tickets! Please enter how many round-trip tickets:")
                    } else {
                        break@bookRoundtrip
                    }
                } else {
                    println("The number of tickets shall be above zero! Please enter how many round-trip tickets:")
                }
            } catch (ex: NumberFormatException) {
                println("Invalid number! Please enter how many round-trip tickets:")
            }
        }
        ticketBooking.add(TicketKotlin(numberOfTicket,numberOfRoundtrip))
        println("\nSuccessful Booking! \nPlease enter number of tickets for next booking(enter \"-1\" to end):")
    }
    if (ticketBooking.size==0){
        print("Ending without any booking.")
    }else{
        var totalPrice=0
        println("\nYour Bookings:")
        for(tk:TicketKotlin in ticketBooking){
            totalPrice += tk.price
            println(tk)
        }
        println("Total Price: $totalPrice")
    }
}