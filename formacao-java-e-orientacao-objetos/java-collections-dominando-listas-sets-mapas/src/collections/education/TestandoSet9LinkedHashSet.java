package collections.education;

import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class TestandoSet9LinkedHashSet {
    public static void main(String[] args) throws IOException {
        Set<String> nomesHashSets = new HashSet<>();
        nomesHashSets.add("Fulano1");
        nomesHashSets.add("Fulano2");
        nomesHashSets.add("Fulano3");
        nomesHashSets.add("Fulano4");
        System.out.println("HashSet=> Não garante a ordem, foi inserido na ordem acima: " + nomesHashSets);
        Set<String> nomesLinkedHashSets = new LinkedHashSet<>();
        nomesLinkedHashSets.add("Fulano1");
        nomesLinkedHashSets.add("Fulano2");
        nomesLinkedHashSets.add("Fulano3");
        nomesLinkedHashSets.add("Fulano4");
        System.out.println("LinkedHashSet=> Garante a ordem, foi inserido na ordem acima: " + nomesLinkedHashSets);

    }
}
