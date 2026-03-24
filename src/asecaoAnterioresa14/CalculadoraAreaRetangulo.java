package src.asecaoAnterioresa14;
import java.util.Scanner;


public class CalculadoraAreaRetangulo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a Altura: ");
        double altura = scanner.nextDouble();
        System.out.println("Digite a Largura: ");
        double largura = scanner.nextDouble();
        double area = altura * largura;

        System.out.println("Está é a area: " + area);



}
}

