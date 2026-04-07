package src.secao27.aula;

public class CalculadoraFuncional {
    public static void main(String[] args) {
        Calculadora soma = (a,b) -> a+b;
        System.out.println(soma.calcular(5 , 8));

        Calculadora subtracao = (a,b) -> a+b;
        System.out.println(subtracao.calcular(5 , 8));

        Calculadora multiplicacao = (a,b) -> a+b;
        System.out.println(multiplicacao.calcular(5 , 8));

        Calculadora divisao = (a,b) -> a+b;
        System.out.println(divisao.calcular(5 , 8));
    }
}
