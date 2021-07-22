package com.doz.kotlinjavaplayground.defaultArguments

class DefaultArguments {

    fun foo(zahl: Int, name: String = "fester Name", kennzeichen: Boolean = false) {
        println("Zahl $zahl Name $name Kennzeichen $kennzeichen")
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            // Sehe Overloading Class kann mit dieser ersetzt werden

            val defaultArguments = DefaultArguments()
            defaultArguments.foo(10)
            defaultArguments.foo(10, "Mein Name")
            defaultArguments.foo(10, "Mein Name", true)
        }
    }
}
