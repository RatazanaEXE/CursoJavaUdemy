package src.sesao23.aula;

public class Brinquedos {

    public static void main(String[] args) {
        Carrinho c = new Carrinho("Hot Wheels");
        Boneca b = new Boneca ("Barbie");
        System.out.println("Carrinho: " + c.getModelo());
        System.out.println("Boneca: " + b.getNome());
    }

}
