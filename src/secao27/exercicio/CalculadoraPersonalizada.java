package src.secao27.exercicio;

public class CalculadoraPersonalizada {

    public static void main(String[] args) {
        OperacaoMatematica potencia = (a, b) -> Math.pow(a, b);

        OperacaoMatematica raizSoma = (a, b) -> Math.sqrt(a + b);

        double resultadoPotencia = potencia.executar(2, 3);
        double resultadoRaiz = raizSoma.executar(10, 5);

        System.out.println("Potência (2^3): " + resultadoPotencia);
        System.out.println("Raiz quadrada de (10 + 5): " + resultadoRaiz);
    }
}
