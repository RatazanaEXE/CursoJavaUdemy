package src.secao24.exercicio2;

import java.util.*;

public class EstoqueDaFeira {

    public static void main(String[] args) {
        Map <String, Integer> estoque = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        estoque.put("Maçã", 30);
        estoque.put("Banana", 90);
        estoque.put("Mamão", 50);
        estoque.put("Manga", 60);

        //Imprimindo Lista
        System.out.println("Estoque: "+estoque);

        //Adicionando ao estoque
        estoque.put("Maçã", 45);

        //Verificando quantidade
        System.out.println("Temos " + estoque.get("Maçã") +" de maçã.");

        //Removendo uma quantidade especifica

        System.out.println("Digite o produto:");
        String produto = scanner.nextLine();

        System.out.println("Digite a quantidade:");
        int quantidade = scanner.nextInt();

        int atual = estoque.get(produto);

        estoque.put(produto, atual - quantidade);

        System.out.println("Estoque atualizado: " + estoque);





    }
}
