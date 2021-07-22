package com.doz.kotlinjavaplayground.comparison;

import com.doz.kotlinjavaplayground.declarations.MachAusMirEinenBuilder;

public class JavaEquality {


    public static void main(String [] args) {

        new MachAusMirEinenBuilder();

        MachAusMirEinenBuilder auto = new MachAusMirEinenBuilder("auto", 10, 10D, 10D);
        MachAusMirEinenBuilder auto2 = new MachAusMirEinenBuilder("auto", 10, 10D, 10D);

        // Geht nicht nutze @JvmOverloads  constructor
        // new MachAusMirEinenBuilder("auto", 10, 10D);
        // new MachAusMirEinenBuilder("auto", 10);

        System.out.println(auto == auto2);
        System.out.println(auto.equals(auto2));
    }
}
