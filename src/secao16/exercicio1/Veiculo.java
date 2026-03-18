package src.secao16.exercicio1;

public class Veiculo {
    int QuantidadeDeRoda;
    String TipoVeiculo;

    public Veiculo (int QuantidadeDeRoda,String TipoVeiculo){
        this.QuantidadeDeRoda = QuantidadeDeRoda;
        this.TipoVeiculo = TipoVeiculo;
    }

    public void acelerar () {
        System.out.println("Veículo acelerando!");
    }
}
