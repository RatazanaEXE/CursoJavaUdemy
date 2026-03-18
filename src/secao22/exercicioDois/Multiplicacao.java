package src.secao22.exercicioDois;

public class Multiplicacao extends Operacao{

    public Multiplicacao(double a, double b) {
        super(a, b);
    }

    @Override
    public double calcular() {
        return a*b;
    }
}
