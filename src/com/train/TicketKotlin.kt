package com.train

import java.util.*

class TicketKotlin(val ticket:Int,val roundtrip:Int){
    val price=1000 * ticket + 800 * roundtrip
    override fun toString():String {
        return "Total tickets: $ticket\tRound-trip: $roundtrip\tPrice: $price"
    }
}