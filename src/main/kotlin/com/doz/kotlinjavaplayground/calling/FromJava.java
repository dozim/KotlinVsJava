package com.doz.kotlinjavaplayground.calling;

public class FromJava {

    public void call() {
        System.out.println("Hier ist eine Java Klasse");
    }

    public static void main(String[] args) {
        System.out.println("Java calling");
        new FromKotlin().call();
    }
}
