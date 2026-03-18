package src.secaoAnterioresa14;

import java.util.Scanner;

public class SistemaDeAprovacaoAvancado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua frequencia: ");
        int frequencia = scanner.nextInt();
        int totalDeAulas = 100;
        System.out.println("Digite agora a suas notas separadas por espaço : ");
        int nota1 = scanner.nextInt();
        int nota2 = scanner.nextInt();

        if (frequencia * 100 / totalDeAulas >= 75 && (nota1 + nota2) / 2 >= 7){
            System.out.println("Aprovado");
            System.out.println(frequencia);
        }
        else {
            System.out.println("Reprovado");
        }

    }
}
