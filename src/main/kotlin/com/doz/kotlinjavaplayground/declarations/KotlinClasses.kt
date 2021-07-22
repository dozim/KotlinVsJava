package com.doz.kotlinjavaplayground.declarations

class Reifen(var profiltiefe: Double = 8.0, val winterreifen: Boolean) {
    init {
        if (winterreifen) {
            profiltiefe = 9.0
        }
    }

    override fun toString(): String {
        return "Reifen(profiltiefe=$profiltiefe, winterreifen=$winterreifen)"
    }
}

class ReifenOhnePropertyWinterreifen(var profiltiefe: Double = 8.0, winterreifen: Boolean) {
    init {
        if (winterreifen) {
            profiltiefe = 9.0
        }
    }

    override fun toString(): String {
        // return "Reifen(profiltiefe=$profiltiefe, winterreifen=$winterreifen)"
        return "Reifen(profiltiefe=$profiltiefe"
    }
}

/*
The compiler automatically derives the following members from all properties declared in the primary constructor:

equals()/ hashCode() pair
toString() of the form "User(name=John, age=42)"
componentN() functions corresponding to the properties in their order of declaration.
copy() function (see below).
 */
data class MachAusMirEinenBuilder (
    var marke: String? = "",
    var baujahr: Int? = 0,
    var kw: Double? = 0.0,
    var preis: Double? = 0.0
)

class TestClasses {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            // --- Named Parameters ---

            println(Reifen(winterreifen = true).toString())
            println(ReifenOhnePropertyWinterreifen(winterreifen = true).toString())


            println(MachAusMirEinenBuilder(preis = 10000.0))

            println(MachAusMirEinenBuilder(preis = 10000.0, kw = 100.0, marke = "Daimler"))

            // Wechsele zu JavaEquality und siehe wie man die Constructor benutzen kann
        }
    }
}
