package com.doz.kotlinjavaplayground.loopsandstreams

import com.doz.kotlinjavaplayground.defaultArguments.DefaultArguments
import kotlin.streams.asStream


class KotlinStreams {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            // val intRange1 = IntRange(0, 5)
            val intRange = 0..5
            intRange.forEach { println(it) }

            // nothing closed here
            intRange.forEach { println(it) }

            // Sequence
            val asSequence = intRange.asSequence()

            // Normal Stream
            val asStream = asSequence.asStream()
            asStream.forEach { println(it) }
            // asStream.forEach { println(it) } // Closed

            intRange
                .onEach { println() }
                .map { it * 2 }
                .filter { it % 2 == 0 }
                .forEach{ println(it)} // Nicht das gleiche Ergebnis wie in Java!!  Jede Operation auf allen Elementen

            intRange
                .asSequence()
                .onEach { println() }
                .map { it * 2 }
                .filter { it % 2 == 0 }
                .forEach{ println(it)} // Ausführung wie in Java
        }
    }
}
