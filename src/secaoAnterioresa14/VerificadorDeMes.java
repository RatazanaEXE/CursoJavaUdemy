package src.secaoAnterioresa14;

import java.util.Scanner;

public class VerificadorDeMes {
    public static void main(String[] args) {
        System.out.println("Olá vou te dizer o nome do mês, basta que me de o numero!!!");
        Scanner scanner = new Scanner(System.in);
        int resposta = scanner.nextInt();

        switch (resposta){
            case 1 -> System.out.println("Janeiro");
            case 2 -> System.out.println("Fevereiro");
            case 3 -> System.out.println("Março");
            case 4 -> System.out.println("Abril");
            case 5 -> System.out.println("Maio");
            case 6 -> System.out.println("Junho");
            case 7 -> System.out.println("Julho - seu mês versário");
            case 8 -> System.out.println("Agosto");
            case 9 -> System.out.println("Setembro");
            case 10-> System.out.println("Outubro");
            case 11-> System.out.println("Novembro");
            case 12-> System.out.println("Dezembro");

        }
    }
}
