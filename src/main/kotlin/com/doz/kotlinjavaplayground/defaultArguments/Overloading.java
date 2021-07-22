package com.doz.kotlinjavaplayground.defaultArguments;

public class Overloading {

    public void foo(int zahl, String name, boolean kennzeichen) {
        System.out.println("Zahl " + zahl + " Name " + name + " Kennzeichen " + kennzeichen);
    }

    public void foo(int zahl, String name) {
        foo(zahl, name, false);
    }

    public void foo(int zahl) {
        foo(zahl, "fester Name");
    }

    public static void main(String [] args) {
        Overloading overloading = new Overloading();
        overloading.foo(10);
        overloading.foo(10, "Mein Name");
        overloading.foo(10, "Mein Name", true);
    }
}
