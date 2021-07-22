package com.doz.kotlinjavaplayground.loopsandstreams;

import java.util.stream.IntStream;

public class JavaStream {

    public static void main(String [] args) {

        IntStream intStream = IntStream.range(0, 5);
        intStream.forEach(System.out::println);

        // Closed Stream
//        intStream
//                .map(operand -> operand * 2)
//                .filter(value -> Math.floorMod(value, 2) == 1)
//                .forEach(System.out::println);

        IntStream.range(0, 5)
                .peek(value -> System.out.println())
                .map(operand -> operand * 2)
                .filter(value -> value % 2 == 0)
                .forEach(System.out::println);
    }
}
