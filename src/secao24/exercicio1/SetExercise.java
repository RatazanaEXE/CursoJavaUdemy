package src.secao24.exercicio1;

import java.util.*;

public class SetExercise {
    public static void main(String[] args) {
        Set<Integer> lista = new HashSet<>();

        lista.add(1);
        lista.add(3);
        lista.add(5);
        lista.add(4);
        lista.add(2);

        System.out.println("Lista: "+lista);

        lista.remove(2);

        System.out.println("Lista atualizada"+ lista);

        boolean verificador = lista.contains( 4);

        System.out.println("A lista contém 4 ? " + verificador);


    }
}
