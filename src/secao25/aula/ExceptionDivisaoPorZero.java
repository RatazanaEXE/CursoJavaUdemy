package src.secao25.aula;

public class ExceptionDivisaoPorZero {
    public static void main(String[] args) {
        int totalNotas = 100;
        int quantidadeDeAlunos = 10;


        try {
            int media = totalNotas / quantidadeDeAlunos;
            System.out.println(media);
        }
        catch (ArithmeticException e){
            System.out.println("Problema: divisão por 0.");

        }
        finally {
            System.out.println("O programa terminou");

        }

    }
}
