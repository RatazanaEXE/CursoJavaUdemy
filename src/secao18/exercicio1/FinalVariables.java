package src.secao18.exercicio1;

public class FinalVariables {
    final int NUMERO_MAXIMO = 100;
    final String MENSAGEM = "Bem-vindo ao mundo da programação!";

    public void imprimirValoresFinal (){
        System.out.println(NUMERO_MAXIMO);
        System.out.println(MENSAGEM);
    }

    public static void main(String[] args) {
        FinalVariables x =new FinalVariables();
        x.imprimirValoresFinal();
    }

}
