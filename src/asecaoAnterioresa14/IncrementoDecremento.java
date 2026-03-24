package src.asecaoAnterioresa14;

import java.util.Scanner;

public class IncrementoDecremento {
        public static void main(String[] args) {
            String auto = "comprados chegará em breve.";
            Scanner scanner = new Scanner(System.in);
            System.out.println("Olá bem vindo ao mercado de açucar, quantos açucar vc quer?");
            int qtoAcucar = scanner.nextInt();
            System.out.println("Levando mais 1 você paga só 1.99, você aceita? 1 sim 2 não.");
            int resposta = scanner.nextInt();

            if (resposta == 1) {
                //Primeiro operador
                ++qtoAcucar;
                System.out.println("quantidade atual de açucar:" + qtoAcucar);
            }

            System.out.println("Você deseja doar 1 açucar a causa das crianças sem açucar? 1 sim 2 não.");
            int resposta2 = scanner.nextInt();

            if (resposta2 == 1) {
                //Segundo operador
                --qtoAcucar;
                System.out.println("Quantidade atual de açucar:" + qtoAcucar);
                System.out.println("Seus " + qtoAcucar + " açucares" + " " + auto);
            }
            else {
                System.out.println("Seus " + qtoAcucar + " açucares" + " " + auto);
            }

    }
}
