package src.secao22.exercicioDois;

public class Calculadora {
    public static void main(String[] args) {
        Operacao soma = new Soma(5, 5);
        System.out.println("Soma: " + soma.calcular());

        Operacao subtracao = new Subtracao(10, 3);
        System.out.println("Subtração: " + subtracao.calcular());

        Operacao multiplicacao = new Multiplicacao(4, 2);
        System.out.println("Multiplicação: " + multiplicacao.calcular());

        Operacao divisao = new Divisao(20, 5);
        System.out.println("Divisão: " + divisao.calcular());
    }
}
