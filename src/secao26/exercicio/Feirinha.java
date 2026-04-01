package src.secao26.exercicio;
import java.util.*;

public class Feirinha {
    public static void main(String[] args) {
        List<String> minhaLista = new ArrayList<>(
                Arrays.asList("maçã", "banana", "cereja", "abacaxi")
        );

        minhaLista.removeIf(s -> s.length() > 5);

        System.out.println(minhaLista);
    }
}
