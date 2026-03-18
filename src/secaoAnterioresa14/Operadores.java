package src.secaoAnterioresa14;

public class Operadores {
    public static void main(String[] args) {

        //Operadores Aritméticos
        int a = 10;
        int b = 20;
        System.out.println(a + b); // Saída: 30
        System.out.println(a - b); // Saída: -10
        System.out.println(a * b); // Saída: 200
        System.out.println(a / b); // Saída: 0
        System.out.println(a % b); // Saída: 10

        //Operadores de Comparação
        System.out.println(a == b); // Saída: false
        System.out.println(a != b); // Saída: true
        System.out.println(a > b); // Saída: false
        System.out.println(a < b); // Saída: true
        System.out.println(a >= b); // Saída: false
        System.out.println(a <= b); // Saída: true

        //Operadores Lógicos
        boolean c = true;
        System.out.println(a < b && c); // Saída: true
        System.out.println(a > b || c); // Saída: true
        System.out.println(!c); // Saída: false

        //Operadores de Atribuição
        a += 2; // Equivalente a a = a + 2;
        System.out.println(a); // Saída: 12

        //Operadores Unários
        a++; // Equivalente a a = a + 1;
        System.out.println(a); // Saída: 11
    }
}
