package com.doz.kotlinjavaplayground.declarations

import java.math.BigDecimal

/*
 * On the JVM platform, numbers are stored as primitive types: int, double, and so on.
 * Exceptions are cases when you create a nullable number reference such as Int?.
 * In these cases numbers are boxed in Java classes Integer, Double, and so on.
 */
class KotlinTypes {

    // --- Standard Types ---

    // Niemals Null
    val bi: Byte = 1
    val sh: Short = 1
    val int: Int = 1
    val long: Long = 1
    val float: Float = 1f
    val double: Double = 1.0
    val bool: Boolean = true
    val char: Char = 'a'
    val big: BigDecimal = BigDecimal.ONE // Ein Java Type (siehe import)

    // Nullable Types durch ?
    var name: String? = "Batman"
    var intBoxed: Int? = 1 // A boxed Int (java.lang.Integer)


    // --- Special String Types ---

    val multilineString = """
        Es war ein mal ein langer Satz
        und er wollte noch länger sein
        doch dann hatte der Autor keine Lust mehr
    """

    val templateString: String = "Ich bin $name"

    // --- ARRAYS ---

    val zahlen: Array<Int> = arrayOf(1, 2, 3) // Integer Array

    val zahlen2: IntArray = intArrayOf(1, 2, 3) // Primitive int keine Integer

    // --- Listen, Maps, Set ---

    val listImmutable: List<String> = listOf("Hallo ich kann nur Leseoperationen")

    val mutabelList: MutableList<String> = mutableListOf("Hallo ich kann auch Schreiboperationen")

    val set: Set<String> = setOf("Set me in")

    val setMutable: MutableSet<String> = mutableSetOf("Mutate me")

    val map: Map<String, String> = mapOf(Pair("key", "value"))

    val mapMutable: MutableMap<String, String> = mutableMapOf(Pair("key", "value"))
}

class TestTypes {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
         println(KotlinTypes().templateString)
        }
    }
}
