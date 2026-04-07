package src.secao27.aula;

public class CalculadoraTradicional {
    public double soma (double a, double b){
        return a +b;
    }
    public double subtracao (double a, double b){
        return a -b;
    }
    public double multiplicacao (double a, double b){
        return a *b;
    }
    public double divisao (double a, double b){
        return a / b;
    }

    public static void main(String[] args) {
        CalculadoraTradicional calcular = new CalculadoraTradicional();
        double resutadoSoma = calcular.soma(2,2);
        System.out.println(resutadoSoma);

        double resultadoSubtracao =calcular.subtracao(5,6);
        System.out.println(resultadoSubtracao);

        double resultadomultiplicacao =calcular.multiplicacao(5,5);
        System.out.println(resultadomultiplicacao);

        double resultadodivisao =calcular.divisao(5,2);
        System.out.println(resultadodivisao);
    }
}
