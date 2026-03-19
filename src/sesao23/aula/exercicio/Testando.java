package src.sesao23.aula.exercicio;

import src.sesao23.aula.Boneca;
import src.sesao23.aula.Carrinho;

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
