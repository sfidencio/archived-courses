package com.github.sfidencio.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main3 {
    static void main() {
        List<String> list = Arrays.asList(
                "Java",
                "Python",
                "JavaScript",
                "C++",
                "Ruby"
        );


        Stream<String> stream = list.stream();
        stream.forEach(System.out::println);
        //stream.forEach(System.out::println);


        System.out.println();

        String[] array = {
                "Java",
                "Python",
                "JavaScript",
                "C++",
                "Ruby"
        };
        Stream<String> stream2 = Arrays.stream(array);
        stream2.forEach(System.out::println);

        Stream<String> stream3 = Stream.of(
                "Java",
                "Python",
                "JavaScript",
                "C++",
                "Ruby"
        );
        stream3.forEach(System.out::println);

        Stream<Integer> pares = Stream.iterate(
                0, n -> n + 10
        );

        pares.limit(100)
                .forEach(System.out::println);
        System.out.println();
        Stream<Double> randomicos =
                Stream.generate(
                        Math::random
                );
        randomicos.limit(100)
                .forEach(System.out::println);

        System.out.println();
        IntStream.range(1,1000)
                .forEach(System.out::println);

        System.out.println();

        IntStream.rangeClosed(1,1000)
                .forEach(System.out::println);


    }
}
