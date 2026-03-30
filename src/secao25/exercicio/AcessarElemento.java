package src.secao25.exercicio;

public class AcessarElemento {

    public AcessarElemento(int[] meuArray, int i) {
    }

    public static int acessarElemento(int[] array, int indice) {
        try {
            return array[indice];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: Índice fora dos limites do array.");
            return -1;
        }
    }
}
