package src.secaoAnterioresa14;

import java.util.Scanner;

public class OperadoresdeAtribuição {
    public static void main(String[] args) {
        String auto = "comprados chegará em breve.";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá bem vindo ao mercado de açucar, quantos açucar vc quer?");
        int qtoAcucar = scanner.nextInt();
        System.out.println("Levando mais 2 você paga só 1.99, você aceita? 1 sim 2 não.");
        int resposta = scanner.nextInt();

        if (resposta == 1) {
            //Primeiro operador
            qtoAcucar += 2;
            System.out.println("quantidade atual de açucar:" + qtoAcucar);
        }

        System.out.println("Você deseja doar 2 açucar a causa das crianças sem açucar? 1 sim 2 não.");
        int resposta2 = scanner.nextInt();

        if (resposta2 == 1) {
            //Segundo operador
            qtoAcucar -= 2;
            System.out.println("Quantidade atual de açucar:" + qtoAcucar);
        }

        System.out.println("Uau você acaba de GANHAR o dobro de açucar comprado");
        //Terceiro operador
        qtoAcucar *= 2;
        System.out.println("quantidade atual de açucar:" + qtoAcucar);

        System.out.println("Você deseja doar seu prêmio a causa das crianças sem açucar? 1 sim 2 não.");
        int resposta3 = scanner.nextInt();

        if (resposta3 == 1) {
            //Quarto operador
            qtoAcucar /= 2;
            System.out.println("quantidade atual de açucar:" + qtoAcucar);
            System.out.println("Seus " + qtoAcucar + " açucares" + " " + auto);
        }

        else {
            System.out.println("Seus " + qtoAcucar + " açucares" + " " + auto);
        }

    }
}
