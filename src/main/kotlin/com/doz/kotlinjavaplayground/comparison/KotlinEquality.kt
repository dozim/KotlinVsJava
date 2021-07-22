package com.doz.kotlinjavaplayground.comparison

import com.doz.kotlinjavaplayground.declarations.MachAusMirEinenBuilder

class TestEquality {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            // Nicht vergessen ist data class mit equals und hashcode
            val auto = MachAusMirEinenBuilder(preis = 10000.0, kw = 100.0, marke = "Daimler")

            println(auto == auto.copy()) // Equals von Java

            println(auto === auto.copy()) // == von Java, Compare by reference

            println(auto === auto)
        }
    }
}
