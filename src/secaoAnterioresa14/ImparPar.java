package src.secaoAnterioresa14;

import java.util.Scanner;

public class ImparPar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int resposta = scanner.nextInt();

        String ifTernario = (resposta % 2 == 0) ? "Par" : "Ímpar";
        System.out.println(ifTernario);

    }
}
