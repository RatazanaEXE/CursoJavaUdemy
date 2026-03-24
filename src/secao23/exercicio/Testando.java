package src.secao23.exercicio;

public class Testando {

    public static void main(String[] args) {
        Cesto <Peixe> redePesqueira = new Cesto<>();
        redePesqueira.guardar(new Peixe("Marlin", 2.5));

        Cesto <Polvo> octoCesto = new Cesto<>();
        octoCesto.guardar(new Polvo("Octavius", 8));

        System.out.println(redePesqueira.pegar());
        System.out.println(octoCesto.pegar());
    }
}
