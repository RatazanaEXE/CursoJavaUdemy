package src.secao14;

import java.util.Scanner;

public class Jogo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Monstro theMonster = new Monstro("The monster Scanner", 1, 2);

        System.out.println("Bem vindo ao jogo ahahahahahah");
        System.out.print("Digite seu nome invocador: ");
        String nome = scanner.nextLine();

        Personagem um = new Personagem(nome, 0);

        System.out.println("AHAHAHAH SEU NOME É " + um.nome + " MESMO ? 1-SIM 2-NÃO");
        int resposta = scanner.nextInt();
        scanner.nextLine(); // Limpa a quebra de linha

        if (resposta == 2) {
            System.out.print("Então qual é a porra do seu nome? ");
            String nome2 = scanner.nextLine();
            um.mudadorDeNome(nome2);
        }

        System.out.println("OK VAMOS CONTINUAR AHAHAHAHA VOCÊ ENCONTROU UMA ARMA QUER PEGAR ELA? 1-SIM 2-NÃO");
        int resposta2 = scanner.nextInt();
        scanner.nextLine(); // Limpa a quebra de linha

        if (resposta2 == 1) {
            um.niveladorDePoder += 10; // aumenta 10 pontos de poder
            System.out.println("Seu poder agora é: " + um.niveladorDePoder);
        }

        System.out.println("HAHAHAHA você encontrou um monstro O glorioso " + theMonster.nome + " Não há escapatória, lute!");

        if (um.niveladorDePoder > theMonster.vida) {
            System.out.println("UAU VC MATOU ELE...");
            System.out.println("O JOGO CHEGOU AO FIM");
        } else {
            System.out.println("Você perdeu! Tente novamente...");
        }

        scanner.close();
    }
}
