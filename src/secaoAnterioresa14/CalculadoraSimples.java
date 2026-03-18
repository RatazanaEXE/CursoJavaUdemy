package src.secaoAnterioresa14;

import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {

        int resultado= 0;
        System.out.println("Olá sou uma Calculadora digite 1 para somar, ou 2 para subtrair, 3 para multiplicar, 4 para dividir e 5 para saber o resto da divisão.");
        Scanner scanner = new Scanner(System.in);

        int opcao = scanner.nextInt();

        System.out.println("Digite o 1º valor: ");
        int a = scanner.nextInt();
        System.out.println("Digite o 2º valor: ");
        int b = scanner.nextInt();
        switch (opcao) {
            case 1:
                resultado = a + b;
                break;
            case 2:
                resultado = a - b;
                break;
            case 3:
                resultado = a * b;
                break;
            case 4:
                resultado = a / b;
                break;
            case 5:
                resultado = a % b;
                break;

            default:
                System.out.println("Você não digitou uma opção válida!");
                break;
        }

        System.out.println("Esse é o resultado: " + resultado);



    }
}
