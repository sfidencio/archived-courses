package com.github.sfidencio.Genericos;

import java.util.ArrayList;
import java.util.List;

public class QualquerCoisa<T> {

    private List<T> coisas;

    public QualquerCoisa() {
        this.coisas = new ArrayList<>(0);
    }

    public void add(T coisa) {
        coisas.add(coisa);
    }

    @Override
    public String toString() {
        return "QualquerCoisa{" +
                "coisas=" + coisas +
                '}';
    }
}
