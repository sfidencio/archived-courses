package com.github.sfidencio.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    static void main() throws IOException {
        Path path = Paths.get("clientes.dat");
        List<String> linhas = Files.readAllLines(path);

        List<Cliente> clientes = linhas.stream()
                .map(l -> {
                            var campos = l.split("\\|");
                            var cliente = new Cliente(campos[0], Double.parseDouble(campos[1]));
                            return cliente;
                        }
                ).toList();
        clientes.forEach(System.out::println);
    }

    record Cliente(String nome, double limite) {}
}
