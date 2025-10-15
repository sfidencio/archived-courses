package com.github.sfidencio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.stream.Stream;

public class TryResources {
    static void main() {
        try (BufferedReader br = new BufferedReader(new FileReader("clientes.dat"))) {
            Stream<String> linhas = br.lines();
            linhas.forEach(System.out::println);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
