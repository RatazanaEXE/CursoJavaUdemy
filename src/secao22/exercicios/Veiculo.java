package src.secao22.exercicios;

public abstract class Veiculo {
    String placa;
    int ano;

    public Veiculo(String placa, int ano) {
        this.placa = placa;
        this.ano = ano;
    }

    public void exibirInformacoes(){
        System.out.println("Placa: "+ placa +" "+ "Ano: " + ano);
    }
}
