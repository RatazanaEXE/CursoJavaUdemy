package src.asecaoAnterioresa14;

public class ControleEstoquePadaria {
    int farinha = 10;
    int acucar = 5;

    public ControleEstoquePadaria(int farinha, int acucar) {
        this.farinha = farinha;
        this.acucar = acucar;
    }

    @Override
    public String toString() {
        return " ControleEstoquePadaria: " +
                "farinha=" + farinha +
                ", acucar=" + acucar;
    }

    public static void main(String[] args) {
        ControleEstoquePadaria a = new ControleEstoquePadaria(10, 10);

        System.out.println(a);
    }

}
