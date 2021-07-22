package com.doz.kotlinjavaplayground.calling

class FromKotlin {

    fun call() {
        println("Hier ist eine Kotlin Klasse")
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println("Kotlin calling ")
            FromJava().call()
        }
    }
}
