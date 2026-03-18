package src.secao22.exercicioDois;

public class Soma extends Operacao{


    public Soma(double a, double b) {
        super(a, b);
    }

    @Override
    public double calcular() {
        return a+b;
    }
}
