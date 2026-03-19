package src.sesao23.aula.exercicio;

public class Peixe {
    String Nome;
    double tamanho;

    public Peixe(String nome, double tamanho) {
        Nome = nome;
        this.tamanho = tamanho;
    }

    public String getNome() {
        return Nome;
    }

    @Override
    public String toString() {
        return "Peixe{" +
                "Nome='" + Nome + '\'' +
                ", tamanho=" + tamanho +
                '}';
    }
}
