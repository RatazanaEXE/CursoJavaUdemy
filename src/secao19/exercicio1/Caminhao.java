package src.secao19.exercicio1;

public class Caminhao implements Veiculo{
    @Override
    public void acelerar() {
        System.out.println("Caminhão - VRRROOOOM!");
    }

    @Override
    public void freiar() {
        System.out.println("Caminhão - Pssshhh!");
    }

    @Override
    public void buzinar() {
        System.out.println("Caminhão - PA-PA! / PA-PAH!");
    }
}
