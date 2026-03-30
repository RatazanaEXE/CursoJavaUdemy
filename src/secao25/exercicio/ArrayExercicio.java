package src.secao25.exercicio;

public class ArrayExercicio {
    public static void main(String[] args) {
        int[] meuArray = { 10, 20, 30, 40, 50 };

        
        System.out.println("Elemento no índice 2: " + AcessarElemento.acessarElemento(meuArray, 2));

        System.out.println("Elemento no índice 10: " + AcessarElemento.acessarElemento(meuArray, 10));
    }

}
