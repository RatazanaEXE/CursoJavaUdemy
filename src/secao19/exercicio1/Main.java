package src.secao19.exercicio1;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Caminhao caminhao = new Caminhao();

        carro.acelerar();
        carro.freiar();
        carro.buzinar();
        caminhao.acelerar();
        caminhao.freiar();
        caminhao.buzinar();
    }
}
