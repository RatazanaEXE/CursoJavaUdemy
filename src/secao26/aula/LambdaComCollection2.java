package src.secao26.aula;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaComCollection2 {

    public static void main(String[] args) {
        List<Integer> listaDeNumeros = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> listaDeNumerosPar = new ArrayList<>();
        List<Integer> listaDeNumerosImpar = new ArrayList<>();

        listaDeNumeros.forEach((numero) -> {
         if (numero % 2 == 0){
             listaDeNumerosPar.add(numero);
         }
         else {
             listaDeNumerosImpar.add(numero);
         }
        });

        System.out.println("Par: " + listaDeNumerosPar);
        System.out.println("Ímpar: " + listaDeNumerosImpar);
    }
}
