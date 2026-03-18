package src.secao22.exercicios;

public class Caminhao extends Veiculo{
    int eixos;

    public Caminhao(String placa, int ano, int eixos) {
        super(placa, ano);
        this.eixos = eixos;
    }

    public void Buzina (){
        System.out.println("Buzinada de caminhão");
    }
}
