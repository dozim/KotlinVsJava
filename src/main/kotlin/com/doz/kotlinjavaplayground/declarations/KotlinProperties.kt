package com.doz.kotlinjavaplayground.declarations

/**
 * No need to add public modifier as by default, all properties and functions are public in Kotlin. Add private or protected if required.
 *
 *
 */
class KotlinProperties {

    // Hat nur Getter, Kann nicht verändert werden
    val name = "String"

    // Hat Getter und Setter
    var zahl = 1

    // Hat Getter und internen Setter
    var zahlP = 1
    private set

    fun zahlPInternerSetter() {
        zahlP++
    }

    // Hat Getter und Custom Setter
    var zahlC = 1
    set(value) {
        zahlP++
        // this.zahlC = value !!! Nicht tun das ruft Getter / Setter auf !!!
        // zahlC = value     !!! Nicht tun das ruft genau diese Methode auf !!!
        field = value
    }

    // Lazy Property erst initialisiert wenn benutzt
    val lazyWert by lazy { Math.random() }

    lateinit var michInitialisiertManLate: String

    fun isReady(): Boolean {
        return this::michInitialisiertManLate.isInitialized
    }
}

class TestIt {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val kotlinProperties = KotlinProperties()

            //valVarKotlin.name = "Anderer Name"

            println(kotlinProperties.name)

            //----------------------------------------

            kotlinProperties.zahl = 2

            println(kotlinProperties.zahl)


            //----------------------------------------

            //valVarKotlin.zahlP = 2

            kotlinProperties.zahlPInternerSetter()
            println(kotlinProperties.zahlP)

            //----------------------------------------

            kotlinProperties.zahlC = 5

            println(kotlinProperties.zahlC)
            println(kotlinProperties.zahlP)

            //----------------------------------------

            println(kotlinProperties.lazyWert)


            //----------------------------------------

            if (kotlinProperties.isReady()) {
                println("I am Ready")
                println(kotlinProperties.michInitialisiertManLate)
            }
            if (!kotlinProperties.isReady()) {
                println("Was not Ready")
                kotlinProperties.michInitialisiertManLate = "My Hero String"
                println(kotlinProperties.michInitialisiertManLate)
            }
        }
    }
}
