package src.secao24;

import java.util.ArrayList;
import java.util.List;

public class exercicio3 {
    public static void main(String[] args) {
        List <String> filmes = new ArrayList<>();

        filmes.add("Interestelar");
        filmes.add("Matrix");
        filmes.add("Vingadores: Ultimato");
        filmes.add("O Senhor dos Anéis");
        filmes.add("Harry Potter");

        System.out.println("Lista de filmes");
        for (int i = 0; i < filmes.size(); i++) {
            System.out.println(filmes.get(i));
        }

        System.out.println("Interestelar está na lista? " + filmes.contains("Interestelar"));

    }
}
