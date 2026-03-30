package src.secao25.aula;

public class ExceptionDivisaoPorZero2 {
    public static int calcularMedia(int totalNotas, int quantidadeAlunos)
            throws ArithmeticException {
            return totalNotas / quantidadeAlunos;
    }

    public static void main(String[] args) {
        int totalNotas = 100;
        int quantidadeDeAlunos = 10;


        try {
            int media = calcularMedia(totalNotas, quantidadeDeAlunos);
            System.out.println("Media: "+ media);
        }
        catch (ArithmeticException e){
           System.out.println("Problema: divisão por 0."+ e.getMessage());

        }
    }
}
