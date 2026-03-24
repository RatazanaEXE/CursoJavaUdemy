package src.asecaoAnterioresa14;

public class SomaDeNumerosInteirosPositivos {
    public static void main(String[] args) {

//
//        int soma = 0; // Inicializa a variável soma com 0
//        for (int i = 1; i <= 10; i++) {
//            soma += i; // Soma o valor de i à variável soma
//        }
//        System.out.println("A soma dos números de 1 a 10 é: " +
//                soma);

        int x = 10;
        int resultado = 0;
        int i = 1;

        do {
            resultado += i;
            i++;
        } while (i <= x);

        System.out.println("Soma = " + resultado);

/*
        int x = 2;
        int resultado = 0;

        do {
            resultado += x;
            x--;
        } while (x > 0);

*/
    }
}
