package com.github.sfidencio.bigO;

import java.util.Arrays;

public class Main {
    static void main() {
        int[] numerosUmAteTrinta = {
            1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
            11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
            21, 22, 23, 24, 25, 26, 27, 28, 29, 30
        };

        // O(log n) -> busca binária
        var result = Arrays.binarySearch(numerosUmAteTrinta,28);

        System.out.println(numerosUmAteTrinta[result]);

    }
}
