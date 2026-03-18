package src.secaoAnterioresa14;

import java.util.Scanner;

public class DiasNoMes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Me diga o nome do mês que te falo quantos dias ele tem.");
        String resposta = scanner.next();

        String quantidadeDias = switch (resposta){
            case "Janeiro", "Março", "Maio", "Julho", "Agosto", "Outubro" , "Dezembro" -> "o número de dias é 31";
            case "Abril", "Junho", "Setembro", "Novembro" -> "o número de dias é 30.";
            case  "Fevereiro" ->  "o número de dias é 28";
            default ->"Desconhecido";
        };

        System.out.println(quantidadeDias);

    }
}
