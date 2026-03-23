package src.sesao23.aula.exercicioDois;

import java.util.ArrayList;

public class Caixa<T> {

    private ArrayList<T> elementos;

    public Caixa() {
        this.elementos = new ArrayList<>();
    }

    public void adicionar(T elemento, int indice) {

        if (indice < 0 || indice > elementos.size()) {
            throw new IllegalArgumentException("Índice inválido");
        }

        elementos.add(indice, elemento);

        System.out.println("Elemento: " + elemento + " Indice: " + indice);

    }

    public T pegar(int indice) {
        if (indice < 0 || indice >= elementos.size()) {
            throw new IndexOutOfBoundsException("Índice inválido");
        }

        return elementos.get(indice);
    }

    public int tamanho() {
        return elementos.size();
    }


}