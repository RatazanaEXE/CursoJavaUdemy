package src.secao24.aula;

import java.util.*;

public class ExemploList {

    public static void main(String[] args) {
        List <String> listaExemplo = new ArrayList<>();

        listaExemplo.add ("Java");
        listaExemplo.add ("Python");
        listaExemplo.add ("C++");

        //Imprimindo a Lista
        System.out.println("Lista: " + listaExemplo);

        // Verificando se contem determinado elemento
        System.out.println("Contém Java? " + listaExemplo.contains("Java"));

        //Adicionando elementos de outra coleção
        List <String> outraLista = Arrays.asList("JavaScript" , "Ruby");
        listaExemplo.addAll(outraLista);
        System.out.println("Lista completa: " + listaExemplo);

        //Removendo um elemento
        listaExemplo.remove("Ruby");
        System.out.println("Lista sem Ruby" + listaExemplo);

        //Obtendo pelo indice
        String elemento = listaExemplo.get(2);
        System.out.println("Elemento 2: " + elemento);

        //Limpando a lista
        listaExemplo.clear();
        System.out.println(listaExemplo);
    }


}
