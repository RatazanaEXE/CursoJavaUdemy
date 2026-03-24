package src.secao24.artigo.ExemploOrdenacaoLista;

//https://www.devmedia.com.br/java-collections-como-utilizar-collections/18450

/* Aqui é utilizado o sort() para ordenar a lista, não é necessário o toString para
converter pois o método println já chama automaticamente o toString() da lista.
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaAlunoSort {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<String>();
        lista.add("João da Silva");
        lista.add("Antonio Sousa");
        lista.add("Lúcia Ferreira");
        System.out.println(lista);
        Collections.sort(lista);
        System.out.println(lista);
    }

}
