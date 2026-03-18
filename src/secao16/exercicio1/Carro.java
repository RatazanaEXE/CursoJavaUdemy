package src.secao16.exercicio1;

public class Carro extends Veiculo {
    String placa;

    public Carro(int QuantidadeDeRoda, String TipoVeiculo, String placa) {
        super(QuantidadeDeRoda, TipoVeiculo);
        this.placa = placa;
    }

    @Override
    public void acelerar() {
        System.out.println("Carro acelerando!");
    }

    public static void main(String[] args) {

        Carro carro1 = new Carro (4,"Carro", "abc-1235");
        carro1.acelerar();




    }
}
