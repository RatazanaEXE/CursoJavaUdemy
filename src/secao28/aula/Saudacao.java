package src.secao28.aula;

public class Saudacao {
    public static void main(String[] args) {
        int num1 = 79;
        int num2 = 108;
        int num3 = 225;

        char letra1 = (char) num1; // 'O'
        char letra2 = (char) num2; // 'l'
        char letra3 = (char) num3; // 'á'

        System.out.println("Saudação: " + letra1 + letra2 + letra3);

        //Isso é possível porque todo caractere tem um número correspondente na tabela Unicode.

    }
}