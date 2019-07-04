package com.train

import java.util.*

class TicketKotlin(){
    var ticket:Int=0
        private set
    var roundtrip:Int=0
        private set
    fun order(){
        var scanner:Scanner
        var x:Int
        println("Please enter number of tickets:")
        ticket1@ while(true){
            scanner=Scanner(System.`in`)
            if (scanner.hasNextInt()) {
                x = scanner.nextInt()
                if ( x > 0) {
                    this.ticket = x
                    break@ticket1
                } else {
                    println("The number of tickets shall be at least one! Please enter number of tickets:")
                }
            } else {
                println("Invalid number! Please enter number of tickets:")
            }
        }
        println("How many round-trip tickets: ")
        ticket2@ while (true) {
            scanner = Scanner(System.`in`)
            if (scanner.hasNextInt()) {
                x = scanner.nextInt()

                if (x >= 0) {
                    if (x > ticket) {
                        println("Round-trip tickets can't be more than total tickets! Please enter how many round-trip tickets:")
                    } else {
                        roundtrip = x
                        break@ticket2
                    }
                } else {
                    println("The number of tickets shall be above zero! Please enter how many round-trip tickets:")
                }
            } else {
                println("Invalid number! Please enter how many round-trip tickets:")
            }
        }
        this.showReceipt()
    }
    fun showReceipt() {
        System.out.printf(
            "Total tickets:%d\nRound-trip:%d\nTotal:%d",
            ticket,
            roundtrip,
            1000 * ticket + 800 * roundtrip
        )
    }
}