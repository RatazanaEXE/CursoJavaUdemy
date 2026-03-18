package src.secaoAnterioresa14;

import java.util.Scanner;

public class SistemaDeAprovacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite agora a suas notas separadas por espaço : ");
        int nota1 = scanner.nextInt();
        int nota2 = scanner.nextInt();

        String resposta = ((nota1 + nota2) /2 >= 6) ? "Aprovado": "Reprovado ou invalido!";
        System.out.println(resposta);

   /*     if (nota1 + nota2 /2 >= 6) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado ou invalido!");
        }*/
    }
}
