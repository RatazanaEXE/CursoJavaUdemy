package src.secao22.exercicios;

public class Onibus extends Veiculo{
    int assentos;

    public Onibus(String placa, int ano, int assentos) {
        super(placa, ano);
        this.assentos=assentos;
    }

    public void Buzina (){
        System.out.println("Buzinada de ônibus");
    }
}
