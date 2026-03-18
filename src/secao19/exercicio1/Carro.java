package src.secao19.exercicio1;

public class Carro implements Veiculo{
    @Override
    public void acelerar() {
        System.out.println("Carro - vrummm");
    }

    @Override
    public void freiar() {
        System.out.println("Carro - Screeeech!");

    }

    @Override
    public void buzinar(){
        System.out.println("Carro - Biiip biiip!");
    }
}
