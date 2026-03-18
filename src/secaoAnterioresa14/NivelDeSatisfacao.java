package src.secaoAnterioresa14;

import java.util.Scanner;

public class NivelDeSatisfacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá queremos fazer uma pesquisa, de uma nota  de 1 a 5 para sua namorada!");
        int nota = scanner.nextInt();

        String resposta = switch (nota) {
            case 1, 2, 3 -> "Vai dormir pra fora hoje.";
            case 4,5 -> "Bom Menino." ;
            default -> "\"Opção inválida (deve estar entre 1 e 5)";
        };
        System.out.println(resposta);
    }
}
