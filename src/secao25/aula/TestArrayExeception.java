package src.secao25.aula;

public class TestArrayExeception {
    public static void main(String[] args) {
        try {
            int [] numeros = {0, 1, 2};
            System.out.println(numeros[5]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Erro: " + e.getMessage());
        }
        finally {
            System.out.println("Finalizado!");
        }
    }
}
