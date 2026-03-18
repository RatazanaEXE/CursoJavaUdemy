package src.secao22.exercicioDois;

public class Divisao extends Operacao{


    public Divisao(double a, double b) {
        super(a, b);
    }

    @Override
    public double calcular() {
        return a/b;
    }
}
