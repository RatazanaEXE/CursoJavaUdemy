package src.secao14;
//Aula 91

public class ExemploBolo {
    int acucar = 100; //Quantidade padrão ou seja se não for definida.

    public static void main(String[] args) {
        ExemploBolo boloDeChoco = new ExemploBolo();
        boloDeChoco.acucar = 200;

        ExemploBolo boloDeBaunilha = new ExemploBolo();

        System.out.println("Quantidade de açucar: " +   boloDeChoco.acucar );
        System.out.println("Quantidade de açucar: " + boloDeBaunilha.acucar );
    }
}
