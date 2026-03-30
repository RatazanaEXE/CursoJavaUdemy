package src.secao25.exercicio;

public class ExemploNullPointerExceptionInteger {
    public static void main(String[] args) {
        Integer numero= null;

        try {
            numero.toString();
        }
        catch (NullPointerException e){
            System.out.println("Erro - Está vazia!!!");
        }
    }
}

