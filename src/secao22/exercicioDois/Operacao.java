package src.secao22.exercicioDois;

public abstract class Operacao {
    double a;
    double b;

    public Operacao(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public abstract double calcular();
}