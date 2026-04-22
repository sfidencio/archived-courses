package com.github.sfidencio;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class GenericosTeste {
    static void main() {
        List<LocalDateTime> datas = new ArrayList<>();
        datas.add(LocalDateTime.now());
        datas.add(LocalDateTime.now().minusDays(10));
        System.out.println(datas);
        System.out.println();
        LocalDateTime data = datas.get(0);
        System.out.println(data);

        //nao usar tipos primitivos em genericos
    }
}
