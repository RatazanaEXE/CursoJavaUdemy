package src.secao25.aula;

public class ExemploObjNull {
    public static void main(String[] args) {
        String nome = new String("Ana");

        try {
            int tamanhoNome = nome.length();
            System.out.println("Tamanho do nome: " + tamanhoNome);
        } catch (NullPointerException e){
            System.out.println("Erro: a variavel está vazia.");
        }
    }
}
