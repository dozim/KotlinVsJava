package com.doz.kotlinjavaplayground.nullability;

public class NullExample {

    private String canBeNull;

    public static void main(String [] args) {

        NullExample nullExample = new NullExample();


        Class<?> aClass = nullExample.canBeNull.getClass();
    }
}
