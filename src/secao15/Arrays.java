package src.secao15;

public class Arrays {
    public static void main(String[] args) {
        int[] meuArray; //Declaração do array
        meuArray = new int[3]; // Criação do array
        meuArray[0] = 5;
        meuArray[1] = 8;
        meuArray[2] = 2;

        //outro modo de fazer

        meuArray = new int[]{5, 8, 2}; // Cria e preenche o array com valores

        System.out.println(meuArray[0]);
        System.out.println(meuArray[1]);
        System.out.println(meuArray[2]);

        //alterando os elementos

        meuArray[0] = 10;

        //percorrendo o array
        for (int i = 0; i <meuArray.length;i++){
            System.out.println(meuArray[i]);
        }

        // Percorrendo Arrays com for-each:
        for (int elemento : meuArray) {
            System.out.println(elemento);
        }
    }
}
