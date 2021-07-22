package com.doz.kotlinjavaplayground.nullability

class NullKotlin {

    var neverNull = "Hallo"

    var canBeNull: String? = null

    val nullableList: List<String?> = listOf("1", "2", null, "4")

    val lazyNull: String? by lazy { "actually never null" }

    fun printMe(string: String) {
        println(string)
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            val nullKotlin = NullKotlin()

            // NeverNull kann man nicht null setzen der Compiler verhindert das
            // nullKotlin.neverNull = null

            // CanBeNull kann man ohne Null-Check nicht aufrufen
            // val javaClass = nullKotlin.canBeNull.javaClass
            // println(nullKotlin.canBeNull)
            // nullKotlin.printMe(nullKotlin.canBeNull)

            // Geht nicht mutated Property !!! D.h. es hätte ja ein anderer Thread mittlerweile die Variable ändern können
            // if (nullKotlin.canBeNull != null) nullKotlin.printMe(nullKotlin.canBeNull)

            // var name: String? = "name"
            // Geht nicht ist ein Nullable Type
            // nullKotlin.printMe(name)
            // Geht weil hier kein anderer Thread die Variable hätte ändern können
            // if (name != null) nullKotlin.printMe(name)

            // Kompiliert nicht Type ist nullable
            // nullKotlin.printMe(nullKotlin.lazyNull)
            // if (nullKotlin.lazyNull != null) nullKotlin.printMe(nullKotlin.lazyNull)

            // Safe calls mit Null Check
            // nullKotlin.printMe(nullKotlin.canBeNull ?: "ist was null")

            // Die neuen Blöcke helfen mit der nullability umzugehen besser umzugehen
            // nullKotlin.canBeNull?.let { nullKotlin.printMe(it) } ?: println("ist was null")

            // Benutzt man den ? Operator wird immer ein Nullable Typ zurückgegeben und jeder verlangt einen Null Check
            // val length: Int? = nullKotlin.canBeNull?.length

            // NPE wenn man den compiler sagt ignoriere deine checks
            //val npe = nullKotlin.canBeNull!!.length

            // Nullable Listen can man zu Non Null Listen machen
            // val filterNotNull: List<String> = nullKotlin.nullableList.filterNotNull()

            // Compiliert nicht
            // nullKotlin.nullableList.forEach { nullKotlin.printMe(it) }
            // filterNotNull
            //    .filter { it != null } // Always true
            //    .forEach { nullKotlin.printMe(it) }
        }
    }
}
