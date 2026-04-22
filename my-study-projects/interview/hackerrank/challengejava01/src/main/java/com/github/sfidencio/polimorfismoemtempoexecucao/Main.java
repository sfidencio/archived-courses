package com.github.sfidencio.polimorfismoemtempoexecucao;

import java.util.Iterator;
import java.util.List;

public class Main {
    static void main() {

        List<Animal> animals = List.of(
                new Cachorro(),
                new Gato(),
                new Cavalo()
        );

        System.out.println();

        for (Animal animal : animals) {
            animal.emitirSom();
        }

        System.out.println();

        animals.forEach(a -> a.emitirSom());

        System.out.println();

        animals.forEach(Animal::emitirSom);

        System.out.println();

        Iterator<Animal> iterator = animals.iterator();
        while (iterator.hasNext()) {
            iterator.next().emitirSom();
        }
    }
}
