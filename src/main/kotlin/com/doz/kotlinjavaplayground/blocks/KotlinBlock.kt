package com.doz.kotlinjavaplayground

import com.doz.kotlinjavaplayground.calling.FromJava
import com.doz.kotlinjavaplayground.declarations.MachAusMirEinenBuilder

class KotlinBlocks {

    fun getMeANumber(faktor: Int): Int {
        return 10 * faktor
    }

    fun getMeANumberOhneBlock(faktor: Int) = 10 * faktor


    fun getMeIntDependingOnIf(bool: Boolean): Int {
        if (bool) {
            return 1
        } else {
            return 0
        }
    }

    fun getMeIntDependingOnIfReturnAußen(bool: Boolean): Int {
        return if (bool) {
            1
        } else {
            0
        }
    }

    fun getMeIntDependingOnIfOhneBlock(bool: Boolean) =
        if (bool) {
            1
        } else {
            0
        }


    fun objectsWithBlocks(neuerPreis: Double, neueBauJahr: Int) {
        MachAusMirEinenBuilder(marke = "Daimler")
            .apply {
                // this hat sich geändert in diesem Block
                preis = neuerPreis
                baujahr = neueBauJahr
            }.also {
                if (it.baujahr?.let { itIsBaujahr -> itIsBaujahr > 2020 } == true) {
                    it.marke = "Neuer " + it.marke
                }
            }.run {
                callToString(this)
            }
    }

    fun callToString(auto: MachAusMirEinenBuilder) = println(auto.toString())

    fun whens(zahl: Int) = when(zahl) {
        in  0..10 -> true
        in 11..100 -> true
        else -> false
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            KotlinBlocks().objectsWithBlocks(99.0, 2021)
        }
    }
}
